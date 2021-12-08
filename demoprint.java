

public class demoprint {
  public static void main(String[] args){

      UserDataRequest req1=new UserDataRequest();
      System.out.println("Здравствуйте,"+req1.GetName());
    
      Captcha cap1=new Captcha();
      System.out.println(cap1.Validate()); //Выведет угадали мы с числом или нет
    //сначала имя - потом капча
      System.out.println("Вот и всё"); //ещё один комментарий
      //вот такой проект
      //Да тут всё хорошо!
  }
}
