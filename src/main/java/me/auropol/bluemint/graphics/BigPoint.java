package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

import java.math.BigInteger;

public class BigPoint {
    private static abstract class BigPointHelper2d {
        public abstract float[] getBigPoint2d();
    }
    private static BigPointHelper2d point;
    public BigPoint(BigInteger x, BigInteger y) {
        point = new BigPointHelper2d() {
            @Override
            public float[] getBigPoint2d() {
                return Container.manage().createArrayFloat(x.floatValue(), y.floatValue());
            }
        };
    }
    public float[] getBigPoint() {
        return point.getBigPoint2d();
    }
    private static abstract class BigPointHelper3d {
        public abstract float[] getBigPoint3d();
    }
    public static class BigPoint3D {
        private static BigPointHelper3d point;
        public BigPoint3D(BigInteger x, BigInteger y, BigInteger z) {
            point = new BigPointHelper3d() {
                @Override
                public float[] getBigPoint3d() {
                    return Container.manage().createArrayFloat(x.floatValue(), y.floatValue(), z.floatValue());
                }
            };
        }
        public float[] getBigPoint() {
            return point.getBigPoint3d();
        }
    }
    private static abstract class BigPointHelper4d {
        public abstract float[] getBigPoint4d();
    }
    public static class BigPoint4D {
        private static BigPointHelper4d point;
        public BigPoint4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w) {
            point = new BigPointHelper4d() {
                @Override
                public float[] getBigPoint4d() {
                    return Container.manage().createArrayFloat(x.floatValue(), y.floatValue(), z.floatValue(), w.floatValue());
                }
            };
        }
        public float[] getBigPoint() {
            return point.getBigPoint4d();
        }
    }
    private static abstract class BigPointHelperInfiniteD {
        public abstract float[] getBigPointID();
    }
    public static class BigPointInfiniteD {
        private static BigPointHelperInfiniteD point;
        private static float[] f;
        public BigPointInfiniteD(BigInteger[] axis) {
            point = new BigPointHelperInfiniteD() {
                @Override
                public float[] getBigPointID() {
                    for(BigInteger bigInteger : axis) {
                        f = Container.manage().createArrayFloat(bigInteger.floatValue());
                    }
                    return f;
                }
            };
        }
        public float[] getBigPoint() {
            return point.getBigPointID();
        }
    }
    public static class BigDoublePoint {
        private static abstract class BigDoublePointHelper2d {
            public abstract double[] getBigPoint2d();
        }
        private static BigDoublePointHelper2d point;
        public BigDoublePoint(BigInteger x, BigInteger y) {
            point = new BigDoublePointHelper2d() {
                @Override
                public double[] getBigPoint2d() {
                    return Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue());
                }
            };
        }
        public double[] getBigDoublePoint() {
            return point.getBigPoint2d();
        }
        private static abstract class BigDoublePointHelper3d {
            public abstract double[] getBigPoint3d();
        }
        public static class BigDoublePoint3D {
            private static BigDoublePointHelper3d point;
            public BigDoublePoint3D(BigInteger x, BigInteger y, BigInteger z) {
                point = new BigDoublePointHelper3d() {
                    @Override
                    public double[] getBigPoint3d() {
                        return Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue(), z.doubleValue());
                    }
                };
            }
            public double[] getBigDoublePoint() {
                return point.getBigPoint3d();
            }
        }
        private static abstract class BigDoublePointHelper4d {
            public abstract double[] getBigPoint4d();
        }
        public static class BigDoublePoint4D {
            private static BigDoublePointHelper4d point;
            public BigDoublePoint4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w) {
                point = new BigDoublePointHelper4d() {
                    @Override
                    public double[] getBigPoint4d() {
                        return Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue(), z.doubleValue(), w.doubleValue());
                    }
                };
            }
            public double[] getBigDoublePoint()  {
                return point.getBigPoint4d();
            }
        }
        private static abstract class BigDoublePointHelperInfiniteD {
            public abstract double[] getBigPointID();
        }
        public static class BigDoublePointInfiniteD {
            private static BigDoublePointHelperInfiniteD point;
            private static double[] d;
            public BigDoublePointInfiniteD(BigInteger[] axis) {
                point = new BigDoublePointHelperInfiniteD() {
                    @Override
                    public double[] getBigPointID() {
                        for(BigInteger bigInteger : axis) {
                            d = Container.manage().createArrayDouble(bigInteger.doubleValue());
                        }
                        return d;
                    }
                };
            }
            public double[] getBigDoublePoint() {return point.getBigPointID();}
        }
    }
}

