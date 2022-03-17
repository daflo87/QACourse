public class imprimirNombre{

    public static void main(String[] args) {

        Empleado e1 = new Empleado("David", "Flores");
        Empleado e2 = new Empleado("Daniela", "Rodriguez");
        Empleado e3 = new Empleado("Tona", "Flores", "Cantu");
        Empleado e4 = new Empleado("Tona", "Flores", "Cantu");

        Empleado[] empleados = new Empleado[2];
        empleados[0] = e1;
        empleados[1] = e2;

        System.out.println("El Nombre es " + e1.nombre +  " " +  e1.apellido);

        for (Empleado empleadoActual : empleados) {
            System.out.println("El Nombre del Empleado es: " + empleadoActual.nombre
                    + empleadoActual.apellido);
        }

        System.out.println("Polimorfimos Empleado: " + e3.nombre + " " +   e3.apellido + " " + e3.sApellido);
    }

}
