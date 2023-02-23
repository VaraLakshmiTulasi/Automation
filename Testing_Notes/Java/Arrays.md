*Arrays*:
  Arrays are non primitive datatypes,it is used to store a set of elements of same type as units.

*Types of Arrays*:
a.Single Dimentional Array
b.Multi Dementional Array

*Single Dimentional Array*:
     It will store linear set of elements .
*Syntax*:
   datatype[] arrayname=new datatype[size];
   ex1:
      int[] a=new int[5];->Declaration
      a[0]=10; ->Initialization
      a[1]=20; -> Initialization
      a[2]=30; ->Initialization 
      a[3]=40; ->Initialization
      a[4]=50; -.Initialization
    ex2:
    int[] a={10,20,30,40,50}; ->Declaration+Initialization 

*for each loop*:
       It is used to another way to display of elements in array.
 *Syntax*:
    for(datatype variable : source)
    {
        //statements
    } 

 *Note*:
    To copy the elements one array to another array we have 2 methods.
  a.clone():
        It is used to copy all elements of one array into another array.
  b.arraycopy():
        It is used to copy specific elements of one array into another array
    syntax:
     system.arraycopy(source array,source index,destination array,destination index,number of elements) ;                   