import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Account{
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
    public void AddAccount() throws IOException{
        FileWriter fw = new FileWriter("Accounts.txt");
        fw.write(this.username + " " + this.password + "\n");
        fw.close();
    }

    public static boolean checklogin(String username, String password) throws IOException{
        Scanner sc = new Scanner(new File("Accounts.txt"));
        while (sc.hasNextLine()){
            if(sc.next().equals(username) && sc.next().equals(password)){
                return true;
            }
        }
        return false;
    }
}
