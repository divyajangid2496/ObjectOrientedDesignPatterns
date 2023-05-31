import fly.behavior.FlyWithWings;
import quack.behavior.Quack;

/**
 * This class represents a type of duck named Mallard Duck
 */
public class MallardDuck extends Duck {

  public MallardDuck(){
    flyBehavior = new FlyWithWings();
    quackBehavior = new Quack();
  }

  @Override
  public void display() {
    System.out.println("This is pure Mallard Duck");
  }

}
