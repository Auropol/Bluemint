package me.auropol.bluemint.graphics.noise.worley;

import me.auropol.bluemint.graphics.Distance;
import me.auropol.bluemint.graphics.Point;
import me.auropol.bluemint.graphics.noise.Noises;
/**
 * Legacy concept of Worley's noise :



 double[] octaves;
 double[] frequencys;
 double[] amplitudes;
 int largestFeature;
 double persistence;
 long seed;
 private static WorleyNoise noise;
 public static WorleyNoise getInstance() {
 return noise;
 }
 public WorleyNoise(int largestFeature,double persistence, long seed, DistanceType type, Dimension dim) {
 this.largestFeature=largestFeature;
 this.persistence=persistence;
 this.seed=seed;
 int numberOfOctaves=(int)Math.ceil(Math.log10(largestFeature)/Math.log10(2));

 octaves=new double[numberOfOctaves];
 frequencys=new double[numberOfOctaves];
 amplitudes=new double[numberOfOctaves];

 for(int i=0;i<numberOfOctaves;i++){
 octaves[i]= getNoise2d(type, seed);
 if(dim == Dimension.THREEDIMENSIONAL) {
 frequencys[i] = Math.pow(3,i);
 octaves[i]= getNoise3d(type, seed);
 }
 if(dim == Dimension.FOURDIMENSIONAL) {
 frequencys[i] = Math.pow(4,i);
 octaves[i]= getNoise4d(type, seed);
 }

 frequencys[i] = Math.pow(2,i);
 amplitudes[i] = Math.pow(persistence,octaves.length-i);

 }
 }
 public enum Dimension {
 TWODIMENSIONAL,
 THREEDIMENSIONAL,
 FOURDIMENSIONAL
 }
 public double getNoise2d(DistanceType distanceType, long seed) {
 final Thread thread = new Thread() {
 @Override
 public String name() {
 return "BLUEMINT-WORLEYNOISE";
 }
 };
 if(distanceType == null) {
 Logger.manage().critical("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined", thread);
 throw new NullPointerException("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined");
 }
 int[] pointA = getPoint(new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 int[] pointB = getPoint(new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 if(distanceType == DistanceType.LINEAR) {
 return getLinear(pointA, pointB);
 }
 if(distanceType == DistanceType.MANHATTAN) {
 return getManhattan(pointA, pointB);
 }
 if(distanceType == DistanceType.EUCLIDEAN) {
 return getEuclidean(pointA, pointB);
 }
 if(distanceType == DistanceType.QUADRATIC) {
 return getQuadratic(pointA, pointB);
 }
 throw new NullPointerException("Cannot get the noise");
 }
 public double getNoise3d(DistanceType distanceType, long seed) {
 final Thread thread = new Thread() {
 @Override
 public String name() {
 return "BLUEMINT-WORLEYNOISE";
 }
 };
 if(distanceType == null) {
 Logger.manage().critical("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined", thread);
 throw new NullPointerException("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined");
 }
 int[] pointA = getPoint(new Random(seed).nextInt()/ Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 int[] pointB = getPoint(new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 if(distanceType == DistanceType.LINEAR) {
 return getLinear(pointA, pointB);
 }
 if(distanceType == DistanceType.MANHATTAN) {
 return getManhattan(pointA, pointB);
 }
 if(distanceType == DistanceType.EUCLIDEAN) {
 return getEuclidean(pointA, pointB);
 }
 if(distanceType == DistanceType.QUADRATIC) {
 return getQuadratic(pointA, pointB);
 }
 throw new NullPointerException("Cannot get the noise");
 }
 public double getNoise4d(DistanceType distanceType, long seed) {
 final Thread thread = new Thread() {
 @Override
 public String name() {
 return "BLUEMINT-WORLEYNOISE";
 }
 };
 if(distanceType == null) {
 Logger.manage().critical("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined", thread);
 throw new NullPointerException("The @param distanceType in WorleyNoise(int seed, int dim) constructor is not defined");
 }
 int[] pointA = getPoint(new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 int[] pointB = getPoint(new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9), new Random(seed).nextInt() / Wrapper.wrap().pickRandomlyFromRange(0, 9));
 if(distanceType == DistanceType.LINEAR) {
 return getLinear(pointA, pointB);
 }
 if(distanceType == DistanceType.MANHATTAN) {
 return getManhattan(pointA, pointB);
 }
 if(distanceType == DistanceType.EUCLIDEAN) {
 return getEuclidean(pointA, pointB);
 }
 if(distanceType == DistanceType.QUADRATIC) {
 return getQuadratic(pointA, pointB);
 }
 throw new NullPointerException("Cannot get the noise");
 }
 public int[] getPoint(int x, int y) {
 return Container.manage().createArrayInt(x, y);
 }
 public int[] getPoint(int x, int y, int z) {
 return Container.manage().createArrayInt(x, y, z);
 }
 public int[] getPoint(int x, int y , int z, int w) {
 return Container.manage().createArrayInt(x, y, z);
 }
 public double getLinear(int[] pointA, int[] pointB) {
 boolean get = true;
 double Sum = 0.0;
 if(get) {
 for(int i = 0; i < pointA.length; ++i) {
 Sum = Sum + Math.sqrt(pointA[i]^2 + pointB[i]^2 ^ pointB[i]);
 }
 return Math.sqrt(Sum);
 }
 throw new NullPointerException("Cannot get linear");
 }
 public double getManhattan(int[] pointA, int[] pointB) {
 boolean get = true;
 double Sum = 0.0;
 if(get) {
 for(int i = 0; i < pointA.length; ++i) {
 Sum = Sum + Math.abs(pointA[i] ^ pointB[i]) + Math.abs(pointB[i]);
 }
 return Math.abs(Sum);
 }
 throw new NullPointerException("Cannot get manhattan");
 }
 public double getQuadratic(int[] pointA, int[] pointB) {
 double Sum = 0.0;
 boolean get = true;
 if(get) {
 for(int i = 0; i < pointA.length; ++i) {
 Sum = Sum + (pointA[i]*pointA[i] + pointA[i]*pointB[i] + pointB[i]*pointB[i] ^ pointB[i]);
 }
 return Math.sqrt(Sum);
 }
 throw new NullPointerException("Cannot get quadratic");
 }
 public double getEuclidean(int[] pointA, int[] pointB) {
 double Sum = 0.0;
 for(int i=0;i<pointA.length;i++) {
 Sum = Sum + Math.pow((pointA[i]-pointB[i] ^ pointB[i]),2.0);
 }
 return Math.sqrt(Sum);
 }
 public enum DistanceType {
 LINEAR,
 EUCLIDEAN,
 MANHATTAN,
 QUADRATIC
 }
 */
