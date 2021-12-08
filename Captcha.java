import java.util.*;

public class Captcha {
    protected String capValue;
    protected static Scanner console=new Scanner(System.in);
    public Captcha(){
        System.out.print("Введите 2+2=");
        capValue=console.next();
    }

    public boolean Validate(){
        return capValue.equals("4");
    }
}
