
package pkg3.hafta.pkg1;

import java.util.Scanner;

public class Hafta1 {

    
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter here a number: ");
        int n = input.nextInt();
        
        if( n > 0){
            System.out.println(n+" A number is pozitif");
        }
      
        else if(n == 0) {
            System.out.println(n+" A number is zero");
        }
          else {
            System.out.println(n+" A number is negatif");
        }
        
    }
    
}
