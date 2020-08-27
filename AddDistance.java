package Oops_Practise_Exercise_1;
/*Exercise - 9
Write a program to Add two distances in inch-feet by creating a class named 'AddDistance'.
*/
public class AddDistance {
	public static void main(String[] args){
		try
		{
			Distance distaneOne=new Distance();
			Distance distanceTwo=new Distance();
			Distance distanceThree=new Distance();
			
			//read first distance
			System.out.println("Enter first distance: ");
			distaneOne.getDistance();
			
			//read second distance
			System.out.println("Enter second distance: ");
			distanceTwo.getDistance();
			
			//add distances
			distanceThree.addDistance(distaneOne,distanceTwo);
			//print distance
			System.out.println("Total distance is:" );
			distanceThree.showDistance();
		}
		catch (Exception e)
		{
			System.out.println("Exception occurred :"+ e.toString());
		}
	}
}
