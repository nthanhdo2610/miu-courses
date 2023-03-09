package lesson6.lab6.ui;

import lesson6.lab6.controller.BookingClubController;

import javax.swing.JPanel;
import javax.swing.JTextArea;

public class DetailForm {

    private JPanel detailPanel;
    private JTextArea areTitle;

    public DetailForm() {
        BookingClubController controller = BookingClubController.INSTANCE;
        controller.setDetailForm(this);
    }

    public JPanel getContent() {
        return detailPanel;
    }

    public void setTitleTxtArea(String text) {
        this.areTitle.setText(text);
    }
}
