import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class Account {
    private static int stt = 1;
    private String fname;
    private String lname;
    private String email;
    private String username;
    private String password;
    private String mobile;
    private String id;
    private static ArrayList<Account> accounts = new ArrayList<>();

    public Account(String fname, String lname, String email, String username, String password, String mobile) {
        this.id = String.format("A%02d",stt++);
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.username = username;
        this.password = password;
        this.mobile = mobile;
    }
    public void AddAccount() {
        try{
            accounts.add(this);
            FileWriter oos = new FileWriter("accounts.txt");
            oos.write(this.id + " " + this.fname + " " + this.lname +" "+ this.email + " " +this.username +" "+ this.password +" "+ this.mobile);
            oos.close();
        } catch (Exception e) {
        }
    }
}
