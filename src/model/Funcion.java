package model;

import java.util.List;
import java.util.Scanner;

public class Funcion {

    public static void agregarFruta(List<Alimento> listaAlimentos, Scanner scanner) {
        System.out.println("--- Agregar Fruta ---");
        System.out.print("ID del Alimento: ");
        int idAlimento = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Precio por unidad: ");
        int precioUnitario = Integer.parseInt(scanner.nextLine());

        System.out.print("Stock disponible: ");
        int stockDisponible = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese país de origen: ");
        String paisOrigen = scanner.nextLine();

        System.out.print("Ingrese temporada de cultivo: ");
        String temporadaCultivo = scanner.nextLine();

        Fruta nuevaFruta = new Fruta(idAlimento, nombreProducto, precioUnitario, stockDisponible, paisOrigen, temporadaCultivo);
        listaAlimentos.add(nuevaFruta);
        System.out.println("-> Fruta registrada exitosamente.");
    }

    public static void agregarVerdura(List<Alimento> listaAlimentos, Scanner scanner) {
        System.out.println("--- Agregar Verdura ---");
        System.out.print("ID del Alimento: ");
        int idAlimento = Integer.parseInt(scanner.nextLine());

        System.out.print("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.print("Precio por unidad: ");
        int precioUnitario = Integer.parseInt(scanner.nextLine());

        System.out.print("Stock disponible: ");
        int stockDisponible = Integer.parseInt(scanner.nextLine());

        System.out.print("¿Es orgánica? (S/N): ");
        String opcionOrganica = scanner.nextLine().strip().toUpperCase();

        // Validación de entrada
        while (!opcionOrganica.equals("S") && !opcionOrganica.equals("N")) {
            System.out.println("Opción inválida. Intente nuevamente.");
            System.out.print("¿Es orgánica? (S/N): ");
            opcionOrganica = scanner.nextLine().strip().toUpperCase();
        }

        // Conversión a valor booleano
        boolean esOrganica = opcionOrganica.equals("S"); // Aqui evaluamos la respuesta del usuario
        // con .equals("S") evaluamos el caso de que el usario conteste S y se asignaria true
        // En caso contrario se asignaria false

        System.out.print("Ingrese contenido nutricional: ");
        String contenidoNutricional = scanner.nextLine();

        // Instanciación y adición a la lista
        Verdura nuevaVerdura = new Verdura(idAlimento, nombreProducto, precioUnitario, stockDisponible, esOrganica, contenidoNutricional);
        listaAlimentos.add(nuevaVerdura);
        System.out.println("-> Verdura registrada exitosamente.");
    }

    public static void listarAlimentos(List<Alimento> listaAlimentos) {
        if (listaAlimentos.isEmpty()) {
            System.out.println("No hay alimentos registrados.");
            return;
        }
        System.out.println("--- Lista de Alimentos ---");
        for (int i = 0; i < listaAlimentos.size(); i++) {
            System.out.println((i + 1) + ". " + listaAlimentos.get(i));
        }
    }

    public static void buscarAlimento(List<Alimento> listaAlimentos, Scanner scanner) {
        System.out.println(" --- Buscar Alimento ---");
        System.out.print("Ingrese ID del alimento a buscar: ");
        int busquedaId = Integer.parseInt(scanner.nextLine());

        for (Alimento alimento : listaAlimentos) {
            // Se usa el getter y la comparación directa de enteros con '=='
            if (alimento.getIdAlimento() == busquedaId) {
                System.out.println("Encontrado -> " + alimento);
                return;
            }
        }
        System.out.println("No se encontró ningún alimento con ese ID.");
    }
}



