package gestionrestaurante.tipoPedido;

public class PedidoBebida extends PlantillaPedido{

    public PedidoBebida(String Bebida){
        this.Producto=Bebida;
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
        System.out.println("Añadiendo hielo a "+ this.Producto);
    }

    @Override
    protected void calculaPrecio() {
        System.out.println("Precio = $8000");
    }
}
