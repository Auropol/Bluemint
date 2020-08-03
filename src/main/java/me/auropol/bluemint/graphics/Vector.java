package me.auropol.bluemint.graphics;

import me.auropol.bluemint.primitive.Container;

public class Vector {
    public static VectorHelper2d vector2d;
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
        return Math.abs(start);
    }
    public float getDirection2d()  {
        return vector2d.getDistanceVec2();
    }
    public abstract static class VectorHelper2d {
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
            return Math.abs(start);
        }
        public float[] getVector3d() {
            return vector3d.getVec3();
        }
        public float getDirection3d() {
            return vector3d.getDistanceVec3();
        }
    }

    public abstract static class VectorHelper3d {
        public abstract float[] getVec3();
        public abstract float getDistanceVec3();
    }
    public abstract static class VectorHelper4d {
        public abstract float[] getVec4();
        public abstract float getDistanceVec4();
    }
    public static class Vector4D  {
        public static VectorHelper4d vector4d;
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
            return Math.abs(start);
        }
        public float[] getVector4d() {
            return vector4d.getVec4();
        }
        public float getDirection4d() {
            return vector4d.getDistanceVec4();
        }
    }
}
