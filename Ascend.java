
import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		Random random = new Random();
		int lim =  Integer.parseInt(args[0]);
		int x1 = random.nextInt(lim+1);
		int x2 = random.nextInt(lim+1);
		int x3 = random.nextInt(lim+1);
		int sum = x1 + x2 + x3;
		int minNum = Math.min(x1, x2);
		minNum= Math.min(minNum, x3);
		int maxNum = Math.max(x1, x2);
		maxNum = Math.max(maxNum, x3);
		int middleNum = sum - (maxNum + minNum);
		System.out.println(minNum + " " + middleNum + " " + maxNum);
	}
}
