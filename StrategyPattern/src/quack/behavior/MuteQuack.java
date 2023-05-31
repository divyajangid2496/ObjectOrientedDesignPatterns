package quack.behavior;

/**
 * This class represents a silent duck.
 * For example: a rubber duck which won't quack at all
 */
public class MuteQuack implements QuackBehavior {
  @Override
  public void quack() {
    System.out.println("<Silence>!");
  }
}
