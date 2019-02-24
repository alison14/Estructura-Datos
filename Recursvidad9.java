
package estructuradatos;

import java.util.Scanner;


public class Recursvidad9 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        int num;
        int a=0;
        
        System.out.println("Digite el Tamaño del arreglo: ");
        num = leer.nextInt();
        
         int [] arreglo = new int[num];
         System.out.println("Digite los valores del arreglo");
         for (int i = 0; i < num; i++) {
            arreglo[i]= leer.nextInt();
        }
         
         for (int i = 0; i < num; i++) {
           a=a+arreglo[i]; 
        }
         System.out.println("La suma del arreglo es: "+a);
    }
    
}
