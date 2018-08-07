# 30 Days of TDD: Day One – What is TDD and Why Should I Use It?
## a blog by James Bender
##### https://www.telerik.com/blogs/30-days-tdd-day-one-what-is-tdd   

**My goal** for [this tutorial](https://www.telerik.com/blogs/30-days-tdd-day-one-what-is-tdd) is to go from "I can barely spell TDD" to being able to confidently consider myself a "functional" TDD developer.

This TDD blog/tutorial is presented in C# and I am translating it to Java.  The author uses Visual Studio, along with tools like NUnit, DevCraft, JustCode and JustMock.  I am following along using Eclipse and JUnit.  You can follow my progress in my [GitHub repo](https://github.com/code-42/tdd_tutorials/tree/master/30DaysOfTDD/UnitTests/net/ed).



Along the way, I will be documenting how to implement C# concepts such as Assert.AreEqual() and String ToCharArray() into their Java equivalents.  Although this may seem trivial, it is not, for a beginner like me.  But, this exercise will surely help push me from beginner to intermediate level programmer.

[**Day Two**](https://www.telerik.com/blogs/30-days-of-tdd-day-two-a-review-of-object-oriented-principles) presents a concise overview of OOP and the three major tenets: Encapsulation, Inheritance and Polymorphism.  I don't know why he does not consider Abstraction to be one of OOP's major tenets, but he does a good job of summarizing OOP in a few short paragraphs with examples.

[**Day Three**](https://www.telerik.com/blogs/30-days-of-tdd-day-three-your-first-test) starts out setting the stage: gathering requirements and defining the expectations of what problem we are attempting to solve and how best to solve it.  Our requirement for this sample is:

> “Create a library method that takes in a sentence and a single character as parameters. The method should return a number that indicates how many times the character appears in the sentence.”

Bender goes on to present the **Arrange, Act and Assert pattern** for writing unit tests.  This pattern allows us to take a complicated problem and reducing it to a few (somewhat) simple steps.

[**Day Four**](https://www.telerik.com/blogs/30-days-of-tdd-day-four-making-your-first-test-pass) implements the method under test.  Create a class StringUtils and define a method FindNumberOfOccurences(String sentenceToScan, String characterToScanFor).  

[**Day Five**](https://www.telerik.com/blogs/30-days-of-tdd-day-five-make-your-code-solid) S.O.L.I.D. - five principals for developers to guide them in creating well designed, high quality and easier to maintain software as described by "Uncle Bob" Martin about 18 years ago. See [this post](https://www.telerik.com/blogs/why-solid-matters) for an in-depth discussion of SOLID principles.
**Single Responsibility Principle** - every method or class should have exactly one thing to do.  Code that does too much results in overly complex and fragile.  An extension of SRP is to make sure you don't instantiate an object from within a class, forcing the calling code to change if the type of class you need changes.
**Open/Close Principle** - a method or class should be open for extension - the ability to extend or change the functionality of a class without actually changing its internals, but closed to modification - cannot change a component in a way that violates the public interface, and as such, the Encapsulation rule.
**Liskov Substitution Principle** - creating substitutes (replacing an object with a type derived from it) for the code's dependencies which help keep tests isolated, and without breaking the application.
**Interface Segregation Principle** - clients should not be forced to rely on interfaces they do not use.  Use several smaller and more targeted interface that are specific to the business logic.  Avoid a large, bulky interface that satisfies all clients needs.
**Dependency Inversion Principle** - code should depend on abstractions, not concrete implementations, making coupling as loos as possible.  Write component dependencies so that they derive from a common ancestor so it won't know (or care) which specific component it's using. 

[**Day Six**](https://www.telerik.com/blogs/30-days-of-tdd-day-six-what-is-dependency-injection-) Dependency Injection - enables the creation of loosely coupled applications by deferring the binding of dependencies until runtime.  Additionally, we can specify dependencies as abstractions (Interfaces) by passing the class dependencies as constructor arguments, and actually bind to a concrete implementation that is based on that abstraction, thereby making the class dependent on abstractions and not concrete instances.

[**Day Seven**](https://www.telerik.com/blogs/30-days-of-tdd-day-seven-software-factories-and-di-frameworks) Software Factories and DI Frameworks - 
[Using an Interface as a Type](https://docs.oracle.com/javase/tutorial/java/IandI/interfaceAsType.html) - When you define a new interface, you are defining a new reference data type. You can use interface names anywhere you can use any other data type name. If you define a reference variable whose type is an interface, any object you assign to it must be an instance of a class that implements the interface.

DI Frameworks, such as Ninject, Structure Map and Microsoft Unity provide encapsulating creational patterns in efficient and manageable structures.  But these are for use with C#, and I am coding this tutorial in Java, so I will research and present some Java-oriented DI Frameworks to complete this part of this TDD tutorial.
