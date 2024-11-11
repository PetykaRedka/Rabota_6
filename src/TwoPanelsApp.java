import javax.swing.*;
import java.awt.*;

public class TwoPanelsApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Panels GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        JLabel label1 = new JLabel("Первая надпись");
        label1.setForeground(Color.BLUE);  // Задаем цвет текста
        label1.setFont(new Font("Serif", Font.BOLD, 18));
        panel1.add(label1);

        JPanel panel2 = new JPanel();
        JLabel label2 = new JLabel("Вторая надпись");
        label2.setForeground(Color.RED);  // Задаем цвет текста
        label2.setFont(new Font("Apatos", Font.ITALIC, 18));
        panel2.add(label2);

        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }
}
