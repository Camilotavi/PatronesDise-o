package gestionRestaurante.tipoPedido;

public class PedidoComida extends PlantillaPedido{

    public PedidoComida(String Comida){
        this.Producto=Comida;
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
        System.out.println("Cocinando "+ this.Producto);
    }

    @Override
    protected void calculaPrecio() {
        System.out.println("Precio = $22000");
    }
}
