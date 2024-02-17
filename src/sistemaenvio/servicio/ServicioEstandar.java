package sistemaenvio.servicio;

import sistemaenvio.envios.Envio;

public class ServicioEstandar implements  Servicio{

    protected Envio envio;

    public ServicioEstandar() {
    }

    public ServicioEstandar(Envio envio) {
        this.envio = envio;
    }

    @Override
    public void mostrarDistancia() {
        System.out.println("La distancia del envio es de " + envio.obtenerDistancia());
    }

    @Override
    public void mostrarPuntoLlegada() {
        System.out.println("El destino del pedido es " + envio.obtenerPuntoLlegada());
    }

    @Override
    public void mostrarPuntoSalida() {
        System.out.println("El punto de salida del pedido es " + envio.obtenerPuntoSalida());
    }

    @Override
    public void mostrarInformacion() {
        this.mostrarDistancia();
        this.mostrarPuntoLlegada();
        this.mostrarPuntoSalida();
        this.envio.confirmarEnvio();
    }
}
