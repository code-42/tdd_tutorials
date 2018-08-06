# 30 Days of TDD: Day One – What is TDD and Why Should I Use It?
## a blog by James Bender
##### https://www.telerik.com/blogs/30-days-tdd-day-one-what-is-tdd   

**My goal** for this tutorial is to go from "I can barely spell TDD" to being able to confidently consider myself a "functional" TDD developer.

This TDD blog/tutorial is presented in C# and I am translating it to Java.  The author uses Visual Studio, along with tools like NUnit, DevCraft, JustCode and JustMock.  I am following along using Eclipse and JUnit.  You can follow my progress in my [GitHub repo](https://github.com/code-42/tdd_tutorials/tree/master/30DaysOfTDD/UnitTests/net/ed).



Along the way, I will be documenting how to implement C# concepts such as Assert.AreEqual() and String ToCharArray() into their Java equivalents.  Although this may seem trivial, it is not, for a beginner like me.  But, this exercise will surely help push me from beginner to intermediate level programmer.

**Day Two** presents a concise overview of OOP and the three major tenets: Encapsulation, Inheritance and Polymorphism.  I don't know why he does not consider Abstraction to be one of OOP's major tenets, but he does a good job of summarizing OOP in a few short paragraphs with examples.

**Day Three** starts out setting the stage: gathering requirements and defining the expectations of what problem we are attempting to solve and how best to solve it.  Our requirement for this sample is:

> “Create a library method that takes in a sentence and a single character as parameters. The method should return a number that indicates how many times the character appears in the sentence.”

Bender goes on to present the **Arrange, Act and Assert pattern** for writing unit tests.  This pattern allows us to take a complicated problem and reducing it to a few (somewhat) simple steps.

**Day Four** implements the method under test.  Create a class StringUtils and define a method FindNumberOfOccurences(String sentenceToScan, String characterToScanFor).  