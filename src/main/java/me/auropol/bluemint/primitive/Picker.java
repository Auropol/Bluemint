package me.auropol.bluemint.primitive;

import java.util.Random;
import java.util.stream.IntStream;

import static me.auropol.bluemint.primitive.Wrappers.addInfinitely;

public interface Picker {
    static int pickRandomlyFromRange(int minValue, int maxValue) {
        int[] range = IntStream.range(minValue, maxValue).toArray();
        return Picker.pickFrom(range);
    }
    static Object pickFrom(Object[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static int pickFrom(int[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static long pickFrom(long[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static short pickFrom(short[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static byte pickFrom(byte[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static float pickFrom(float[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static double pickFrom(double[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static char pickFrom(char[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static boolean pickFrom(boolean[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }
    static String pickFrom(String[] input) {
        int nextObject = new Random().nextInt(input.length);
        return input[nextObject];
    }

    static Object pickInOrder(Object[] input) {
      return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static int pickInOrder(int[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static long pickInOrder(long[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static short pickInOrder(short[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static byte pickInOrder(byte[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static float pickInOrder(float[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static double pickInOrder(double[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static char pickInOrder(char[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static boolean pickInOrder(boolean[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static String pickInOrder(String[] input) {
        return pickFrom(input, addInfinitely(0, 1, 1000));
    }
    static Object pickFrom(Object[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static int pickFrom(int[] input,  int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static long pickFrom(long[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static short pickFrom(short[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static byte pickFrom(byte[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static float pickFrom(float[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static double pickFrom(double[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static char pickFrom(char[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static boolean pickFrom(boolean[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }
    static String pickFrom(String[] input, int radix) {
        if(input.length < radix)  {
            throw new IllegalStateException("Value of radix is bigger then length of array");
        }
        return input[radix];
    }

    @Deprecated
    static String pickGradientlyFrom(String[] input) {
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
    static Object pickGradientlyFrom(Object[] input) {
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
    static int pickGradientlyFrom(int[] input) {
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
    static long pickGradientlyFrom(long[] input) {
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
    static short pickGradientlyFrom(short[] input) {
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
    static byte pickGradientlyFrom(byte[] input) {
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
    static float pickGradientlyFrom(float[] input) {
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
    static double pickGradientlyFrom(double[] input) {
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
    static char pickGradientlyFrom(char[] input) {
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
    static boolean pickGradientlyFrom(boolean[] input) {
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
