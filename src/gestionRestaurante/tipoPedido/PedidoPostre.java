package gestionRestaurante.tipoPedido;

public class PedidoPostre extends PlantillaPedido{

    public PedidoPostre(String Postre){
        this.Producto=Postre;
    }
    @Override
    protected void tomaPedido() {
        System.out.println("Tomando pedido de "+ this.Producto);
    }

    @Override
    protected void revisaDisponibilidad() {
        System.out.println("Si hay disponibilidad");
    }

    @Override
    protected void preparaPedido() {
        System.out.println("Preparando "+ this.Producto);
    }

    @Override
    protected void calculaPrecio() {
        System.out.println("Precio = $5500");
    }
}
