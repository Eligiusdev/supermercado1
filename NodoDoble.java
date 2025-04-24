package supermercado1;

public class NodoDoble {
    public Producto dato;
    public NodoDoble siguiente;
    public NodoDoble anterior;

    public NodoDoble(Producto dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }
}
