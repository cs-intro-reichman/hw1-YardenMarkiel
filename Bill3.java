// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
		// To get you started, here is the first line in the program:
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		Double price = Double.parseDouble(args[3]);
		Double splitPrice = price / 3;
		splitPrice = Math.ceil(splitPrice);
		System.out.println("Dear " + name1  + ","+ name2 + " and " + name3 + " pay " + splitPrice + "shekels each");
	    // Replace this comment with the rest of your code   
	}
}
