package CW.Lec22;

public class leet_22_1 {
    public static void countFrequency(){
        int arr[] = {1, 2, 2, 3, 3, 3, 4, 4,};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int freq[] = new int[max+1];
        for(int i=0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        for(int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                System.out.println(i + " " + freq[i]);
            }
        }
    }

    public static void main(String[] args) {
        countFrequency();
    }
}
