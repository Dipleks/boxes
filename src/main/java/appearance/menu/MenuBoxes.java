package appearance.menu;

import appearance.ControllingArea;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;

/**
 * Меню программы.
 * @author Загороднев Д.М.
 * */
public class MenuBoxes {

    /** Панель меню */
    private final MenuBar menuBar = new MenuBar();

    /** Меню файл */
    private final Menu menuFile = new Menu("Файл");

    /** Меню сервис */
    private final Menu menuService = new Menu("Сервис");

    /**
     * Вызов меню программы.
     * */
    public MenuBar getMenuBar(){

        ControllingArea.ROOT_PANE.getChildren().addAll(menuBar);

        menuService.setDisable(true);

        menuFile.getItems().addAll();
        menuService.getItems().addAll();

        menuBar.setMinWidth(ControllingArea.WIDTH_SIZE);
        menuBar.getMenus().addAll(menuFile, menuService);
        return menuBar;
    }

}
