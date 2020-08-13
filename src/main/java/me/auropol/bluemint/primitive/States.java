package me.auropol.bluemint.primitive;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class States {
    private static StatesHelper<Boolean> binternal;
    private static StatesHelper<Integer> iinternal;
    private static StatesHelper<Float> finternal;
    private static StatesHelper<Long> linternal;
    private static StatesHelper<DoubleByte> dbinternal;
    private static StatesHelper<BigDecimal> bdinternal;
    private static StatesHelper<Double> dinternal;
    private static StatesHelper<Short> sinternal;
    private static StatesHelper<BigInteger> biinternal;
    private static StatesHelper<Byte> byinternal;
    private static StatesHelper<Character> cinternal;
    private static abstract class StatesHelper<T> {
        public abstract T[] getStates();
    }
    public States()  {
        binternal = new StatesHelper<Boolean>() {
            @Override
            public Boolean[] getStates() {
                return new Container<Boolean>().createArray(false, true);
            }
        };
    }
    public States(int minDefined, int maxDefined) {
        iinternal = new StatesHelper<Integer>() {
            @Override
            public Integer[] getStates() {
                return IntStream.range(minDefined, maxDefined).boxed().toArray(Integer[]::new);
            }
        };
    }
    public States(float minDefined, float maxDefined) {
        finternal = new StatesHelper<Float>() {
            @Override
            public Float[] getStates() {
                for(double d : IntStream.range(Float.floatToIntBits(minDefined), Float.floatToIntBits(maxDefined)).asDoubleStream().toArray()) {
                    return new Container<Float>().createArray((float)d);
                }
                return null;
            }
        };
    }
    public States(double minDefined, double maxDefined) {
        dinternal = new StatesHelper<Double>() {
            @Override
            public Double[] getStates() {
                return LongStream.range(Double.doubleToLongBits(minDefined), Double.doubleToLongBits(maxDefined)).asDoubleStream().boxed().toArray(Double[]::new);
            }
        };
    }
    public States(long minDefined, long maxDefined) {
        linternal = new StatesHelper<Long>() {
            @Override
            public Long[] getStates() {
                return LongStream.range(minDefined, maxDefined).boxed().toArray(Long[]::new);
            }
        };
    }
    public States(short minDefined, short maxDefined) {
        sinternal = new StatesHelper<Short>() {
            @Override
            public Short[] getStates() {
                int[] is =  IntStream.range(minDefined, maxDefined).toArray();
                for(int i : is) {
                    return new Container<Short>().createArray((short)i);
                }
                return null;
            }
        };
    }
    public States(byte minDefined, byte maxDefined) {
        byinternal = new StatesHelper<Byte>() {
            @Override
            public Byte[] getStates() {
                int[] is =  IntStream.range(minDefined, maxDefined).toArray();
                for(int i : is) {
                    return new Container<Byte>().createArray((byte)i);
                }
                return null;
            }
        };
    }
    public States(DoubleByte minDefined, DoubleByte maxDefined) {
        dbinternal = new StatesHelper<DoubleByte>() {
            @Override
            public DoubleByte[] getStates() {
                int[] is = IntStream.range(minDefined.integerValue(), maxDefined.integerValue()).toArray();
                for(int i : is) {
                    return new Container<DoubleByte>().createArray(new DoubleByte(i));
                }
                return null;
            }
        };
    }
    public States(char minDefined, char maxDefined) {
        cinternal = new StatesHelper<Character>() {
            @Override
            public Character[] getStates() {
                int[] is = IntStream.range(minDefined, maxDefined).toArray();
                for(int i : is) {
                    return new Container<Character>().createArray((char)i);
                }
                return null;
            }
        };
    }
    public States(BigInteger minDefined, BigInteger maxDefined) {
        biinternal = new StatesHelper<BigInteger>() {
            @Override
            public BigInteger[] getStates() {
                long[] ls = LongStream.range(minDefined.longValue(), maxDefined.longValue()).toArray();
                for(long l : ls) {
                    return new Container<BigInteger>().createArray(BigInteger.valueOf(l));
                }
                return null;
            }
        };
    }
    public States(BigDecimal minDefined, BigDecimal maxDefined) {
        bdinternal = new StatesHelper<BigDecimal>() {
            @Override
            public BigDecimal[] getStates() {
                double[] ds = LongStream.range(Double.doubleToLongBits(minDefined.doubleValue()), Double.doubleToLongBits(maxDefined.doubleValue())).asDoubleStream().toArray();
                for(double d : ds) {
                   new Container<BigDecimal>().createArray(BigDecimal.valueOf(d));
                }
                return null;
            }
        };
    }
    public Boolean[] getStatesBoolean() {
        if(binternal == null) {
            throw new NullPointerException("You are using a non-boolean constructor !");
        }
        return binternal.getStates();
    }
    public boolean getState(boolean value) {
        if(new Container<Boolean>().inputContains(binternal.getStates(), value)) {
            return value;
        } else {
            return false;
        }
    }
    public int getState(int value) {
        if(new Container<Integer>().inputContains(iinternal.getStates(), value)) {
            return value;
        } else {
            return 0;
        }
    }
    public float getState(float value) {
        if(new Container<Float>().inputContains(finternal.getStates(), value)) {
            return value;
        } else {
            return 0f;
        }
    }
    public double getState(double value) {
        if(new Container<Float>().inputContains(dinternal.getStates(), value)) {
            return value;
        } else {
            return 0d;
        }
    }
    public long getState(long value) {
        if(new Container<Long>().inputContains(linternal.getStates(), value)) {
            return value;
        } else {
            return 0;
        }
    }
    public short getState(short value) {
        if(new Container<Short>().inputContains(sinternal.getStates(), value)) {
            return value;
        } else {
            return 0;
        }
    }
    public byte getState(byte value) {
        if(new Container<Byte>().inputContains(byinternal.getStates(), value)) {
            return value;
        } else {
            return 0;
        }
    }
    public DoubleByte getState(DoubleByte value) {
        if(new Container<DoubleByte>().inputContains(dbinternal.getStates(), value)) {
            return value;
        } else {
            return new DoubleByte(0);
        }
    }
    public char getState(char value) {
        if(new Container<Character>().inputContains(cinternal.getStates(), value)) {
            return value;
        } else {
            return 0;
        }
    }
    public BigInteger getState(BigInteger value) {
        if(new Container<BigInteger>().inputContains(biinternal.getStates(), value)) {
            return value;
        } else {
            return BigInteger.ZERO;
        }
    }
    public BigDecimal getState(BigDecimal value) {
        if(new Container<BigDecimal>().inputContains(bdinternal.getStates(), value)) {
            return value;
        } else {
            return BigDecimal.ZERO;
        }
    }
    public Integer[] getStatesInteger() {
        if(iinternal == null) {
            throw new NullPointerException("You are using a non-integer constructor !");
        }
        return iinternal.getStates();
    }
    public Float[] getStatesFloat() {
        if(finternal == null) {
            throw new NullPointerException("You are using a non-float constructor !");
        }
        return finternal.getStates();
    }
    public Long[] getStatesLong() {
        if(linternal == null) {
            throw new NullPointerException("You are using a non-long constructor !");
        }
        return linternal.getStates();
    }
    public BigDecimal[] getStatesBigDecimal() {
        if(bdinternal == null) {
            throw new NullPointerException("You are using a non-big-decimal constructor !");
        }
        return bdinternal.getStates();
    }
    public Double[] getStatesDouble() {
        if(dinternal == null) {
            throw new NullPointerException("You are using a non-double constructor !");
        }
        return dinternal.getStates();
    }
    public Short[] getStatesShort() {
        if(sinternal == null) {
            throw new NullPointerException("You are using a non-short constructor !");
        }
        return sinternal.getStates();
    }
    public BigInteger[] getStatesBigInteger() {
        if(biinternal == null) {
            throw new NullPointerException("You are using a non-big-integer constructor !");
        }
        return biinternal.getStates();
    }
    public Byte[] getStatesByte() {
        if(byinternal == null) {
            throw new NullPointerException("You are using a non-byte constructor !");
        }
        return byinternal.getStates();
    }
    public Character[] getStatesCharacter() {
        if(cinternal == null) {
            throw new NullPointerException("You are using a non-character constructor !");
        }
        return cinternal.getStates();
    }

}
