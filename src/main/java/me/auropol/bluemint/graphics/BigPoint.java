package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigPoint {
    private static abstract class BigPointHelper2d {
        public abstract BigDecimal[] getBigPoint2d();
    }
    private static BigPointHelper2d point;
    public BigPoint(BigDecimal x, BigDecimal y) {
        point = new BigPointHelper2d() {
            @Override
            public BigDecimal[] getBigPoint2d() {
                return new Container<BigDecimal>().createArray(x, y);
            }
        };
    }
    public BigDecimal[] getBigPoint() {
        return point.getBigPoint2d();
    }
    private static abstract class BigPointHelper3d {
        public abstract BigDecimal[] getBigPoint3d();
    }
    public static class BigPoint3D {
        private static BigPointHelper3d point;
        public BigPoint3D(BigDecimal x, BigDecimal y, BigDecimal z) {
            point = new BigPointHelper3d() {
                @Override
                public BigDecimal[] getBigPoint3d() {
                    return new Container<BigDecimal>().createArray(x, y, z);
                }
            };
        }
        public BigDecimal[] getBigPoint() {
            return point.getBigPoint3d();
        }
    }
    private static abstract class BigPointHelper4d {
        public abstract BigDecimal[] getBigPoint4d();
    }
    public static class BigPoint4D {
        private static BigPointHelper4d point;
        public BigPoint4D(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w) {
            point = new BigPointHelper4d() {
                @Override
                public BigDecimal[] getBigPoint4d() {
                    return new Container<BigDecimal>().createArray(x, y, z, w);
                }
            };
        }
        public BigDecimal[] getBigPoint() {
            return point.getBigPoint4d();
        }
    }
    private static abstract class BigPointHelperInfiniteD {
        public abstract BigDecimal[] getBigPointID();
    }
    public static class BigPointInfiniteD {
        private static BigPointHelperInfiniteD point;
        private static BigDecimal[] f;
        public BigPointInfiniteD(BigDecimal[] axis) {
            point = new BigPointHelperInfiniteD() {
                @Override
                public BigDecimal[] getBigPointID() {
                    for(BigDecimal bigDec : axis) {
                        f = new Container<BigDecimal>().createArray(bigDec);
                    }
                    return f;
                }
            };
        }
        public BigDecimal[] getBigPoint() {
            return point.getBigPointID();
        }
    }
    public static class BigDoublePoint {
        private static abstract class BigDoublePointHelper2d {
            public abstract BigInteger[] getBigPoint2d();
        }
        private static BigDoublePointHelper2d point;
        public BigDoublePoint(BigInteger x, BigInteger y) {
            point = new BigDoublePointHelper2d() {
                @Override
                public BigInteger[] getBigPoint2d() {
                    return new Container<BigInteger>().createArray(x, y);
                }
            };
        }
        public BigInteger[] getBigDoublePoint() {
            return point.getBigPoint2d();
        }
        private static abstract class BigDoublePointHelper3d {
            public abstract BigInteger[] getBigPoint3d();
        }
        public static class BigDoublePoint3D {
            private static BigDoublePointHelper3d point;
            public BigDoublePoint3D(BigInteger x, BigInteger y, BigInteger z) {
                point = new BigDoublePointHelper3d() {
                    @Override
                    public BigInteger[] getBigPoint3d() {
                        return new Container<BigInteger>().createArray(x, y, z);
                    }
                };
            }
            public BigInteger[] getBigDoublePoint() {
                return point.getBigPoint3d();
            }
        }
        private static abstract class BigDoublePointHelper4d {
            public abstract BigInteger[] getBigPoint4d();
        }
        public static class BigDoublePoint4D {
            private static BigDoublePointHelper4d point;
            public BigDoublePoint4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w) {
                point = new BigDoublePointHelper4d() {
                    @Override
                    public BigInteger[] getBigPoint4d() {
                        return new Container<BigInteger>().createArray(x, y, z, w);
                    }
                };
            }
            public BigInteger[] getBigDoublePoint()  {
                return point.getBigPoint4d();
            }
        }
        private static abstract class BigDoublePointHelperInfiniteD {
            public abstract BigInteger[] getBigPointID();
        }
        public static class BigDoublePointInfiniteD {
            private static BigDoublePointHelperInfiniteD point;
            private static BigInteger[] d;
            public BigDoublePointInfiniteD(BigInteger[] axis) {
                point = new BigDoublePointHelperInfiniteD() {
                    @Override
                    public BigInteger[] getBigPointID() {
                        for(BigInteger bigInteger : axis) {
                            d = new Container<BigInteger>().createArray(bigInteger);
                        }
                        return d;
                    }
                };
            }
            public BigInteger[] getBigDoublePoint() {return point.getBigPointID();}
        }
    }
}

