import javax.swing.*;

public class HelloWorldApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello World GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        JPanel panel = new JPanel();

        JLabel label = new JLabel("Привет МИР!");
        panel.add(label);

        frame.getContentPane().add(panel);

        frame.setVisible(true);
    }
}
