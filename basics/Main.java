public class Main {
  public static void main(String[]args) {
    System.out.println("Hello  Superworld");
    int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
  }

  public static String pluralize(String str, int num){
    if(num == 1){
      return str;
    }
    else{
      return (str+"s");
    }
  }
}