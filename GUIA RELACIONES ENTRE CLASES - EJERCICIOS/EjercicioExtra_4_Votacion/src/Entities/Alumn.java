
package Entities;

public class Alumn {
    
    private String Name;
    private int DNI;
    private int countVotes;

    public Alumn() {
    }

    public Alumn(String Name, int DNI, int countVotes) {
        this.Name = Name;
        this.DNI = DNI;
        this.countVotes = countVotes;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCountVotes() {
        return countVotes;
    }

    public void setCountVotes(int countVotes) {
        this.countVotes = countVotes;
    }
    
}