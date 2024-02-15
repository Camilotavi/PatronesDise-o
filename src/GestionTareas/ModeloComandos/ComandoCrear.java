package GestionTareas.ModeloComandos;

import GestionTareas.ModeloTareas.Tarea;

public class ComandoCrear implements Comando{
    private Tarea tarea;

    public ComandoCrear(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.crearTarea();
    }
}
