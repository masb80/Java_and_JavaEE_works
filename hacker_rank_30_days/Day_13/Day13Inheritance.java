package hacker_rank_30_days.Day_13;

import java.util.Scanner;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
    int[] testScores;

   /*	
   *   Class Constructor
   *   
   *   @param firstName - A string denoting the Person's first name.
   *   @param lastName - A string denoting the Person's last name.
   *   @param id - An integer denoting the Person's ID number.
   *   @param scores - An array of integers denoting the Person's test scores.
   */
   // Write your constructor here
       Student(String firstName, String lastName, int idNumber, int[] scores){
       super(firstName, lastName,idNumber);
       
       this.testScores = scores;
   }  

   /*	
   *   Method Name: calculate
   *   @return A character denoting the grade.
   */
   // Write your method here
   public String calculate(){
         double total = 0;
       for(int i=0; i<testScores.length; i++){
           total = total + testScores[i];
       }
       double average  =0.0;
       if(testScores.length > 0){
           average = total / testScores.length;
       }
       String a ="";
       if(90 <= average && average <= 100){
           a = "O";
       } else if(80 <= average && average < 90){
           a = "E";
       }else if(70 <= average && average < 80){
           a = "A";
       }else if(55 <= average && average < 70){
           a = "P";
       }else if(40 <= average && average < 55){
           a = "D";
       }else if(average < 40){
           a = "T";
       }
       
       return a;
   }
   
}

public class Day13Inheritance  {
    public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
    
}
