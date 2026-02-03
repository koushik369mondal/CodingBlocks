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
        double pi = 3.14;
        double r = 5;
        double h = 6;
        double v = pi * r * r * h / 3;
        System.out.println("Volume of the cone: " + v);
    }

    public static void cylinderVolume(){
        double pi = 3.14;
        double r = 5;
        double h = 6;
        double v = pi * r * r * h;
        System.out.println("Volume of the cylinder: " + v);
    }

    public static void main(String[] args) {
        // sumOdd();
        // coneVolume();
        cylinderVolume();
    }
}
