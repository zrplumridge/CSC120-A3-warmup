public class ConversationIntro {

  /*
   *  Example A:  plusOne (warmup)
   *  To make sure everything it working, remove the comment
   *  from the line in the method below.  When you have done so,
   *  the program should be able to pass the first test.
   */
  
  /** Returns an integer one larger than its input */
  public int plusOne(int n) {
    n = n+1;
    return n;
  }

  /*
   *  Exercise 1:  timesTwo
   *  Here's a function similar to the one above.
   *  See if you can figure out how to make it work.
   */
  
  /** Returns an integer that is double its input */
  public int timesTwo(int n) {
    return n * 2;
  }

  /*
   *  Exercise 2:  squared
   */
  
  /** Returns the square of its input */
  public int squared(int n) {
    return n * n;
  }

  /*
   *  Exercise 3:  integer division
   */
  
  /** Divides its input by seven, dropping remainders */
  public int intDivideBy7(int n) {
    return n / 7;
    //don't need to specify integer division vs float division bc not ambiguous 
  }

  /*
   *  Exercise 4:  double precision floating point division
   */
  
  /** Divides its input by 7 */
  public double doubleDivideBy7(int n) {
    //need to convert integer to double w/o losing any precision
    double p = n;
    double m = p/7;
    return m;
  }

  /*
   *  Example B:  isPrime
   *  
   *  This function is completely written for you.
   *  Uncomment the loop to make it work, examining it as you do so.
   *  It contains an example of a loop, and also 
   *  the % operator, which computes the integer remainder
   */
  
  /** Returns true if its input is prime */
  public static boolean isPrime(int n) {
    boolean isPrime = (n > 1); // one, zero, and negatives not prime
    for (int i = 2; i <= Math.sqrt(n); i++) {
        if (n%i == 0) {
            isPrime = false;
        }
    }
    return isPrime;
  }

  /*
   *  Exercise 5:  isEven
   */
  
  /** Returns true if its input is even */
  public boolean isEven(int n) {
    /*if (n%2 == 0){
      return true;
    } else {
      return false;
    }*/

    //how can we shorted this even more?

    return(n%2 == 0);
  }

  // Returns true if its input is even
  // results of mod 2 can only be 0 or 1 BUT mod always returns a number
  public boolean isOdd (int n){
    return(n%2 == 1);
  }

  /*
   *  Example C:  isComma
   *  
   *  Now we move to string processing.
   *  This function is meant to perform a string comparison
   *  but as written it uses the wrong equality test for strings.
   *  Replace the comparison with the commented line to make 
   *  it work properly.
   */
  
  /** Returns true if its input is a comma */
  public boolean isComma(String s) {
    return s.equals(","); //asking about value
    //return (s == ","); //asking if stored in the same place in memory
  }

  /*
   *  Exercise 6:  isPunctuation
   */
  
  /** Returns true if its input is one of:  .,?! */
  /** yes I know there are much better ways to do this but I don't feel like it */
  public boolean isPunctuation(String s) {
    if (s.equals(".") || 
        s.equals(",") || 
        s.equals("?") || 
        s.equals("!")) {
      return true;
      /*
      if (s.length() != 1) {
        return false
      }
      return ".,?!".contains(s);*/
    }
    return false;
  }

  /*
   *  Exercise 7:  mirrorWord
   */
  
  /** Returns its input, unless it is "I" or "you", which switch */
  public String mirrorWord(String s) {
    if (s.equals("I")){
      return "you";
    } else if (s.equals("you")){
      return "I";
    }
    
    /*String newString;
    for (int i = 0; i < s.length(); i++){
      char c = s.charAt(i);
      char lookingFor = 'I';

      //replace function --> loops where replaces EVERYTHING

      //boolean contains(CharSequence s)

      //s is a constant so can't reassign a value to it
      if (s.contains('I')) {
        newString = s; //from 0 to i-1, then concatenate c, then i to s.length
      } else {
        //newString.append(s.charAt(i));
      }
    }*/
    return s;

    //equality is more robust than replace but split up words
  }

  /*
   *  Example D:  wholeNumbers
   *  
   *  This example shows the use of a loop to put
   *  values into an array.  Uncomment the loop to
   *  make the example work.
   */
  
  /** Returns an array of whole numbers up to n */
  public static int[] wholeNumbers(int n) {
    int[] arr = new int[n]; // allocate space for the array
    //for (int i = 0; i < n; i++) {
    //  arr[i] = i+1;
    //}
    return arr;
  }

  /*
   *  Exercise 7:  squares
   *  Write a loop here to match the description
   */
  
  /** Returns an array of squares from 1 to n*n */
  public static int[] squares(int n) {
    int[] arr = new int[n]; // allocate space for the array
    return arr;
  }
}
