import fly.behavior.FlyBehavior;
import quack.behavior.QuackBehavior;

/**
 * Represents a generic Duck class which contain attributes and methods that are common in any Duck.
 * The more specific duck class such as mallard Duck or Rubber Duck can extend this abstract class and implement their own
 * display method based on what type of duck they are.
 * All other common attributes and methods of the Duck is abstracted into this class
 */
public abstract class Duck {
  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  public abstract void display();

  public void performFly() {
    flyBehavior.fly();
  }

  public void performQuack() {
    quackBehavior.quack();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior){
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void swim() {
    System.out.println("All ducks can swim!");
  }
}
