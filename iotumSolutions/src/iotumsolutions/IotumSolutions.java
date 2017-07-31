/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iotumsolutions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author user1
 */
public class IotumSolutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Question 1: ");
        multiplesOfThreeAndFive();
        System.out.println("\nQuestion 2: ");
        evenIntegers(10);
        System.out.println("Question 4: ");
        removeDuplicates();
    }

    /**
     * Written by Kleanthi Tupe, July 2017
     * The function for the Question 1
     * function that prints the numbers from 1 to 100. But for multiples of three print “Foo” instead of the number
     * and for the multiples of five print “Bar”. For numbers which are multiples of both three and five print “FooBar”
     */
    public static void multiplesOfThreeAndFive(){
        //My approach to this was to check if the remainder is 0 when the number is divided by 3 or 5
        for (int i = 1; i<=100; i++){
            //use the modulus operator to check if number is a multiple of both 3 and 5 (initial condition), and print FooBar if true
            if (i%3 == 0 && i%5 == 0){
                System.out.print("FooBar ");
            }else if(i%3 == 0){     //then check if it's a multiple of 3 and print Foo if condition is true
                System.out.print("Foo ");
            }else if(i%5 == 0){     //then check if it's a multiple of 5 and print Bar if condition is true
                System.out.print("Bar ");
            }else{  //if none of the above conditions are true, then print the number itself
                System.out.print(i + " ");
            }
        }
    }

    /**
     * Written by Kleanthi Tupe, July 2017
     * The function for the Question 2
     * @param n
     * Function that determines the number of even numbers that appear in a range of integers 0..n,
     * where n is supplied as the sole argument to the function
     */
    public static void evenIntegers(int n){
        // iterate through the numbers and check if the remainder of each number divided by 2 is zero
        // if condition is true, then increase the variable count by 1
        int count = 0; // variable that will keep the count of positive matches found, initialize to 0
        for (int i=0; i<=n; i++){
           if (i%2 == 0){
               count++;
           }
        }
        // after the loop is finished, print variable count to the console
        System.out.println(count);
    }

    /**
     * Written by Kleanthi Tupe, July 2017
     * The function for the Question 4
     * Given: words = ['one', 'one', 'two', 'three', 'three', 'two']
     *  Remove the duplicates.
     */
    public static void removeDuplicates(){
        // Declare the array with the duplicates, and an ArrayList where to copy the unique values
        // If the array was larger it would be better to sort first, fo faster searching
        // but in this case the array is not large
        String[] words = {"one", "one", "two", "three", "three", "two"};
        String temp = "";
        List<String> duplicatesRemoved = new ArrayList<>();
        // iterate through the array, and set temp to each element of the array
        for(int i = 0; i<words.length; i++){
            temp = words[i];

            if (!"".equals(temp)) {
                // if the temp is not equal to an empty string, then add it to the new ArrayList duplicatesRemoved
                duplicatesRemoved.add(words[i]);
                // then iterate through the remainding part of the array to see if there's any duplicates,
                // and set those elements to "", so that we don't have to search through them again
                // this way we lower run time
                for (int j = i + 1; j < words.length; j++) {
                    if (temp.equals(words[j])) {
                        words[j] = "";
                    }
                }
            }
        }
        // iterate through the new non duplicate-elements array and print its elements
        for (int i = 0; i<duplicatesRemoved.size(); i++){
            System.out.println(duplicatesRemoved.get(i));
        }
    }
}
