
package estructuradatos;


public class Recursividad2 {

    
    public static void main(String[] args) {
        Recursividad2 numfac = new Recursividad2();
        System.out.println("El numero de probabilidad del numero 4 es: "+numfac.Factorial(4));
     
        
    }
    public int Factorial(int n){
        if (n<0) {
            return 0;
        }else{
            
            if (n==0) {
                return 1;
            }else{
                return n*Factorial(n-1);
            }
        }
    }
}
