package construccionMenus.builder;

import construccionMenus.menus.Menu;

public interface Builder {
    void constryeEntrada(String entrada);
    void construyePrincipal(String principal);
    void construyeBebida(String bebida);
    void construyePostre(String postre);

    Menu getMenu();

}
