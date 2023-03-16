package lesson9;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;
import java.util.List;

public class JFrameExamples {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Window");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(400, 350);
        frame.setLayout(new FlowLayout());
        List<String> labels = List.of("Yes", "No", "May Be");
        labels.stream()
                .map(JButton::new)
                .forEach(frame::add);
        frame.setVisible(true);
    }
}
