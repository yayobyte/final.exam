package ejlistadoble;

public class Main {
    public static void main(String[] args) {
        ListaDoblementeEnlazada lista = new ListaDoblementeEnlazada();
        lista.insertarInicio(3);
        lista.mostrar();
        lista.insertarInicio(2);
        lista.mostrar();
        lista.insertarFinal(5);
        lista.mostrar();
        lista.insertarInicio(1);
        lista.mostrar();
        lista.insertarInicio(1);
        lista.mostrar();
        lista.insertarFinal(8);
        lista.mostrar();
        
        
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarInicio();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
        lista.eliminarFinal();
        lista.mostrar();
    }
}
