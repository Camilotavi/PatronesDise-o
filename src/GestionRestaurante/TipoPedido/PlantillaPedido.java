package GestionRestaurante.TipoPedido;

public abstract class PlantillaPedido {

    String Producto;
    public final void procesaPedido() {
        tomaPedido();
        revisaDisponibilidad();
        preparaPedido();
        calculaPrecio();
    }

    protected abstract void tomaPedido();

    protected abstract void revisaDisponibilidad();

    protected abstract void preparaPedido();

    protected abstract void calculaPrecio();
}
