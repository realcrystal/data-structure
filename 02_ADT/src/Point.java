
public class Point implements ADTPoint {

	private double x;
	private double y;

	@Override
	public double getX() {
		return x;
	}

	@Override
	public void setX(double x) {
		this.x = x;
	}

	@Override
	public double getY() {
		return y;
	}

	@Override
	public void setY(double y) {
		this.y = y;
	}

	@Override
	public void moveTo(double a, double b) {
		x += a;
		y += b;
		System.out.println("[move] x������ " + a + ", y������ " + b + "��ŭ �̵� �Ϸ� �Ͽ����ϴ�.");
	}

	@Override
	public void scaleTo(double c) {
		if (c > 0) {
			x *= c;
			y *= c;
			System.out.println("[scale] ��ǥ�� " + (int) c + "�踦 �Ͽ����ϴ�.");
		} else {
			System.out.println("[Error] �Է��Ͻ� " + (int) c + "�� ����� �ƴϹǷ� ������ ��߳��ϴ�.");
		}
	}

}
