package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;
public class Point {
    private static PointHelper2d point;
    public Point(float x, float y) {
      point = new PointHelper2d() {
          @Override
          public float[] getPoint2d() {
              return Container.manage().createArrayFloat(x, y);
          }
      };
    }
    public float[] getPoint() {
        return point.getPoint2d();
    }
    public static class Point3D {
        private static PointHelper3d point;
        public Point3D(float x, float y, float z) {
            point = new PointHelper3d() {
                @Override
                public float[] getPoint3d() {
                    return Container.manage().createArrayFloat(x, y, z);
                }
            };
        }
        public float[] getPoint() {
            return point.getPoint3d();
        }
    }
    private abstract static class PointHelper2d  {
        public abstract float[] getPoint2d();
    }
    private abstract static class PointHelper3d {
        public abstract float[] getPoint3d();
    }
    private abstract static class PointHelper4d {
        public abstract float[] getPoint4d();
    }
    public static class Point4D {
        private static PointHelper4d point;
        public Point4D(float x, float y, float z, float w) {
            point = new PointHelper4d() {
                @Override
                public float[] getPoint4d() {
                    return Container.manage().createArrayFloat(x, y, z, w);
                }
            };
        }
        public float[] getPoint() {
            return point.getPoint4d();
        }
    }
   public static class PointInfiniteD {
        private static float[] fs;
        private static PointHelperInfiniteD point;
        public PointInfiniteD(float[] axis) {
            point = new PointHelperInfiniteD() {
                @Override
                public float[] getPointInfiniteD() {
                    for(float f : axis) {
                        fs = Container.manage().createArrayFloat(f);
                    }
                    return fs;
                }
            };
        }
        public float[] getPoint() {
            return point.getPointInfiniteD();
        }
   }
   private abstract static class PointHelperInfiniteD {
        public abstract float[] getPointInfiniteD();
   }
   public static class DoublePoint {
        private abstract static class DoublePointHelper2d {
            public abstract double[] getDoublePoint2d();
        }
        private static DoublePointHelper2d point;
        public DoublePoint(double x, double y) {
            point = new DoublePointHelper2d() {
                @Override
                public double[] getDoublePoint2d() {
                    return Container.manage().createArrayDouble(x, y);
                }
            };
        }
        public double[] getDoublePoint() {
            return point.getDoublePoint2d();
        }
        private static abstract class DoublePointHelper3d {
            public abstract double[] getDoublePoint3d();
        }
        public static class DoublePoint3D {
            private static DoublePointHelper3d point;
            public DoublePoint3D(double x, double y, double z) {
                point = new DoublePointHelper3d() {
                    @Override
                    public double[] getDoublePoint3d() {
                        return Container.manage().createArrayDouble(x, y, z);
                    }
                };
            }
            public double[] getDoublePoint() {
                return point.getDoublePoint3d();
            }
        }
        private static abstract class DoublePointHelper4d {
            public abstract double[] getDoublePoint4d();
        }
        public static class DoublePoint4D {
            private static DoublePointHelper4d point;
            public DoublePoint4D(double x, double y, double z, double w) {
                point = new DoublePointHelper4d() {
                    @Override
                    public double[] getDoublePoint4d() {
                        return Container.manage().createArrayDouble(x, y, z, w);
                    }
                };
            }
            public double[] getDoublePoint() {
                return point.getDoublePoint4d();
            }
        }
        private static abstract class DoublePointHelperInfiniteD {
            public abstract double[] getDoublePointInfiniteD();
        }
        public static class DoublePointInfiniteD {
            private static double[] ds;
            private static DoublePointHelperInfiniteD point;
            public DoublePointInfiniteD(double[] axis) {
                point = new DoublePointHelperInfiniteD() {
                    @Override
                    public double[] getDoublePointInfiniteD() {
                        for(double d : axis) {
                            ds = Container.manage().createArrayDouble(d);
                        }
                        return ds;
                    }
                };
            }
            public double[] getDoublePoint() {
                return point.getDoublePointInfiniteD();
            }
        }
   }
   public static class IntegerPoint {
        private static abstract class IntegerPointHelper2d {
            public abstract int[] getIntegerPoint2d();
        }
        private static IntegerPointHelper2d point;
        public IntegerPoint(int x, int y) {
            point = new IntegerPointHelper2d() {
                @Override
                public int[] getIntegerPoint2d() {
                    return Container.manage().createArrayInt(x, y);
                }
            };
        }
        public int[] getIntegerPoint()  {
            return point.getIntegerPoint2d();
        }
        private static abstract class IntegerPointHelper3d  {
            public abstract int[] getIntegerPoint3d();
        }
        public static class IntegerPoint3D {
            private static IntegerPointHelper3d point;
            public IntegerPoint3D(int x, int y, int z) {
                point = new IntegerPointHelper3d() {
                    @Override
                    public int[] getIntegerPoint3d() {
                        return Container.manage().createArrayInt(x, y, z);
                    }
                };
            }
            public int[] getIntegerPoint() {
                return point.getIntegerPoint3d();
            }
        }
        private static abstract class IntegerPointHelper4d {
            public abstract int[] getIntegerPoint4d();
        }
        public static class IntegerPoint4D {
            private static IntegerPointHelper4d point;
            public IntegerPoint4D(int x, int y, int z, int w) {
                point = new IntegerPointHelper4d() {
                    @Override
                    public int[] getIntegerPoint4d() {
                        return Container.manage().createArrayInt(x, y, z, w);
                    }
                };
            }
            public int[] getIntegerPoint() {
                return point.getIntegerPoint4d();
            }
        }
        private static abstract class IntegerPointHelperInfiniteD {
            public abstract int[] getIntegerPointInfiniteD();
        }
        public static class IntegerPointInfiniteD {
            private static int[] is;
            private static IntegerPointHelperInfiniteD point;
            public IntegerPointInfiniteD(int[] axis) {
                point = new IntegerPointHelperInfiniteD() {
                    @Override
                    public int[] getIntegerPointInfiniteD() {
                        for(int i : axis) {
                            is = Container.manage().createArrayInt(i);
                        }
                        return is;
                    }
                };
            }
            public int[] getIntegerPoint() {
                return point.getIntegerPointInfiniteD();
            }
        }
   }
   public static class LongPoint {
        private static abstract class LongPointHelper2d {
            public abstract long[] getLongPoint2d();
        }
        private static LongPointHelper2d point;
        public LongPoint(long x, long y) {
            point = new LongPointHelper2d() {
                @Override
                public long[] getLongPoint2d() {
                    return Container.manage().createArrayLong(x, y);
                }
            };
        }
        public long[] getLongPoint() {
            return point.getLongPoint2d();
        }
        private static abstract class LongPointHelper3d {
            public abstract long[] getLongPoint3d();
        }
        public static class LongPoint3D {
            private static LongPointHelper3d point;
            public LongPoint3D(long x, long y, long z) {
                point = new LongPointHelper3d() {
                    @Override
                    public long[] getLongPoint3d() {
                        return Container.manage().createArrayLong(x, y, z);
                    }
                };
            }
            public long[] getLongPoint() {
                return point.getLongPoint3d();
            }
        }
        private static abstract class LongPointHelper4d {
            public abstract long[] getLongPoint4d();
        }
        public static class LongPoint4D {
            private static LongPointHelper4d point;
            public LongPoint4D(long x, long y, long z, long w) {
                point = new LongPointHelper4d() {
                    @Override
                    public long[] getLongPoint4d() {
                        return Container.manage().createArrayLong(x, y, z, w);
                    }
                };
            }
            public long[] getLongPoint() {
                return point.getLongPoint4d();
            }
        }
        private static abstract class LongPointHelperInfiniteD {
            public abstract long[] getLongPointInfiniteD();
        }
        public static class LongPointInfiniteD {
            private static LongPointHelperInfiniteD point;
            public LongPointInfiniteD(long[] axis) {
                for(long l : axis) {
                point = new LongPointHelperInfiniteD() {
                    @Override
                    public long[] getLongPointInfiniteD() {
                        return Container.manage().createArrayLong(l);
                    }
                };
             }
            }
            public long[] getLongPoint() {
                return point.getLongPointInfiniteD();
            }
        }
   }
}
