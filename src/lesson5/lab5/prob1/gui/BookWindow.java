package lesson5.lab5.prob1.gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BookWindow extends JFrame implements IWindow {
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JButton button;
    private JTextField isbnField;
    private JTextField titleField;
    private JTextField priceField;
    private static final long serialVersionUID = 1L;

    public BookWindow() {
        initializeWindow();
        JPanel mainPanel = new JPanel();
        defineTopPanel();
        defineBottomPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(topPanel, BorderLayout.NORTH);
        mainPanel.add(bottomPanel, BorderLayout.SOUTH);
        getContentPane().add(mainPanel);
        pack();
    }

    public void defineTopPanel() {
        topPanel = new JPanel();
        JLabel isbnLabel = new JLabel("ISBN");
        isbnLabel.setFont(WindowUtil.makeSmallFont(isbnLabel.getFont()));
        isbnField = new JTextField(12);
        JPanel isbnPanel = WindowUtil.createTextPanel(isbnLabel, isbnField);


        JLabel titleLabel = new JLabel("Title");
        titleLabel.setFont(WindowUtil.makeSmallFont(titleLabel.getFont()));
        titleField = new JTextField(12);
        JPanel titlePanel = WindowUtil.createTextPanel(titleLabel, titleField);

        JLabel priceLabel = new JLabel("Price");
        priceLabel.setFont(WindowUtil.makeSmallFont(priceLabel.getFont()));
        priceField = new JTextField(12);
        JPanel pricePanel = WindowUtil.createTextPanel(priceLabel, priceField);


        topPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        topPanel.add(isbnPanel);
        topPanel.add(titlePanel);
        topPanel.add(pricePanel);

    }

     public void defineBottomPanel() {
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
        button = new JButton("Update Info");
        button.addActionListener(new ButtonListener());
        bottomPanel.add(button);

    }

    public void initializeWindow() {
        setTitle("Add Book to Collection");
        setSize(520, 180);
        handleWindowClosing();
        WindowUtil.centerFrameOnDesktop(this);
        setResizable(false);
    }

    public void handleWindowClosing() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent w) {
                dispose();
                //other clean-up
                System.exit(0);
            }
        });
    }

    public void clearTextFieldList() {
        isbnField.setText("");
        titleField.setText("");
        priceField.setText("");
    }

    class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            JOptionPane.showMessageDialog(BookWindow.this, "Still need to check book rules!");
        }
    }

    class BackListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {

        }
    }

    public String getIsbnValue() {
        return isbnField.getText();
    }

    public String getTitleValue() {
        return titleField.getText();
    }

    public String getPriceValue() {
        return priceField.getText();
    }

    public static void main(String[] args) {
        BookWindow mf = new BookWindow();
        //mf.pack();
        mf.setVisible(true);
    }

    public String[] getTextFieldList() {
        return new String[]{this.isbnField.getText(), this.titleField.getText(), this.priceField.getText()};
    }
}
