package clase1;

public class main {
    public static void main(String[] args) {
        Auto a1 = new Auto("Tonga", 3, 4, true);
        Auto a2 = new Auto("Emilio", 4, 4, false);
        Camion c1 = new Camion("Daniel", 2, 16, 15000);
        System.out.println("El dueño del camion es "+c1.getPropietario()+", tiene "+c1.getRuedas()+" ruedas, "+c1.getPuertas()+" puertas y esta cargado con "+c1.getCarga()+"kg");
        a1.subirse();
        System.out.println("El auto es de "+a1.getPropietario()+" y tiene "+a1.getPuertas()+" puertas.");
        if (a1.isDescapotable())
            System.out.println("El auto es descapotable");
        else
            System.out.println("El auto no es descapotable");
        a1.bajarse();
        a2.subirse();
        System.out.println("El auto es de "+a2.getPropietario()+" y tiene "+a2.getPuertas()+" puertas.");
        if (a2.isDescapotable())
            System.out.println("El auto es descapotable");
        else
            System.out.println("El auto no es descapotable");
        a2.bajarse();
    }
}
