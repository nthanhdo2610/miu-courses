package lesson6.lab6.dao;

import lesson6.lab6.model.Auth;
import lesson6.lab6.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * This class stores "dummy data" for the Gui. 
 */
public class Data {
	
	public static final Data INSTANCE = new Data();
	private Data() {
		//private constructor; must be accessed with getInstance method
	}
	
	
	/////////////names
	private final static String MESSIAH_OF_DUNE = "Messiah Of Dune";
    private final static String GONE_WITH_THE_WIND = "Gone With The Wind";
    private final static String GARDEN_OF_RAMA = "Garden of Rama";
	
    
    public List<String> bookTitles = new ArrayList<>() {

        {
            add(MESSIAH_OF_DUNE);
            add(GONE_WITH_THE_WIND);
            add(GARDEN_OF_RAMA);
        }
    };
    
    public void addBookTitle(String title) {
    	bookTitles.add(title);
    }
    
    public static Auth currentAuth = null;
    
    public List<User> logins = new ArrayList<>() {

        {
            add(new User("Joe", "111", Auth.SELLER));
            add(new User("Ann", "101", Auth.MEMBER));
            add(new User("Dave", "102", Auth.BOTH));
        }
    };
    
}