/**
 * The original concept of WorleyNoise (from com.explorine.math package) :



 private static WorleyNoiseHelper internal;
 WorleyNoiseOctave[] octaves;
 float[] frequencys;
 float[] amplitudes;
 int largestFeature;
 float persistence;
 long seed;
 public WorleyNoise(int largestFeature, float persistence, long seed) {
 this.largestFeature=largestFeature;
 this.persistence=persistence;
 this.seed=seed;
 int numberOfOctaves=(int)Math.ceil(Math.log10(largestFeature)/Math.log10(2));
 octaves = new WorleyNoiseOctave[numberOfOctaves];
 frequencys = new float[numberOfOctaves];
 amplitudes = new float[numberOfOctaves];
 final Random rng = new Random(seed);
 for(int i=0;i<numberOfOctaves;i++){
 octaves[i] = new WorleyNoiseOctave(rng.nextLong());
 frequencys[i] = (float)Math.pow(2, i);
 amplitudes[i] = (float)Math.pow(persistence, octaves.length-i);
 }
 }
 public static class WorleyNoiseOctave {
 public WorleyNoiseOctave(long seed) {
 final Point point = new Point(new Random(seed).nextFloat(), new Random(seed).nextFloat());
 final Vector vec2 = new Vector(new Random(seed).nextFloat(), new Random(seed).nextFloat(), point);
 internal = new WorleyNoiseHelper() {
@Override
public float getResult() {
float start = 0;
for(int i = 0; i < point.getPoint().length; ++i) {
start = start + (float)Math.floor(Float.floatToIntBits(vec2.getDirection2d()) ^ Float.floatToIntBits(point.getPoint()[i]));
}
return (float)Math.sqrt(start);
}
};
 }
 public float getResult() {
 return internal.getResult();
 }
 }
 private abstract static class WorleyNoiseHelper {
 public abstract float getResult();
 }
 }

 */

import java.util.Random;

