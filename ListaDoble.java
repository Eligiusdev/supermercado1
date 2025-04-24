package supermercado1;

public class ListaDoble {
    private NodoDoble cabeza;

    public void insertar(Producto producto) {
        NodoDoble nuevo = new NodoDoble(producto);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoDoble aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
            nuevo.anterior = aux;
        }
    }

    public void mostrar() {
        NodoDoble aux = cabeza;
        if (aux == null) {
            System.out.println("Inventario vacío.");
        } else {
            while (aux != null) {
                System.out.println(aux.dato);
                aux = aux.siguiente;
            }
        }
    }

    public NodoDoble buscar(String nombre) {
        NodoDoble aux = cabeza;
        while (aux != null) {
            if (aux.dato.getNombre().equalsIgnoreCase(nombre)) {
                return aux;
            }
            aux = aux.siguiente;
        }
        return null;
    }

    public boolean eliminar(String nombre) {
        NodoDoble actual = buscar(nombre);
        if (actual == null) return false;

        if (actual.anterior != null) {
            actual.anterior.siguiente = actual.siguiente;
        } else {
            cabeza = actual.siguiente;
        }

        if (actual.siguiente != null) {
            actual.siguiente.anterior = actual.anterior;
        }

        return true;
    }
}
