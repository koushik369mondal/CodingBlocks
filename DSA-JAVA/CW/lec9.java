package CW;

public class lec9 {

    public static void evenOdd1(int n){
        if(n%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static int evenOdd2(int n){
        if(n%2==0){
            return 1;
        }else{
            return 0;
        }
    }

    public static void main(String[] args) {
        //Using void function
        int n = 10;
        evenOdd1(n);

       //Using int function
        int result = evenOdd2(n);
        if(result == 1){
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
