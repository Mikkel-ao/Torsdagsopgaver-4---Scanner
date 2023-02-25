### Exercises with Scanner 
Today's tasks should be coded using a text editor. For each Task you will create a new folder and start by adding a Main class with a main method (except for Task 2). 
In task 2 you will write all the code in this main method, while in 1 and 4 you will be asked to make both a Main class with a main method in it (sometimes refered to as the "client class") and an "entity class" whithout a main method but with a constructor. 

NOTE: Task 5 is a continuation of Task 4. There are many small steps and you might loose track. Follow the steps as far as you can. Use the hints and codesnippets provided. The goal is to prepare yourself for review, where we will code it together. 

---
## Task 1:
1.a Create a class Main with a main method.

1.b Create an entity class called Team

1.c Add a private instance variable a.k.a attribute to Team to hold the team name

1.d Add another private instance variable to save the Teams rank (some number)

1.e Add yet another private instance variable to save the names of players in the team 

1.f Add a constructor with a parameter, so that the Team can be instantiated with a team name. Make sure the parameter value is assigned to the mathcing instance variable.
<details>
  <summary>Hint</summary>
  <p><code>public Team(String teamName)</code></p>
</details>

1.g From the main method in the Main class, create an instance of the Team class (instantiate the Team class).

1.h In the Team class add a method called <code>setRank</code> that takes a number and assigns it the the rank attribute.

1.i From the main method, call the method setRank on the instance of Team you created in step 1.g with a number of your choice.

1.j In the Team class add a toString method that returns a String formated like this:

"Hold navn: De Uovervindelige
Rang: 3" 

(Precise wording depening ofcourse on the name and rank of the Team instance you have created in step 1.g)

1.k From the main method, print the instance you created in step 1.g


## Task 2: Scanner basics: calculate years to retirement 
This task will require you to use the Scanner type, to get some data from the user. One of the inputs you will use in a simple calculation, that will tell the use how many years they will have to work they can retire.

2.a: create a Main class with a main method.

2.b: In the main method start by printing a message to the user: "Please type your name".

2.c: Instantiate (create) a Scanner object for reading the command line (remember to import the Scanner class from the util library: <code>import java.util.Scanner; </code>)
<details>
  <summary>Hint</summary>
  <p><code>Scanner scanner = new Scanner(System.in);</code></p>
</details>
2.d: Declare a String variable, <code>name</code> and assign the content of the scanner to it.
<details>
  <summary>Hint</summary>
  <p><code>String input =  scanner.nextLine();</code></p>
</details>

2.e: Print the value the user writes (print the <code>input</code> variable)

2.f: Print another message to the user: "Please type your age"

2.g: Declare another variable of type int, <code>age</code> and assign the content of the scanner to it (you may reuse the Scanner object created in 2.c).

2.h: Print the value the user writes (print the <code>age</code> variable)

2.i: Declare a third variable of type int. To this variable, assign the calculated number of years until the user can retire. You may assume retirement starts at 67 years. Print the result

---

## Task 3: Finish the GuessANumber class
3.a Open the java file above called GuessANumber.java and try to finish the code. Follow the steps written as comments in the <code>makeAGuess</code> method. Recursion is mentioned. This means that the method must call itself.
<details>
  <summary>Not sure about recursion?</summary>
  <p><a href="https://www.geeksforgeeks.org/recursion-in-java/">Read about it here</a></p>
</details>
---

## Task 4. Textbased menu for a game
In this program the user is presented with a list of actions. When he types a number associated with an action, the program will print a response that corresponds to that action.

4.a Create an entity class, Menu.

4.b Add a private attribute, 'options' of type ArrayList to the class.

4.c Add a constructor with a parameter of type ArrayList. This is so that the Menu class can be instantiated with a list of menuitems (options).  

4.d In the contructor, assign the list received, to the 'options' attribute. 

4.e Create a client class, Main with a main method. (You will use this class to test the Menu class) after the next step.

4.f In the main method create an ArrayList of type String called <code>options</code>. Don't forget to import the class. Add the following String values to the <code>options</code> ArrayList:
+ "1) Start game"
+ "2) Resume game"
+ "3) Pause game"
+ "4) End game"

<details>
  <summary>Tip for testing:</summary>
You can test the options ArrayList by printing one of the elements:

<code>
System.out.print(options.get(2)) // expected output: "Pause game"
</code>
</details>

4.g Still in the main method, instantiate the Menu class with the options reference as an argument to the constructor. 


## Task 5:
We will continue with the code you produced in task 4. Now we want to make it possible for a user to select an option in the menu. 

5.a Create a method in the Menu class, <code>showMenu</code> that prints the sentence "Type a number to choose" and then prints each element in the <code>options</code> attribute. 
 <details>
  <summary>Hint</summary>
  <p>use a <code>for-each</code>loop for printing the options
  </p>
</details>

5.b Still in the <code>showMenu</code> method, create a new Scanner object. Declare a variable <code>String choice</code> and assign it the user's input. (Similar to what you did in step 2.c and 2.d)

<details>
  <summary>Solution to this step</summary>
  <p>
    <code>
    Scanner scanner = new Scanner(System.in);
    String choice = scanner.nextLine();
</code>
</p>
</details>

5.c Let the <code>showMenu</code> method return the user's choice. If the method has void as return type, change that to return type String. Then return the choice variable you declared in step 5.c 

5.d Create a method in the Main class, for testing that the user dialog in the Menu class works as expected. The method should have this signature: <code>public static void doAction(int action)</code>. The <code> int action </code> parameter represents the user's choice of action. 

5.e In the body of the <code>doAction</code> method, write a <code>switch-case</code> with a case for each of the 4 options added in step 4.f. In each case block you will print a message that corresponds to the user's choice:
   + 1: "Starting the game now"
   + 2: "Fetching previously saved game data"
   + 3: "Game paused"
   + 4: "Ending game"


5.f In the main method, call the <code>showMenu</code> -method on the Menu instance, saving the return value (the user response) in a variable. 
<details>
  <summary>Peep solution</summary>
  <p>
    <code>
    String userChoice = showMenu();
</code>
</p>
</details>

5.g Convert the value to an int before using it as an argument in a call to the <code>doAction</code> method in the you created in step 5.d and 5.e
<details>
  <summary>hint</summary>
  <p>
    <code>
    Integer.parseInt()
</code>
</p>
</details>





