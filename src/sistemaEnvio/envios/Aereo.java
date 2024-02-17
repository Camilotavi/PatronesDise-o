package sistemaEnvio.envios;

public class Aereo implements Envio{

    private String puntoDeSalida = "Cucuta";
    private String puntoDeLlegada = "Neiva";
    private String distancia = "300km";

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
