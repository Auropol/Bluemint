package me.auropol.bluemint.primitive;

import me.auropol.bluemint.util.RandStream;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
    public Object getObject(){
        return getClass();
    }
    public IntStream range(int minValue, int maxValue) {
        return IntStream.range(minValue, maxValue);
    }
    public int pickRandomlyFromRange(int minValue, int maxValue) {
        int[] range = IntStream.range(minValue, maxValue).toArray();
        return RandStream.pickFrom(range);
    }
    public int[] pickInOrder(int[] input, int rnd) {
        java.util.List<Integer> list = new ArrayList<Integer>(input.length);
        for (int i : input)
            list.add(i);
        Collections.shuffle(list);

        int[] answer = new int[rnd];
        for (int i = 0; i < rnd; i++)
            answer[i] = list.get(i);
        Arrays.sort(answer);

        return answer;
    }
}
