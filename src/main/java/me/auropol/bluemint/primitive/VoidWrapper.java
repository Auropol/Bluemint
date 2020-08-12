package me.auropol.bluemint.primitive;
import org.jetbrains.annotations.NotNull;
import java.util.Objects;

public final class VoidWrapper implements Comparable<VoidWrapper.Void> {
    private static VoidWrapper.Void internal;
    public synchronized int compareTo(@NotNull Void o) {
        return compare(internal, o);
    }

    public static abstract class Void {
        public abstract void voidValue();
    }
    public VoidWrapper(VoidWrapper.Void v) {
        internal = v;
    }
    public void voidValue() {
        internal.voidValue();
    }
    public boolean equals(VoidWrapper.Void anotherVoid) {
        return Objects.equals(internal, anotherVoid);
    }
    public static void valueOf(VoidWrapper.Void v) {
        v.voidValue();
    }
    private static VoidWrapper.Void voidString;
    public static VoidWrapper.Void valueOf(String s) {
       return parseWrapperVoid(s);
    }
    public static int compare(VoidWrapper.Void a, VoidWrapper.Void b) {
        return Integer.compare(Integer.parseInt(a.toString()), Integer.parseInt(b.toString()));
    }
    public static VoidWrapper.Void parseWrapperVoid(String s) {
        try {
            voidString = VoidWrapper.Void.class.cast(s.getClass());
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        return voidString;
    }

}
