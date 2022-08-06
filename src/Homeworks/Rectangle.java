package Homeworks;

public class Rectangle {
   private static int width;
   private static int length;

    //Setters
   public static void setWidth(int a){
        if(a<0){
            System.out.println("you couldn't give negative value for width");
        }
       else{
           width = a;}
    }
   public static void setLength(int b){
        if (b<0){
            System.out.println("you couldn't give negative value for length");
        }
        else {length = b;}
   }

    //Getter
    public static int getRectangleArea(){
        return width*length;
    }
    @Override
    public String toString() {
        return "width: "+width +" length: "+length;
    }



}
