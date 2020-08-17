package me.auropol.bluemint.graphics;
import me.auropol.bluemint.primitive.Container;
import me.auropol.bluemint.primitive.Converter;

public interface SaltPointCryptography {
    public String getResult();
    public String decrypt();
    public static SaltPointCryptography encrypt(Key k, String input) {
        return new SaltPointCryptography() {
            @Override
            public String getResult() {
                    for(char c : input.toCharArray()) {
                       char b = Converter.convert().stringToChar(getLetter(k.getKey()), 0);
                       return input.replace(c, b);
                    }
                return null;
            }

            @Override
            public String decrypt() {
                return input;
            }
        };
    }
    static String getLetter(float[] keys) {
        for(float fl : keys) {
            String[] arr = Container.manage().createArrayString("a", "b", "c", "d", "e", "f", "g", "h", "c", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q" ,"r", "s", "t", "u", "v", "w ","x ","y" ,"z");
            String[] letters = new String[100000];
            letters = new Container<String>().multifill(letters, arr);
            return letters[Math.round(fl)];
        }
        return "";
    }
    public static interface Key {
        public float[] getKey();
        public static Key generateKey(Point[] key) {
            return new Key() {
                @Override
                public float[] getKey() {
                    for (Point p : key) {
                       return p.getPoint();
                    }
                    return null;
                }
            };
        }
    }
}
