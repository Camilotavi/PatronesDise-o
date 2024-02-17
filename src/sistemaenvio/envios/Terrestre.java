package sistemaenvio.envios;

public class Terrestre implements Envio{

    private String puntoDeSalida = "Bogota";
    private String puntoDeLlegada = "Cucuta";
    private String distancia = "200km";

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
