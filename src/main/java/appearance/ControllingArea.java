package appearance;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

/**
 * Итерфейс с набором паелей рабочего окна.
 * @author Загороднев Д.М.
 * */
public interface ControllingArea {

    /** Окно программы */
    Stage WINDOW = new Stage();
    /** Получаем разрешение монитора */
    Screen SCREEN = Screen.getPrimary();
    /** Ширина монитора */
    double WIDTH_SIZE = SCREEN.getBounds().getWidth();
    /** Высота монитора */
    double HEIGHT_SIZE = SCREEN.getBounds().getHeight();
    /** Главна панель */
    Group ROOT_PANE = new Group();
    /** Рабочая облать окна программы */
    Scene SCENE_ROOT = new Scene(ROOT_PANE, WIDTH_SIZE*0.95, HEIGHT_SIZE*0.95);
}
