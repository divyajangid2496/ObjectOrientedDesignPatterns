**NOTE:** In this section we are discussing the problem related to a successful duck pond simulation game called "SimUDuck". This game shows a large variety of duck species swimming and making quacking sounds.

**What is Strategy Pattern?**
The Strategy Pattern defines a family of algorithms, encapsulates each one of them and make them interchangable. Strategy lets the algorithm vary independently from clients that use it.
  
**Key Take Aways**
1. Inheritance doesn't work well when the behaviour keeps changing across subclasses. Since it is not appropriate for all the subclassses to have those behaviour. For example in the SimUDuck example the flying behaviour of the Mallard duck was different from the rubber duck and decoy ducks
2. One of the key principle of object oriented design is **"Program to an interfance and not to an implementation"**. However, in our SimUDuck example, the interface alone did not work because interface has no implementation and therefore didn't allow us to reuse the code. In our case if in future the client wants to change the fly behaviour of 10 duck categories then interace makes it difficult because we would then have to change the code across 10 duck class implementations
3. Hence, Strategy pattern/object oriented design pattern teaches us that we should always **identify the part of the application that varies and separate them from what stays the same**. Talking about our example, the Ducks don't change it remains the same. The only thing changes here is the duck behaviour such as flying and quacking
4. With this design where we have Flying and Quacking behaviors, other type of objects can resuse our behaviors as they are no longer hidden away in our Duck class
5. We can add new behaviors very easily without modifying any of the existing classes that use the Flyinh or Quacking behavior. So, we get the benefit of REUSE without all the baggage that comes along with inheritance
6. One more thing to notice here is that our design has both the IS-A and HAS-A relationship. However, this pattern taught us that inheritance may create problems with respect to the code maintainance and changing behavior of the subclass implementation. Hence, always **"favour composition over inheritance"**
7. As we see that composing the FlyBehavior and QuackBehavior in our Duck class has great benefits in out SimUDuck example
