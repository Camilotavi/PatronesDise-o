package sistemaEnvio.servicio;

import sistemaEnvio.envios.Envio;

public class ServicioExpress extends ServicioEstandar{

    public ServicioExpress(Envio envio){
        super.envio = envio;
    }

    public void mostrarTiempo(){
        System.out.println("El tiempo de entrega es lo más rápido posible");
    }
}
