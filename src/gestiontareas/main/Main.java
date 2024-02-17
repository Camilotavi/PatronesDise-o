package gestionTareas.main;


import gestionTareas.gestor.GestorHistorial;
import gestionTareas.originador.Tarea;

public class Main {
    public static void main(String[] args) {
        GestorHistorial gestorHistorial = new GestorHistorial();
        Tarea tarea = new Tarea();

        gestorHistorial.agregarMarcador(tarea.crearMarcador());
        tarea.realizarAccion("EDITADA");
        gestorHistorial.agregarMarcador(tarea.crearMarcador());
        tarea.realizarAccion("BORRADA");
        gestorHistorial.agregarMarcador(tarea.crearMarcador());

        tarea.aplicarMarcador(gestorHistorial.obtenerMarcador(1));

        //Si se quiere volver a la última acción editada sería.
        tarea.aplicarMarcador(gestorHistorial.obtenerMarcador(gestorHistorial.obtenerLargoMarcadores()-1));

    }
}
