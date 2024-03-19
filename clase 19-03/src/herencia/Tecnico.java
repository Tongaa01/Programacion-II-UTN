package herencia;

public class Tecnico extends Operario{

    private String jefe;

    public Tecnico() {
    }
    public Tecnico(String nombre, int nroEmpleado, String jefe) {
        super(nombre, nroEmpleado);
        this.jefe = jefe;
    }

    public String getJefe() {
        return jefe;
    }
    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String toString(){
        return "dd";
    }

    public String datos(){
        return "Nombre: " + super.getNombre() + ", N° legajo: " + super.getNroEmpleado() + ", Jefe: " + jefe;
    }
}