package fly.behavior;

/**
 * This class represents a duck which doesn't fly
 * For example: a rubber duck would never fly
 */
public class FlyNoWay implements FlyBehavior{

  @Override
  public void fly() {
    System.out.println("I can't Fly!");
  }
}
