
package estructuradatos;

import java.util.Scanner;

public class Recursividad4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        
        do {
             System.out.println("Digite el numero: ");
               num = leer.nextInt();
        } while (num<0);
         System.out.println("La suma de los numeros es:" + num + "=" + suma(num));
    }
    
            static long suma (int num)
       {    
            if (num<=1)
            return 1;
           else
       {
           long resultado = num+suma(num-1);
           return resultado;
     }
   }
}
        
    

