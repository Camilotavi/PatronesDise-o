package sistemaenvio.envios;

public class Maritimo implements Envio{

    private String puntoDeSalida = "Barranquilla";
    private String puntoDeLlegada = "New York";
    private String distancia = "3000km";

    private boolean estadoPedido = false;
    
    @Override
    public String obtenerDistancia() {
        return distancia;
    }

    @Override
    public String obtenerPuntoSalida() {
        return puntoDeSalida;
    }

    @Override
    public String obtenerPuntoLlegada() {
        return puntoDeLlegada;
    }

    @Override
    public void confirmarEnvio() {
        if (!this.estadoPedido){
            this.estadoPedido = true;
        }
    }
}
