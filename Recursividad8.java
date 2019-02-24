
package estructuradatos;

import java.util.Scanner;


public class Recursividad8 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
      System.out.print("Ingresa un numero en codigo Binario:");
      int n = numero.nextInt();
      int ex=-1;
      System.out.print("El codigo binario " + n + " convertido a entero es:" +entero(n,ex)+"\n");
    }
    public static int entero(long val,int ex){
    ex++;
     if(val==0){
     return 0;
     }
     return (int)(((val % 10) * Math.pow(2,ex)) + entero(((val - (val % 10)) / 10),ex));
       
    
}

    
    
}
