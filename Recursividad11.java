
package estructuradatos;

import java.util.Scanner;


public class Recursividad11 {

    
    
       public static void CambiarNum(){
    int num;
    Scanner leer = new Scanner (System.in);
    System.out.println("Ingrese el tamaño del arreglo:");
    num=leer.nextInt();
   int arreglo []=new int [num];
      System.out.println("Ingrese los datos del Arreglo:");
     for (int i=0;i<arreglo.length;i++){
     
     arreglo[i]=leer.nextInt();
    }
      int inicio=0,fin=arreglo.length-1;

      arreglo = InvierteRec(arreglo,inicio,fin);

     for (int i=0;i<arreglo.length;i++){

      if(i==0){
     
     System.out.println("El Arreglo invertido es:");}
      System.out.println(arreglo[i]);
    }
}
     public static int[] InvierteRec(int [] a,int i,int f){
      while (i<=f){
      int temp = a[f];
     a[f] = a[i];
     a[i] = temp;
       return InvierteRec(a,i+1,f-1);
    }   
       return  a;
  }
    public static void main(String[] args) {
    CambiarNum();
    }
    
}
