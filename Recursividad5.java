
package estructuradatos;

import java.util.Scanner;

public class Recursividad5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num,a;
        
        System.out.println("Digite el numero");
        num=leer.nextInt();
        a=num;
        while (a>=2){
           a=a-2;
        }
        
        if (a==0) {
            System.out.println("La suma de los pares positivos es de: "+suma(num));
        }else{
            System.out.println(".:ERROR:."); 
        }
    }
   static long suma(int num)
   {
       if (num<=2) {
          return 2; 
       }else{
           
       }
       long resultado=num+suma(num-2);
               return resultado;
               
   }
}


