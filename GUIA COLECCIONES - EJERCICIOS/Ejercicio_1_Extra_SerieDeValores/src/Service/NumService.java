
package Service;

import Entities.Num;
import java.util.Scanner;


public class NumService {
    
    Num num = new Num();
    Scanner read = new Scanner(System.in);
    
    public void registerNum() {
        
          int  newNum=0;
        do {
            
            System.out.println("Ingresa un numero, si deseas que termine la secuencia ingresa -99");
            
            newNum = read.nextInt();
            
            if ( !(newNum==-99))
            num.addNum(newNum);
        
        } while (!(newNum ==-99));
                
        
        System.out.println(num.toString());
        
        
    }
    
    public void calculate() {
        
        int  suma=0;
        int cont = 0;
        
        for (Integer num : num.getNumList()) {       
        suma += num;
        cont+=1;
        }
        
        System.out.println("La suma de los valores es: " + suma);
        System.out.println("El promedio de valores es : " + (suma/cont));
        
        
    }
}
