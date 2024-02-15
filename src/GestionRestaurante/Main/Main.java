package GestionRestaurante.Main;

import GestionRestaurante.TipoPedido.PedidoBebida;
import GestionRestaurante.TipoPedido.PedidoComida;
import GestionRestaurante.TipoPedido.PedidoPostre;
import GestionRestaurante.TipoPedido.PlantillaPedido;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlantillaPedido Comida = new PedidoComida("Hamburguesa");
        Comida.procesaPedido();

        Thread.sleep(2000);

        PlantillaPedido Bebida = new PedidoBebida("Pepsi");
        Bebida.procesaPedido();

        Thread.sleep(2000);

        PlantillaPedido Postre = new PedidoPostre("Helado");
        Postre.procesaPedido();

        Thread.sleep(2000);
    }
}
