package me.auropol.bluemint.util;

import me.auropol.bluemint.primitive.Maps;

import java.util.Objects;
public interface Map {
    Maps newMap = new Maps() {
        @Override
        public Object createNewMap(Object map) {
            return this;
        }
    };
    void newMapMethod();
    static String assignToFrom(String string, int value, int valueForMapping) {
        if(value == valueForMapping) {
            return string;
        }
        return "";
    }
    static String assignToFrom(String string, String value, String valueForMapping) {
        if(Objects.equals(value, valueForMapping)) {
            return string;
        }
        if(valueForMapping.contains(value)) {
            return string;
        }
        return "";
    }
    static String assignToFrom(String string, char value, char valueForMapping)  {
        if(value == valueForMapping)  {
            return string;
        }
        return "";
    }
    static String assignToFrom(String string, boolean value, boolean valueForMapping) {
        if(value == valueForMapping)  {
            return string;
        }
        return "";
    }
    static String assignToFrom(String string, Object value, Object valueForMapping)  {
        if(value == valueForMapping) {
            return string;
        }
        return "";
    }
    static Object assignToFrom(Object object, int value, int valueForMapping) {
        if(value == valueForMapping) {
            return object;
        }
        return null;
    }
    static Object assignToFrom(Object object, Object value, Object valueForMapping) {
        if(value == valueForMapping) {
            return object;
        }
        return null;
    }
    static Object assignToFrom(Object object, char value, char valueForMapping) {
        if(value == valueForMapping) {
            return object;
        }
        return null;
    }

    static Object assignToFrom(Object object, boolean value, boolean valueForMapping) {
        if(value == valueForMapping) {
            return object;
        }
        return null;
    }
    static Object assignToFrom(Object object, String value, String valueForMapping) {
        if(valueForMapping.contains(value)) {
            return object;
        }
        if(Objects.equals(value, valueForMapping))  {
            return object;
        }
        return null;
    }

    static int assignToFrom(int integer, String value, String valueForMapping) {
        if(valueForMapping.contains(value)) {
            return integer;
        }
        if(Objects.equals(valueForMapping, value)) {
            return integer;
        }
        return 0;
    }
    static int assignToFrom(int integer, Object value, Object valueForMapping) {
        if(value == valueForMapping){
            return integer;
        }
        return 0;
    }
    static int assignToFrom(int integer, int value, int valueForMapping) {
        if(value == valueForMapping) {
            return integer;
        }
        return 0;
    }
    static int assignToFrom(int integer, boolean value, boolean valueForMapping){
        if(value == valueForMapping) {
            return integer;
        }
        return 0;
    }
    static int assignToFrom(int integer, char value, char valueForMapping) {
        if(value == valueForMapping) {
            return integer;
        }
        return 0;
    }
    static char assignToFrom(char character, int value, int valueForMapping) {
        if(value == valueForMapping) {
            return character;
        }
        return Character.MIN_VALUE;
    }
    static char assignToFrom(char character, boolean value, boolean valueForMapping) {
        if(value == valueForMapping){
            return character;
        }
        return Character.MIN_VALUE;
    }
    static char assignToFrom(char character, char value, char valueForMapping) {
        if(value == valueForMapping){
            return character;
        }
        return Character.MIN_VALUE;
    }
    static char assignToFrom(char character, Object value, Object valueForMapping) {
        if(Objects.equals(value, valueForMapping)){
            return character;
        }
        return Character.MIN_VALUE;
    }
    static char assignToFrom(char character, String value, String valueForMapping){
        if(Objects.equals(value, valueForMapping)){
            return character;
        }
        if(valueForMapping.contains(value)){
            return character;
        }
        return Character.MIN_VALUE;
    }
    //String, Object, char, boolean, integer
    static boolean assignToFrom(boolean bool, int value, int valueForMapping){
        if(value == valueForMapping){
            return bool;
        }
        return false;
    }
    static boolean assignToFrom(boolean bool, boolean value, boolean valueForMapping){
        if(value == valueForMapping) {
      return bool;
}
        return false;
    }
    static boolean assignToFrom(boolean bool, char value, char valueForMapping){
        if(value == valueForMapping){
            return bool;
        }
        return false;
    }
    static boolean assignToFrom(boolean bool, Object value, Object valueForMapping){
        if(Objects.equals(value, valueForMapping)) {
            return bool;
        }
        return false;
    }
    static boolean assignToFrom(boolean bool, String value, String valueForMapping){
        if(Objects.equals(value, valueForMapping)){
            return bool;
        }
        if(valueForMapping.contains(valueForMapping)){
            return bool;
        }
        return false;
    }
}
