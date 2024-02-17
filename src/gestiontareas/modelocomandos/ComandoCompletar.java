package gestiontareas.modelocomandos;

import gestiontareas.modelotareas.Tarea;
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
