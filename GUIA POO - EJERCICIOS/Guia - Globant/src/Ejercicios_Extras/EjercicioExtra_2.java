
package Ejercicios_Extras;


public class EjercicioExtra_2 {
    
    public static void main(String[] arg){
        
        int A = 10;
        int B = 20;
        int C = 30;
        int D = 40;
        int aux = 0;
        
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
        
        aux =A;
        A = D; // A toma el valor de D
        
        D = B; // D toma el valor de B
        
        B = C; // B toma el valor de C
        C = aux; // C toma el valor de A
        
        System.out.println("");
        System.out.println("A: "+A);
        System.out.println("B: "+B);
        System.out.println("C: "+C);
        System.out.println("D: "+D);
    }
    
}
