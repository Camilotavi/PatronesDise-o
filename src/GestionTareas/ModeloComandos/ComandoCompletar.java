package GestionTareas.ModeloComandos;

import GestionTareas.ModeloTareas.Tarea;
public class ComandoCompletar implements Comando{
    private Tarea tarea;

    public ComandoCompletar(Tarea tarea) {
        this.tarea = tarea;
    }

    @Override
    public void execute() {
        tarea.completarTarea();
    }
}
