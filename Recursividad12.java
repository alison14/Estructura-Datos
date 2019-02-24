
package estructuradatos;

import java.util.Scanner;


public class Recursividad12 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese una palabra:");
        
     String sPalabra = "da arroz a  zorra el CAMBIO\n";
     int inc = 0;
     int des = sPalabra.length()-1;
      boolean bError = false;

      while ((inc<des) && (!bError)){

     if (sPalabra.charAt(inc)==sPalabra.charAt(des)){
     inc++;
         int des1 = des--;
     } else {
     bError = true;
   }
}
     if (!bError)
     System.out.println(sPalabra + " es un PALINDROMO");
      else
System.out.println(sPalabra + "No es un palindromo");
    }
    
}
