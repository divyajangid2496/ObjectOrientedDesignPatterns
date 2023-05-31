package quack.behavior;

/**
 * This class represents the Quack behavior of a duck
 */
public class Quack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Quack!");
  }
}
