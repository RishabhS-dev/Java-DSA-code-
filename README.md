# Java-DSA-code-

# TOPICS COVERED
Linked List - singly doubly circular
Stack and Queue - array and linked list
Recursion
Trees - binary , general , n-arr

# NOTES
(some written in notebook)
Binary search tree

1. binary tree
2. All nodes in left subtree is less than the root node and all nodes in right subtree greater than the root node
3. all nodes in left and right u=subtree should follow the same
operations:
insert delete search traverse

very important point

ternary search- unimodal function is a function that has exactly one peak (maximum) or one valley (minimum).
This means the function:

Increases up to a single highest point

Then decreases

| Situation                                                    | Best Algorithm |
| ------------------------------------------------------------ | -------------- |
| List is unsorted                                             | Linear search  |
| List is sorted                                               | Binary search  |
| Searching for **maximum/minimum** of a **unimodal** function | Ternary search |


| Type       | Shape                  | Good for Ternary Search? |
| ---------- | ---------------------- | ------------------------ |
| Unimodal   | One peak or valley     | ✔ Yes                    |
| Multimodal | Multiple peaks/valleys | ❌ No                     |


# Phase1 notes
.java notes

10-1 + 10-2
9+8

# React 
to install react 
install node 
npx create-react-app

three parts of react

component 
props(properties is nothing but key values)
state(storage) - react hooks

router-dom - to navigate between pages


...

SPA -  single page application eg yt
MPA - multipage application eg - amazon

lazy loading - based on percentage of net the image will be shown .. in normal loading it shows only when its 100%


# Components
1. functional
2. class only have state




// import { Component } from "react";

// class App extends Component {

//   state = { count: 0 };

//   increment = () => {
//     if (this.state.count < 10) {
//       this.setState(prevState => ({
//         count: prevState.count + 1
//       }));
//     }
//   };

//   decrement = () => {
//     if (this.state.count > -10) {
//       this.setState(prevState => ({
//         count: prevState.count - 1
//       }));
//     }
//   };
  
//   Reseted = () => {
//     this.setState({
//       count: 0
//     });
//   };

//   render() {
//     const { count } = this.state;
//     return (
//       <>
//         <h1>
//           {count}
//         </h1>
//         <button onClick={this.increment}>
//           +
//         </button>
//         <button onClick={this.decrement}>
//           -
//         </button>
//         <button onClick={this.Reseted}>
//           Reset
//         </button>
//       </>
//     );
//   }
// }

// export default App;


// for navigation vbetween pages ----> npm i react-router-dom

dont use anchor taG in react js strictly saying use link instead

# ARRAYS
Arrays.toString(arrayname) to convert array to string 

dataType[] arrayName =new dataType[size]

int[] arr;
arr = new int[3];

String literals 

a string literals is a value which I enclosed in double quotes("").in java string literal us created by using double quotes

string str - "abc";
here abc is a string literal which Is assigned to the variable str.

comparing strings 

using equality (==) operator
using equals() method
using equalsignoreCase() method
using compareto()method
using comparetoignorecase()method

s1.toLowerCase() - ti cinvert all letters in lowercase


# Object Oriented Programming
oops in java

oops is a way of writing programs where everything revolves around objects just like the real world

java is a pure object-oriented language which means everythin in java is designed around classes and objects.

class is nothing but a blueprint of object 
something made of blueprint is object ( instance of the class )[real world entity]

public class Obj {
   class Car{
    string brand;
    void drive(){
        System.out.println("Car is driving");
    }
   } 

   Car myCar = new Car();
   myCar.brand = "toyata";
   myCar.drive();
}


# SYNTAX OF CREATING AN OBJECT

ClassName obj = new ClassName(args)

args indicates the arguments ( csv) sent ti the constructor

we use contructor to initialize the value


constructor is a special method which is invoked automatically when instantiated
name should be same as class name , and doestn have any return type ,, if we don't have any contructor java will automatically create one

destructor - called when object is delted from memory __del


public class Main{
public static void main(string[] args){
Student s1 = new Student();
s1.name = "alex";
s1.age = 20;
s1.study();
}
}


# ACCESS MODIFIER
this are the keywords that set access levels when used with the classes methods constructors attributes etc
its keeps some type of security 

private - accessible only within the declared class

syntax - private static dataType attributeName;

default(not in python) - access level of a protected modifier is up to the class/subclass of the same package. it cannot be accessed from outside of the package.(there is no keyword for this)

protected - the access level is up to the class/subclass of the same package and also to different package through the subclass. a subclass is required to access it from a different package.

when an attribute is declared as protected, it means that it is accessible to the class/subclass of the same package and subclass of other packages.

public - the access level of a public modifier is everywhere in the program



# inheritance 
takes wealth from parents as an example is form of inheritance

