package lesson5.lab5.prob2.control;

import lesson5.lab5.prob2.data.Data;
import lesson5.lab5.prob2.data.DataFactory;
import lesson5.lab5.prob2.data.Logins;
import lesson5.lab5.prob2.ui.Grades;
import lesson5.lab5.prob2.ui.Login;
import lesson5.lab5.prob2.ui.Remarks;
import lesson5.lab5.prob2.ui.Start;

import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public enum Control {
    INSTANCE;
    Start start;
    Grades grades;
    Login login;
    String username;
    Data data;
    Remarks remarks;
    private boolean isLoggedIn = false;

    public boolean isLoggedIn() {
        return isLoggedIn;
    }

    public void setLoggedIn(boolean b) {
        isLoggedIn = b;
    }

    public void setStart(Start st) {
        this.start = st;
    }

    public void backToStart(JFrame frame) {
        frame.setVisible(false);
        start.setMessage("");
        start.setVisible(true);
    }

    class LoginListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            login = new Login();
            start.setVisible(false);
            isLoggedIn = false;
            login.setPrevious(UI.START);
            login.setVisible(true);
        }
    }

    class RemarksListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            start.setMessage("");
            start.setVisible(false);
            if (!isLoggedIn) {
                login = new Login();
                login.setPrevious(UI.REMARK);
                login.setVisible(true);
            } else {
                bindingDataRemarks();
            }
        }
    }

    private void bindingDataRemarks(){
        remarks = new Remarks();
        HashMap<String, String> rem = data.getTeacherRemarks();
        StringBuilder sb = new StringBuilder();
        for (String key : rem.keySet()) {
            sb.append(key + " : " + rem.get(key) + "\n");
        }
        remarks.setRemarks(sb.toString());
        remarks.setTitle("Teacher Remarks for " + username);
        remarks.setHeading("Teacher Remarks for " + username);
        remarks.setVisible(true);
    }

    class GradesListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            start.setMessage("");
            start.setVisible(false);
            if (!isLoggedIn) {
                login = new Login();
                login.setPrevious(UI.GRADE);
                login.setVisible(true);
            } else {
                bindingDataGrades();
            }
        }
    }

    private void bindingDataGrades(){
        grades = new Grades();
        HashMap<String, String> gr = data.getGrades();
        StringBuilder sb = new StringBuilder();
        for (String key : gr.keySet()) {
            sb.append(key + " : " + gr.get(key) + "\n");
        }
        grades.setGrades(sb.toString());
        grades.setTitle("Grades for " + username);
        grades.setHeading("Grades for " + username);
        grades.setVisible(true);
    }

    class SubmitLoginListener implements ActionListener {
        public void actionPerformed(ActionEvent evt) {
            String username = login.getUserName();
            String password = login.getPassword();
            if (!Logins.foundUserNamePwd(username, password)) {
                login.setMessage("Login failed.");
                isLoggedIn = false;
            } else {
                Control.this.username = username;
                Control.this.isLoggedIn = true;
                data = DataFactory.getData(username);
                login.setVisible(false);
                switch (login.getPrevious()) {
                    case GRADE -> bindingDataGrades();
                    case REMARK -> bindingDataRemarks();
                    case START -> {
                        start.setVisible(true);
                        start.setMessage("Successful login");
                    }
                    default -> {
                        login.setVisible(true);
                        login.setMessage("Successful login");
                    }
                }
            }
        }
    }

    public SubmitLoginListener getSubmitLoginListener() {
        return new SubmitLoginListener();
    }

    public LoginListener getLoginListener() {
        return new LoginListener();
    }

    public RemarksListener getRemarksListener() {
        return new RemarksListener();
    }

    public GradesListener getGradesListener() {
        return new GradesListener();
    }
}
