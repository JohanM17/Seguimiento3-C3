import supermercado.services;

public class Main {
    public static void main(String[] args) {
        services service = new services();
        service.obtenerProductos().forEach(p -> System.out.println(p.getNombre()));
    }
}

