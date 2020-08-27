package Oops_Practise_Exercise_1;
/*Exercise - 6
Create a class named Average
    • Include a static method named avg, which takes two integers as parameters and returns a double as average.
    • Include an overloaded static method avg, which takes three integers as parameters and returns a double as average
    • Include an overloaded static method named avg, which takes two doubles as parameters and returns a double as average
Create a class TestAverage with a main method.
    • Test all the avg overloaded methods
*/
public class Average {
	public static double avg(int valueOne,int valueTwo){
		double avg=(valueOne+valueTwo)/2;
		return avg;
	}
	public static double avg(int valueOne,int valueTwo,int valueThree){
		double avg=(valueOne+valueTwo+valueThree)/3;
		return avg;
	}
	public static double avg(double valueOne,double valueTwo){
		double avg=(valueOne+valueTwo)/2;
		return avg;
	}
}
