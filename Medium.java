//packages
//import java.util.*;


public class Medium {

    //solutions

    //How Many Solutions Does This Quadratic Have?
    public static int solutions(int a, int b, int c) {
		int sol = b*b - 4 * a * c;
		if(sol > 0) return 2;
		else if(sol == 0) return 1;
		else return 0;
  }
    //Array of Multiples - Caleb miller
	public static int[] arrayOfMultiples(int num, int length) {
		int[] array = new int[length];
		for (int i = 0; i < length; ++i) {
			array[i] = num * (i+1);
		}
		return array;
	}
}
