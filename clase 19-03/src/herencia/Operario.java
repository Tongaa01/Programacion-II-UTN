package herencia;

public class Operario extends Empleado{

    private int nroEmpleado;

    public Operario() {
    }
    public Operario(String nombre, int nroEmpleado) {
        super(nombre);
        this.nroEmpleado = nroEmpleado;
    }

    public int getNroEmpleado() {
        return nroEmpleado;
    }
    public void setNroEmpleado(int nroEmpleado) {
        this.nroEmpleado = nroEmpleado;
    }

    public String toString(){
        return "aa";
    }

    public String estado(){
        return "Numero de legajo:" + nroEmpleado;
    }
}
