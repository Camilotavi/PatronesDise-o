package GestionTareas.Invoker;

import GestionTareas.ModeloComandos.Comando;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

    private final List<Comando> Comandos = new ArrayList<>();

    public void ejecutarComando(Comando comando){
        comando.execute();
        Comandos.add(comando);
    }

}
