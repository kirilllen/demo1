import java.util.*;

public class UserDataRequest {
    protected String userName;
    public static Scanner console=new Scanner(System.in);
    public UserDataRequest(){
        System.out.println("Введите имя");
        userName=console.next();
    }

    public String GetName(){
        return userName;
    }
}
