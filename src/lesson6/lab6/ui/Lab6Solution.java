package lesson6.lab6.ui;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Toolkit;
import java.io.Serial;

public class Lab6Solution extends JFrame {

    @Serial
    private static final long serialVersionUID = -1L;

    JPanel cardDeck;
    JList<String> linkList;
    JSplitPane splitPane;

    Lab6Solution() {
        initializeWindow();
        setSize(600, 450);
        linkList = new JList<>(new String[]{"Login", "View Titles", "Add Book"});
        setUpCards();
        splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,    //Orientation
                linkList,                       //left side
                cardDeck                        //right side
        );
        splitPane.setDividerLocation(200);
        splitPane.setBorder(BorderFactory.createCompoundBorder());
        add(splitPane, BorderLayout.CENTER);
        centreOnDesktop(this);
    }

    private void centreOnDesktop(Component component) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        component.setLocation(
                (toolkit.getScreenSize().width - component.getWidth()) / 2,
                (toolkit.getScreenSize().height - component.getHeight()) / 2
        );
    }

    private void setUpCards() {

        LoginPanel loginPanel = new LoginPanel();
        loginPanel.add(new JLabel("This is login card"));
        DetailPanel detailPanel = new DetailPanel();
        detailPanel.add(new JLabel("This is view titles card"));
        AddBookPanel addBookPanel = new AddBookPanel();
        addBookPanel.add(new JLabel("This is add book card"));
        cardDeck = new JPanel(new CardLayout());
        cardDeck.add(loginPanel, "Login");
        cardDeck.add(detailPanel, "View Titles");
        cardDeck.add(addBookPanel, "Add Book");
        linkList.addListSelectionListener(event -> {
            String value = linkList.getSelectedValue();
            CardLayout cl = (CardLayout) (cardDeck.getLayout());
            cl.show(cardDeck, value);
        });
    }

    private void initializeWindow() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(Lab6Solution::new);
    }
}