package me.auropol.bluemint.graphics;
import me.auropol.bluemint.primitive.Container;


public class ConstantTrajectory {
    public static class Circular {
    private static DistanceHelper internal;
    public static class CircularMovingPoints {
        private static ConstantMovingHelper helperInternal;
        public CircularMovingPoints(Point firstDest, Point secondDest, Point thirdDest, Point fourthDest) {
            helperInternal = new ConstantMovingHelper() {
                @Override
                public Vector getFirstVec() {
                    for(float f : firstDest.getPoint()) {
                        return  new Vector(f, f, secondDest);
                    }
                    return null;
                }

                @Override
                public Vector getSecondVec() {
                    for(float f : secondDest.getPoint()) {
                        return new Vector(f, f, thirdDest);
                    }
                    return null;
                }

                @Override
                public Vector getThirdVec() {
                    for(float f : thirdDest.getPoint()) {
                        return new Vector(f, f, fourthDest);
                    }
                    return null;
                }

                @Override
                public Vector getFourthVec() {
                    for(float f : fourthDest.getPoint()) {
                        return new Vector(f, f, firstDest);
                    }
                    return null;
                }

                @Override
                public Point[] getPoints() {
                    return createArray(firstDest, secondDest, thirdDest, fourthDest);
                }
            };
        }
        private Vector getFirstVec() {
            return helperInternal.getFirstVec();
        }
        private Vector getSecondVec() {
            return helperInternal.getSecondVec();
        }
        private Vector getThirdVec() {
            return helperInternal.getThirdVec();
        }
        private Vector getFourthVec() {
            return helperInternal.getFourthVec();
        }
        private Point[] getPoints() {
            return helperInternal.getPoints();
        }
        private Point[] createArray(Point... points) {
            return points;
        }
    }
    public Circular(CircularMovingPoints points) {
        final Vector fvec = points.getFirstVec();
        final Vector svec = points.getSecondVec();
        final Vector tvec = points.getThirdVec();
        final Vector fovec = points.getFourthVec();
        final Point fpoint = points.getPoints()[0];
        final Point spoint = points.getPoints()[1];
        final Point tpoint = points.getPoints()[2];
        final Point fopoint = points.getPoints()[3];
        internal = new DistanceHelper() {
            @Override
            public float[] getResult() {
                return Container.manage().createArrayFloat(getStop(fvec, spoint), getStop(svec, tpoint), getStop(tvec, fopoint), getStop(fovec, fpoint));
            }
        };
    }
    public float[] getResult() {
        return internal.getResult();
    }
    private float getStop(Vector vec, Point point) {
        float start = 0;
        final float[] pointf = point.getPoint();
        for(int i = 0; i < pointf.length; ++i) {
            start = start + (float)Math.sqrt(Float.floatToIntBits(vec.getVector2d()[i])^ 2 + Float.floatToIntBits(pointf[i]) ^ 2 ^ Float.floatToIntBits(pointf[i]));
        }
        return (float)Math.sqrt(start);
    }

    private static abstract class ConstantMovingHelper {
        public abstract Vector getFirstVec();
        public abstract Vector getSecondVec();
        public abstract Vector getThirdVec();
        public abstract Vector getFourthVec();
        public abstract Point[] getPoints();
    }
    private static abstract class DistanceHelper {
        public abstract float[] getResult();
    }
  }
}
