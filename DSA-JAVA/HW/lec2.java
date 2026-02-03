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

    public static void coneVolume(){
        float pi = 3.14f;
        float r = 4;
        float h = 7;
        float v = pi * r * r * h / 3;
        System.out.println("Volume of the cone: " + v);
    }

    public static void cylinderVolume(){
        double pi = 3.14;
        double r = 5;
        double h = 6;
        double v = pi * r * r * h;
        System.out.println("Volume of the cylinder: " + v);
    }

    public static void hemisphereVolume(){
        double pi = 3.14;
        double r = 5;
        double v = (2.0/3.0) * pi * r * r * r;
        System.out.println("Volume of the hemisphere: " + v);
    }

    public static void sumAllDigits(){
        int n = 123;
        int sum = 0;
        while(n > 0){
            int digit = n % 10;
            sum = sum + digit;
            n = n / 10; // Remove the last digit
        }
        System.out.println("Sum of all digits: " + sum);
    }

    public static void main(String[] args) {
        // sumOdd();
        // coneVolume();
        // cylinderVolume();
        // hemisphereVolume();
        sumAllDigits();
    }
}
