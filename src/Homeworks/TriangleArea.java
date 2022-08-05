package Homeworks;

public class TriangleArea {
    float a;
    int b;
    int c;

    static float methodArea(float a, int b, int c ){
     float p = (a+b+c)/2;
     float area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
     return area;
    }

}
