
package estructuradatos;

import java.util.Scanner;


public class Recursividad7 {
    
    public static String Numeroabinario(int num){
     if (num / 2 != 1)
     return Numeroabinario(num / 2) + num % 2;
     else
     return "1" + num%2;
    }
    
    public static void main (int[] arre,int pos){
      if (pos < arre.length / 2) {
      int res =  arre[pos];
      arre[pos]=arre[arre.length-pos-1];
      arre[arre.length-pos-1]= res;
      
       main(arre, pos + 1);
        }
    }

    public static void main(String[] args) {
       int num;
     Scanner entrada = new Scanner(System.in);
     System.out.print("Introduzca un numero :");
     num = entrada.nextInt();
     System.out.println("El numero  " + num +  "  convertido a binario es: " + Numeroabinario(num));
}
        
    
    
}
