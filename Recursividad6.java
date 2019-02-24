
package estructuradatos;

import java.util.Scanner;


public class Recursividad6 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      int x,y,n,m;
      
        System.out.println("Digite N");
        n = leer.nextInt();
        System.out.println("Digite M");
        m = leer.nextInt();
        
        x=n;
        y=m;
        
        System.out.println("El MCD de M Y N ES:"+sacar_mcd(n, m % n));
    }
        public static int sacar_mcd(int m, int n) {
       if(n==0)
       return m;
       else
       return sacar_mcd(n, m % n);
    }
    
}
