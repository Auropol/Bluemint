package me.auropol.bluemint.primitive;

import me.auropol.bluemint.util.Map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;

public class Container<T> extends Wrappers {
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
    boolean methodEight = Map.assignToFrom(new Container<String>().inputContentEquals(a + b + c, a + b + c), true, nextBoolean);
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
    public byte[] createArrayByte(byte... bytes) {
        return bytes;
    }
    public T[] replace(T[] input, T oldValue, T replacingValue) {
        if(inputContains(input, oldValue)) {
           int index = Arrays.asList(input).indexOf(oldValue);
           ArrayList<T> list = (ArrayList<T>) Arrays.asList(input);
           list.set(index, replacingValue);
           return (T[])list.toArray();
        } else {
            throw new RuntimeException("Could not find the value you wanted to replace in an array");
        }
    }
    @SafeVarargs
    public final T[] createArray(T... ts) {
        return ts;
    }
    public T[] multifill(T[] input, T[] fillingValue) {
        for (T t: fillingValue) {
         Arrays.fill(input, t);
        }
        return input;
    }
    public T[] shorten(T[] input, int newLength) {
        return Arrays.copyOf(input, newLength);
    }
    public boolean inputContains(T[] input, T target) {
        for(Object ob : input)  {
            if(ob == target) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContentEquals(T input, T target) {
        return Objects.equals(input, target);
    }
    public float[] createArrayFloat(float... floats) {
        return floats;
    }
    public boolean inputContentEquals(T[] input, T[] target) {
        return input == target;
    }
    public boolean inputContains(String[] input, String target) {
        for(String s : input)  {
            if(s.equals(target)) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(long[] input, long target) {
        for(long l : input)  {
            if(l == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(int[] input, int target) {
        for(int i : input)  {
            if(i  == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(short[] input, short target) {
        for(short s : input)  {
            if(s == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(char[] input, char target) {
        for(char c : input)  {
            if(c == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(double[] input, double target) {
        for(double d : input)  {
            if(d == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(float[] input, float target) {
        for(float f : input)  {
            if(f == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean inputContains(byte[] input, byte target) {
        for(byte b : input)  {
            if(b == target ) {
                return true;
            }
        }
        return false;
    }
    public boolean[] createArrayBoolean(boolean... booleans) {
        return booleans;
    }
    public boolean inputContentEquals(String[] input, String[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(long[] input, long[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(int[] input, int[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(short[] input, short[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(char[] input, char[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(double[] input, double[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(float[] input, float[] target)  {
        return input == target;
    }
    public boolean inputContentEquals(byte[] input, byte[] target)  {
        return input == target;
    }
    public static Container manage(){
        return new Container();
    }
    @Override
    public Object wrapper() {
        return this;
    }
}
