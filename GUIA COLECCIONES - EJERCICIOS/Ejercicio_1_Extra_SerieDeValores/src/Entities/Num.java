
package Entities;

import java.util.ArrayList;


public class Num {
    
     private ArrayList <Integer> numList = new ArrayList();

    public Num() {
    }
    
    public void  addNum(int num) {
        numList.add(num);    
    }

    public ArrayList<Integer> getNumList() {
        return numList;
    }

    public void setNumList(ArrayList<Integer> NumList) {
        this.numList = NumList;
    }

    @Override
    public String toString() {
        return "Num{" + "numList=" + numList + '}';
    }
     
     
    
}
