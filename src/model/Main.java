package model;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;




public class Main {

    // creamos las listas de frutas y verduras

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

        while(cicloMenu){
            System.out.println(menu);
            String opMenu = scanner.nextLine();




            switch (opMenu) {

                case "1" -> {
                    System.out.println("--- Agregar Alimento ---");
                    System.out.println("""
                            Seleccione el tipo de alimento:
                            1)Fruta
                            2)Verdura
                            """);
                    String opAlimento = scanner.nextLine();

                    switch (opAlimento) {

                        case "1" -> {
                            System.out.println("--- Ingreso de Fruta ---");
                            // METODO INGRESO FRUTA

                        }

                        case "2" -> {
                            System.out.println("--- Ingreso de Verdura ---");
                            // METODO INGRESO VERDURA
                        }

                        default -> System.out.println("Ingrese una opcion valida (1 o 2)");
                    }

                }


                case "2" -> System.out.println("--- Listar Alimentos ---");


                case "3" -> System.out.println("--- Buscar Alimentos ---");


                case "4" -> {
                    System.out.println("Saliendo de la app . . .");
                    cicloMenu = false ;
                }


                default -> System.out.println("Opcion invalida, intente nuevamente");
            }



        }
        scanner.close();

    }

    private static void agregarFruta(Scanner scanner){
        System.out.println("Ingrese: ");
        System.out.println("ID del Alimento: ");
        int idAlimento = scanner.nextInt();

        System.out.println("Nombre del producto: ");
        String nombreProducto = scanner.nextLine();

        System.out.println();




        Fruta nuevaFruta = new Fruta(idAlimento, nombreProducto, precioUnitario, stockDisponible, paisOrigen, temporadaCultivo);

    }
}
