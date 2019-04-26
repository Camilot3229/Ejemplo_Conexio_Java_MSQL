
import java.util.Scanner;


public class AppBD {    
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nAnexar Dato a la Base de Dato");
        System.out.println("Id:");
        String id = sc.next();
        System.out.println("Nombre: ");
        String nombre = sc.next();
        System.out.println("Precio: ");
        int precio = sc.nextInt();
        ProcesarBD bd = new ProcesarBD();
        System.out.println("\nAnexar Dato a la Base de Dato");
        bd.ingresarArticulo(id, nombre, precio);
        System.out.println("\nListar informacion");
        bd.listar();      
    }
    
}
