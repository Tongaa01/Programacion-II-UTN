package clase1;

public class Auto extends Vehiculo{
    private boolean descapotable;

    public Auto(String propietario, int puertas, int ruedas, boolean descapotable) {
        super(propietario, puertas, ruedas);
        this.descapotable = descapotable;
    }

    public boolean isDescapotable() {
        return descapotable;
    }
    public void setDescapotable(boolean descapotable) {
        this.descapotable = descapotable;
    }

    public void bajarse(){
        System.out.println("Te bajaste");
    }
    public void subirse(){
        System.out.println("Te subiste");
    }

    public void caracteristicas() {
    }
}
