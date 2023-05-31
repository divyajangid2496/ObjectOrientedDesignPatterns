package fly.behavior;

/**
 * This class represents a duck which can fly with their wings
 */
public class FlyWithWings implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I am Flying with wings!");
  }
}
