import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] emp ;
        int j = 0;
        int[]  arr  = {5000,1000,500,100,50,20,10,5,2,1};
        int b = a;
        for (int i = 0; i < arr.length; i++) {
            while(a>=arr[i]){
                a = a-arr[i];
                j= j + 1;
            }
        }
        emp = new int[j];
        j = 0;
        for (int i = 0; i < arr.length; i++) {
            while(b>=arr[i]){
                b = b-arr[i];
                emp[j] = arr[i];
                j= j + 1;
            }
        }
//        Arrays.toString(emp);
        System.out.println(Arrays.toString(emp));
        int sum = 0;
        for(int i = 0 ; i < emp.length; i++){
            sum += emp[i];
        }
        System.out.println(sum);
    }
}