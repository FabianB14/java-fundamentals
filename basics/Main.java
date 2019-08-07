import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[]args) {
    System.out.println("Hello  Superworld");
    int dogCount = 1;
System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

int catCount = 2;
System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

int turtleCount = 0;
System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");
    flipNHeads(3);
    clock();
  }

  public static String pluralize(String str, int num){
    if(num == 1){
      return str;
    }
    else{
      return (str+"s");
    }
  }

  public static void flipNHeads(int num){
    int totalCount = 0;
    int headsCount = 0;

    while(headsCount < num){
      double flipped = Math.random();
      if(flipped >= .5){
        System.out.println("Heads");
        headsCount++;
      }
      else{
        System.out.println("Tails");
      }
      totalCount++;
    }
    System.out.println("It took " + totalCount + " " + pluralize("flip", totalCount) + " to get " + headsCount + " " + pluralize("head", headsCount) + " " + "in a row.");
  }

  public static void clock(){
    while(0==0){
      try {
      TimeUnit.SECONDS.sleep(1);
      LocalTime localTime = LocalTime.now();
      System.out.println(localTime.getHour() + ":" + localTime.getMinute()+ ":" + localTime.getSecond());
      }
      catch(InterruptedException e){
        System.out.println("wait");
      }
    }
  
  }
}