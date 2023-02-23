import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow(){   // Конструктор класса MainWindow()
        setTitle("Змейка");
        MainWindow.class.getClassLoader().getResource("Game_Icon.jpg");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(320,345);
        setLocation(400,400);
        add(new GameField());
        setResizable(false);
        setVisible(true);
        }

        public static void main(String[] args) {
            MainWindow mw = new MainWindow();
        }  // Метод отрисовки игры
    }

