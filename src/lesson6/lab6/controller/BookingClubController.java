package lesson6.lab6.controller;

import lesson6.lab6.dao.Data;
import lesson6.lab6.model.Auth;
import lesson6.lab6.model.User;
import lesson6.lab6.model.Util;
import lesson6.lab6.ui.BookingClub;
import lesson6.lab6.ui.DetailForm;

import java.util.StringJoiner;

public enum BookingClubController {
    INSTANCE;
    BookingClub bookingClub;
    DetailForm detailForm;
    User user = new User("", "", Auth.ANONYMOUS);
    Data data = Data.INSTANCE;

    public void setBookingClub(BookingClub bookingClub) {
        this.bookingClub = bookingClub;
    }

    public void setDetailForm(DetailForm detailForm) {
        this.detailForm = detailForm;
    }

    public User getUser() {
        return user;
    }

    public void doLogin(String username, String password){
        User user = Util.findUser(data.logins, new User(username, password));
        if (user == null) {
            this.bookingClub.error("Login failed!");
        } else {
            this.bookingClub.info("Login successful");
            this.bookingClub.auth(user.getAuthorization());
            this.user = user;
            if(user.getAuthorization().equals(Auth.BOTH) || user.getAuthorization().equals(Auth.SELLER)){
                StringJoiner joiner = new StringJoiner("\n");
                data.bookTitles.forEach(joiner::add);
                detailForm.setTitleTxtArea(joiner.toString());
            } else {
                detailForm.setTitleTxtArea("unauthorized");
            }
        }
    }

    public void error(String msg){
        this.bookingClub.error(msg);
    }
}
