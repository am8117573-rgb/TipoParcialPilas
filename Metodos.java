import java.util.Scanner;
import java.util.Stack;

public class Metodos {

    // 1. Registrar un libro y apilarlo
    public Stack<Libro> registrarLibro(Stack<Libro> pila, Scanner sc) {
        Libro libro = new Libro();

        System.out.println("Ingrese el ISBN del libro: ");
        libro.setIsbn(sc.next());
        sc.nextLine();
        System.out.println("");
        System.out.println("Ingrese el titulo del libro: ");
        libro.setTitulo(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese el autor del libro: ");
        libro.setAutor(sc.nextLine());
        System.out.println("");
        System.out.println("Ingrese el año de publicación: ");
        libro.setAnioPublicacion(validarEntero(sc));

        pila.push(libro);
        System.out.println("Libro registrado y apilado correctamente");
        return pila;
    }

    // 2. Retirar el último libro registrado (pop)
    public Stack<Libro> retirarUltimoLibro(Stack<Libro> pila) {
        if (pila.isEmpty()) {
            System.out.println("No hay libros registrados para retirar");
        } else {
            Libro retirado = pila.pop();
            System.out.println("Se retiró el libro: " + retirado);
        }
        return pila;
    }

    // 3. Consultar el último libro registrado usando peek()
    public void consultarUltimoLibro(Stack<Libro> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay libros registrados");
        } else {
            Libro ultimo = pila.peek();
            System.out.println("El último libro registrado es: " + ultimo);
        }
    }

    // 4. Mostrar todos los libros almacenados
    public void mostrarLibros(Stack<Libro> pila) {
        if (pila.isEmpty()) {
            System.out.println("La pila esta vacia, no hay libros para mostrar");
        } else {
            System.out.println("Libros almacenados (del ultimo al primero):");
            for (int i = pila.size()-1; i >= 0; i--) {
                System.out.println(pila.get(i));
            }
        }
    }

    // Validación de enteros para evitar que el programa se caiga con datos no numéricos
    public int validarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor ingrese un valor numerico valido");
            sc.next();
        }
        return sc.nextInt();
    }
}