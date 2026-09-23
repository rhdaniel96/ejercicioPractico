package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

    private static List<Alimento> listaAlimento = new ArrayList<>();
    public static boolean cicloMenu = true;

    public static String menu = """
        --------------------------------------------
                Sistema de Gestion de Alimentos
        --------------------------------------------
        1) Agregar Alimento
        2) Listar Alimentos
        3) Buscar Alimentos
        4) Salir de la app
        --------------------------------------------
        Elija una opcion . . .
        """;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (cicloMenu) {
            System.out.println(menu);
            String opMenu = scanner.nextLine();

            switch (opMenu) {
                case "1" -> {
                    System.out.println("--- Agregar Alimento ---");
                    System.out.println("""
                            Seleccione el tipo de alimento:
                            1) Fruta
                            2) Verdura
                            """);
                    String opAlimento = scanner.nextLine();

                    switch (opAlimento) {
                        case "1" -> {
                            // Se llama funcion agregar fruta
                            Funcion.agregarFruta(listaAlimento, scanner);
                        }
                        case "2" -> {
                            // Se llama funcion agregar verdura
                            Funcion.agregarVerdura(listaAlimento, scanner);
                        }
                        default -> System.out.println("Ingrese una opcion valida (1 o 2)");
                    }
                }
                case "2" -> {
                    Funcion.listarAlimentos(listaAlimento);
                }
                case "3" -> {
                    Funcion.buscarAlimento(listaAlimento, scanner);
                }
                case "4" -> {
                    System.out.println("Saliendo de la app . . .");
                    cicloMenu = false;
                }
                default -> System.out.println("Opcion invalida, intente nuevamente");
            }
        }
        scanner.close();
    }
}