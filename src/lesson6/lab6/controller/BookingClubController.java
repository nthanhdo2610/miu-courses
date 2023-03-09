package lesson6.lab6.controller;

import lesson6.lab6.dao.Data;
import lesson6.lab6.model.Auth;
import lesson6.lab6.model.User;
import lesson6.lab6.model.Util;
import lesson6.lab6.ui.BookingClub;

public enum BookingClubController {
    INSTANCE;
    BookingClub bookingClub;
    User user = new User("", "", Auth.ANONYMOUS);

    public BookingClub getBookingClub() {
        return bookingClub;
    }

    public void setBookingClub(BookingClub bookingClub) {
        this.bookingClub = bookingClub;
    }

    public User getUser() {
        return user;
    }

    public void doLogin(String username, String password){
        Data data = Data.INSTANCE;
        User user = Util.findUser(data.logins, new User(username, password));
        if (user == null) {
            this.bookingClub.error("Login failed!");
        } else {
            this.bookingClub.info("Login successful");
            this.bookingClub.auth(user.getAuthorization());
            this.user = user;
        }
    }
}
