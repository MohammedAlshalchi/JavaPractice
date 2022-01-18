package day11_SwitchAndIf;

public class browser {
    public static void main(String[] args) {
      String  browserName= "opera";
      String result ="";

      switch (browserName){
          case ("chrome"):
              result="chrome";
              break;
          case ("firefox"):
              result="firefox";
              break;
          case ("opera"):
              result="opera";
              break;
          case ("safari"):
              result="safari";
              break;
          case ("edge"):
              result="edge";
              break;
          default:result="Invalid Browser";
      }

        System.out.println(result);


















    }


















}
