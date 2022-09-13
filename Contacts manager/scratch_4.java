import java.util.Arrays;
import java.util.Scanner;
class Contacts {
    public String fnme;
    public String lnme;
    public String cont;
    public String comp;
    public String adress;


    public Contacts(String fname, String lname, String contact, String company, String address) {
        fnme = fname;
        lnme = lname;
        cont = contact;
        comp = company;
        adress = address;
    }
}

class Scratch {

    public static void print(Contacts Objs) {
        System.out.println("First Name: "+Objs.fnme +" || Last Name: "+ Objs.lnme +" || Company: "+ Objs.comp +" || Contact: "+ Objs.cont +" || Address: "+ Objs.adress);
    }
    public static Contacts newCont(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        String fNme = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String lNme = sc.nextLine();
        System.out.print("Enter Contact: ");
        String Cont = sc.nextLine();
        System.out.print("Enter Company: ");
        String Comp = sc.nextLine();
        System.out.print("Enter Address: ");
        String Adre = sc.nextLine();

        Contacts p = new Contacts(fNme,lNme,Cont,Comp,Adre);
        return p;
    }
    public static Contacts[] delcont(Contacts[] arr, int index)
    {

        if (arr == null || index < 0
                || index >= arr.length) {

            return arr;
        }

        Contacts[] anotherArray = new Contacts[arr.length];

        for (int i = 0, k = 0; i < arr.length; i++) {

            if (arr[i] == null) {
                continue;
            }

            anotherArray[k++] = arr[i];
        }

        return anotherArray;
    }
    public static Contacts[] sortedByFirstName(Contacts[] fields,int indexer){
        int indForNew = 0;
        String s = "abcdefghijklmnopqrstuvwxyz";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].fnme.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }

    public static Contacts[] sortedByFirstName(Contacts[] fields,int indexer,String order){
        int indForNew = 0;
        String s = "zyxwvutsrqponmlkjihgfedcba";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].fnme.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }
//    ======================================================================

    public static Contacts[] sortedByLastName(Contacts[] fields,int indexer){
        int indForNew = 0;
        String s = "abcdefghijklmnopqrstuvwxyz";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].lnme.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }
    public static Contacts[] sortedByLastName(Contacts[] fields,int indexer,String order){
        int indForNew = 0;
        String s = "zyxwvutsrqponmlkjihgfedcba";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].lnme.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }
//    ======================================================================
    public static Contacts[] sortedByCompany(Contacts[] fields,int indexer){
        int indForNew = 0;
        String s = "abcdefghijklmnopqrstuvwxyz";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].comp.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }

    public static Contacts[] sortedByCompany(Contacts[] fields,int indexer, String order){
        int indForNew = 0;
        String s = "zyxwvutsrqponmlkjihgfedcba";
        Contacts[] newCont = new Contacts[999];
        for(int i = 0; i<26;i++){
            for(int j = 0;j<indexer;j++){
                if(s.charAt(i) == Character.toLowerCase(fields[j].comp.charAt(0))){
                    newCont[indForNew]  = fields[j];
                    indForNew++;
                }

            }
        }
        return newCont;
    }
//    ======================================================================


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int indexer = 0;
        Contacts[] fields = new Contacts[999];
        Contacts contacts;


        while(true){
        System.out.println("------------------------------------------------------");
        System.out.println("to add contact ---> 1");
        System.out.println("to delete contact ---> 2");
            System.out.println("to sorting order contact ---> 3");
            System.out.println("Exit ---> 0");
        System.out.println("------------------------------------------------------");
        System.out.print("Select: ");
        int usrinp = sc.nextInt();
        if(usrinp == 1){
            while(true){
                contacts = newCont();
                fields[indexer] = contacts;
                for(int i = 0;i<indexer+1;i++){
                    print(fields[i]);
                }
                indexer++;

                System.out.println("====================================================");
                System.out.println("Do You want to add more?");
                System.out.println("1 for Yes");
                System.out.println("2 for No");
                int slc = sc.nextInt();
                if(slc == 2){
                    break;
                }
        }}
        else if(usrinp == 2){
                while(true){
            if(indexer == 0){
                System.out.println("====================================================");
                System.out.println("There is no contact to delete!");
                break;
            }
            else{
            for(int i = 0;i<indexer;i++){
                System.out.print(i+": ");
                print(fields[i]);
            }
                System.out.print("Select The Contact: ");
            int delinp = sc.nextInt();
            int index = delinp;
            fields[delinp] = null;
            fields = delcont(fields,delinp);
            indexer--;
            for(int i = 0;i<indexer;i++){
                System.out.print(i+": ");
                print(fields[i]);
            }
                    System.out.println("====================================================");
                    System.out.println("Do You want to delete more?");
                    System.out.println("1 for Yes");
                    System.out.println("2 for No");
                    int slc = sc.nextInt();
                    if(slc == 2){
                        break;
                    }
        }
        }}else if(usrinp == 3){
            // Sorting
            while (true){
                System.out.println("====================================================");
                System.out.println("Select The Field by Which Contacts Will be Sorted: ");
            System.out.println("By First Name -----> 1");
            System.out.println("By Last Name -----> 2");
            System.out.println("By Company Name -----> 3");

            int userSelect = sc.nextInt();

            if(userSelect == 1){
                System.out.println("====================================================");
                System.out.println("Select the order");
                System.out.println("For Ascending ----> 1");
                System.out.println("For descending ----> 2");
                int userOrder = sc.nextInt();
                if(userOrder == 1) {
                    fields = sortedByFirstName(fields, indexer);
                }else if(userOrder == 2){
                    fields = sortedByFirstName(fields, indexer,"dsc");
                }
            }else if(userSelect == 2){
                System.out.println("====================================================");
                System.out.println("Select the order");
                System.out.println("For Ascending ----> 1");
                System.out.println("For descending ----> 2");
                int userOrder = sc.nextInt();
                if(userOrder == 1) {
                    fields = sortedByLastName(fields, indexer);
                }else if(userOrder == 2){
                    fields = sortedByLastName(fields, indexer,"dsc");
                }
            }else if(userSelect == 3){
                System.out.println("====================================================");
                System.out.println("Select the order");
                System.out.println("For Ascending ----> 1");
                System.out.println("For descending ----> 2");
                int userOrder = sc.nextInt();
                if(userOrder == 1) {
                    fields = sortedByCompany(fields, indexer);
                }else if(userOrder == 2){
                    fields = sortedByCompany(fields, indexer,"dsc");
                }
            }

            for(int i = 0;i<indexer;i++){
                System.out.print(i+": ");
                print(fields[i]);
            }
            System.out.println("====================================================");
                System.out.println("Do You want to Sort more?");
                System.out.println("1 for Yes");
                System.out.println("2 for No");
                int slc = sc.nextInt();
                if(slc == 2){
                    break;
                }
        }
        }else{

            break;

        }}
    }

}
