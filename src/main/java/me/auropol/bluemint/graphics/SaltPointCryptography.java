package me.auropol.bluemint.graphics;
import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.primitive.Converter;
import me.auropol.bluemint.primitive.Picker;
import me.auropol.bluemint.util.Map;

public class SaltPointCryptography {
    private static SPointCryptoHelper internal;
    private static abstract class KeyHelper {
     public abstract float[] getKey();
    }
    private static abstract class SPointCryptoHelper {
        public abstract String getResult();
        public abstract String getOriginalInput();
    }
    public SaltPointCryptography(Key k, String input) {
        internal = new SPointCryptoHelper() {
            @Override
            public String getResult() {
                    for(char c : input.toCharArray()) {
                       char b = Converter.convert().stringToChar(getLetter(k.getKey()), 0);
                       return input.replace(c, b);
                    }
                return null;
            }

            @Override
            public String getOriginalInput() {
                return input;
            }
        };
    }
    public String getResult() {
        return internal.getResult();
    }
    public String getOriginalInput() {
        return internal.getOriginalInput();
    }
    private String getLetter(float[] keys) {
        for(float fl : keys) {
            float nextLetter = Picker.pickFrom(Container.manage().createArrayFloat(fl));
        String a = Map.assignToFrom("a", fl,  nextLetter);
        String b = Map.assignToFrom("b", fl,  nextLetter);
        String c = Map.assignToFrom("c", fl,  nextLetter);
        String d = Map.assignToFrom("d", fl,  nextLetter);
        String e = Map.assignToFrom("e", fl,  nextLetter);
        String f = Map.assignToFrom("f", fl,  nextLetter);
        String g = Map.assignToFrom("g", fl,  nextLetter);
        String h = Map.assignToFrom("h", fl,  nextLetter);
        String i = Map.assignToFrom("i", fl,  nextLetter);
        String j = Map.assignToFrom("j", fl,  nextLetter);
        String k = Map.assignToFrom("k", fl, nextLetter);
        String l = Map.assignToFrom("l", fl,  nextLetter);
        String m = Map.assignToFrom("m", fl, nextLetter);
        String n = Map.assignToFrom("n", fl,  nextLetter);
        String o = Map.assignToFrom("o", fl,  nextLetter);
        String p = Map.assignToFrom("p", fl,  nextLetter);
        String q = Map.assignToFrom("q", fl, nextLetter);
        String r = Map.assignToFrom("r", fl, nextLetter);
        String s = Map.assignToFrom("s", fl, nextLetter);
        String t = Map.assignToFrom("t", fl, nextLetter);
        String u = Map.assignToFrom("u", fl, nextLetter);
        String v = Map.assignToFrom("v", fl, nextLetter);
        String w = Map.assignToFrom("w", fl, nextLetter);
        String x = Map.assignToFrom("x", fl, nextLetter);
        String y = Map.assignToFrom("y", fl, nextLetter);
        String z = Map.assignToFrom("z", fl, nextLetter);
        return a + b + c + d + e+ f + g + h + i+ j + k + l + m + n + o + p + q + r + s + t + u + v + w + x + y + z;
        }
        return "";
    }
    public static class Key {
        private static KeyHelper internal;
        public Key(Point[] key) {
            internal = new KeyHelper() {
                @Override
                public float[] getKey() {
                    for (Point p : key) {
                       return p.getPoint();
                    }
                    return null;
                }
            };
        }
        public float[] getKey() {
            return internal.getKey();
        }
    }
}
