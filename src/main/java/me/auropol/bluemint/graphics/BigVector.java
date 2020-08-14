package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigVector {
 private static abstract class BigVectorHelper2d {
     public abstract BigDecimal[] getBigVec2();
     public abstract BigDecimal getDistanceBigVec2();
 }
 private static BigVectorHelper2d bigVector2d;

 public BigVector(BigDecimal x, BigDecimal y, BigPoint direction) {
     BigDecimal[] point = new Container<BigDecimal>().createArray(x, y);
     BigDecimal[] secondPoint = direction.getBigPoint();
     bigVector2d = new BigVectorHelper2d() {
         @Override
         public BigDecimal[] getBigVec2() {
             return new Container<BigDecimal>().createArray(x, y);
         }

         @Override
         public BigDecimal getDistanceBigVec2() {
             return getDir(point, secondPoint);
         }
     };
 }
    private BigDecimal getDir(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
        for(int i = 0; i < point.length; ++i) {
            start = start.add(point[i].abs()).add(secondPoint[i].abs());
        }
        return sqrt(start);
    }
    private static BigDecimal sqrt(BigDecimal decimal) {
     BigDecimal start = BigDecimal.ZERO;
     BigDecimal dec = BigDecimal.valueOf(decimal.doubleValue());
     while(!dec.equals(start)) {
        start = dec;
        dec = decimal.divide(start, decimal.scale(), RoundingMode.FLOOR);
        dec = dec.add(start);
        dec = dec.divide(BigDecimal.valueOf(2) , decimal.scale(), RoundingMode.HALF_UP);
     }
     return dec;
    }
    public BigDecimal[] getBigVector2d() {
     return bigVector2d.getBigVec2();
    }
    public BigDecimal getDirection2d() {
     return bigVector2d.getDistanceBigVec2();
    }
    private static abstract class BigVectorHelper3d {
     public abstract BigDecimal[] getBigVec3();
     public abstract BigDecimal getDistanceBigVec3();
    }

    public static class BigVector3D {
     private static BigVectorHelper3d bigVector3d;
     public BigVector3D(BigDecimal x, BigDecimal y, BigDecimal z, BigPoint.BigPoint3D direction) {
         BigDecimal[] point = new Container<BigDecimal>().createArray(x, y, z);
         BigDecimal[] secondPoint = direction.getBigPoint();
         bigVector3d = new BigVectorHelper3d() {
             @Override
             public BigDecimal[] getBigVec3() {
                 return new Container<BigDecimal>().createArray(x, y, z);
             }

             @Override
             public BigDecimal getDistanceBigVec3() {
                 return getDir(point, secondPoint);
             }
         };
     }
        private BigDecimal getDir(BigDecimal[] point, BigDecimal[] secondPoint) {
            BigDecimal start = BigDecimal.ZERO;
            for(int i = 0; i < point.length; ++i) {
                start = start.add(point[i].abs().add(secondPoint[i].abs()));
            }
            return sqrt(start);
        }
        public BigDecimal[] getBigVector3d() {
            return bigVector3d.getBigVec3();
        }
        public BigDecimal getDirection3d() {
            return bigVector3d.getDistanceBigVec3();
        }
    }
    private static abstract class BigVectorHelper4d {
     public abstract BigDecimal[] getBigVec4();
     public abstract BigDecimal getDistanceBigVec4();
    }
    private static abstract class BigVectorHelperInfiniteD {
        public abstract BigDecimal[] getBigVecID();
        public abstract BigDecimal getDistanceBigVecID();
    }
    private static abstract class DoubleBigVectorHelper2d{
        public abstract BigInteger[] getDoubleBigVec2();
        public abstract BigInteger getDistanceDoubleBigVec2();
    }
    private static abstract class DoubleBigVectorHelper3d {
        public abstract BigInteger[] getDoubleBigVec3();
        public abstract BigInteger getDistanceDoubleBigVec3();
    }
    private static abstract class DoubleBigVectorHelper4d {
        public abstract BigInteger[] getDoubleBigVec4();
        public abstract BigInteger getDistanceDoubleBigVec4();
    }
    private static abstract class DoubleBigVectorHelperInfiniteD{
        public abstract BigInteger[] getDoubleBigVecID();
        public abstract BigInteger getDistanceDoubleBigVecID();
    }
    public static class BigVector4D {
     private static BigVectorHelper4d bigVector4d;
     public BigVector4D(BigDecimal x, BigDecimal y, BigDecimal z, BigDecimal w, BigPoint.BigPoint4D direction) {
         BigDecimal[] point = new Container<BigDecimal>().createArray(x, y, z, w);
         BigDecimal[] secondPoint = direction.getBigPoint();
         bigVector4d = new BigVectorHelper4d() {
             @Override
             public BigDecimal[] getBigVec4() {
                 return point;
             }

             @Override
             public BigDecimal getDistanceBigVec4() {
                 return getDir(point, secondPoint);
             }
         };
     }
        private BigDecimal getDir(BigDecimal[] point, BigDecimal[] secondPoint) {
            BigDecimal start = BigDecimal.ZERO;
            for(int i = 0; i < point.length; ++i) {
                start = start.add(point[i].abs().add(secondPoint[i].abs()));
            }
            return sqrt(start);
        }
        public BigDecimal[] getBigVector4d() {
            return bigVector4d.getBigVec4();
        }
        public BigDecimal getDirection4d() {
            return bigVector4d.getDistanceBigVec4();
        }
    }
    public static class BigVectorInfiniteD {
        private static BigVectorHelperInfiniteD bigVectorID;
        public BigVectorInfiniteD(BigDecimal[] axis, BigPoint.BigPointInfiniteD direction) {
            BigDecimal[] point = new BigPoint.BigPointInfiniteD(axis).getBigPoint();
            BigDecimal[] secondPoint = direction.getBigPoint();
            bigVectorID = new BigVectorHelperInfiniteD() {
                @Override
                public BigDecimal[] getBigVecID() {
                 return point;
                }

                @Override
                public BigDecimal getDistanceBigVecID() {
                    return getDir(point, secondPoint);
                }
            };
        }
        private BigDecimal getDir(BigDecimal[] point, BigDecimal[] secondPoint) {
            BigDecimal start = BigDecimal.ZERO;
            for(int i = 0; i < point.length; ++i) {
                start = start.add(point[i].abs().add(secondPoint[i].abs()));
            }
            return sqrt(start);
        }
        public BigDecimal[] getBigVectorID() {
            return bigVectorID.getBigVecID();
        }
        public BigDecimal getDirectionID() {
            return bigVectorID.getDistanceBigVecID();
        }
    }
    public static class DoubleBigVector {
     private static DoubleBigVectorHelper2d doubleBigVector2d;
     public DoubleBigVector(BigInteger x, BigInteger y, BigPoint.BigDoublePoint direction) {
         BigInteger[] point = new Container<BigInteger>().createArray(x, y);
         BigInteger[] secondPoint = direction.getBigDoublePoint();
         doubleBigVector2d = new DoubleBigVectorHelper2d() {
             @Override
             public BigInteger[] getDoubleBigVec2() {
                 return new Container<BigInteger>().createArray(x, y);
             }

             @Override
             public BigInteger getDistanceDoubleBigVec2() {
                 return getDir(point, secondPoint);
             }
         };
     }
        private BigInteger getDir(BigInteger[] point, BigInteger[] secondPoint) {
            BigInteger start = BigInteger.ZERO;
            for(int i = 0; i < point.length; ++i) {
                start = start.add(point[i].abs().add(secondPoint[i].abs()));
            }
            return sqrt(new BigDecimal(start)).toBigInteger();
        }
        public BigInteger[] getDoubleBigVector2d() {
            return doubleBigVector2d.getDoubleBigVec2();
        }
        public BigInteger getDirection2d() {
            return doubleBigVector2d.getDistanceDoubleBigVec2();
        }
        public static class DoubleBigVector3D {
         private static DoubleBigVectorHelper3d doubleBigVector3d;
         public DoubleBigVector3D(BigInteger x, BigInteger y, BigInteger z, BigPoint.BigDoublePoint.BigDoublePoint3D direction) {
             BigInteger[] point = new Container<BigInteger>().createArray(x, y, z);
             BigInteger[] secondPoint = direction.getBigDoublePoint();
             doubleBigVector3d = new DoubleBigVectorHelper3d() {
                 @Override
                 public BigInteger[] getDoubleBigVec3() {
                     return point;
                 }

                 @Override
                 public BigInteger getDistanceDoubleBigVec3() {
                     return getDir(point, secondPoint);
                 }
             };
         }
            private BigInteger getDir(BigInteger[] point, BigInteger[] secondPoint) {
                BigInteger start = BigInteger.ZERO;
                for(int i = 0; i < point.length; ++i) {
                    start = start.add(point[i].abs().add(secondPoint[i].abs()));
                }
                return sqrt(new BigDecimal(start)).toBigInteger();
            }
            public BigInteger[] getDoubleBigVector3d() {
             return doubleBigVector3d.getDoubleBigVec3();
            }
            public BigInteger getDirection3d() {
             return doubleBigVector3d.getDistanceDoubleBigVec3();
            }
        }
        public static class DoubleBigVector4D {
         private static DoubleBigVectorHelper4d doubleBigVector4d;
         public DoubleBigVector4D(BigInteger x, BigInteger y, BigInteger z, BigInteger w, BigPoint.BigDoublePoint.BigDoublePoint4D direction) {
             BigInteger[] point = new Container<BigInteger>().createArray(x, y, z, w);
             BigInteger[] secondPoint = direction.getBigDoublePoint();
             doubleBigVector4d = new DoubleBigVectorHelper4d() {
                 @Override
                 public BigInteger[] getDoubleBigVec4() {
                     return point;
                 }

                 @Override
                 public BigInteger getDistanceDoubleBigVec4() {
                     return getDir(point, secondPoint);
                 }
             };
         }
            private BigInteger getDir(BigInteger[] point, BigInteger[] secondPoint) {
                BigInteger start = BigInteger.ZERO;
                for(int i = 0; i < point.length; ++i) {
                    start = start.add(point[i].abs().add(secondPoint[i].abs()));
                }
                return sqrt(new BigDecimal(start)).toBigInteger();
            }
            public BigInteger[] getDoubleBigVector4d() {
             return doubleBigVector4d.getDoubleBigVec4();
            }
            public BigInteger getDirection4d() {
             return doubleBigVector4d.getDistanceDoubleBigVec4();
            }
        }
        public static class DoubleBigVectorInfiniteD {
         private static DoubleBigVectorHelperInfiniteD doubleBigVectorID;
         public DoubleBigVectorInfiniteD(BigInteger[] axis, BigPoint.BigDoublePoint.BigDoublePointInfiniteD direction) {
             BigInteger[] point = new BigPoint.BigDoublePoint.BigDoublePointInfiniteD(axis).getBigDoublePoint();
             doubleBigVectorID = new DoubleBigVectorHelperInfiniteD() {
                 @Override
                 public BigInteger[] getDoubleBigVecID() {
                     return point;
                 }

                 @Override
                 public BigInteger getDistanceDoubleBigVecID() {
                     return getDir(point, direction.getBigDoublePoint());
                 }
             };
         }
            private BigInteger getDir(BigInteger[] point, BigInteger[] secondPoint) {
                BigInteger start = BigInteger.ZERO;
                for(int i = 0; i < point.length; ++i) {
                    start = start.add(point[i].abs().add(secondPoint[i].abs()));
                }
                return sqrt(new BigDecimal(start)).toBigInteger();
            }
            public BigInteger[] getBigDoubleVectorID() {
             return doubleBigVectorID.getDoubleBigVecID();
            }
            public BigInteger getDirectionID() {
             return doubleBigVectorID.getDistanceDoubleBigVecID();
            }
        }
    }

}
