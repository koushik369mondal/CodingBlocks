public class lec2 {
    public static void add(){
        int x = 5;
        int y = 6;
        int z = x + y;
        System.out.println(z);
    }

    public static void simpleInterest(){
        int p = 1000;
        int r = 5;
        int t = 3;
        int si = (p * r * t) / 100;
        System.out.println(si);
    }

    public static void oddEven(){
        int n = 7;
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    public static void max(){
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void grade(){
        int marks = 85;
        if(marks >= 90){
            System.out.println("A");
        } else if(marks >= 80){
            System.out.println("B");
        } else if(marks >= 70){
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
    public static void main(String[] args) {
        // add();
        // simpleInterest();
        // oddEven();
        // max();
        grade();
    }
}
