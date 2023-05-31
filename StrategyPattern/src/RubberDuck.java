import fly.behavior.FlyNoWay;
import quack.behavior.MuteQuack;

/**
 * This class represents a type of duck called a Rubber Duck
 */
public class RubberDuck extends Duck {

  public RubberDuck(){
    flyBehavior = new FlyNoWay();
    quackBehavior = new MuteQuack();
  }

  @Override
  public void display() {
    System.out.println("This is a rubber Duck");
  }
}
