package Homeworks;

public class Main {
    public static void main(String[] args) {
        Rectangle area = new Rectangle();
        area.setWidth(6);
        area.setLength(5);
        System.out.println(area.toString());
        System.out.println("The area of rectangle: "+area.getRectangleArea());
    }

}

