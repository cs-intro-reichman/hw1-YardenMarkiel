// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {
	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		Double price = Double.parseDouble(args[3]);
		Double splitPrice = price / 3;
		splitPrice = Math.ceil(splitPrice);
		System.out.println("Dear " + name3  + ", "+ name2 + ", and " + name1 + ": pay " + splitPrice + " Shekels each");
	}
}
