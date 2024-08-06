package sosnujava;

public class sosnu {
	public static void main(String[] args) {
		String soluong = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println("The length of the txt string is: " + soluong.length());
		String viethoa = "Hello World";

		//
		System.out.println(viethoa.toUpperCase()); // Outputs "HELLO WORLD"
		System.out.println(viethoa.toLowerCase()); // Outputs "hello world"
		//
		String locate = "Please aloo aloo  where 'locate' occurs!";
		System.out.println(locate.indexOf("locate")); // Outputs 7 //
		// vi tri ke ca khoang trang

		String greeting = "Hello";
		System.out.println(greeting);
		// noi chuoi
		String n = "a";
		String c = "c";
		System.out.println(n.concat(c));
		String x = "10";
		int y = 20;
		String z = x + y; // z will be 1020 (a String)
		System.out.println(z);
	}
}
