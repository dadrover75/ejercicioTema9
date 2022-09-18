public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(25, "Juan", 123456789, 1000);
        System.out.println(cliente.nombre + " tiene " + cliente.edad + " años, su teléfono es " + cliente.telefono + " y su crédito es " + cliente.credito + " euros");
        Trabajador trabajador = new Trabajador(30, "Pedro", 987654321, 2000);
        System.out.print(trabajador.nombre + " tiene " + trabajador.edad + " años, su telefono es " + trabajador.telefono +" y cobra " + trabajador.salario + " euros.");
    }
}
