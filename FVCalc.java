
public class FVCalc {
	public static void main(String[] args){
		double currentValue = Double.parseDouble(args[0]);
		double rate = Double.parseDouble(args[1]);
		int n = Integer.parseInt(args[2]);
		double newValue = (currentValue) * Math.pow(1 + (rate/100), n);
		System.out.println("After " + n + " years, a $" + (int)currentValue + " saved at " + rate + "% will yield $" + (int)newValue);
	}
}


