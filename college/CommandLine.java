package college;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = args[0];
		String fname = args[1];
		int x,y;
		x= Integer.parseInt(args[2]);
		y= Integer.parseInt(args[3]);
		
		System.out.println("My name is :"+name);
		System.out.println("My friend's name is :"+fname);
		System.out.println("sum of given numbers is = "+(x+y));

	}

}
