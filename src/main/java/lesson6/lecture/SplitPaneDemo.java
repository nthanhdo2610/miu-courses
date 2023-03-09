package lesson6.lecture;

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

public class SplitPaneDemo extends JFrame {
    JPanel cardDeck;
    JPanel firstPanel;
    JPanel secondPanel;
    JPanel thirdPanel;
    JList<String> nameList;
    JSplitPane splitPane;

    SplitPaneDemo() {
        initializeWindow();
        setUpCards();
        setUpLists();
        splitPane = new JSplitPane(
                JSplitPane.HORIZONTAL_SPLIT,    //Orientation
                nameList,                       //left side
                cardDeck                        //right side
        );
        splitPane.setDividerLocation(300);
        add(splitPane, BorderLayout.CENTER);
        setSize(500, 450);
        centreOnDesktop(this);
    }

    private void centreOnDesktop(Component component) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        component.setLocation(
                (toolkit.getScreenSize().width - component.getWidth()) / 2,
                (toolkit.getScreenSize().height - component.getHeight()) / 2
        );
    }

    private void setUpLists() {
        nameList = new JList<>(new String[]{"first", "second", "third"});
        nameList.addListSelectionListener(e -> ((CardLayout) (cardDeck.getLayout())).show(cardDeck, nameList.getSelectedValue()));
    }

    private void setUpCards() {
        cardDeck = new JPanel();
        //set its layout as CardLayout
        cardDeck.setLayout(new CardLayout());
        firstPanel = new JPanel();
        firstPanel.add(new JLabel("This is first card"));
        secondPanel = new JPanel();
        secondPanel.add(new JLabel("This is second card"));
        thirdPanel = new JPanel();
        thirdPanel.add(new JLabel("This is third card"));
        //add all panels to deck
        cardDeck.add("first", firstPanel);
        cardDeck.add("second", secondPanel);
        cardDeck.add("third", thirdPanel);
    }

    private void initializeWindow() {
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(SplitPaneDemo::new);
    }
}