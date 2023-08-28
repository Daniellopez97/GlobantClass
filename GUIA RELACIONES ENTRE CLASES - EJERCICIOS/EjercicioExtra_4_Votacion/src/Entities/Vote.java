
package Entities;

import java.util.ArrayList;



public class Vote {
    
   private Alumn alumn = new Alumn();
   private  ArrayList <Alumn>    alumnvotedList = new ArrayList();

    public Vote() {
    }
    
    public Vote (Alumn alumn, ArrayList<Alumn> alumnvotedList) {
    
      this.alumn = alumn;
      this.alumnvotedList= alumnvotedList;
    }
    public Alumn getAlumn() {
        return alumn;
    }

    public void setAlumn(Alumn alumn) {
        this.alumn = alumn;
    }

    public ArrayList<Alumn> getAlumnvotedList() {
        return alumnvotedList;
    }

    public void setAlumnvotedList(ArrayList<Alumn> alumnvotedList) {
        this.alumnvotedList = alumnvotedList;
    }

    
       

    

    
}


