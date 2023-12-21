/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class Gen3 {
	public static void main(String[] args) {
	int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int x = (int)((b - a) * Math.random() + a);
		int y = (int)((b - a) * Math.random() + a);
		int z = (int)((b - a) * Math.random() + a);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		int minimal = Math.min(x, y);
		minimal = Math.min(minimal, z);
		System.out.println("The minimal generated number was " + minimal);
		
	}
}
