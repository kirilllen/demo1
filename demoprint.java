

public class demoprint {
  public static void main(String[] args){

      UserDataRequest req1=new UserDataRequest();
      System.out.println("Здравствуйте, господин "+req1.GetName());
    
      Captcha cap1=new Captcha();
    //сначала имя - потом капча
      System.out.println("Вот и всё");
  }
}
