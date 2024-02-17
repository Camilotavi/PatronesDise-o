package gestionTareas.originador;


import gestionTareas.memento.Memento;

public class Tarea {

    private String accionEjecutada;

    public Tarea() {
        this.accionEjecutada = "CREADA";
    }

    public void realizarAccion(String accion){
        this.accionEjecutada = accion;
        System.out.println(this.accionEjecutada);
    }

    public Memento crearMarcador(){
        System.out.println("Marcador agregado");
        return new Memento(this.accionEjecutada);
    }

    public void aplicarMarcador(Memento memento){
        this.accionEjecutada = memento.obtenerAccionEjecutada();
        System.out.println("Volvimos a la acción ejecutada de " + memento.obtenerAccionEjecutada());
    }
}
