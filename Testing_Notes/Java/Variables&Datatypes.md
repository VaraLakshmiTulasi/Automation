Variables:
 Variable is a named memory location where we can store the data temperarly.
 Ex:
 int i=6; //Declaration & Initialization
 int j;  // Declaration
 j=7;    //Initialization
Note: In Java without Initialization not able perform operations.

Variable Types:
a.Local Variables
b.Instance Variables
c.Static Variables

Here we can took variables inputs in two types:
a.We can given variables(Inputs) could be given in design time(we can provide input values @ code designing).
b.We can be provided inputs by runtime(we can provide inputs after running the code)->By using scanner.

Example structure of reusability of program
a.Import the package
   ex: import java.util.Scanner;
b.Create an instance of the class called object.
   ex: Scanner sc=new Scanner(System.in)   
c.Call the related method using the object.
 i.next(): Used to accept string data in the form of 'word' as input.
        ex:String str=sc.next();
 ii.nextLine(): Used to accept string data in the form of 'sentence' as input.      
        ex:String str=sc.nextLine();
 iii.nextInt(): Used to accept numeric data of integer as input. 
        ex: int n=sc.nextInt();
  iv.nextDouble(): Used to accept numeric data of float-point type as input.
        ex: double d=sc.nextDouble();              