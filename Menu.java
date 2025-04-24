package supermercado1;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        try (Scanner sc = new Scanner(System.in)) {
            InventarioDoble inventario = new InventarioDoble();
            int opcion;

            do {
                System.out.println("\n--- Supermercado (Lista Doble) ---");
                System.out.println("1. Agregar producto");
                System.out.println("2. Mostrar productos");
                System.out.println("3. Buscar producto");
                System.out.println("4. Eliminar producto");
                System.out.println("5. Salir");
                System.out.print("Seleccione una opción: ");
                opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Precio: ");
                        double precio = sc.nextDouble();
                        System.out.print("Cantidad: ");
                        int cantidad = sc.nextInt();
                        inventario.agregarProducto(new Producto(nombre, precio, cantidad));
                        break;
                    case 2:
                        inventario.mostrarInventario();
                        break;
                    case 3:
                        System.out.print("Nombre del producto a buscar: ");
                        String buscar = sc.nextLine();
                        inventario.buscarProducto(buscar);
                        break;
                    case 4:
                        System.out.print("Nombre del producto a eliminar: ");
                        String eliminar = sc.nextLine();
                        inventario.eliminarProducto(eliminar);
                        break;
                }
            } while (opcion != 5);
        }
    }
}
