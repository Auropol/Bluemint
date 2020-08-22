package me.auropol.bluemint.primitive;

import org.jetbrains.annotations.NotNull;

public final class DoubleByte implements Comparable<DoubleByte>{
    public static final DoubleByte MAX_VALUE = new DoubleByte(255);
    public static final DoubleByte MIN_VALUE = new DoubleByte(-256);
    private static final int MAX_VALUE_INT = 255;
    private static final int MIN_VALUE_INT = -256;
    public synchronized int compareTo(@NotNull DoubleByte o) {
        return compare(new DoubleByte(), o);
    }

    private static abstract class DoubleByteHelper {
        public abstract int integerValue();
    }
    private static DoubleByteHelper internal;
    private static DoubleByteHelper internalStorage;
    public static DoubleByte valueOf(DoubleByte b) {
        return b;
    }
    public static DoubleByte valueOf(String s) {
        return parseDoubleByte(s);
    }
    public static DoubleByte valueOf(String s, int radix) {
        return parseDoubleByte(s, radix);
    }
    public static DoubleByte valueOf(DoubleByteFloat b) {
        return b.toDoubleByte();
    }
    public static DoubleByte valueOf(byte[] bs) {
        if(bs[0] < 0) {
            return new DoubleByte(Math.negateExact(Math.abs(bs[0]) + Math.abs(bs[1])));
        }
        if(bs[1] < 0) {
            return new DoubleByte(Math.negateExact(Math.abs(bs[0]) + Math.abs(bs[1])));
        }
        return new DoubleByte(Math.abs(bs[0]) + Math.abs(bs[1]));
    }
    public DoubleByte(int value) {
        if(value > MAX_VALUE_INT) {
            throw new IllegalStateException("The value is too high to process");
        }
        if(value < MIN_VALUE_INT)  {
            throw new IllegalStateException("The value is too high to process");
        }
        internal = new DoubleByteHelper() {
            @Override
            public int integerValue() {
                return value;
            }
        };
        internalStorage = new DoubleByteHelper() {
            @Override
            public int integerValue() {
                return value;
            }
        };
    }
    private DoubleByte() {
        internal = new DoubleByteHelper() {
            @Override
            public int integerValue() {
                return internalStorage.integerValue();
            }
        };
    }
    public int integerValue() {
        return internal.integerValue();
    }
    public static byte[] toByteArray(DoubleByte db) {
        byte b = (byte) (db.integerValue() / 2);
        byte a = (byte) (Math.negateExact(Math.abs(db.integerValue()) / 2));
        if(db.integerValue() > Byte.MAX_VALUE) {
            return barray(b, b);
        }
        if(db.integerValue() < Byte.MIN_VALUE) {
            return barray(a, a);
        }
        return barray((byte)db.integerValue());
    }
    public String toString() {
        return toString(new DoubleByte());
    }
    public int hashCode() {
        return hashCode(new DoubleByte());
    }
    public byte[] byteArrayValue() {
        return toByteArray(new DoubleByte());
    }
    public static DoubleByte parseDoubleByte(String s) {
        DoubleByte b = new DoubleByte(Integer.parseInt(s));
        if(b.integerValue() > MAX_VALUE_INT) {
            return new DoubleByte(MAX_VALUE_INT);
        }
        if(b.integerValue() < MIN_VALUE_INT) {
            return new DoubleByte(MIN_VALUE_INT);
        }
        return b;
    }
    public static DoubleByte parseDoubleByte(String s, int radix) {
        DoubleByte b = new DoubleByte(Integer.parseInt(s, radix));
        if(b.integerValue() > MAX_VALUE_INT) {
            return new DoubleByte(MAX_VALUE_INT);
        }
        if(b.integerValue() < MIN_VALUE_INT) {
            return new DoubleByte(MIN_VALUE_INT);
        }
        return b;
    }
    public static int compare(DoubleByte a, DoubleByte b) {
        return Integer.compare(a.integerValue(), b.integerValue());
    }
    public static int toUnsignedInt(DoubleByte b) {
        return b.integerValue();
    }
    public static short toUnsignedShort(DoubleByte b) {
        return (short)b.integerValue();
    }
    public static long toUnsignedLong(DoubleByte b) {
        return b.integerValue();
    }
    public static DoubleByteFloat toDoubleByteFloat(DoubleByte b) {
        return DoubleByteFloat.valueOf(b);
    }
    public float floatValue() {
        return (float)internal.integerValue();
    }
    public DoubleByteFloat doubleByteFloatValue() {
        return DoubleByteFloat.valueOf(((float)internal.integerValue()));
    }
    public double doubleValue() {
        return internal.integerValue();
    }
    public short shortValue() {
        return (short)internal.integerValue();
    }
    public long longValue() {
        return internal.integerValue();
    }
    public static int hashCode(DoubleByte b) {
        return Integer.hashCode(b.integerValue());
    }
    public static int decode(String s) {
        return Integer.decode(s);
    }
    public static String toString(DoubleByte b) {
        return Integer.toString(b.integerValue());
    }

    private static byte[] barray(byte... bytes) {
        return bytes;
    }
}
