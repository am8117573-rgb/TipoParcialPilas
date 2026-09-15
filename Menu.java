import java.util.Scanner;
import java.util.Stack;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Libro> pila = new Stack<>();
        Metodos m = new Metodos();
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido a la gestión de libros de la biblioteca");
            System.out.println("Que desea realizar");
            System.out.println("1) Registrar libro");
            System.out.println("2) Retirar el último libro registrado");
            System.out.println("3) Consultar el último libro registrado (peek)");
            System.out.println("4) Mostrar todos los libros");
            System.out.println("5) Salir");

            int opt = m.validarEntero(sc);

            switch (opt) {
                case 1:
                    pila = m.registrarLibro(pila, sc);
                    break;
                case 2:
                    pila = m.retirarUltimoLibro(pila);
                    break;
                case 3:
                    m.consultarUltimoLibro(pila);
                    break;
                case 4:
                    m.mostrarLibros(pila);
                    break;
                case 5:
                    System.out.println("Hasta luego");
                    continuar = false;
                    break;
                default:
                    System.out.println("Esta opción no existe");
                    break;
            }
        }
        sc.close();
    }
}
