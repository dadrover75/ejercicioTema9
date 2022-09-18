public class Trabajador extends Persona {
    int salario;


    public Trabajador( int edad, String nombre, int telefono, int salario) {
        super( edad, nombre, telefono );
        this.salario = salario;
    }
}
