package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static String FizzBuzz(int a){
        String Output = " ";
        if (a%3==0 && a%5==0)
            Output = "FizzBuzz";
        else if(a%3==0)
            Output = "Fizz";
        else if (a%5==0)
            Output="Buzz";
        else
            Output = String.valueOf(a);
        return Output;
    }
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
