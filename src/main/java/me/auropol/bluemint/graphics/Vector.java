package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

public class Vector {
    private static VectorHelper2d vector2d;
    public Vector(float x, float y, Point direction) {
        float[] secondPoint = direction.getPoint();
        float[] point = Container.manage().createArrayFloat(x, y);
        vector2d = new VectorHelper2d() {
            @Override
            public float[] getVec2() {
                return Container.manage().createArrayFloat(x, y);
            }
            @Override
            public float getDistanceVec2() {
            return getDir(point, secondPoint);
            }

        };

    }
    public float[] getVector2d() {
         return vector2d.getVec2();
    }
    private float getDir(float[] point, float[] secondPoint) {
        float start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
        }
        return (float)Math.sqrt(start);
    }
    public float getDirection2d()  {
        return vector2d.getDistanceVec2();
    }
    private abstract static class VectorHelper2d {
        public abstract float[] getVec2();
        public abstract float getDistanceVec2();
    }
    public static class Vector3D {
        public static VectorHelper3d vector3d;
        public Vector3D(float x, float y, float z, Point.Point3D direction) {
            float[] secondPoint = direction.getPoint();
            float[] point = Container.manage().createArrayFloat(x, y, z);
            vector3d = new VectorHelper3d() {
                @Override
                public float[] getVec3() {
                    return Container.manage().createArrayFloat(x, y, z);
                }
                @Override
                public float getDistanceVec3() {
                    return getDir(point, secondPoint);
                }

            };
    }
        private float getDir(float[] point, float[] secondPoint) {
            float start = 0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return (float)Math.sqrt(start);
        }
        public float[] getVector3d() {
            return vector3d.getVec3();
        }
        public float getDirection3d() {
            return vector3d.getDistanceVec3();
        }
    }

    private abstract static class VectorHelper3d {
        public abstract float[] getVec3();
        public abstract float getDistanceVec3();
    }
    private abstract static class VectorHelper4d {
        public abstract float[] getVec4();
        public abstract float getDistanceVec4();
    }
    public static class Vector4D  {
        private static VectorHelper4d vector4d;
        public Vector4D(float x, float y, float z, float w, Point.Point4D direction) {
            float[] point = Container.manage().createArrayFloat(x, y, z, w);
            float[] secondPoint = direction.getPoint();
            vector4d = new VectorHelper4d() {
                @Override
                public float[] getVec4() {
                    return Container.manage().createArrayFloat(x, y, z, w);
                }

                @Override
                public float getDistanceVec4() {
                    return getDir(point, secondPoint);
                }
            };
        }
        private float getDir(float[] point, float[] secondPoint) {
            float start = 0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return (float)Math.sqrt(start);
        }
        public float[] getVector4d() {
            return vector4d.getVec4();
        }
        public float getDirection4d() {
            return vector4d.getDistanceVec4();
        }
    }
    private abstract static class VectorHelperInfiniteD {
        public abstract float[] getVecID();
        public abstract float getDistanceVecID();
    }
    public static class VectorInfiniteD {
        private static float[] fs;
        private static VectorHelperInfiniteD vectorID;
        public VectorInfiniteD(float[] axis, Point.PointInfiniteD direction) {
            float[] secondPoint = direction.getPoint();
            vectorID = new VectorHelperInfiniteD() {
                @Override
                public float[] getVecID() {
                    for(float f : axis) {
                        fs = Container.manage().createArrayFloat(f);
                    }
                    return fs;
                }

                @Override
                public float getDistanceVecID() {
                    return getDir(axis, secondPoint);
                }
            };
        }
        private float getDir(float[] point, float[] secondPoint) {
            float start = 0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return (float)Math.sqrt(start);
        }
        public float[] getVectorID() {
            return vectorID.getVecID();
        }
        public float getDirectionID() {
            return vectorID.getDistanceVecID();
        }
    }
    public static class DoubleVector {
        private static abstract class DoubleVectorHelper2d {
            public abstract double[] getDvec2d();
            public abstract double getDistanceDvec2d();
        }
        private static DoubleVectorHelper2d doubleVector2d;
        public DoubleVector(double x, double y, Point.DoublePoint direction) {
            double[] point = Container.manage().createArrayDouble(x, y);
            double[] secondPoint = direction.getDoublePoint();
            doubleVector2d = new DoubleVectorHelper2d() {
                @Override
                public double[] getDvec2d() {
                    return Container.manage().createArrayDouble(x, y);
                }

                @Override
                public double getDistanceDvec2d() {
                    return getDir(point, secondPoint);
                }
            };
        }
        private double getDir(double[] point, double[] secondPoint) {
            double start = 0.0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return Math.sqrt(start);
        }
        public double[] getDoubleVector2d() {
            return doubleVector2d.getDvec2d();
        }
        public double getDirection2d() {
            return doubleVector2d.getDistanceDvec2d();
        }
        private static abstract class DoubleVectorHelper3d {
            public abstract double[] getDvec3d();
            public abstract double getDistanceDvec3d();
        }
        public static class DoubleVector3D {
            private static DoubleVectorHelper3d doubleVector3d;
            public DoubleVector3D(double x, double y, double z, Point.DoublePoint.DoublePoint3D direction) {
                double[] point = Container.manage().createArrayDouble(x, y, z);
                double[] secondPoint = direction.getDoublePoint();
                doubleVector3d = new DoubleVectorHelper3d() {
                    @Override
                    public double[] getDvec3d() {
                        return Container.manage().createArrayDouble(x, y, z);
                    }

                    @Override
                    public double getDistanceDvec3d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private double getDir(double[] point, double[] secondPoint) {
                double start = 0.0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.sqrt(start);
            }
            public double[] getDoubleVector3d() {
                return doubleVector3d.getDvec3d();
            }
            public double getDirection3d() {
                return doubleVector3d.getDistanceDvec3d();
            }
        }
        private static abstract class DoubleVectorHelper4d {
            public abstract double[] getDvec4d();
            public abstract double getDistanceDvec4d();
        }
        public static class DoubleVector4D {
            private static DoubleVectorHelper4d doubleVector4d;
            public DoubleVector4D(double x, double y, double z, double w, Point.DoublePoint.DoublePoint4D direction) {
                double[] point = Container.manage().createArrayDouble(x, y, z, w);
                double[] secondPoint = direction.getDoublePoint();
                doubleVector4d = new DoubleVectorHelper4d() {
                    @Override
                    public double[] getDvec4d() {
                        return Container.manage().createArrayDouble(x, y, z, w);
                    }

                    @Override
                    public double getDistanceDvec4d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private double getDir(double[] point, double[] secondPoint) {
                double start = 0.0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.sqrt(start);
            }
            public double[] getDoubleVector4d() {
                return doubleVector4d.getDvec4d();
            }
            public double getDirection4d() {
                return doubleVector4d.getDistanceDvec4d();
            }
        }
        private static abstract class DoubleVectorHelperInfiniteD {
            public abstract double[] getDvecID();
            public abstract double getDistanceDvecID();
        }
        public static class DoubleVectorInfiniteD {
            private static double[] ds;
            private static DoubleVectorHelperInfiniteD doubleVectorID;
            public DoubleVectorInfiniteD(double[] axis, Point.DoublePoint.DoublePointInfiniteD direction) {
                double[] secondPoint = direction.getDoublePoint();
                doubleVectorID = new DoubleVectorHelperInfiniteD() {
                    @Override
                    public double[] getDvecID() {
                        for (double d : axis) {
                            ds = Container.manage().createArrayDouble(d);
                        }
                        return ds;
                    }

                    @Override
                    public double getDistanceDvecID() {
                        return getDir(axis, secondPoint);
                    }
                };
            }
            private double getDir(double[] point, double[] secondPoint) {
                double start = 0.0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.sqrt(start);
            }
            public double[] getDoubleVectorID() {
                return doubleVectorID.getDvecID();
            }
            public double getDirectionID() {
                return doubleVectorID.getDistanceDvecID();
            }
        }

    }
    public static class IntegerVector {
        private static abstract class IntegerVectorHelper2d {
            public abstract int[] getIvec2d();
            public abstract int getDistanceIvec2d();
        }
        private static IntegerVectorHelper2d integerVector2d;
        public IntegerVector(int x, int y, Point.IntegerPoint direction) {
            int[] point = Container.manage().createArrayInt(x, y);
            int[] secondPoint = direction.getIntegerPoint();
            integerVector2d = new IntegerVectorHelper2d() {
                @Override
                public int[] getIvec2d() {
                    return Container.manage().createArrayInt(x, y);
                }

                @Override
                public int getDistanceIvec2d() {
                    return getDir(point, secondPoint);
                }
            };
        }
        private int getDir(int[] point, int[] secondPoint) {
            float start = 0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return Math.round((float)Math.sqrt(start));
        }
        public int[] getIntegerVector2d() {
            return integerVector2d.getIvec2d();
        }
        public int getDirection2d() {
            return integerVector2d.getDistanceIvec2d();
        }
        private static abstract class IntegerVectorHelper3d {
            public abstract int[] getIvec3d();
            public abstract int getDistanceIvec3d();
        }
        public static class IntegerVector3D {
            private static IntegerVectorHelper3d integerVector3d;
            public IntegerVector3D(int x, int y, int z, Point.IntegerPoint.IntegerPoint3D direction) {
                int[] point = Container.manage().createArrayInt(x, y, z);
                int[] secondPoint = direction.getIntegerPoint();
                integerVector3d = new IntegerVectorHelper3d() {
                    @Override
                    public int[] getIvec3d() {
                        return Container.manage().createArrayInt(x, y, z);
                    }

                    @Override
                    public int getDistanceIvec3d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private int getDir(int[] point, int[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round((float)Math.sqrt(start));
            }
            public int[] getIntegerVector3d() {
                return integerVector3d.getIvec3d();
            }
            public int getDirection3d() {
                return integerVector3d.getDistanceIvec3d();
            }
        }
        private static abstract class IntegerVectorHelper4d {
            public abstract int[] getIvec4d();
            public abstract int getDistanceIvec4d();
        }
        public static class IntegerVector4D {
            private static IntegerVectorHelper4d integerVector4d;
            public IntegerVector4D(int x, int y, int z, int w, Point.IntegerPoint.IntegerPoint4D direction) {
                int[] point = Container.manage().createArrayInt(x, y, z, w);
                int[] secondPoint = direction.getIntegerPoint();
                integerVector4d = new IntegerVectorHelper4d() {
                    @Override
                    public int[] getIvec4d() {
                        return Container.manage().createArrayInt(x, y, z, w);
                    }

                    @Override
                    public int getDistanceIvec4d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private int getDir(int[] point, int[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round((float)Math.sqrt(start));
            }
            public int[] getIntegerVector4d() {
                return integerVector4d.getIvec4d();
            }
            public int getDirection4d() {
                return integerVector4d.getDistanceIvec4d();
            }
        }
        private static abstract class IntegerVectorHelperInfiniteD {
            public abstract int[] getIvecID();
            public abstract int getDistanceIvecID();
        }
        public static class IntegerVectorInfiniteD {
            private static IntegerVectorHelperInfiniteD integerVectorID;
            public IntegerVectorInfiniteD(int[] axis, Point.IntegerPoint.IntegerPointInfiniteD direction) {
                int[] secondPoint = direction.getIntegerPoint();
                integerVectorID = new IntegerVectorHelperInfiniteD() {
                    @Override
                    public int[] getIvecID() {
                        return axis;
                    }

                    @Override
                    public int getDistanceIvecID() {
                        return getDir(axis, secondPoint);
                    }
                };
            }
            private int getDir(int[] point, int[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round((float)Math.sqrt(start));
            }
            public int[] getIntegerVectorID() {
                return integerVectorID.getIvecID();
            }
            public int getDirectionID() {
                return integerVectorID.getDistanceIvecID();
            }
        }
    }

    public static class LongVector {
        private static abstract class LongVectorHelper2d {
            public abstract long[] getLvec2d();
            public abstract long getDistanceLvec2d();
        }
        private static LongVectorHelper2d longVector2d;
        public LongVector(long x, long y, Point.LongPoint direction) {
            long[] point = Container.manage().createArrayLong(x, y);
            long[] secondPoint = direction.getLongPoint();
            longVector2d = new LongVectorHelper2d() {
                @Override
                public long[] getLvec2d() {
                    return Container.manage().createArrayLong(x, y);
                }

                @Override
                public long getDistanceLvec2d() {
                    return getDir(point, secondPoint);
                }
            };
        }
        private long getDir(long[] point, long[] secondPoint) {
            float start = 0;
            for(int i = 0; i < point.length; ++i) {
                start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
            }
            return Math.round(Math.sqrt(start));
        }
        public long[] getLongVector2d() {
            return longVector2d.getLvec2d();
        }
        public long getDirection2d() {
            return longVector2d.getDistanceLvec2d();
        }
        private static abstract class LongVectorHelper3d {
            public abstract long[] getLvec3d();
            public abstract long getDistanceLvec3d();
        }
        private static abstract class LongVectorHelper4d {
            public abstract long[] getLvec4d();
            public abstract long getDistanceLvec4d();
        }
        private static abstract class LongVectorHelperInfiniteD {
            public abstract long[] getLvecID();
            public abstract long getDistanceLvecID();
        }
        public static class LongVector3D {
            private static LongVectorHelper3d longVector3d;
            public LongVector3D(long x, long y, long z, Point.LongPoint.LongPoint3D direction) {
                long[] point = Container.manage().createArrayLong(x, y, z);
                long[] secondPoint = direction.getLongPoint();
                longVector3d = new LongVectorHelper3d() {
                    @Override
                    public long[] getLvec3d() {
                        return Container.manage().createArrayLong(x, y, z);
                    }

                    @Override
                    public long getDistanceLvec3d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private long getDir(long[] point, long[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round(Math.sqrt(start));
            }
            public long[] getLongVector3d() {
                return longVector3d.getLvec3d();
            }
            public long getDirection3d() {
                return longVector3d.getDistanceLvec3d();
            }
        }
        public static class LongVector4D {
            private static LongVectorHelper4d longVector4d;
            public LongVector4D(long x, long y, long z, long w, Point.LongPoint.LongPoint4D direction) {
                long[] point = Container.manage().createArrayLong(x, y, z, w);
                long[] secondPoint = direction.getLongPoint();
                longVector4d = new LongVectorHelper4d() {
                    @Override
                    public long[] getLvec4d() {
                        return Container.manage().createArrayLong(x, y, z, w);
                    }

                    @Override
                    public long getDistanceLvec4d() {
                        return getDir(point, secondPoint);
                    }
                };
            }
            private long getDir(long[] point, long[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round(Math.sqrt(start));
            }
            public long[] getLongVector4d() {
                return longVector4d.getLvec4d();
            }
            public long getDirection4d() {
                return longVector4d.getDistanceLvec4d();
            }
        }
        public static class LongVectorInfiniteD {
            private static LongVectorHelperInfiniteD longVectorID;
            public LongVectorInfiniteD(long[] axis, Point.LongPoint.LongPointInfiniteD direction) {
                long[] secondPoint = direction.getLongPoint();
                longVectorID = new LongVectorHelperInfiniteD() {
                    @Override
                    public long[] getLvecID() {
                        return axis;
                    }

                    @Override
                    public long getDistanceLvecID() {
                        return getDir(axis, secondPoint);
                    }
                };
            }
            private long getDir(long[] point, long[] secondPoint) {
                float start = 0;
                for(int i = 0; i < point.length; ++i) {
                    start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
                }
                return Math.round(Math.sqrt(start));
            }
            public long[] getLongVectorID() {
                return longVectorID.getLvecID();
            }
            public long getDirectionID() {
                return longVectorID.getDistanceLvecID();
            }
        }
    }

}
