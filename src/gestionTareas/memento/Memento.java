package gestionTareas.memento;

public class Memento{

    private String accionEjecutada;

    public Memento(String accionEjecutada) {
        this.accionEjecutada = accionEjecutada;
    }
    public String obtenerAccionEjecutada() {
        return accionEjecutada;
    }

    public void asignarAccionEjecutada(String accionEjecutada) {
        this.accionEjecutada = accionEjecutada;
    }


}
