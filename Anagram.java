import java.util.Arrays;
import java.util.Scanner;
public class Anagram {
   public static boolean isana(String a, String b){
char a1[]=a.toCharArray();
char b1[]=b.toCharArray();
Arrays.sort(a1);
Arrays.sort(b1);


return Arrays.equals(a1, b1);
   } 
   public static void main (String args[]){
    Scanner in=new Scanner(System.in);
    String str,str1;
    System.out.println("Enter the string");
    str=in.nextLine();
    System.out.println("Enter the string 2");
    str1=in.nextLine();
    System.out.println(isana(str,str1));
   }
}
