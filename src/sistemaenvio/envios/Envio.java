package sistemaenvio.envios;

public interface Envio {

    String obtenerDistancia();
    String obtenerPuntoSalida();
    String obtenerPuntoLlegada();
    void confirmarEnvio();
}
