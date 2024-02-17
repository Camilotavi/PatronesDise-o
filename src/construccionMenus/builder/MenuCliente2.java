package construccionMenus.builder;

import construccionMenus.menus.Menu;

public class MenuCliente2 implements Builder{
    private Menu menu;

    public MenuCliente2(){
        this.menu=new Menu();
    }
    @Override
    public void constryeEntrada(String entrada) {
        menu.setEntrada(entrada);
    }

    @Override
    public void construyePrincipal(String principal) {
        menu.setPricipal(principal);
    }

    @Override
    public void construyeBebida(String bebida) {
        menu.setBebida(bebida);
    }

    @Override
    public void construyePostre(String postre) {
        menu.setPostre(postre);
    }

    @Override
    public Menu getMenu() {
        return menu;
    }
}
