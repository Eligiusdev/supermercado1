package supermercado1;

public class InventarioDoble {
    private ListaDoble lista = new ListaDoble();

    public void agregarProducto(Producto producto) {
        lista.insertar(producto);
    }

    public void mostrarInventario() {
        lista.mostrar();
    }

    public void buscarProducto(String nombre) {
        NodoDoble nodo = lista.buscar(nombre);
        if (nodo != null) {
            System.out.println("Producto encontrado: " + nodo.dato);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    public void eliminarProducto(String nombre) {
        if (lista.eliminar(nombre)) {
            System.out.println("Producto eliminado correctamente.");
        } else {
            System.out.println("No se encontró el producto para eliminar.");
        }
    }
}

