package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

import java.math.BigInteger;

public class BigVector {
 private static abstract class BigVectorHelper2d {
     public abstract float[] getBigVec2();
     public abstract float getDistanceBigVec2();
 }
 private static BigVectorHelper2d bigVector2d;

 public BigVector(BigInteger x, BigInteger y, BigPoint direction) {
     float[] point = Container.manage().createArrayFloat(x.floatValue(), y.floatValue());
     float[] secondPoint = direction.getBigPoint();
     bigVector2d = new BigVectorHelper2d() {
         @Override
         public float[] getBigVec2() {
             return Container.manage().createArrayFloat(x.floatValue(), y.floatValue());
         }

         @Override
         public float getDistanceBigVec2() {
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
    public float[] getBigVector2d() {
     return bigVector2d.getBigVec2();
    }
    public float getDirection2d() {
     return bigVector2d.getDistanceBigVec2();
    }
    private static abstract class BigVectorHelper3d {
     public abstract float[] getBigVec3();
     public abstract float getDistanceBigVec3();
    }

    public static class BigVector3D {
     private static BigVectorHelper3d bigVector3d;
     public BigVector3D(BigInteger x, BigInteger y, BigInteger z, BigPoint.BigPoint3D direction) {
         float[] point = Container.manage().createArrayFloat(x.floatValue(), y.floatValue(), z.floatValue());
         float[] secondPoint = direction.getBigPoint();
         bigVector3d = new BigVectorHelper3d() {
             @Override
             public float[] getBigVec3() {
                 return Container.manage().createArrayFloat(x.floatValue(), y.floatValue(), z.floatValue());
             }

             @Override
             public float getDistanceBigVec3() {
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
        public float[] getBigVector3d() {
            return bigVector3d.getBigVec3();
        }
        public float getDirection3d() {
            return bigVector3d.getDistanceBigVec3();
        }
    }
    private static abstract class BigVectorHelper4d {
     public abstract float[] getBigVec4();
     public abstract float getDistanceBigVec4();
    }
    private static abstract class BigVectorHelperInfiniteD {
        public abstract float[] getBigVecID();
        public abstract float getDistanceBigVecID();
    }
    private static abstract class DoubleBigVectorHelper2d{
        public abstract double[] getDoubleBigVec2();
        public abstract double getDistanceDoubleBigVec2();
    }
    private static abstract class DoubleBigVectorHelper3d {
        public abstract double[] getDoubleBigVec3();
        public abstract double getDistanceDoubleBigVec3();
    }
    private static abstract class DoubleBigVectorHelper4d {
        public abstract double[] getDoubleBigVec4();
        public abstract double getDistanceDoubleBigVec4();
    }
    private static abstract class DoubleBigVectorHelperInfiniteD{
        public abstract double[] getDoubleBigVecID();
        public abstract double getDistanceDoubleBigVecID();
    }
    public static class BigVector4D {
     private static BigVectorHelper4d bigVector4d;
     public BigVector4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w, BigPoint.BigPoint4D direction) {
         float[] point = Container.manage().createArrayFloat(x.floatValue(), y.floatValue(), z.floatValue(), w.floatValue());
         float[] secondPoint = direction.getBigPoint();
         bigVector4d = new BigVectorHelper4d() {
             @Override
             public float[] getBigVec4() {
                 return point;
             }

             @Override
             public float getDistanceBigVec4() {
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
        public float[] getBigVector4d() {
            return bigVector4d.getBigVec4();
        }
        public float getDirection4d() {
            return bigVector4d.getDistanceBigVec4();
        }
    }
    public static class BigVectorInfiniteD {
        private static BigVectorHelperInfiniteD bigVectorID;
        public BigVectorInfiniteD(BigInteger[] axis, BigPoint.BigPointInfiniteD direction) {
            float[] point = new BigPoint.BigPointInfiniteD(axis).getBigPoint();
            float[] secondPoint = direction.getBigPoint();
            bigVectorID = new BigVectorHelperInfiniteD() {
                @Override
                public float[] getBigVecID() {
                 return point;
                }

                @Override
                public float getDistanceBigVecID() {
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
        public float[] getBigVectorID() {
            return bigVectorID.getBigVecID();
        }
        public float getDirectionID() {
            return bigVectorID.getDistanceBigVecID();
        }
    }
    public static class DoubleBigVector {
     private static DoubleBigVectorHelper2d doubleBigVector2d;
     public DoubleBigVector(BigInteger x, BigInteger y, BigPoint.BigDoublePoint direction) {
         double[] point = Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue());
         double[] secondPoint = direction.getBigDoublePoint();
         doubleBigVector2d = new DoubleBigVectorHelper2d() {
             @Override
             public double[] getDoubleBigVec2() {
                 return Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue());
             }

             @Override
             public double getDistanceDoubleBigVec2() {
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
        public double[] getDoubleBigVector2d() {
            return doubleBigVector2d.getDoubleBigVec2();
        }
        public double getDirection2d() {
            return doubleBigVector2d.getDistanceDoubleBigVec2();
        }
        public static class DoubleBigVector3D {
         private static DoubleBigVectorHelper3d doubleBigVector3d;
         public DoubleBigVector3D(BigInteger x, BigInteger y, BigInteger z, BigPoint.BigDoublePoint.BigDoublePoint3D direction) {
             double[] point = Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue(), z.doubleValue());
             double[] secondPoint = direction.getBigDoublePoint();
             doubleBigVector3d = new DoubleBigVectorHelper3d() {
                 @Override
                 public double[] getDoubleBigVec3() {
                     return point;
                 }

                 @Override
                 public double getDistanceDoubleBigVec3() {
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
            public double[] getDoubleBigVector3d() {
             return doubleBigVector3d.getDoubleBigVec3();
            }
            public double getDirection3d() {
             return doubleBigVector3d.getDistanceDoubleBigVec3();
            }
        }
        public static class DoubleBigVector4D {
         private static DoubleBigVectorHelper4d doubleBigVector4d;
         public DoubleBigVector4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w, BigPoint.BigDoublePoint.BigDoublePoint4D direction) {
             double[] point = Container.manage().createArrayDouble(x.doubleValue(), y.doubleValue(), z.doubleValue(), w.doubleValue());
             double[] secondPoint = direction.getBigDoublePoint();
             doubleBigVector4d = new DoubleBigVectorHelper4d() {
                 @Override
                 public double[] getDoubleBigVec4() {
                     return point;
                 }

                 @Override
                 public double getDistanceDoubleBigVec4() {
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
            public double[] getDoubleBigVector4d() {
             return doubleBigVector4d.getDoubleBigVec4();
            }
            public double getDirection4d() {
             return doubleBigVector4d.getDistanceDoubleBigVec4();
            }
        }
        public static class DoubleBigVectorInfiniteD {
         private static DoubleBigVectorHelperInfiniteD doubleBigVectorID;
         public DoubleBigVectorInfiniteD(BigInteger[] axis, BigPoint.BigDoublePoint.BigDoublePointInfiniteD direction) {
             double[] point = new BigPoint.BigDoublePoint.BigDoublePointInfiniteD(axis).getBigDoublePoint();
             doubleBigVectorID = new DoubleBigVectorHelperInfiniteD() {
                 @Override
                 public double[] getDoubleBigVecID() {
                     return point;
                 }

                 @Override
                 public double getDistanceDoubleBigVecID() {
                     return getDir(point, direction.getBigDoublePoint());
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
            public double[] getBigDoubleVectorID() {
             return doubleBigVectorID.getDoubleBigVecID();
            }
            public double getDirectionID() {
             return doubleBigVectorID.getDistanceDoubleBigVecID();
            }
        }
    }

}
