package Homeworks;

import static Homeworks.TriangleArea.methodArea;

public class Main {
    public static void main(String[] args) {
        TriangleArea t = new TriangleArea();
        System.out.println(methodArea(7, 6,3 ));
        System.out.print("To be precise: ");
        System.out.print(Math.round(methodArea(7, 6,3 )));
    }


}

