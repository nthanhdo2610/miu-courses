package lesson5.lab5.prob1.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Toolkit;

public class WindowUtil {

    static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), (f.getSize() - 2));
    }

    static JPanel createTextPanel(JLabel lab, JTextField textField) {

        JPanel top = new JPanel();
        JPanel bottom = new JPanel();
        top.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        bottom.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));


        top.add(lab);
        bottom.add(textField);

        JPanel textPanel = new JPanel();
        textPanel.setLayout(new BorderLayout());
        textPanel.add(top, BorderLayout.NORTH);
        textPanel.add(bottom, BorderLayout.CENTER);
        return textPanel;
    }

    static void centerFrameOnDesktop(Component f) {
        final int SHIFT_AMOUNT = 0;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height;
        int width = toolkit.getScreenSize().width;
        int frameHeight = f.getSize().height;
        int frameWidth = f.getSize().width;
        f.setLocation(((width - frameWidth) / 2) - SHIFT_AMOUNT, (height - frameHeight) / 3);
    }
}
