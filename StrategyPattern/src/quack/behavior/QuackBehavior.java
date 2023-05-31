package quack.behavior;

/**
 * Represents the quack behavior interface. The implementation classes will be responsible for implement different
 * set of quack behaviors such as Quack, MuteQuack, Squeak etc.
 *
 * Adding a new quack behavior later becomes easy as we just need to add the implementation class that implements this interface
 */
public interface QuackBehavior {
  /**
   * Represents a method which is responsible to deal with the quacking behavior
   */
  void quack();
}
