package me.auropol.bluemint.primitive;

import java.awt.*;
import java.util.stream.IntStream;

public class Wrapper extends Wrappers {
    public static Wrapper wrap() {
        return new Wrapper();
    }
    @Override
    public Object wrapper() {
        return this;
    }
    public Color getColor(byte rBase, byte rAdditional, byte gBase, byte gAdditional, byte bBase, byte bAdditional)  {
        if(rBase < 1) {
            rBase = 1;
        }
        if(rAdditional < 1) {
            rAdditional = 1;
        }
        if(gBase < 1) {
            gBase = 1;
        }
        if(gAdditional < 1) {
            gAdditional = 1;
        }
        if(bBase < 1){
            bBase = 1;
        }
        if(bAdditional < 1){
            bAdditional = 1;
        }
        return new Color(rBase + rAdditional - 1, gBase + gAdditional - 1, bAdditional + bBase - 1);
    }
    public Color getColor(DoubleByte r, DoubleByte g, DoubleByte b) {
        return new Color(r.integerValue(), g.integerValue(), b.integerValue());
    }
    public Object getObject(){
        return getClass();
    }
    public IntStream range(int minValue, int maxValue) {
        return IntStream.range(minValue, maxValue);
    }
    public int pickRandomlyFromRange(int minValue, int maxValue) {
        int[] range = IntStream.range(minValue, maxValue).toArray();
        return Picker.pickFrom(range);
    }
}
