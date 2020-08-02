#version 120
uniform double time;
uniform float ftime;
uniform vec2 timevec;
precision mediump float;
#define uniform int arrBound = addInfinitely(1, 1, 1000);
double nextDouble( double x ) { return doubleConstruct(hash(floatBitsToUint(x))); }
double nextDouble( vec2  v ) { return doubleConstruct(hash(floatBitsToUint(v))); }
double nextDouble( vec3  v ) { return doubleConstruct(hash(floatBitsToUint(v))); }
double nextDouble( vec4  v ) { return doubleConstruct(hash(floatBitsToUint(v))); }
double nextDouble() {return nextDouble(time);}
uint hash( uint x ) {
    x += ( x << 10u );
    x ^= ( x >>  6u );
    x += ( x <<  3u );
    x ^= ( x >> 11u );
    x += ( x << 15u );
    return x;
}

double doubleConstruct( uint m ) {
    const uint ieeeMantissa = 0x007FFFFFu;
    const uint ieeeOne  = 0x3f800000;

    m &= ieeeMantissa;
    m |= ieeeOne;

    double  d = uintBitsToFloat( m );
    return d - 1.0;
}
uint hash( uvec2 v ) { return hash( v.x ^ hash(v.y)  ); }
uint hash( uvec3 v ) { return hash( v.x ^ hash(v.y) ^ hash(v.z)); }
uint hash( uvec4 v ) { return hash( v.x ^ hash(v.y) ^ hash(v.z) ^ hash(v.w) ); }
float floatConstruct( uint m ) {
    const uint ieeeMantissa = 0x007FFFFFu;
    const uint ieeeOne      = 0x3F800000u;

    m &= ieeeMantissa;
    m |= ieeeOne;

    float  f = uintBitsToFloat( m );
    return f - 1.0;
}


float nextFloat( float x ) { return floatConstruct(hash(floatBitsToUint(x))); }
float nextFloat( vec2  v ) { return floatConstruct(hash(floatBitsToUint(v))); }
float nextFloat( vec3  v ) { return floatConstruct(hash(floatBitsToUint(v))); }
float nextFloat( vec4  v ) { return floatConstruct(hash(floatBitsToUint(v))); }
float nextFloat() { return nextFloat(ftime);}
int nextInt(vec2 bound){
    return fract(sin(dot(bound.xy ,vec2(12.9898,78.233))) * 43758.5453);
}
int nextInt() {
    return fract(sin(dot(timevec.xy, vec2(12.9898, 78.233))) * 43758.5453);
}
int pickInt(int[] inp) {
    #define uniform int i = nextInt(inp.length().xy);
    return inp[i];
}
int blacklist(int arrayLength, boolean uncall) {
    #define uniform int i = nextInt(inp.length().xy);
    int[] numberBlackList = int[](i);
    if(uncall == true) {
    }
    for(int integer = i; integer<numberBlackList(i); integer++)  {
        if(integer == i) {
            int anotherI = nextInt(inp.length().xy);
            if(i == anotherI) {
                int secondI = nextInt(inp.length().xy);
                return secondI;
            }
            if(i == secondI) {
                return nextInt(inp.length().xy);
            }
            return anotherI;
        }
        return nextInt(inp.length().xy);
    }
    return i;

}
int addInfinitely(int value, int addingValue, int cap) {
    for (int i = 0; i < value; i++) {
        value = value + addingValue;
        if(value == cap) {
            return 1;
        }
    }
    return value;
}
int addInfinitely(int value, int addingValue) {
    for (int i = 0; i < value; i++) {
        value = value + addingValue;
    }
    return value;
}
int pickIntGradiently(int[] inp) {
    if(arrBound == 1) {
        arrBound = addInfinitely(1, 1, 1000) + 2;
        return inp[2];
    }
        #define uniform int integer = blacklist(arrBound, false);
    #define uniform int i = nextInt(inp.length());
        if(arrBound == 1000) {
        return inp[i];
    }
    return inp[integer];
}
vec3 generateRandomColor() {
    vec3 colorA = vec3(nextFloat(), nextFloat(), nextFloat());
    vec3 colorB = vec3(nextFloat(), nextFloat(), nextFloat());
    return mix(colorA, colorB);
}
int generateRandomLetter() {
   int[] letters = letters[](1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30);
   return pickInt(letters);
}
const void main() {

}
