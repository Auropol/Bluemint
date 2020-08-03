package me.auropol.bluemint.util;

import java.awt.*;
import java.io.StringWriter;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

import me.auropol.bluemint.BluemintInitializer;
import me.auropol.bluemint.primitive.*;
import me.auropol.bluemint.primitive.Container;
import sun.util.calendar.BaseCalendar;

import static me.auropol.bluemint.primitive.Wrappers.addInfinitely;

public interface RandStream {
    static Color generateRandomColor() {
        byte nextByte = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
        byte nextByte2 = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
        byte nextByte3 = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
        byte nextByte4 = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
        byte nextByte5 = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
        byte nextByte6 = (byte) (new Random().nextInt(Byte.MAX_VALUE - 1 + 1) - 1);
       return Wrapper.wrap().getColor(nextByte, nextByte2, nextByte3, nextByte4, nextByte5, nextByte6);
    }
    static char generateRandomCharacter() {
        int nextChar = new Random().nextInt(7 - 1 + 1) - 1;
        int nextNumber = new Random().nextInt(9 - 1 + 1) - 1;
        String a = Map.assignToFrom("A", 1, new Random().nextInt(9 - 1 + 1) - 1);
        String b = Map.assignToFrom("B", 2, new Random().nextInt(9 - 1 + 1) - 1);
        String c = Map.assignToFrom("C", 3, new Random().nextInt(9 - 1 + 1) - 1);
        String d = Map.assignToFrom("D", 4, new Random().nextInt(9 - 1 + 1) - 1);
        String e = Map.assignToFrom("E", 5, new Random().nextInt(9 - 1 + 1) - 1);
        String f =  Map.assignToFrom("F", 6, nextChar);
        String number = Map.assignToFrom(String.valueOf(nextNumber),7, nextChar);
        char closeLiteral = '\u0031';
        String strCharacter = closeLiteral + "u" + a + b + c + d + e + f + number;
        int i = Integer.parseInt(strCharacter);
        return (char)i;
    }
    static String generateRandomLetter(boolean uppercase, boolean includeBlankCharacter) {
        String[] letters = Container.manage().createArrayString("a", "b", "c", "d", "e", "f", "g", "h", "c", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" ,"r", "s", "t", "u", "v", "w ","x ","y" ,"z");
        if(includeBlankCharacter) {
            letters = Container.manage().createArrayString("a", "b", "c", "d", "e", "f", "g", "h", "c", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" ,"r", "s", "t", "u", "v", "w ","x ","y" ,"z", " ");
            if(uppercase) {
                letters = Container.manage().createArrayString("A", "B", "C" ,"D" ,"E" ,"F" ,"G" ,"H" ," I"  ," J"  ,"K", "L" ,"M" ,"N" ,"O", "P", "Q", "R", "S", "T", "U","V"," W"," X"," Y", "Z", " ");
            }
        }
        if(uppercase) {
            letters = Container.manage().createArrayString("A", "B", "C" ,"D" ,"E" ,"F" ,"G" ,"H" ," I"  ," J"  ,"K", "L" ,"M" ,"N" ,"O", "P", "Q", "R", "S", "T", "U","V"," W"," X"," Y", "Z");
        }
        return pickFrom(letters);
    }
    @Deprecated
    static String generateRandomLetter(boolean uppercase) {
        int nextLetter = new Random().nextInt(26 - 1 + 1) - 1;
        String a = Map.assignToFrom("a", 1,  nextLetter);
        String b = Map.assignToFrom("b", 2,  nextLetter);
        String c = Map.assignToFrom("c", 3,  nextLetter);
        String d = Map.assignToFrom("d", 4,  nextLetter);
        String e = Map.assignToFrom("e", 5,  nextLetter);
        String f = Map.assignToFrom("f", 6,  nextLetter);
        String g = Map.assignToFrom("g", 7,  nextLetter);
        String h = Map.assignToFrom("h", 8,  nextLetter);
        String i = Map.assignToFrom("i", 9,  nextLetter);
        String j = Map.assignToFrom("j", 10,  nextLetter);
        String k = Map.assignToFrom("k", 11, nextLetter);
        String l = Map.assignToFrom("l", 12,  nextLetter);
        String m = Map.assignToFrom("m", 13, nextLetter);
        String n = Map.assignToFrom("n", 14,  nextLetter);
        String o = Map.assignToFrom("o", 15,  nextLetter);
        String p = Map.assignToFrom("p", 16,  nextLetter);
        String q = Map.assignToFrom("q", 17, nextLetter);
        String r = Map.assignToFrom("r", 18, nextLetter);
        String s = Map.assignToFrom("s", 19, nextLetter);
        String t = Map.assignToFrom("t", 20, nextLetter);
        String u = Map.assignToFrom("u", 21, nextLetter);
        String v = Map.assignToFrom("v", 22, nextLetter);
        String w = Map.assignToFrom("w", 23, nextLetter);
        String x = Map.assignToFrom("x", 24, nextLetter);
        String y = Map.assignToFrom("y", 25, nextLetter);
        String z = Map.assignToFrom("z", 26, nextLetter);
        if(uppercase) {
             a = Map.assignToFrom("A", 1, nextLetter);
            b = Map.assignToFrom("B", 2, nextLetter);
             c = Map.assignToFrom("C", 3, nextLetter);
            d = Map.assignToFrom("D", 4, nextLetter);
             e = Map.assignToFrom("E", 5, nextLetter);
             f = Map.assignToFrom("F", 6, nextLetter);
             g = Map.assignToFrom("G", 7, nextLetter);
             h = Map.assignToFrom("H", 8, nextLetter);
             i = Map.assignToFrom("I", 9, nextLetter);
             j = Map.assignToFrom("J", 10, nextLetter);
             k = Map.assignToFrom("K", 11, nextLetter);
             l = Map.assignToFrom("L", 12, nextLetter);
            m = Map.assignToFrom("M", 13, nextLetter);
             n = Map.assignToFrom("N", 14, nextLetter);
             o = Map.assignToFrom("O", 15, nextLetter);
             p = Map.assignToFrom("P", 16, nextLetter);
             q = Map.assignToFrom("Q", 17, nextLetter);
             r = Map.assignToFrom("R", 18, nextLetter);
            s = Map.assignToFrom("S", 19, nextLetter);
             t = Map.assignToFrom("T", 20, nextLetter);
             u = Map.assignToFrom("U", 21, nextLetter);
             v = Map.assignToFrom("V", 22, nextLetter);
             w = Map.assignToFrom("W", 23, nextLetter);
             x = Map.assignToFrom("X", 24, nextLetter);
             y = Map.assignToFrom("Y", 25, nextLetter);
             z = Map.assignToFrom("Z", 26, nextLetter);

        }
        return a + b + c + d + e+ f + g + h + i+ j + k + l + m + n + o + p + q + r + s + t + u + v + w + x + y + z;
    }
    static int[] generateRandomMoreDigitInteger(int digits) {
    Random random = new Random();
    byte[] bytes = new BigInteger(digits, random).toByteArray();
    return Converter.convert().byteArrayToIntArray(bytes);
    }
    static int generateRandomHexInteger() {
        int nextHex = new Random().nextInt(7 - 1 + 1) - 1;
        int nextNumber = new Random().nextInt(9 - 1 + 1) - 1;
        boolean nextMethod = new Random().nextBoolean();
        char zero = '\u0030';
        char x = '\u0078';
        String a = Map.assignToFrom("A", 1, nextHex);
        String b = Map.assignToFrom("B", 2, nextHex);
        String c = Map.assignToFrom("C", 3, nextHex);
        String d = Map.assignToFrom("D", 4, nextHex);
        String e = Map.assignToFrom("E", 5, nextHex);
        String f =  Map.assignToFrom("F", 6, nextHex);
        String hex = Integer.toHexString(new Random().nextInt());
        String number = Map.assignToFrom(String.valueOf(nextNumber),7, nextHex);
        if(nextMethod) {
            return Integer.parseInt(String.valueOf(zero) + x + a + b + c + d + e + f + number);
        }
      return Integer.parseInt(String.valueOf(zero) + x + hex);
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

    static byte generateRandomByte() {
        return (byte) ((byte)new Random().nextInt(Byte.MAX_VALUE - 1) + 1);
    }
    static short generateRandomShort() {
        return (short) ((short)new Random().nextInt(Short.MAX_VALUE - 1) + 1);
    }
    static String generateRandomHash() {
        String rnd = RandStream.generateRandomLetter(true) + RandStream.generateRandomLetter(false) + RandStream.generateRandomLetter(false) + RandStream.generateRandomLetter(false);
        byte[] input = rnd.getBytes();
        MessageDigest messageDigest = new MessageDigest("SHA-512") {
            @Override
            protected void engineUpdate(byte input) {

            }

            @Override
            protected void engineUpdate(byte[] input, int offset, int len) {

            }

            @Override
            protected byte[] engineDigest() {
                return input;
            }

            @Override
            protected void engineReset() {

            }
        };
        return Arrays.toString(messageDigest.digest(input));
    }
    static int blacklist(int arrayLength, boolean uncall) {
        int nextObjectRaw = new Random().nextInt(arrayLength);
        int[] numberBlackList = Container.manage().createArrayInt(new Random().nextInt(arrayLength));
        if(uncall) {
            for(int i : numberBlackList) {
                if(i == nextObjectRaw) {
                    int anotherObject = new Random().nextInt(arrayLength);
                    if(i == anotherObject) {
                        return new Random().nextInt(arrayLength);
                    }
                    return anotherObject;
                }
                return new Random().nextInt(arrayLength);
            }
        }
        return nextObjectRaw;
    }
    static Color changingColor() {
       Runnable task = new Task().generateNewTaskR(generateRandomColor());
       new Task().scheduleTaskAtFixedDelay(task, 1, 1, TimeUnit.MILLISECONDS);
       return generateRandomColor();
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
