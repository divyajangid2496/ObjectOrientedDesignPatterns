package fly.behavior;

/**
 * Represents the fly behavior interface. The implementation classes will be responsible for implement different
 * set of fly behaviors such as FlyWithWings, FlyNoWay, FlyRocketPowered etc.
 *
 * Adding a new fly behavior later becomes easy as we just need to add the implementation class that implements this interface
 */
public interface FlyBehavior {

  /**
   * Represents a method which is responsible to deal with the flying behavior
   */
  void fly();
}
