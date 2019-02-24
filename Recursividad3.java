
package estructuradatos;

import java.util.Scanner;


public class Recursividad3 {

    
    public static void main(String[] args) {
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
         for(int i = 0; i < num; i++) {
           for(int j = 0; j < num; j++) {
            if(arreglo[i] < arreglo[j]) {
             a = arreglo[i];
              arreglo[i] = arreglo[j];
               arreglo[j] = a;
               
               
            }   
            
        }
      }
         
         System.out.println("El arreglo ordenado es: ");
         
         for(int i = 0; i < num; i++) {
         System.out.print(arreglo[i] + " ");
        }   
    }
    
}
