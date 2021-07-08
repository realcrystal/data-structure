
public class Test {
	public static void main(String[] args) {

		BigInt x = new BigInt(54321);
		BigInt y = new BigInt(8888);
		System.out.println("[ x : " + x.toString() + ", y : " + y.toString() + " ]");
		System.out.println(" - x.multiply(y) = "+x.multiply(y).toString());
		x = new BigInt(8888);
		y = new BigInt(54321);
		System.out.println("[ x : " + x.toString() + ", y : " + y.toString() + " ]");
		System.out.println(" - x.multiply(y) = "+x.multiply(y).toString());
		
		x.multiply(y);
	}
}
