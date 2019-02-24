/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuradatos;

/**
 *
 * @author Daniela
 */
public class Recursividad13 {

    
    
    public String descomposicion(int n){
   int i=1;
   if (n==1) {
    return "1";
   } 
     else {
       if (n>n-2) {
        return "1+"+descomposicion(n-1);
   } 
}
      return "1+"+descomposicion(n-1); 
} 

public static void main(String[] ar) {

        Recursividad1 re=new Recursividad1();

        System.out.print(Recursividad1.descomposicion(3)); 

}
    
}
