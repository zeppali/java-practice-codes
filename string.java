import java.util.Scanner;

public class string{
    public static void main(String args[]){
       /*  Scanner s= new Scanner(System.in);
            String b= s.nextLine();
            System.out.println(b.matches("[0-3][0-9]/[0|1][0-9]/[0-9]{4}"));*/

            String a ="  ahv453$^    &@64   %^d";
            System.out.println(a);
          /*   System.out.println(a.replaceAll("[^a-zA-Z1-9]", ""));*/
           /*  System.out.println(a.replaceAll("\\s+", " "));*/

           String b= a.replaceAll("\\s+", " ").trim();
           System.out.println(b);
            String word[]=b.split("\\s+");
            System.out.println(word.length);
           

        }
    }
