
package estructuradatos;

import java.util.Scanner;


public class Recursividad1 {

   
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int n;
        int a=0; int b=1; int c;
        
        System.out.println("Digite el numero de elementos: ");
        n = Leer.nextInt();
        
       
          for(int i = 0; i<n; i++){
               System.out.print(Fibonacci(i) + ", ");
          }
     }
 
     private static int Fibonacci(int num){
          if(num == 0 || num==1)
               return num;
          else
               return Fibonacci(num-1) + Fibonacci(num-2);
     }

    static boolean descomposicion(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}
    
    
     
    

