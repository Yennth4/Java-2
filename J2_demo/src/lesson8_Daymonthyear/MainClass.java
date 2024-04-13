package lesson8_Daymonthyear;

public class MainClass {
    public static void main(String[] args) {
        int c = 1 , d = 0;
        
        try {
            int kq1 = c/d;
            System.out.println(kq1);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        System.out.println("Xu li hoan tat");
        int a = 1 , b = 2;
        try {
            int kq2 = a - b;
            System.out.println(kq2);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("xu li hoan tat");
    } 
}
