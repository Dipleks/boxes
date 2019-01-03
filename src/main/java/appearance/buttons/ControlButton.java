package appearance.buttons;

import appearance.ControllingArea;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

/**
 * Класс кнопок.
 * @author Загороднев Д.М.
 * */
public class ControlButton implements ControllingArea {

    /** Кнопка верного ответа */
    private static Button right = new Button("Я знаю!");
    /** Кнопка не верного ответа */
    private static Button invalid = new Button("Я не знаю!");
    /** Кнопка оставляющая задание без перемещения в другие коробки */
    private static Button leave = new Button("Оставить в этой коробки");

    public static Button getRight() {

        right.setFont(Font.font("Time New Roman", FontWeight.LIGHT, FontPosture.ITALIC,30));
        right.setTextFill(Color.GREEN);
        right.setFocusTraversable(false); // скрывает границу отрисовки
        right.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/15);
        right.setLayoutX(WIDTH_SIZE/4);
        right.setLayoutY(HEIGHT_SIZE/1.5);
        right.setTooltip(new Tooltip("При нажатии на кнопку задание переместися в следующею коробку!"));
        ROOT_PANE.getChildren().add(right);

        return right;
    }

    public static Button getInvalid(){

        invalid.setFont(Font.font("Time New Roman", FontWeight.LIGHT, FontPosture.ITALIC,30));
        invalid.setTextFill(Color.GREEN);
        invalid.setFocusTraversable(false); // скрывает границу отрисовки
        invalid.setPrefSize(WIDTH_SIZE/10, HEIGHT_SIZE/15);
        invalid.setLayoutX(WIDTH_SIZE/1.5);
        invalid.setLayoutY(HEIGHT_SIZE/1.5);
        invalid.setTooltip(new Tooltip("При нажатии на кнопку задание переместися в предыдующею коробку!"));
        ROOT_PANE.getChildren().add(invalid);

        return invalid;
    }

    public static Button getLeave(){

        leave.setFont(Font.font("Time New Roman", FontWeight.LIGHT, FontPosture.ITALIC,30));
        leave.setTextFill(Color.GREEN);
        leave.setFocusTraversable(false); // скрывает границу отрисовки
        leave.setPrefSize(WIDTH_SIZE/4.5, HEIGHT_SIZE/15);
        leave.setLayoutX(WIDTH_SIZE/2.5);
        leave.setLayoutY(HEIGHT_SIZE/1.5);
        leave.setTooltip(new Tooltip("При нажатии задание остается в этой коробке!"));
        ROOT_PANE.getChildren().add(leave);

        return leave;
    }
}
