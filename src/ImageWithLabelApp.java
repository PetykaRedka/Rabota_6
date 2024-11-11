import javax.swing.*;
import java.awt.*;

public class ImageWithLabelApp {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Two Panels GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        JPanel panel1 = new JPanel();
        panel1.setLayout(new BorderLayout());

        ImageIcon image1 = new ImageIcon("гора.png");
        JLabel imageLabel1 = new JLabel(image1);
        JLabel label1 = new JLabel("Гора", JLabel.CENTER);
        label1.setForeground(Color.BLUE);
        label1.setFont(new Font("Serif", Font.BOLD, 18));

        panel1.add(imageLabel1, BorderLayout.CENTER);
        panel1.add(label1, BorderLayout.SOUTH);

        JPanel panel2 = new JPanel();
        panel2.setLayout(new BorderLayout());

        ImageIcon image2 = new ImageIcon("горы.png");
        JLabel imageLabel2 = new JLabel(image2);
        JLabel label2 = new JLabel("Горы", JLabel.CENTER);
        label2.setForeground(Color.RED);
        label2.setFont(new Font("Apatos", Font.ITALIC, 18));

        panel2.add(imageLabel2, BorderLayout.CENTER);
        panel2.add(label2, BorderLayout.SOUTH);

        frame.setLayout(new GridLayout(2, 1));
        frame.add(panel1);
        frame.add(panel2);

        frame.setVisible(true);
    }
}
