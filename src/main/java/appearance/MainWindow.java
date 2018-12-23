package appearance;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 * Главное окно приложения.
 * @author Загороднев Д.М.
 **/
public class MainWindow extends Application implements ControllingArea{

    /**
     * Главный метод вызова приложения.
     * */
    public static void main (String[] args){
        launch(args);
    }

    /**
     * Метод вызывающий графический интерфейс.
     * */
    @Override
    public void start(Stage primaryStage) throws Exception {


        WINDOW.setTitle("Коробки");
        WINDOW.setMaximized(true); // Окно на всесь экран
        WINDOW.setScene(SCENE_ROOT);
        WINDOW.show();

    }
}
