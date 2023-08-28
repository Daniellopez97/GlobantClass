
package Entities;


public class Viewer {
    
    private String name;
    private int age;
    private double availableMoney;

    public Viewer(String name, int age, double availableMoney) {
        this.name = name;
        this.age = age;
        this.availableMoney = availableMoney;
    }

    public Viewer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvailableMoney() {
        return availableMoney;
    }

    public void setAvailableMoney(double availableMoney) {
        this.availableMoney = availableMoney;
    }

    @Override
    public String toString() {
        return "Viewer{" + "name=" + name + ", age=" + age + ", availableMoney=" + availableMoney + '}';
    }
    
    
    
    
}
