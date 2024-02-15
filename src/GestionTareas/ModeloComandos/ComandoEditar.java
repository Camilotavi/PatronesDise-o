package GestionTareas.ModeloComandos;

import GestionTareas.ModeloTareas.Tarea;

public class ComandoEditar implements Comando{
    private Tarea tarea;

    public ComandoEditar(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.editarTarea();
    }
}
