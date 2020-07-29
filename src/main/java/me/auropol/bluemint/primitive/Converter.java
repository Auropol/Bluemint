package me.auropol.bluemint.primitive;


import java.util.Arrays;

public class Converter extends Wrappers {
    public static Converter convert() {
        return new Converter();
    }
    @Override
    public Object wrapper() {
        return this;
    }
    public char intToChar(int integer){
        if(integer > (int)Short.MAX_VALUE){
            return (char)Short.MAX_VALUE;
        }
        return (char)integer;
    }
    public char doubleToChar(double floatDouble){
        return (char)floatDouble;
    }
    public char floatToChar(float floatingPoint){
        return (char)floatingPoint;
    }
    public char longToChar(long longInt){
        if(longInt > (long)Short.MAX_VALUE){
            return (char)Short.MAX_VALUE;
        }
        return (char)longInt;
    }
    public char byteToChar(byte byteInt){
        return (char)byteInt;
    }
    public char shortToChar(short shortInt){
        return (char)shortInt;
    }
    public char booleanToChar(boolean bool){
        String str = Boolean.toString(bool);
        int i = Integer.parseInt(str);
        return (char)i;
    }
    public char objectToChar(Object object, int radix){
        String str = object.toString();
        int i = Integer.parseInt(str);
        return Character.forDigit(i, radix);
    }
    public char stringToChar(String string, int radix){
        int i = Integer.parseInt(string);
        return Character.forDigit(i, radix);
    }
    public char intToChar(int integer, int radix){
        return Character.forDigit(integer, radix);
    }
    public char doubleToChar(double d, int radix){
        int i = (int)d;
        return Character.forDigit(i, radix);
    }
    public char floatToChar(float f, int radix){
        int i = (int)f;
        return Character.forDigit(i, radix);
    }
    public char longToChar(long l, int radix){
        int i = (int)l;
        return Character.forDigit(i, radix);
    }
    public char byteToChar(byte b, int radix){
        return Character.forDigit(b, radix);
    }
    public char shortToChar(short s, int radix){
        return Character.forDigit(s, radix);
    }
    public int charToInt(char character){
        return character;
    }
    public float charToFloat(char character){
        return character;
    }
    public double charToDouble(char character){
        return character;
    }
    public short charToShort(char character){
        return (short)character;
    }
    public boolean charToBoolean(char character){
        String str = Character.toString(character);
        return Boolean.parseBoolean(str);
    }
    public long charToLong(char character){
        String str = Character.toString(character);
        return Long.parseLong(str);
    }
    public byte charToByte(char character){
        String str = Character.toString(character);
        if(character > Byte.MAX_VALUE) {
            character = (char)Byte.MAX_VALUE;
        }
        return Byte.parseByte(str);
    }
    //Object, String, array, double, float, byte, short, int, long, boolean, char
    public boolean objectToBoolean(Object object){
        String str = (String)object;
        return Boolean.parseBoolean(str);
    }
    public boolean stringToBoolean(String string){
        return Boolean.parseBoolean(string);
    }
    public boolean doubleToBoolean(double d){
        String str = String.valueOf(d);
        return Boolean.parseBoolean(str);
    }
    public boolean floatToBoolean(float f){
        String str = String.valueOf(f);
        return Boolean.parseBoolean(str);
    }
    public boolean byteToBoolean(byte b){
        String str = String.valueOf(b);
        return Boolean.parseBoolean(str);
    }
    public int[] intToIntArray(int integer) {
        String str = Integer.toString(integer);
        int[] ints = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            ints[i] = str.charAt(i) - '0';
        }
        return ints;
    }
    public int[] byteArrayToIntArray(byte[] bytes) {
        String str = byteArrayToByte(bytes);
        int[] ints = new int[str.length()];
        for(int i = 0; i < str.length(); i++) {
            ints[i] = str.charAt(i) - '0';
        }
        return ints;
    }
    public String byteArrayToByte(byte[] bytes) {
        StringBuilder builder = new StringBuilder();
        for (byte b : bytes) {
            builder.append(b);
        }
        return builder.toString();
    }
}
