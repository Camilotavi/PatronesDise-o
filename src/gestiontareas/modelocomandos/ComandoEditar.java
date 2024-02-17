package gestiontareas.modelocomandos;

import gestiontareas.modelotareas.Tarea;

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
