package me.auropol.bluemint.graphics;

public class Distance {
    private static DistanceHelper<Float> internalF;
    private static DistanceHelper<Double> internalD;
    private static DistanceHelper<Long> internalL;
    private static DistanceHelper<Integer> internalI;
    private static DistanceHelper<Float> internalBF;
    private static DistanceHelper<Double> internalBD;
    private static abstract class DistanceHelper<T> {
        public abstract T getManhattan();
        public abstract T getLinear();
        public abstract T getWorley();
        public abstract T getQuadratic();
        public abstract T getEuclidean();
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
    public Distance(BigPoint a, BigPoint b)  {
        internalBF = new DistanceHelper<Float>() {
            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
            }
        };
    }
    public Distance(BigPoint.BigPoint3D a, BigPoint.BigPoint3D b) {
        internalBF = new DistanceHelper<Float>() {
            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
            }
        };
    }
    public Distance(BigPoint.BigPoint4D a, BigPoint.BigPoint4D b) {
        internalBF = new DistanceHelper<Float>() {
            @Override
            public Float getManhattan() {
                return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getLinear() {
                return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getWorley() {
                return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getQuadratic() {
                return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
            }

            @Override
            public Float getEuclidean() {
                return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
            }
        };
    }
   public Distance(BigPoint.BigPointInfiniteD a, BigPoint.BigPointInfiniteD b) {
       internalBF = new DistanceHelper<Float>() {
           @Override
           public Float getManhattan() {
               return Distance.this.getManhattan(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public Float getLinear() {
               return Distance.this.getLinear(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public Float getWorley() {
               return Distance.this.getWorley(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public Float getQuadratic() {
               return Distance.this.getQuadratic(a.getBigPoint(), b.getBigPoint());
           }

           @Override
           public Float getEuclidean() {
               return Distance.this.getEuclidean(a.getBigPoint(), b.getBigPoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint a, BigPoint.BigDoublePoint b) {
        internalBD = new DistanceHelper<Double>() {
            @Override
            public Double getManhattan() {
                return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
            }

            @Override
            public Double getLinear() {
                return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
            }

            @Override
            public Double getWorley() {
                return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
            }

            @Override
            public Double getQuadratic() {
                return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
            }

            @Override
            public Double getEuclidean() {
                return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
            }
        };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePoint3D a, BigPoint.BigDoublePoint.BigDoublePoint3D b) {
       internalBD = new DistanceHelper<Double>() {
           @Override
           public Double getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePoint4D a, BigPoint.BigDoublePoint.BigDoublePoint4D b) {
       internalBD = new DistanceHelper<Double>() {
           @Override
           public Double getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
   }
   public Distance(BigPoint.BigDoublePoint.BigDoublePointInfiniteD a, BigPoint.BigDoublePoint.BigDoublePointInfiniteD b) {
       internalBD = new DistanceHelper<Double>() {
           @Override
           public Double getManhattan() {
               return Distance.this.getManhattan(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getLinear() {
               return Distance.this.getLinear(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getWorley() {
               return Distance.this.getWorley(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getQuadratic() {
               return Distance.this.getQuadratic(a.getBigDoublePoint(), b.getBigDoublePoint());
           }

           @Override
           public Double getEuclidean() {
               return Distance.this.getEuclidean(a.getBigDoublePoint(), b.getBigDoublePoint());
           }
       };
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
            start = start + (float)Math.sqrt(Math.round(point[i]) ^ 2 + Math.round(secondPoint[i]) ^ 2);
        }
        return Math.abs(start);
    }
    private float getWorley(float[] point, float[] secondPoint) {
        float start = 0;
        for(int i = 0; i < point.length; ++i) {
            start = start + (float)Math.floor(Float.floatToIntBits(getLinear(point, secondPoint)) ^ Float.floatToIntBits(secondPoint[i]));
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
            start = start + Math.sqrt(Math.round(point[i]) ^ 2 + Math.round(secondPoint[i]) ^ 2);
        }
        return Math.abs(start);
    }
    private double getWorley(double[] point, double[] secondPoint) {
        double start = 0.0;
        for(int i = 0; i < point.length; ++i) {
            start = start + Math.floor(Double.doubleToLongBits(getLinear(point, secondPoint)) ^ Double.doubleToLongBits(secondPoint[i]));
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
    public float getManhattanBig() {
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getManhattan();
    }
    public float getLinearBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getLinear();
    }
    public float getWorleyBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getWorley();
    }
    public float getQuadraticBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getQuadratic();
    }
    public float getEuclideanBig(){
        if(internalBF == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-float constructor");
        }
        return internalBF.getEuclidean();
    }
    // Big Double
    public double  getManhattanBigDouble() {
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double constructor");
        }
        return internalBD.getManhattan();
    }
    public double  getLinearBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getLinear();
    }
    public double  getWorleyBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getWorley();
    }
    public double  getQuadraticBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getQuadratic();
    }
    public double getEuclideanBigDouble(){
        if(internalBD == null) {
            throw new NullPointerException("You cannot use this method since you are using a non-big-double  constructor");
        }
        return internalBD.getEuclidean();
    }
}
