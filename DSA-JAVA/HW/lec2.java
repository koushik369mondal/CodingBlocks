package HW;
public class lec2 {

    public static void sumOdd(){
        int n = 5;
        int sum = 0;
        for(int i=1; i<=n; i++){
            if(i % 2 !=0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }

    public static void main(String[] args) {
        sumOdd();
    }
}
