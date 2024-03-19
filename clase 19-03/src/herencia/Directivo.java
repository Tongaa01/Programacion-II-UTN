package herencia;

public class Directivo extends Empleado{

    private int empleadosACargo;

    public Directivo() {
    }
    public Directivo(String nombre, int empleadosACargo) {
        super(nombre);
        this.empleadosACargo = empleadosACargo;
    }

    public int getEmpleadosACargo() {
        return empleadosACargo;
    }
    public void setEmpleadosACargo(int empleadosACargo) {
        this.empleadosACargo = empleadosACargo;
    }

    public String toString(){
        return "bb";
    }

    public String jefe(){
        return "Nombre: " + super.getNombre() + ", cantidad de empleados a cargo: " + empleadosACargo;
    }
}
