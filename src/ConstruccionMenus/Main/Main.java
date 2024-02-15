package ConstruccionMenus.Main;

import ConstruccionMenus.Builder.Director;
import ConstruccionMenus.Builder.MenuCliente1;
import ConstruccionMenus.Menus.Menu;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        MenuCliente1 builder = new MenuCliente1();
        Menu MenudelCliente = director.construct(builder);


        System.out.println("Menu del primer cliente="+MenudelCliente.getEntrada()+","+
                MenudelCliente.getPricipal()+","+MenudelCliente.getBebida()+","+MenudelCliente.getPostre());
    }
}
