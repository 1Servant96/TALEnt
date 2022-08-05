package Homeworks;

public class TriangleArea {
    float a;
    int b;
    int c;
    float area;

    public void methodArea(float a, int b, int c ){

     float p = (a+b+c)/2;

     area = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));

     System.out.println("Triangle's area is: " + area+ "; rounded "+Math.round(area));
    }

}
