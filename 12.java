import java.util.Scanner;

/**
 * x
 */
public class x {

    public static void main(String[] args) {
      Scanner scn=new Scanner(System.in);
      int a,b,c;
      System.out.print("lütfen sayı giriniz : ");
      a=scn.nextInt();
      
      for(int i=0;i<=a; i++){
        if (i%12==0) {
            System.out.println(i);
        }
        
      }
      
    }
}