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

    // Question 8
    public static void allEven(){
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    // Question 9
    public static void sumNatural(){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum = sum + i;
        }
        System.out.println("Sum: " + sum);
    }

    // Question 9 - Alternative - without loop
    public static void sumNaturalWithoutLoop(){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n * (n + 1) / 2;
        System.out.println("Sum: " + sum);
    }

    //Question 10
    public static void sumOdd(){
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum: " + sum);
    }

    // Question 11
    public static void reverse(){
        int n = 123; 
        int ans = 0;
        while (n > 0) {
            int r = n % 10; 
            n = n / 10; 
            ans = ans * 10 + r;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // add();
        // simpleInterest();
        // oddEven();
        // max();
        // grade();
        // count();
        // mulTable();
        // allEven();
        // sumNatural();
        // sumOdd();
        // sumNaturalWithoutLoop();
        reverse();
    }
}
