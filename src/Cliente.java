public class Cliente extends Persona {
    int credito;

    public Cliente(int edad, String nombre, int telefono, int credito) {
        super( edad, nombre, telefono );
        this.credito = credito;
    }
}
