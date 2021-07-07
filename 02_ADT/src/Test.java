
public class Test {
	public static void main(String[] args) {
		Point myPoint = new Point();
		myPoint.setX(-1);
		myPoint.setY(3);
		printPoint(myPoint.getX(), myPoint.getY());
		myPoint.moveTo(2, -5);
		printPoint(myPoint.getX(), myPoint.getY());
		myPoint.scaleTo(-2);
		printPoint(myPoint.getX(), myPoint.getY());
		myPoint.scaleTo(2);
		printPoint(myPoint.getX(), myPoint.getY());
	}

	private static void printPoint(double x, double y) {
		System.out.println("ÇöÀç ÁÂÇ¥ : (" + x + ", " + y + ")");
	}

}
