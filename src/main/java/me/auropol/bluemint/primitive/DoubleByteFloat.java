package me.auropol.bluemint.primitive;

import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public final class DoubleByteFloat implements Comparable<DoubleByteFloat>{
    private static abstract class DoubleByteFloatHelper {
        public abstract float floatValue();
    }
    private static DoubleByteFloatHelper internal;
    private static DoubleByteFloatHelper internalStorage;
    private static float MAX_VALUE_FLOAT = 255.999f;
    private static float MIN_VALUE_FLOAT = -256.999f;
    public static DoubleByteFloat MAX_VALUE = new DoubleByteFloat(MAX_VALUE_FLOAT);
    public static DoubleByteFloat MIN_VALUE = new DoubleByteFloat(MIN_VALUE_FLOAT);
    public static DoubleByteFloat NaN = new DoubleByteFloat(Float.NaN);
    public static DoubleByteFloat POSITIVE_INFINITY = new DoubleByteFloat(Float.POSITIVE_INFINITY);
    public static DoubleByteFloat NEGATIVE_INFINITY = new DoubleByteFloat(Float.NEGATIVE_INFINITY);
    public synchronized int compareTo(@NotNull DoubleByteFloat o) {
        return compare(new DoubleByteFloat(), o);
    }
    public static DoubleByteFloat valueOf(DoubleByteFloat anotherDoubleByteFloat)  {
        return anotherDoubleByteFloat;
    }
    public static DoubleByteFloat valueOf(DoubleByte b) {
        return new DoubleByteFloat(b.floatValue());
    }
    public static DoubleByteFloat valueOf(float f) {
        return round(f);
    }
    public static DoubleByteFloat valueOf(String s) {
        return parseDoubleByteFloat(s);
    }
    public static DoubleByteFloat parseDoubleByteFloat(String s)  {
       DoubleByteFloat b = new DoubleByteFloat(Float.parseFloat(s));
       if(b.floatValue() > MAX_VALUE_FLOAT) {
           return new DoubleByteFloat(Float.NaN);
       }
       if(b.floatValue() < MIN_VALUE_FLOAT) {
           return new DoubleByteFloat(Float.NaN);
       }
       return b;
    }
    public DoubleByteFloat(float value) {
        if(rfloat(value)> MAX_VALUE_FLOAT) {
            throw new IllegalStateException("The value is too high to process");
        }
        if(rfloat(value) < MIN_VALUE_FLOAT) {
            throw new IllegalStateException("The value is too low to process");
        }
        internal = new DoubleByteFloatHelper() {
            @Override
            public float floatValue() {
                return rfloat(value);
            }
        };
        internalStorage = new DoubleByteFloatHelper() {
            @Override
            public float floatValue() {
                return rfloat(value);
            }
        };
    }
    public static String toString(DoubleByteFloat b) {
        return Float.toString(b.floatValue());
    }
    public String toString() {
        return toString(new DoubleByteFloat());
    }
    public float floatValue() {
        return internal.floatValue();
    }
    public static String toHexString(DoubleByteFloat b) {
        return Float.toHexString(b.floatValue());
    }
    public String toHexString() {
        return toHexString(new DoubleByteFloat());
    }
    public static boolean isFinite(DoubleByteFloat b) {
        return Float.isFinite(b.floatValue());
    }
    public static boolean isInfinite(DoubleByteFloat b) {
        return Float.isInfinite(b.floatValue());
    }
    public static boolean isNaN(DoubleByteFloat b) {
        return Float.isNaN(b.floatValue());
    }
    public boolean isFinite() {
        return isFinite(new DoubleByteFloat());
    }
    public boolean isInfinite()  {
        return isInfinite(new DoubleByteFloat());
    }
    public boolean isNaN() {
        return isNaN(new DoubleByteFloat());
    }
    public DoubleByte toDoubleByte() {
       return new DoubleByte(Math.round(internal.floatValue()));
    }
    public static int hashCode(DoubleByteFloat b) {
        return Float.hashCode(b.floatValue());
    }
    public int hashCode() {
        return hashCode(new DoubleByteFloat());
    }
    public static DoubleByteFloat round(float f) {
        return new DoubleByteFloat(rfloat(f));
    }
    private static float rfloat(float f) {
        boolean negative = f < 0;
       final float ff = Math.abs(f);
       String str = String.valueOf(ff);
       Character[] cs = str.chars().mapToObj(c -> (char)c).toArray(Character[]::new);
       Character[] c = new Container<Character>().shorten(cs, 6);
       Character[] c2 = new Container<Character>().shorten(cs, 5);
       Character[] c3 = new Container<Character>().shorten(cs, 4);
       Character[] c4 = new Container<Character>().shorten(cs, 3);
       float finalFloat = Float.parseFloat(Arrays.toString(c));
       float f2 = Float.parseFloat(Arrays.toString(c2));
       float f3 = Float.parseFloat(Arrays.toString(c3));
       float f4 = Float.parseFloat(Arrays.toString(c4));
       if(finalFloat > MAX_VALUE_FLOAT) {
           if(negative) {
               f2 = -f2;
           }
           return f2;
       }
       if(f2 > MAX_VALUE_FLOAT) {
           if(negative) {
               f3 = -f3;
           }
           return f3;
       }
       if(f3 > MAX_VALUE_FLOAT) {
           if(negative) {
               f4 = -f4;
           }
           return f4;
       }
       if(negative) {
           finalFloat = -finalFloat;
       }
       return finalFloat;

    }

    private DoubleByteFloat() {
        internal = new DoubleByteFloatHelper() {
            @Override
            public float floatValue() {
                return internalStorage.floatValue();
            }
        };
    }
    public static DoubleByte toDoubleByte(DoubleByteFloat b) {
        return new DoubleByte(Math.round(b.floatValue()));
    }
    public static int compare(DoubleByteFloat a, DoubleByteFloat b) {
        return Float.compare(a.floatValue(), b.floatValue());
    }
}
