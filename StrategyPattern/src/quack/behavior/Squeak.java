package quack.behavior;

/**
 * This class represents the Squeak behavior of the duck
 */
public class Squeak implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("Squeak!");
  }
}
