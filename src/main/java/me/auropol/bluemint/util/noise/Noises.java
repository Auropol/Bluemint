package me.auropol.bluemint.util.noise;

import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.util.RandStream;
import me.auropol.bluemint.util.noise.worley.WorleyNoise;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public abstract class Noises {
    public abstract Object registerNoise();
    public void renderImageFrom(WorleyNoise noise)  {
        WorleyNoise.DistanceType[] types = (WorleyNoise.DistanceType[]) Container.manage().createArrayObject(WorleyNoise.DistanceType.EUCLIDEAN, WorleyNoise.DistanceType.QUADRATIC, WorleyNoise.DistanceType.LINEAR, WorleyNoise.DistanceType.MANHATTAN);
        double xStart= Math.random();
        double XEnd=Math.random();
        double yStart=Math.random();
        double yEnd=Math.random();
        int xResolution = new Random().nextInt();
        int yResolution = new Random().nextInt();
        double[][] result=new double[xResolution][yResolution];

        for(int i=0;i<xResolution;i++){
            for(int j=0;j<yResolution;j++){
                long x=(int)(xStart+i*((XEnd-xStart)/xResolution));
                long y=(int)(yStart+j*((yEnd-yStart)/yResolution));
                long[] seed = Container.manage().createArrayLong(x, y);
                result[i][j]=0.5*(1+noise.getNoise2d((WorleyNoise.DistanceType)RandStream.pickFrom(types), RandStream.pickFrom(seed)));
            }
        }
        ImageType[] imageTypes = (ImageType[]) Container.manage().createArrayObject(ImageType.SIMPLE_INT_RGB, ImageType.SIMPLE_FLOAT_RGB);
        renderHelper(result, (ImageType) RandStream.pickFrom(imageTypes));

    }
    private static void renderHelper(double[][] data, ImageType type) {
        BufferedImage image = new BufferedImage(data.length,data[0].length, BufferedImage.TYPE_INT_RGB);

        for (int y = 0; y < data[0].length; y++)
        {
            for (int x = 0; x < data.length; x++)
            {
                if (data[x][y]>1){
                    data[x][y]=1;
                }
                if (data[x][y]<0){
                    data[x][y]=0;
                }
                Color color = new Color((float) data[x][y], (float) data[x][y], (float) data[x][y]);
                if(type == ImageType.SIMPLE_INT_RGB) {
                    color = RandStream.generateRandomColor();
                }
                image.setRGB(x, y, color.getRGB());
            }
        }
        try {
            // retrieve image
            File outputfile = new File("saved.png");
            outputfile.createNewFile();
             ImageIO.write(image, "png", outputfile);
        } catch (IOException exc) {
            throw new RuntimeException("Something very bad happened");
        }
    }
    public enum ImageType {
        SIMPLE_INT_RGB,
        SIMPLE_FLOAT_RGB,
    }
}