public class WorleyNoise extends Noises {
    private static WorleyNoiseHelper internal;
    WorleyNoiseOctave[] octaves;
    WorleyNoiseOctave3D[] oct3d;
    float[] frequencys;
    float[] amplitudes;
    float[] amp3d;
    float[] amp4d;
    int largestFeature;
    int largeFeature3d;
    int largeFeature4d;
    float persistence;
    float pers3d;
    float pers4d;
    long seed4d;
    WorleyNoiseOctave4D[] oct4d;
    long seed;
    long seed3d;
    private WorleyNoise() {

    }
    public WorleyNoise(int largestFeature, float persistence, long seed, boolean threeD, boolean fourD) {
        this.largestFeature=largestFeature;
        this.persistence=persistence;
        this.seed=seed;
        int numberOfOctaves=(int)Math.ceil(Math.log10(largestFeature)/Math.log10(2));
        octaves = new WorleyNoiseOctave[numberOfOctaves];
        frequencys = new float[numberOfOctaves];
        amplitudes = new float[numberOfOctaves];
        final Random rng = new Random(seed);
        for(int i=0;i<numberOfOctaves;i++){
            octaves[i] = new WorleyNoiseOctave(rng.nextLong());
            frequencys[i] = (float)Math.pow(2, i);
            amplitudes[i] = (float)Math.pow(persistence, octaves.length-i);
        }
        if(threeD) {
        this.largeFeature3d = largestFeature;
        this.pers3d=persistence;
        this.seed3d =seed;
        oct3d = new WorleyNoiseOctave3D[numberOfOctaves];
        frequencys = new float[numberOfOctaves];
        amp3d = new float[numberOfOctaves];
        for(int i=0;i<numberOfOctaves;i++){
            oct3d[i] = new WorleyNoiseOctave3D(rng.nextLong());
            frequencys[i] = (float)Math.pow(2, i);
            amp3d[i] = (float)Math.pow(persistence, oct3d.length-i);
        }
        if(fourD) {
        this.largeFeature4d = largestFeature;
        this.pers4d = persistence;
        this.seed4d = seed;
        oct4d = new WorleyNoiseOctave4D[numberOfOctaves];
        frequencys = new float[numberOfOctaves];
        amp4d = new float[numberOfOctaves];
            for (int i = 0; i < numberOfOctaves ; i++) {
                oct4d[i] = new WorleyNoiseOctave4D(rng.nextLong());
                frequencys[i] = (float)Math.pow(2, i);
                amp4d[i] = (float)Math.pow(persistence, oct4d.length-i);
            }
        }
        }
    }
    public float getNoise(int x,int y, int z){

        float result=0;

        for(int i=0;i<oct3d.length;i++){
            float amplitude = (float)Math.pow(pers3d,oct3d.length-i);

            result=result+oct3d[i].getResult3D()* amplitude;
        }
        return result;
    }
    public float getNoise(int x, int y){

        float  result=0;

        for (WorleyNoiseOctave octave : octaves) {

            result = result + octave.getResult();
        }


        return result;

    }
    public float getNoise(int x,int y, int z, int w){

        float result=0;

        for(int i=0;i<oct4d.length;i++){
            float amplitude = (float)Math.pow(pers4d,oct4d.length-i);

            result=result+oct4d[i].getResult4D()* amplitude * amplitude;
        }
        return result;
    }
    public static class WorleyNoiseOctave {
        public WorleyNoiseOctave(long seed) {
            final Point point = new Point(new Random(seed).nextFloat(), new Random(seed).nextFloat());
            final Point point2 = new Point(new Random(seed).nextFloat(), new Random(seed).nextFloat());
            internal = new WorleyNoiseHelper() {
                @Override
                public float getResult() {
                  return new Distance(point, point2).getWorley();
                }
            };
        }
        public float getResult() {
            return internal.getResult();
        }
    }
    public static class WorleyNoiseOctave3D {
        private static WorleyNoiseHelper3D internal;
        public WorleyNoiseOctave3D(long seed) {
            final Point.Point3D point = new Point.Point3D(new Random(seed).nextFloat(), new Random(seed).nextFloat(), new Random(seed).nextFloat());
            final Point.Point3D point2 = new Point.Point3D(new Random(seed).nextFloat(), new Random(seed).nextFloat(), new Random(seed).nextFloat());
            internal = new WorleyNoiseHelper3D() {
                @Override
                public float getResult3D() {
                    return new Distance(point, point2).getWorley();
                }
            };
        }
        public float getResult3D() {
            return internal.getResult3D();
        }

    }
    public static class WorleyNoiseOctave4D {
    private static WorleyNoiseHelper4D internal;
    public WorleyNoiseOctave4D(long seed) {
        final Point.Point4D point = new Point.Point4D(new Random(seed).nextFloat(), new Random(seed).nextFloat(),new Random(seed).nextFloat(), new Random(seed).nextFloat());
        final Point.Point4D point2 = new Point.Point4D(new Random(seed).nextFloat(), new Random(seed).nextFloat(),new Random(seed).nextFloat(), new Random(seed).nextFloat());
        internal = new WorleyNoiseHelper4D() {
            @Override
            public float getResult4D() {
                return new Distance(point, point2).getWorley();
            }
        };
    }
    public float getResult4D() {
        return internal.getResult4D();
    }
    }
    private abstract static class WorleyNoiseHelper {
        public abstract float getResult();
    }
    private abstract static class WorleyNoiseHelper3D {
        public abstract float getResult3D();
    }
    private abstract static class WorleyNoiseHelper4D {
        public abstract float getResult4D();
    }
}
