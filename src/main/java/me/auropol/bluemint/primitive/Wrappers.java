package me.auropol.bluemint.primitive;

import me.auropol.bluemint.util.Logger;
import me.auropol.bluemint.util.Map;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public abstract class Wrappers {
    public abstract Object wrapper();
    public void createNewTextFile(String name, String content){
        try(PrintWriter writer = new PrintWriter(name)) {
            writer.println(content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    private Object assignEqualsAsBoolean(Object object, Object value, Object returningValue) {
        if(object == value) {
            return returningValue;
        }
        return null;
    }
    public String catchVoid(VoidType type, String name, String content) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ByteArrayOutputStream bs = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(byteArrayOutputStream);
        PrintStream ps = new PrintStream(bs);
        if(type == VoidType.SYSTEM_PRINTLN) {
            name = "";
            System.setOut(printStream);
            System.out.println(content + name);
            System.out.flush();
            System.setOut(System.out);
           return byteArrayOutputStream.toString() + name;
        }
        if(type == VoidType.WRITER_PRINTLN) {
            try(PrintWriter writer = new PrintWriter(name)) {
                System.setOut(ps);
                writer.println(content);
                writer.flush();
                System.setOut(System.out);
                return bs.toString() + name;
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return "";
    }
    public static int addInfinitely(int value, int addingValue, int cap) {
        for (int i = 0; i < value; i++) {
            value = new Task<Integer>().scheduleTaskAtFixedRate(value + addingValue);
            if(value == cap) {
                return 1;
            }
        }
        return value;
}
    public static int addInfinitely(int value, int addingValue) {
        for (int i = 0; i < value; i++) {
            value = new Task<Integer>().scheduleTaskAtFixedRate(value + addingValue);
        }
        return value;
    }
    public enum VoidType {
        SYSTEM_PRINTLN,
        WRITER_PRINTLN,
    }
}
