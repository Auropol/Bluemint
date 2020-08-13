package me.auropol.bluemint.primitive;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

import static me.auropol.bluemint.primitive.Wrappers.addInfinitely;

public class Picker<T> {
    public T[] pickAndMerge(T[] input, Object[] inputForMerging) {
        T t = (T)Picker.pickFrom(inputForMerging);
        return new Container<T>().createArray(t, pickFromUniversal(input));
    }
    public T[] pickAndMerge(T[] input, Object[] inputForMerging, int radixInput, int radixInputForMerging) {
        return new Container<T>().createArray(input[radixInput], (T)inputForMerging[radixInputForMerging]);
    }
    public T pickFromUniversal(T[] input) {
        int nextT = new Random().nextInt(input.length);
        return input[nextT];
    }
    public T pickFromUniversal(T[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public T pickInOrderUniversal(T[] input) {
        return pickFromUniversal(input, addInfinitely(0, 1, input.length));
    }
    @Deprecated
    public T pickGradientlyFromUniversal(T[] input) {
        int arrBound = addInfinitely(1, 1, input.length);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, input.length) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    public static int pickRandomlyFromRange(int minValue, int maxValue) {
        int[] range = IntStream.range(minValue, maxValue).toArray();
        return Picker.pickFrom(range);
    }
    public static long pickRandomlyFromRange(long minValue, long maxValue) {
        long[] range = LongStream.range(minValue, maxValue).toArray();
        return Picker.pickFrom(range);
    }
    public static float pickRandomlyFromRange(float minValue, float maxValue) {
        float start = 0;
        double[] range = IntStream.range(Float.floatToIntBits(minValue), Float.floatToIntBits(maxValue)).asDoubleStream().toArray();
        for(double d : range) {
            start = start + Picker.pickFrom(Container.manage().createArrayFloat((float)d));
        }
        return start;
    }
    public static double pickRandomlyFromRange(double minValue, double maxValue) {
        return Picker.pickFrom(LongStream.range(Double.doubleToLongBits(minValue), Double.doubleToLongBits(maxValue)).asDoubleStream().toArray());
    }
    public static Object pickFrom(Object[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static int pickFrom(int[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static long pickFrom(long[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static short pickFrom(short[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static byte pickFrom(byte[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static float pickFrom(float[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static double pickFrom(double[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static char pickFrom(char[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static boolean pickFrom(boolean[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    public static String pickFrom(String[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }

    public static Object pickInOrder(Object[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static int pickInOrder(int[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static long pickInOrder(long[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static short pickInOrder(short[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static byte pickInOrder(byte[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static float pickInOrder(float[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static double pickInOrder(double[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static char pickInOrder(char[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static boolean pickInOrder(boolean[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public static String pickInOrder(String[] input) {
        return pickFrom(input, addInfinitely(0, 1, input.length));
    }
    public  static Object pickFrom(Object[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public  static int pickFrom(int[] input,  int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static long pickFrom(long[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static short pickFrom(short[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static byte pickFrom(byte[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static float pickFrom(float[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static double pickFrom(double[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static char pickFrom(char[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static boolean pickFrom(boolean[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    public static String pickFrom(String[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }

    @Deprecated
    public static String pickGradientlyFrom(String[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public static Object pickGradientlyFrom(Object[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public  static int pickGradientlyFrom(int[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public  static long pickGradientlyFrom(long[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public static short pickGradientlyFrom(short[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public  static byte pickGradientlyFrom(byte[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public static float pickGradientlyFrom(float[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public  static double pickGradientlyFrom(double[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public  static char pickGradientlyFrom(char[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
    @Deprecated
    public static boolean pickGradientlyFrom(boolean[] input) {
        int arrBound = addInfinitely(1, 1, 1000);
        if(arrBound == 1) {
            arrBound = addInfinitely(1, 1, 1000) + 2;
            return input[2];
        }
        int nextObjectRaw = new Random().nextInt(arrBound);
        if(arrBound == 1000) {
            return input[nextObjectRaw];
        } else {
            int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrBound));
            for(int i : numberBlackList)  {
                if(i == nextObjectRaw)  {
                    int anotherObject = new Random().nextInt(arrBound);
                    if(i == anotherObject) {
                        return input[new Random().nextInt(arrBound)];
                    }
                    return input[anotherObject];
                }
            }
        }
        return input[nextObjectRaw];
    }
}
