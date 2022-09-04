import java.util.Arrays;
import java.util.Scanner;

class Scratch {
    public static void currency(){
        System.out.println("Enter Your Amount: ");
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
        System.out.println("Currency Notes Are: " + Arrays.toString(emp));
        int sum = 0;
        for(int i = 0 ; i < emp.length; i++){
            sum += emp[i];
        }
        System.out.println("The total amount is: " + sum);
    }
    public static void main(String[] args) {

        boolean flag = true;
        boolean flagCheck = true;
        Scanner usr = new Scanner(System.in);
        while(flag){
        if(flagCheck == true){
        System.out.println("Press 1 for check notes: ");
        System.out.println("Press 2 for Exit: ");
            flagCheck = false;
        }
        int usrInpt = usr.nextInt();
        if(usrInpt == 1){
        currency();
        System.out.println("Press 1 to Check Again? and 2 to exit");
        }
        else if(usrInpt == 2){
            flag = false;
        }
        }
    }
}
