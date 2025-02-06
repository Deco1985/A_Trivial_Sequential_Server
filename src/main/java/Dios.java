public class Dios {
    private String nombre;
    private int poder;
    private static int totalDioses = 0;

    public Dios(String nombre, int poder) {
        this.nombre = nombre;
        this.poder = poder;
        totalDioses++;
    }

    public void crearMundo(String nombreMundo) {
        if (nombreMundo == null) {
            System.out.println("Error: Nombre del mundo no puede ser nulo.");
            return;
        }
        System.out.println(nombre + " ha creado el mundo: " + nombreMundo);
    }

    public void destruirMundo(String nombreMundo) {
        if (nombreMundo == null) {
            System.out.println("Error: Nombre del mundo no puede ser nulo.");
            return;
        }
        System.out.println(nombre + " ha destruido el mundo: " + nombreMundo);
    }

    public void aumentarPoder(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }
        poder += cantidad;
    }

    public void disminuirPoder(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }
        poder -= cantidad;
        if (poder < 0) {
            poder = 0;
        }
    }

    public void mostrarPoder() {
        System.out.println("El poder de " + nombre + " es: " + poder);
    }

    public static void mostrarTotalDioses() {
        System.out.println("Total de dioses creados: " + totalDioses);
    }

    public void crearHumanos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombre + " ha creado un humano.");
        }
    }

    public void destruirHumanos(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que cero.");
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            System.out.println(nombre + " ha destruido un humano.");
        }
    }

    public void realizarMilagro(String descripcion) {
        if (descripcion == null) {
            System.out.println("Error: La descripción no puede ser nula.");
            return;
        }
        System.out.println(nombre + " ha realizado un milagro: " + descripcion);
    }

    public void castigar(String nombreHumano, String razon) {
        if (nombreHumano == null || razon == null) {
            System.out.println("Error: El nombre del humano y la razón no pueden ser nulos.");
            return;
        }
        System.out.println(nombre + " ha castigado a " + nombreHumano + " por " + razon);
    }

    public void recompensar(String nombreHumano, String razon) {
        if (nombreHumano == null || razon == null) {
            System.out.println("Error: El nombre del humano y la razón no pueden ser nulos.");
            return;
        }
        System.out.println(nombre + " ha recompensado a " + nombreHumano + " por " + razon);
    }

    public static void main(String[] args) {
        Dios zeus = new Dios("Zeus", 100);
        zeus.crearMundo("Tierra");
        zeus.crearHumanos(5);
        zeus.realizarMilagro("Hacer llover");
        zeus.castigar("Prometeo", "robar el fuego");
        zeus.destruirHumanos(2);
        zeus.destruirMundo("Tierra");
        zeus.mostrarPoder();

        Dios odin = new Dios("Odin", 200);
        odin.crearMundo("Asgard");
        odin.crearHumanos(10);
        odin.realizarMilagro("Crear el Bifrost");
        odin.recompensar("Thor", "proteger Asgard");
        odin.destruirHumanos(3);
        odin.destruirMundo("Asgard");
        odin.mostrarPoder();

        Dios.mostrarTotalDioses();
    }
}
