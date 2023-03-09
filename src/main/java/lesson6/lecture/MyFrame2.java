package lesson6.lecture;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.EventQueue;

public class MyFrame2  extends JFrame {
    //Need 3 JPanel objects
    JPanel topJPanel;
    JPanel middleJPanel;
    JPanel bottomJPanel;
    JTextField jTextField;
    JButton button;
    JLabel label;
    MyFrame2(){
        initializeWindow();
        defineTopPanel();
        defineMiddlePanel();
        defineBottomPanel();
        add(topJPanel, BorderLayout.NORTH);
        add(middleJPanel, BorderLayout.CENTER);
        add(bottomJPanel, BorderLayout.SOUTH);
        pack();
    }
    private void defineBottomPanel() {
        bottomJPanel = new JPanel();
        button = new JButton("Process");
        bottomJPanel.add(button);
        //register button with event listener interface
        button.addActionListener(e -> {
            //read text content from text field
            String data = jTextField.getText();
            // update label
            label.setText("You typed: "+data);
        });
    }
    private void defineMiddlePanel() {
        middleJPanel = new JPanel();
        label = new JLabel("My Text");
        middleJPanel.add(label);
    }
    private void defineTopPanel() {
        //instantiate top panel
        topJPanel = new JPanel();
        //instantiate text field
        jTextField = new JTextField(10);
        //add a text field to panel
        topJPanel.add(jTextField);
    }
    private void initializeWindow() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    public static void main(String[] args) {
        EventQueue.invokeLater(MyFrame2::new);
    }
}