types 
hierarchial inheritance - single parent multiple child




upcasting - Upcasting is the process of converting a subclass object to a superclass reference
in java a super class refernce variable can be used to refer to its subclass object i.e, we can specify a superclass as a type while creating an object of its superclass variabale is called upcasting

in this case we can access all the members of the superclass but can only access a few members like overriding methods of the subclass


Method Overriding
allows a subclass to provide a specific implementation of a method that its superclass already provides

the super keyword
the super keyword in java used to access the superclass members like attributes method and also the constructors inside the subclass
ysed ysing super keyword

rules of method overriding
constructor can not be overridden
overriding method should have the same return type and parameters


final method cannt be overridden

the final keyword can be used for method also a method declared with final is called final method


# polymorphism 

entity having many forms 
refers to an object,s capacity to take several forms 
polymorphism allows us to perform the same action in multiple ways in java

type of polymorphism 
run time - method overriding
compile time - method overloading

# Abstraction

abstraction I process of hiding imp information and showing only the useful stuff 

abstract Abstractclass{
}

An interface defines a contract of methods that a class must implement, focusing on what a class can do, while an abstract class is a blueprint that can provide some implementation and common state for related classes, focusing on a shared "is-a" relationship. Key differences include that a class can implement multiple interfaces but only extend one abstract class, abstract classes can have concrete methods and instance variables, and interfaces can only have method signatures and constants.  
Interface
Purpose: Defines a contract for behavior; what a class can do. 
Methods: Primarily contains method signatures. Methods are public and abstract by default. Modern versions may allow default method implementations. 
Variables: Can only have public static final constant variables; it cannot have instance variables or state. 
Relationship: A class can implement multiple interfaces, establishing a behavior or role. 
Inheritance: Can inherit from other interfaces. 
Abstract Class
Purpose: Provides a common base class for related classes, sharing both common behavior and state. 
Methods: Can contain both abstract methods (without implementation) and concrete methods (with implementation). 
Variables: Can have instance variables, including final, non-final, static, and non-static ones. 
Relationship: Represents an "is-a" relationship; it provides a partial implementation for a base type. 
Inheritance: A class can only extend one abstract class. 
When to use which
Use an interface when you want to define a contract for classes that might not be closely related, or when you want to define a behavior that multiple, unrelated classes can share. It's useful for polymorphism and swapping implementations (e.g., List interface with ArrayList or LinkedList implementations). 
Use an abstract class when you want to provide a base class with a mix of common, non-abstract methods and shared state to a group of closely related classes. An abstract class is useful when you want to enforce a common structure while still providing some default functionality to subclasses. 




abstract returnType methodName();

abstract class Vehicle{
abstract void start();
abstract void stop();
}

the implementation of the abstract method should be provided by its subclasses.



note : abstract method can not be instantiated


class Car extends Vehicle{
void start(){
System.out.println("Car Started");
};

void stop(){
System.out.println("Car stopped");
};
}

# Interview Points

Interview question format

any interview first excuse may I come in then greet them
  if they asked u tell me about urself


knwo about compnay first 
(like in depth)


tell me about urself:
as uk my name is Rishabh, where I am from then education I am currently pursuing my btech cse and I ve been intrested in these topics , technologies [MERN stack abhi jyada use hai] project then hobbies ( don't ever say reading books they might ask u about naME of author , novel or comic category how many books have u read from this hooby) soch samjh kar muh kholna hai , then while telling about project tell what u achieved in ur program then how u do it lot of questions even if u dk u should be able to handle it say only terms which u only know

prepare company specific resume
say something with full confidence 

if there is clash 
accept is positively sorry sir maybe I have been misguided 

be POSITIVE

they see listening skills then speaking ask doubts and questions IF U HAVE in technical questions ask them example or sometimes multiple time if u have didn't understand question

they are there to hire just be ready to be hired 

while solving question walkthrough it by speaking cuz interviewer will help u

do first brute force approach and then optimizr it directly optimize na he will think u just copied from mind 

in offcampus don't ever say new to language 

IN ON CMAPUS I FOUND INTRESTING IN UR COMPANY SO I UPSKILLED MY COMPANY AND THEN PRASIE THE COMPANY CUZ OF UR COMAPNY I AM LEARNING ALL THSI STUFF 

AT END OF INTERVIEW U CAN ASK LIKE 
WHAT ARE THE DAILY LIFE ROUTINE LOOKS LIKE / ROLE / TOOLS REQ FOR THE ROLE WHICH I can learn for the role in ur company

NEVER SWITCH ON UR ANSWERS


if u say anything worng don't get stuck keep going on take pauses and speak

based on language oops concepts changes
encapsulation vs abstaraction 
abstaraction vs interfaces

array vs vector
array vs array list


interface Is blueprint of class

python there is no interface
