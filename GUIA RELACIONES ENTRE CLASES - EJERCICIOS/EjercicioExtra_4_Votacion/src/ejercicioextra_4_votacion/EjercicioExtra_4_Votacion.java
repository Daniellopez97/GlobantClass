
package ejercicioextra_4_votacion;

import Entities.Simulator;


public class EjercicioExtra_4_Votacion {


    public static void main(String[] args) {
        
        Simulator s1 = new Simulator();
      
        s1.createAlumn();
        s1.printAlumns();
        s1.voting();
        s1.printVote();
        s1.countVotes();
        s1.createFacilitator();
    }
    
}
