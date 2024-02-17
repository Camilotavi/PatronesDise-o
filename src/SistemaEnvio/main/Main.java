package SistemaEnvio.main;


import SistemaEnvio.envios.Aereo;
import SistemaEnvio.envios.Envio;
import SistemaEnvio.envios.Maritimo;
import SistemaEnvio.envios.Terrestre;
import SistemaEnvio.servicio.ServicioEstandar;
import SistemaEnvio.servicio.ServicioExpress;

public class Main {
    public static void main(String[] args){

        Aereo aereo = new Aereo();
        Maritimo maritimo = new Maritimo();
        Terrestre terrestre = new Terrestre();
        testEnvio(aereo);
        testEnvio(maritimo);
        testEnvio(terrestre);
    }

    public static void testEnvio(Envio envio){
        System.out.println("-----------------");
        System.out.println("Envio estandar");
        ServicioEstandar servicioEstandar = new ServicioEstandar(envio);
        servicioEstandar.mostrarInformacion();

        System.out.println("Envio express");
        ServicioExpress servicioExpress = new ServicioExpress(envio);
        servicioExpress.mostrarInformacion();
        servicioExpress.mostrarTiempo();
    }
}
