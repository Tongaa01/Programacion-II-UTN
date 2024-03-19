package herencia;

public class Oficial extends Operario{

    private String departamento;

    public Oficial() {
    }
    public Oficial(String nombre, int nroEmpleado, String departamento) {
        super(nombre, nroEmpleado);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String toString(){
        return "cc";
    }

    public String datos (){
        return "Nombre: " + super.getNombre() + ", N° de empleado: " + super.getNroEmpleado() + ", Dpto de trabajo: " + departamento;
    }
}
