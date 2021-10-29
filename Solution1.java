public class Solution1 {

    //Upvotes vs Downvotes
	//Given an object containing counts of both upvotes and downvotes, return what vote count should be displayed. This is calculated by subtracting the number of downvotes from upvotes.

	public static int getVoteCount(int upvotes,int downvotes) {
		return upvotes - downvotes;
	}
	//Find the Perimeter of Rectangle
	//Create a function that takes length and width and finds the perimeter of a rectangle.

	public static int findPerimeter(int length, int width) {
		return 2*(width + length);

	}

	//Power Calculator
	//Create a function that takes voltage and current and returns the calculated power.
	public static int power(int voltage, int current) {
		return voltage * current;
	}

	//Is the Number Less than or Equal to Zero?
	//Create a method that takes an integer as its only argument and returns true if it's less than or equal to zero, otherwise return false.
	public static boolean lessThanOrEqualToZero(int num) {
      
		/*if(num <= 0){
			return true;
		} else {
			return false;
		} */
		return num <= 0;
    }

	//



}