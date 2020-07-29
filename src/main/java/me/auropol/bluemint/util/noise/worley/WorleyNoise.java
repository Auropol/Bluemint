package me.auropol.bluemint.util.noise.worley;

import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.primitive.Wrapper;
import me.auropol.bluemint.util.Logger;
import me.auropol.bluemint.util.Thread;
import me.auropol.bluemint.util.noise.Noises;

import java.util.Random;
public class WorleyNoise extends Noises {
    @Override
    public Object registerNoise() {
        return this;
    }
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
}
