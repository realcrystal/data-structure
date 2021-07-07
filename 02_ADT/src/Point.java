
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
		System.out.println("[move] x축으로 " + a + ", y축으로 " + b + "만큼 이동 완료 하였습니다.");
	}

	@Override
	public void scaleTo(double c) {
		if (c > 0) {
			x *= c;
			y *= c;
			System.out.println("[scale] 좌표에 " + (int) c + "배를 하였습니다.");
		} else {
			System.out.println("[Error] 입력하신 " + (int) c + "는 양수가 아니므로 조건이 어긋납니다.");
		}
	}

}
