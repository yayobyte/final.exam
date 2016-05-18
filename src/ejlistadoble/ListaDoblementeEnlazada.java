package ejlistadoble;

public class ListaDoblementeEnlazada {
    Nodo cabeza;
    Nodo fin;

    //constructor que crea una LDE vacia.
    public ListaDoblementeEnlazada() {
        cabeza = null;
        fin = null;
    }

    //indica si la lista est� vacia
    private boolean estaVacia() {
        boolean vacia = false;
        if ( cabeza == null ) {
            vacia = true;
        }
        return vacia;
    }

    //enlaza dos nodos mediante enlace doble
    private void enlazar(Nodo nodoA, Nodo nodoB) {
        nodoA.siguiente = nodoB;
        nodoB.anterior = nodoA;
    }

    //inserta un nuevo nodo al inicio de la lista
    public void insertarInicio(int ndato) {
        Nodo nuevo = new Nodo(ndato);
        if ( estaVacia() ) {
            cabeza = nuevo;
            fin = nuevo;
        } else {
            enlazar(nuevo, cabeza);
            cabeza = nuevo;
        }
    }

    //inserta un nuevo nodo al final de la lista
    public void insertarFinal(int ndato) {
        Nodo nuevo = new Nodo(ndato);
        if ( estaVacia() ) {
            cabeza = nuevo;
            fin = nuevo;
        } else {
            enlazar(fin, nuevo);
            fin = nuevo;
        }
    }

    //elimina el nodo del frente de la lista
    public void eliminarInicio() {
        if ( !estaVacia() ) {
            Nodo primero = cabeza.siguiente;
            if ( primero == null ) {
                cabeza = null;
                fin = null;
            } else {
                primero.anterior = null;
                cabeza = primero;
            }
        }
    }

    //elimina el nodo del final de la lista
    public void eliminarFinal() {
        if ( !estaVacia() ) {
            Nodo ultimo = fin.anterior;
            if ( ultimo == null ) {
                cabeza = null;
                fin = null;
            } else {
                ultimo.siguiente = null;
                fin = ultimo;
            }
        }
    }

    
    //muestra los valores en la lista
    public void mostrar() {
        Nodo iterador = cabeza;
        while ( iterador != null ) {
            System.out.print( iterador.informacion + " -> " );
            iterador = iterador.siguiente;
        }
        System.out.println( "null" );
    }
}