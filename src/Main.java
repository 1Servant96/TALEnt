public class Main {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 301; i++) {
            if(i%3==0 && i%4==0 && i%5==0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println();
        System.out.println("The sum of numbers which divisible by 3,4 and 5 are:"+sum);
    }
}