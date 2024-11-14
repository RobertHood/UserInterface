import java.util.ArrayList;

public class Account {
    private static int id = 1;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
    private String mobile;
    private static ArrayList<Account> accounts = new ArrayList<>();

    public Account(String fname, String lname, String email, String username, String password, String mobile) {
        this.id = id++;
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }
    public void AddAccount(Account account) {
        accounts.add(account);
    }
}
