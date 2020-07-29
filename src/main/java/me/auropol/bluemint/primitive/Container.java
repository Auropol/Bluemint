package me.auropol.bluemint.primitive;

import me.auropol.bluemint.util.Map;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Objects;
import java.util.Random;

public class Container extends Wrappers {
    public boolean inputContains(int input, int target) {
        String sInput = Integer.toString(input);
        String sInteger = Integer.toString(target);
        return sInput.contains(sInteger);
    }
    public boolean inputContentEquals(int input, int target){
        return input == target;
    }
    public boolean inputContains(Object input, Object target){
        String sInput = String.valueOf(input);
        String sObject = String.valueOf(target);
        return sInput.contains(sObject);
    }
    public boolean inputContentEquals(Object input, Object target){
        return Objects.equals(input, target);
    }
    public boolean inputContains(char input, char target) {
        Character cInput = input;
        Character cTarget = target;
        String sInput = String.valueOf(cInput);
        String sTarget = String.valueOf(cTarget);
        return sInput.contains(sTarget);
    }
    public boolean inputContentEquals(char input, char target){
        return input == target;
    }
    public boolean inputContains(float input, float target){
        String sInput = String.valueOf(input);
        String sTarget = String.valueOf(target);
        return sInput.contains(sTarget);
    }
    public boolean inputContentEquals(float input, float target){
        return input == target;
    }
    public boolean inputContains(double input, double target){
        String sInput = String.valueOf(input);
        String sTarget = String.valueOf(target);
        return sInput.contains(sTarget);
    }
    public boolean inputContentEquals(double input, double target){
        return input == target;
    }
    public boolean inputContains(long input, long target){
        String sInput = String.valueOf(input);
        String sTarget = String.valueOf(target);
        return sInput.contains(sTarget);
    }
    public boolean inputContentEquals(long input, long target){
        return input == target;
    }
    public boolean inputContains(short input, short target){
        return this.inputContains((int)input, (int)target);
    }
    public boolean inputContentEquals(short input, short target){
        return input == target;
    }
    public boolean inputContains(byte input, byte target){
        return this.inputContains((int)input, (int)target);
    }
    public boolean inputContentEquals(byte input, byte target){
        return input == target;
    }
    public boolean inputContains(){
        double nextDouble = new Random().nextDouble();
        boolean nextBoolean = new Random().nextBoolean();
        float nextFloat = new Random().nextFloat();
        long nextLong = new Random().nextLong();
        short nextShort = (short)new Random().nextInt(Short.MAX_VALUE - 1);
        byte nextByte = (byte)new Random().nextInt(Byte.MAX_VALUE - 1);
        int nMinValue = 1;
        int nMaxValue = 3;
        int nextLetter = new Random().nextInt(nMinValue + nMaxValue) - nMinValue;
        String a = Map.assignToFrom("a", 1, nextLetter);
        String b = Map.assignToFrom("b", 2, nextLetter);
        String c = Map.assignToFrom("c", 3, nextLetter);
        char ca =  Map.assignToFrom((char)1, 1, nextLetter);
        char cb = Map.assignToFrom((char)2, 2, nextLetter);
        char cc = Map.assignToFrom((char)3, 3, nextLetter);
        boolean methodOne = Map.assignToFrom(inputContains(new Random().nextInt(), new Random().nextInt()), true, nextBoolean);
        boolean methodTwo = Map.assignToFrom(inputContains(nextByte, nextByte), true, nextBoolean);
        boolean methodThree = Map.assignToFrom(inputContains(ca + cb + cc, ca + cb + cc), true, nextBoolean);
        boolean methodFour = Map.assignToFrom(inputContains(nextLong, nextLong), true, nextBoolean);
        boolean methodFive = Map.assignToFrom(inputContains(nextFloat, nextFloat), true, nextBoolean);
        boolean methodSix = Map.assignToFrom(inputContains(nextDouble, nextDouble), true, nextBoolean);
        boolean methodSeven = Map.assignToFrom(inputContains(nextShort, nextShort), true, nextBoolean);
        boolean methodEight = Map.assignToFrom(inputContains(a + b + c, a + b + c), true, nextBoolean);
        if(methodOne){
            return true;
        }
        if(methodTwo){
            return true;
        }
        if(methodThree){
            return true;
        }
        if(methodFive){
            return true;
        }
        if(methodSix){
            return true;
        }
        if(methodSeven){
            return true;
        }
        if(methodFour){
            return true;
        }
        return methodEight;
}
public boolean inputContentEquals() {
    double nextDouble = new Random().nextDouble();
    boolean nextBoolean = new Random().nextBoolean();
    float nextFloat = new Random().nextFloat();
    long nextLong = new Random().nextLong();
    short nextShort = (short)new Random().nextInt(Short.MAX_VALUE - 1);
    byte nextByte = (byte)new Random().nextInt(Byte.MAX_VALUE - 1);
    int nMinValue = 1;
    int nMaxValue = 3;
    int nextLetter = new Random().nextInt(nMinValue + nMaxValue) - nMinValue;
    String a = Map.assignToFrom("a", 1, nextLetter);
    String b = Map.assignToFrom("b", 2, nextLetter);
    String c = Map.assignToFrom("c", 3, nextLetter);
    char ca =  Map.assignToFrom((char)1, 1, nextLetter);
    char cb = Map.assignToFrom((char)2, 2, nextLetter);
    char cc = Map.assignToFrom((char)3, 3, nextLetter);
    boolean methodOne = Map.assignToFrom(this.inputContentEquals(new Random().nextInt(), new Random().nextInt()), true, nextBoolean);
    boolean methodTwo = Map.assignToFrom(this.inputContentEquals(nextByte, nextByte), true, nextBoolean);
    boolean methodThree = Map.assignToFrom(this.inputContentEquals(ca + cb + cc, ca + cc + cb), true, nextBoolean);
    boolean methodFour = Map.assignToFrom(this.inputContentEquals(nextLong, nextLong), true, nextBoolean);
    boolean methodFive = Map.assignToFrom(this.inputContentEquals(nextDouble, nextDouble), true, nextBoolean);
    boolean methodSix = Map.assignToFrom(this.inputContentEquals(nextShort, nextShort), true, nextBoolean);
    boolean methodSeven = Map.assignToFrom(this.inputContentEquals(nextFloat, nextFloat), true, nextBoolean);
    boolean methodEight = Map.assignToFrom(this.inputContentEquals(a + b + c, a + b + c), true, nextBoolean);
    if(methodOne){
        return true;
    }
    if(methodTwo){
        return true;
    }
    if(methodThree){
        return true;
    }
    if(methodFive){
        return true;
    }
    if(methodSix){
        return true;
    }
    if(methodSeven){
        return true;
    }
    if(methodFour){
        return true;
    }
    return methodEight;
}
//Object, String, long, int, short, char, double, float, byte
    public String[] createArrayString(String... strings) {
        return strings;
    }
    public Object[] createArrayObject(Object... objects) {
       return objects;
    }
    public long[] createArrayLong(long... longs) {
        return longs;
    }
    public int[] createArrayInt(int... ints) {
        return ints;
    }
    public short[] createArrayShort(short... shorts) {
        return shorts;
    }
    public char[] createArrayChar(char... chars) {
        return chars;
    }
    public double[] createArrayDouble(double... doubles) {
        return doubles;
    }
    public static Container manage(){
        return new Container();
    }
    @Override
    public Object wrapper() {
        return this;
    }
}
