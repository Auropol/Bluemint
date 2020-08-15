package me.auropol.bluemint.graphics;

import javafx.util.converter.BigDecimalStringConverter;
import javafx.util.converter.BigIntegerStringConverter;
import me.auropol.bluemint.primitive.Container;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

public class Distance {
    private static DistanceHelper<Float> internalF;
    private static DistanceHelper<Double> internalD;
    private static DistanceHelper<Long> internalL;
    private static DistanceHelper<Integer> internalI;
    private static DistanceHelper<BigDecimal> internalBF;
    private static DistanceHelper<BigInteger> internalBD;
    private static abstract class DistanceHelper<T> {
        public abstract T getManhattan();
        public abstract T getLinear();
        public abstract T getWorley();
        public abstract T getQuadratic();
        public abstract T getEuclidean();
    }
    private static int[] marr;
    private static int[] mdarr;
    private static BigInteger pow(BigInteger base, BigInteger multiplicand) {
        String multiplicandStr = new BigIntegerStringConverter().toString(multiplicand);
        int[] multiplicandArr = new int[multiplicandStr.length()];
        for (int i = 0; i < multiplicandArr.length ; i++) {
            multiplicandArr[i] = multiplicandStr.charAt(i) - '0';
            marr = multiplicandArr;
        }
        for(int i : marr)  {
            base = base.pow(i);
        }
        return base;
    }
    private static BigDecimal pow(BigDecimal base, BigDecimal multiplicand) {
        String multiplicandStr = new BigDecimalStringConverter().toString(multiplicand);
        int[] multiplicandArr = new int[multiplicandStr.length()];
        for (int i = 0; i < multiplicandArr.length ; i++) {
            multiplicandArr[i] = multiplicandStr.charAt(i) - '0';
            mdarr = multiplicandArr;
        }
        for(int i : mdarr) {
            base = base.pow(i);
        }
        return base;
    }
    public Distance(Point a, Point b) {
        internalF = new DistanceHelper<Float>() {

            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getPoint(), b.getPoint());
            }
        };
    }
    public Distance(Point.Point3D a, Point.Point3D b) {
        internalF = new DistanceHelper<Float>() {

            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getPoint(), b.getPoint());
            }
        };
    }
    public Distance(Point.Point4D a, Point.Point4D b) {
        internalF = new DistanceHelper<Float>() {

            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getPoint(), b.getPoint());
            }
        };
    }
    public Distance(Point.PointInfiniteD a, Point.PointInfiniteD b) {
        internalF = new DistanceHelper<Float>() {

            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getPoint(), b.getPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getPoint(), b.getPoint());
            }
        };
    }
    public Distance(Point.DoublePoint a, Point.DoublePoint b) {
        internalD = new DistanceHelper<Double>() {
            @Override
            public Double getManhattan() {
                return Distance.this.getManhattan(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getLinear() {
                return Distance.this.getLinear(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getWorley() {
                return Distance.this.getWorley(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getQuadratic() {
                return Distance.this.getQuadratic(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getEuclidean() {
                return Distance.this.getEuclidean(a.getDoublePoint(), b.getDoublePoint());
            }
        };

    }
    public Distance(Point.DoublePoint.DoublePoint3D a, Point.DoublePoint.DoublePoint3D  b) {
        internalD = new DistanceHelper<Double>() {
            @Override
            public Double getManhattan() {
                return Distance.this.getManhattan(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getLinear() {
                return Distance.this.getLinear(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getWorley() {
                return Distance.this.getWorley(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getQuadratic() {
                return Distance.this.getQuadratic(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getEuclidean() {
                return Distance.this.getEuclidean(a.getDoublePoint(), b.getDoublePoint());
            }
        };
    }
    public Distance(Point.DoublePoint.DoublePoint4D  a, Point.DoublePoint.DoublePoint4D  b) {
        internalD = new DistanceHelper<Double>() {
            @Override
            public Double getManhattan() {
                return Distance.this.getManhattan(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getLinear() {
                return Distance.this.getLinear(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getWorley() {
                return Distance.this.getWorley(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getQuadratic() {
                return Distance.this.getQuadratic(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getEuclidean() {
                return Distance.this.getEuclidean(a.getDoublePoint(), b.getDoublePoint());
            }
        };
    }
    public Distance(Point.DoublePoint.DoublePointInfiniteD a, Point.DoublePoint.DoublePointInfiniteD b) {
        internalD = new DistanceHelper<Double>() {
            @Override
            public Double getManhattan() {
                return Distance.this.getManhattan(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getLinear() {
                return Distance.this.getLinear(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getWorley() {
                return Distance.this.getWorley(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getQuadratic() {
                return Distance.this.getQuadratic(a.getDoublePoint(), b.getDoublePoint());
            }

            @Override
            public Double getEuclidean() {
                return Distance.this.getEuclidean(a.getDoublePoint(), b.getDoublePoint());
            }
        };
    }
    public Distance(Point.IntegerPoint a, Point.IntegerPoint b){
        internalI = new DistanceHelper<Integer>() {
            @Override
            public Integer getManhattan() {
                return Distance.this.getManhattan(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getLinear() {
                return Distance.this.getLinear(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getWorley() {
                return Distance.this.getWorley(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getQuadratic() {
                return Distance.this.getQuadratic(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getEuclidean() {
                return Distance.this.getEuclidean(a.getIntegerPoint(), b.getIntegerPoint());
            }
        };
    }
    public Distance(Point.IntegerPoint.IntegerPoint3D a, Point.IntegerPoint.IntegerPoint3D b) {
        internalI = new DistanceHelper<Integer>() {
            @Override
            public Integer getManhattan() {
                return Distance.this.getManhattan(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getLinear() {
                return Distance.this.getLinear(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getWorley() {
                return Distance.this.getWorley(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getQuadratic() {
                return Distance.this.getQuadratic(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getEuclidean() {
                return Distance.this.getEuclidean(a.getIntegerPoint(), b.getIntegerPoint());
            }
        };
    }
    public Distance(Point.IntegerPoint.IntegerPoint4D a, Point.IntegerPoint.IntegerPointInfiniteD b) {
        internalI = new DistanceHelper<Integer>() {
            @Override
            public Integer getManhattan() {
                return Distance.this.getManhattan(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getLinear() {
                return Distance.this.getLinear(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getWorley() {
                return Distance.this.getWorley(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getQuadratic() {
                return Distance.this.getQuadratic(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getEuclidean() {
                return Distance.this.getEuclidean(a.getIntegerPoint(), b.getIntegerPoint());
            }
        };
    }
    public Distance(Point.IntegerPoint.IntegerPointInfiniteD a, Point.IntegerPoint.IntegerPointInfiniteD b) {
        internalI = new DistanceHelper<Integer>() {
            @Override
            public Integer getManhattan() {
                return Distance.this.getManhattan(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getLinear() {
                return Distance.this.getLinear(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getWorley() {
                return Distance.this.getWorley(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getQuadratic() {
                return Distance.this.getQuadratic(a.getIntegerPoint(), b.getIntegerPoint());
            }

            @Override
            public Integer getEuclidean() {
                return Distance.this.getEuclidean(a.getIntegerPoint(), b.getIntegerPoint());
            }
        };
    }
    public Distance(Point.LongPoint a, Point.LongPoint b) {
        internalL = new DistanceHelper<Long>() {
            @Override
            public Long getManhattan() {
                return Distance.this.getManhattan(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getLinear() {
                return Distance.this.getLinear(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getWorley() {
                return Distance.this.getWorley(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getQuadratic() {
                return Distance.this.getQuadratic(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getEuclidean() {
                return Distance.this.getEuclidean(a.getLongPoint(), b.getLongPoint());
            }
        };
    }
    public Distance(Point.LongPoint.LongPoint3D a, Point.LongPoint.LongPoint3D b) {
        internalL = new DistanceHelper<Long>() {
            @Override
            public Long getManhattan() {
                return Distance.this.getManhattan(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getLinear() {
                return Distance.this.getLinear(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getWorley() {
                return Distance.this.getWorley(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getQuadratic() {
                return Distance.this.getQuadratic(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getEuclidean() {
                return Distance.this.getEuclidean(a.getLongPoint(), b.getLongPoint());
            }
        };
    }
    public Distance(Point.LongPoint.LongPoint4D a, Point.LongPoint.LongPoint4D b) {
        internalL = new DistanceHelper<Long>() {
            @Override
            public Long getManhattan() {
                return Distance.this.getManhattan(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getLinear() {
                return Distance.this.getLinear(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getWorley() {
                return Distance.this.getWorley(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getQuadratic() {
                return Distance.this.getQuadratic(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getEuclidean() {
                return Distance.this.getEuclidean(a.getLongPoint(), b.getLongPoint());
            }
        };
    }
    public Distance(Point.LongPoint.LongPointInfiniteD a, Point.LongPoint.LongPointInfiniteD b) {
        internalL = new DistanceHelper<Long>() {
            @Override
            public Long getManhattan() {
                return Distance.this.getManhattan(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getLinear() {
                return Distance.this.getLinear(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getWorley() {
                return Distance.this.getWorley(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getQuadratic() {
                return Distance.this.getQuadratic(a.getLongPoint(), b.getLongPoint());
            }

            @Override
            public Long getEuclidean() {
                return Distance.this.getEuclidean(a.getLongPoint(), b.getLongPoint());
            }
        };
    }
    public Distance(BigPoint a, BigPoint b) {
        internalBF = new DistanceHelper<BigDecimal>() {
            @Override
            public BigDecimal getManhattan() {
                return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getLinear() {
                return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getWorley() {
                return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getQuadratic() {
                return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getEuclidean() {
                return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
            }
        };
    }
    public Distance(BigPoint.BigPoint3D a, BigPoint.BigPoint3D b) {
        internalBF = new DistanceHelper<BigDecimal>() {
            @Override
            public BigDecimal getManhattan() {
                return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getLinear() {
                return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getWorley() {
                return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getQuadratic() {
                return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public BigDecimal getEuclidean() {
                return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
            }
        };
    }
    public Distance(BigPoint.BigPoint4D a, BigPoint.BigPoint4D b) {
    internalBF = new DistanceHelper<BigDecimal>() {
        @Override
        public BigDecimal getManhattan() {
            return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
        }

        @Override
        public BigDecimal getLinear() {
            return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
        }

        @Override
        public BigDecimal getWorley() {
            return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
        }

        @Override
        public BigDecimal getQuadratic() {
            return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
        }

        @Override
        public BigDecimal getEuclidean() {
            return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
        }
    };
}
   public Distance(BigPoint.BigPointInfiniteD a, BigPoint.BigPointInfiniteD b) {
       internalBF = new DistanceHelper<BigDecimal>() {
           @Override
           public BigDecimal getManhattan() {
               return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public BigDecimal getLinear() {
               return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public BigDecimal getWorley() {
               return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public BigDecimal getQuadratic() {
               return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public BigDecimal getEuclidean() {
               return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint a, BigPoint.BigDoublePoint b) {
       internalBD = new DistanceHelper<BigInteger>() {
           @Override
           public BigInteger getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePoint3D a, BigPoint.BigDoublePoint.BigDoublePoint3D b) {
       internalBD = new DistanceHelper<BigInteger>() {
           @Override
           public BigInteger getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePoint4D a, BigPoint.BigDoublePoint.BigDoublePoint4D b) {
       internalBD = new DistanceHelper<BigInteger>() {
           @Override
           public BigInteger getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePointInfiniteD a, BigPoint.BigDoublePoint.BigDoublePointInfiniteD b) {
       internalBD = new DistanceHelper<BigInteger>() {
           @Override
           public BigInteger getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public BigInteger getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
    private static BigDecimal sqrt(BigDecimal decimal) {
        BigDecimal y = BigDecimal.ONE;
        int precision = decimal.precision();
        BigDecimal dec = decimal.abs().subtract(y).abs().divide(decimal.abs(), RoundingMode.FLOOR);
        while(dec.compareTo(BigDecimal.valueOf(precision)) > precision) {
            decimal = (decimal.add(y)).divide(BigDecimal.valueOf(2), RoundingMode.FLOOR);
            y = decimal.divide(decimal, RoundingMode.FLOOR);
        }
        return decimal;
    }
   private BigInteger getManhattan(BigInteger[] point, BigInteger[] secondPoint) {
        BigInteger start = BigInteger.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(point[i].abs().add(secondPoint[i].abs()));
       }
       return sqrt(new BigDecimal(start)).toBigInteger();
   }
   private BigInteger getLinear(BigInteger[] point, BigInteger[] secondPoint) {
        BigInteger start = BigInteger.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(sqrt(new BigDecimal(point[i].pow(2).add(secondPoint[i].pow(2)))).toBigInteger());
       }
       return start.abs();
   }
   private BigInteger getWorley(BigInteger[] point, BigInteger[] secondPoint) {
        BigInteger start = BigInteger.ZERO;
       for (int i = 0; i < point.length ; i++) {
           BigDecimal res = new BigDecimal(pow(getLinear(point, secondPoint), secondPoint[i]));
           start = res.round(new MathContext(res.precision(), RoundingMode.FLOOR)).toBigInteger();
       }
       return sqrt(new BigDecimal(start)).toBigInteger();

   }
   private BigInteger getQuadratic(BigInteger[] point, BigInteger[] secondPoint) {
        BigInteger start = BigInteger.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(point[i].multiply(point[i]).add(point[i].multiply(secondPoint[i]).add(secondPoint[i].multiply(secondPoint[i]))));
       }
       return sqrt(new BigDecimal(start)).toBigInteger();
   }
   private BigInteger getEuclidean(BigInteger[] point, BigInteger[] secondPoint) {
        BigInteger start = BigInteger.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(pow((point[i].subtract(secondPoint[i])), BigInteger.valueOf(2)));
       }
       return sqrt(new BigDecimal(start)).toBigInteger();
   }
   private BigDecimal getManhattan(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(point[i].abs().add(secondPoint[i].abs()));
       }
       return sqrt(start);
   }
   private BigDecimal getLinear(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(sqrt(point[i].pow(2).add(secondPoint[i].pow(2))));
       }
       return start.abs();
   }
   private BigDecimal getWorley(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
       for (int i = 0; i < point.length; i++) {
           BigDecimal res = pow(getLinear(point, secondPoint), secondPoint[i]);
           start = res.round(new MathContext(res.precision(), RoundingMode.FLOOR));
       }
       return sqrt(start);
   }
   private BigDecimal getQuadratic(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
       for (int i = 0; i < point.length ; i++) {
           start = start.add(point[i].multiply(point[i]).add(point[i].multiply(secondPoint[i]).add(secondPoint[i].multiply(secondPoint[i]))));
       }
       return sqrt(start);
   }
   private BigDecimal getEuclidean(BigDecimal[] point, BigDecimal[] secondPoint) {
        BigDecimal start = BigDecimal.ZERO;
       for (int i = 0; i < point.length; i++) {
           start = start.add(pow((point[i].subtract(secondPoint[i])), BigDecimal.valueOf(2)));
       }
       return sqrt(start);
   }
    private float getManhattan(float[] point, float[] secondPoint) {
        float start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
        }
        return (float)Math.sqrt(start);
    }
    private float getLinear(float[] point, float[] secondPoint) {
        float start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + (float)Math.sqrt(Math.pow(point[i], 2) + Math.pow(secondPoint[i], 2));
        }
        return Math.abs(start);
    }
    private float getWorley(float[] point, float[] secondPoint) {
        float start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + (float)Math.floor(Math.pow(getLinear(point, secondPoint), secondPoint[i]));
        }
        return (float)Math.sqrt(start);
    }
    private float getQuadratic(float[] point, float[] secondPoint) {
        float start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + (point[i]*point[i] + point[i]*secondPoint[i] + secondPoint[i]*secondPoint[i]);
        }
        return (float)Math.sqrt(start);
    }
    private float getEuclidean(float[] point, float[] secondPoint) {
        float start = 0;
        for (int i = 0; i < point.length; i++) {
            start = start + (float)Math.pow((point[i] - secondPoint[i]), 2);
        }
        return (float)Math.sqrt(start);
    }
    private double getManhattan(double[] point, double[] secondPoint) {
        double start = 0.0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
        }
        return Math.sqrt(start);
    }
    private double getLinear(double[] point, double[] secondPoint) {
        double start = 0.0;
        for (int i = 0; i < point.length ; i++) {
            start = start + Math.sqrt(Math.pow(point[i], 2) + Math.pow(secondPoint[i], 2));
        }
        return Math.abs(start);
    }
    private double getWorley(double[] point, double[] secondPoint) {
        double start = 0.0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.floor(Math.pow(getLinear(point, secondPoint), secondPoint[i]));
        }
        return Math.sqrt(start);
    }
    private double getQuadratic(double[] point, double[] secondPoint) {
        double start = 0.0;
        for (int i = 0; i < point.length ; i++) {
            start = start + (point[i]*point[i] + point[i]*secondPoint[i] + secondPoint[i]*secondPoint[i]);
        }
        return Math.sqrt(start);
    }
    private double getEuclidean(double[] point, double[] secondPoint) {
        double start = 0.0;
        for (int i = 0; i < point.length; i++) {
            start = start +  Math.pow((point[i] - secondPoint[i]), 2);
        }
        return Math.sqrt(start);
    }
    private int getManhattan(int[] point, int[] secondPoint) {
        int start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
        }
        return Math.round((float)Math.sqrt(start));
    }
    private int getLinear(int[] point, int[] secondPoint) {
        int start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + Math.round((float)Math.sqrt(point[i] ^ 2 + secondPoint[i]^ 2));
        }
        return Math.abs(start);
    }
    private int getWorley(int[] point, int[] secondPoint) {
        int start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.round((float)Math.floor(getLinear(point, secondPoint) ^ secondPoint[i]));
        }
        return Math.round((float)Math.sqrt(start));
    }
    private int getQuadratic(int[] point, int[] secondPoint) {
        int start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + (point[i]*point[i] + point[i]*secondPoint[i] + secondPoint[i]*secondPoint[i]);
        }
        return Math.round((float)Math.sqrt(start));
    }
    private int getEuclidean(int[] point, int[] secondPoint) {
        int start = 0;
        for (int i = 0; i < point.length; i++) {
            start = start +  Math.round((float)Math.pow((point[i] - secondPoint[i]), 2));
        }
        return Math.round((float)Math.sqrt(start));
    }
    private long getManhattan(long[] point, long[] secondPoint) {
        long start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.abs(point[i]) + Math.abs(secondPoint[i]);
        }
        return Math.round(Math.sqrt(start));
    }
    private long getLinear(long[] point, long[] secondPoint) {
        long start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + Math.round(Math.sqrt(point[i] ^ 2 + secondPoint[i]^ 2));
        }
        return Math.abs(start);
    }
    private long getWorley(long[] point, long[] secondPoint) {
        long start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.round(Math.floor(getLinear(point, secondPoint) ^ secondPoint[i]));
        }
        return Math.round(Math.sqrt(start));
    }
    private long getQuadratic(long[] point, long[] secondPoint) {
        long start = 0;
        for (int i = 0; i < point.length ; i++) {
            start = start + (point[i]*point[i] + point[i]*secondPoint[i] + secondPoint[i]*secondPoint[i]);
        }
        return Math.round(Math.sqrt(start));
    }
    private long getEuclidean(long[] point, long[] secondPoint) {
        long start = 0;
        for (int i = 0; i < point.length; i++) {
            start = start +  Math.round(Math.pow((point[i] - secondPoint[i]), 2));
        }
        return Math.round(Math.sqrt(start));
    }
    //Float
    public float getManhattan() {
        if(internalF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-float constructor");
        }
        return internalF.getManhattan();
    }
    public float getLinear(){
        if(internalF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-float constructor");
        }
        return internalF.getLinear();
    }
    public float getWorley(){
        if(internalF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-float constructor");
        }
        return internalF.getWorley();
    }
    public float getQuadratic(){
        if(internalF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-float constructor");
        }
        return internalF.getQuadratic();
    }
    public float getEuclidean(){
        if(internalF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-float constructor");
        }
        return internalF.getEuclidean();
    }
    //Double
    public double getManhattanDouble() {
        if(internalD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-double constructor");
        }
        return internalD.getManhattan();
    }
    public double getLinearDouble(){
        if(internalD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-double constructor");
        }
        return internalD.getLinear();
    }
    public double getWorleyDouble(){
        if(internalD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-double   constructor");
        }
        return internalD.getWorley();
    }
    public double getQuadraticDouble(){
        if(internalD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-double  constructor");
        }
        return internalD.getQuadratic();
    }
    public double getEuclideanDouble(){
        if(internalD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-double   constructor");
        }
        return internalD.getEuclidean();
    }
    //Integer
    public int getManhattanInteger() {
        if(internalI == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-integer  constructor");
        }
        return internalI.getManhattan();
    }
    public int getLinearInteger(){
        if(internalI == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-integer  constructor");
        }
        return internalI.getLinear();
    }
    public int getWorleyInteger(){
        if(internalI == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-integer   constructor");
        }
        return internalI.getWorley();
    }
    public int getQuadraticInteger(){
        if(internalI == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-integer  constructor");
        }
        return internalI.getQuadratic();
    }
    public int getEuclideanInteger(){
        if(internalI == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-integer   constructor");
        }
        return internalI.getEuclidean();
    }
    //Long
    public long getManhattanLong() {
        if(internalL == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-long  constructor");
        }
        return internalL.getManhattan();
    }
    public long getLinearLong(){
        if(internalL == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-long  constructor");
        }
        return internalL.getLinear();
    }
    public long getWorleyLong(){
        if(internalL == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-long   constructor");
        }
        return internalL.getWorley();
    }
    public long getQuadraticLong(){
        if(internalL == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-long constructor");
        }
        return internalL.getQuadratic();
    }
    public long getEuclideanLong(){
        if(internalL == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-long   constructor");
        }
        return internalL.getEuclidean();
    }
    //Big Float
    public BigDecimal getManhattanBig() {
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getManhattan();
    }
    public BigDecimal getLinearBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getLinear();
    }
    public BigDecimal getWorleyBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getWorley();
    }
    public BigDecimal getQuadraticBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getQuadratic();
    }
    public BigDecimal getEuclideanBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getEuclidean();
    }
    // Big Double
    public BigInteger  getManhattanBigDouble() {
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double constructor");
        }
        return internalBD.getManhattan();
    }
    public BigInteger  getLinearBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getLinear();
    }
    public BigInteger  getWorleyBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getWorley();
    }
    public BigInteger  getQuadraticBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getQuadratic();
    }
    public BigInteger getEuclideanBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getEuclidean();
    }
}
