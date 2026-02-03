import java.util.Scanner;

public class lec2 {
    // Question 1
    public static void add(){
        int x = 5;
        int y = 6;
        int z = x + y;
        System.out.println(z);
    }

    // Question 2
    public static void simpleInterest(){
        int p = 1000;
        int r = 5;
        int t = 3;
        int si = (p * r * t) / 100;
        System.out.println(si);
    }

    // Question 3
    public static void oddEven(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 2 == 0){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

    // Question 4
    public static void max(){
        int a = 10;
        int b = 20;
        if(a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    // Question 5
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

    // Question 6
    public static void count(){
        int n = 5;
        for(int i=1; i<=n; i++){
            System.out.print(i + " ");
        }
    }

    // Question 7
    public static void mulTable(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public static void main(String[] args) {
        // add();
        // simpleInterest();
        // oddEven();
        // max();
        // grade();
        // count();
        mulTable();
    }
}
