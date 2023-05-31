import fly.behavior.FlyRocketPowered;
import quack.behavior.Squeak;

/**
 * SimUDuck is a duck simulation game, in which ducks have certain behaviors such us Flying and Quacking.
 *
 * In this problem we are trying to design the SimUDuck application such that it can cater to any requirement change
 * without affecting or changing the Existing code.
 * Here we implement the Strategy Pattern to solve this
 */
public class SimUDuck {

  public static void main(String[] args) {
    //Instantiate a Mallard Duck
    Duck mallardDuck = new MallardDuck();
    System.out.println("---------------------");
    mallardDuck.display();
    System.out.println("---------------------");
    mallardDuck.performFly();
    mallardDuck.performQuack();

    //Change the Behavior on runtime
    mallardDuck.setFlyBehavior(new FlyRocketPowered());
    mallardDuck.setQuackBehavior(new Squeak());
    mallardDuck.performFly();
    mallardDuck.performQuack();

    //Instantiate a Rubber Duck
    Duck rubberDuck = new RubberDuck();
    System.out.println("---------------------");
    rubberDuck.display();
    System.out.println("---------------------");
    rubberDuck.performFly();
    rubberDuck.performQuack();
  }
}
