package ejlistadoble;



public class Nodo {
    //Campos del nodo
    int informacion;
    Nodo anterior;
    Nodo siguiente;

    //constructor que inicializa un Nodo con cierta informacion o dato
    public Nodo(int dato) {
        informacion = dato;
        anterior = null;
        siguiente = null;
    }
}