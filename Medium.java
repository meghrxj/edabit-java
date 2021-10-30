public class Medium {

    //solutions

    //How Many Solutions Does This Quadratic Have?

    public static int solutions(int a, int b, int c) {
		int sol = b*b - 4 * a * c;
		if(sol > 0) return 2;
		else if(sol == 0) return 1;
		else return 0;
  }
  
}
