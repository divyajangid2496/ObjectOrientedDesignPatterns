package fly.behavior;

/**
 * This class represents a duck which can fly at the speed of a rocket.
 */
public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("I'm flying like a rocket!");
  }
}
