
package Entidades;

import java.util.Date;

public class Persona {
    
    String nombre;
    Date fechanacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date fechanacimiento) {
        this.nombre = nombre;
        this.fechanacimiento = fechanacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }
    
    
    
    
}
