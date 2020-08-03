package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;
public class Point {
    public static PointHelper2d point;
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
        public static PointHelper3d point;
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
    public abstract static class PointHelper2d  {
        public abstract float[] getPoint2d();
    }
    public abstract static class PointHelper3d {
        public abstract float[] getPoint3d();
    }
    public abstract static class PointHelper4d {
        public abstract float[] getPoint4d();
    }
    public static class Point4D {
        public static PointHelper4d point;
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
}
