
public class BigInt {
	private Node start;

	private static class Node {
		int digit;
		Node next;

		Node(int digit) {
			this.digit = digit;
			this.next = null;
		}
	}

	public BigInt(int n) {
		if (n < 0)
			throw new IllegalArgumentException(n + " < 0");
		start = new Node(n % 10);
		Node p = start;
		n /= 10;
		while (n > 0) {
			p = p.next = new Node(n % 10);
			n /= 10;
		}
	}

	public String toString() {
		StringBuffer sb = new StringBuffer(Integer.toString(start.digit));
		Node p = start.next;
		while (p != null) {
			sb.insert(0, Integer.toString(p.digit));
			p = p.next;
		}
		return sb.toString();
	}

	public BigInt plus(BigInt y) {
		Node p = start;
		Node q = y.start;
		int n = p.digit + q.digit;
		BigInt z = new BigInt(n % 10);
		Node r = z.start;
		p = p.next;
		q = q.next;

		while (p != null && q != null) {
			n = n / 10 + p.digit + q.digit;
			r.next = new Node(n % 10);
			p = p.next;
			q = q.next;
			r = r.next;
		}
		while (p != null) {
			n = n / 10 + p.digit;
			r.next = new Node(n % 10);
			p = p.next;
			r = r.next;
		}
		while (q != null) {
			n = n / 10 + q.digit;
			r.next = new Node(n % 10);
			q = q.next;
			r = r.next;
		}
		if (n > 9)
			r.next = new Node(n / 10);

		return z;
	}

	public BigInt multiplyOne(BigInt x) {
		Node p = start;
		int a = p.digit;
		int b = x.start.digit;

		int c = a * b;
		BigInt result = new BigInt(c % 10);
		Node q = result.start;
		p = p.next;
		while (p != null) {
			a = p.digit;
			c = c / 10 + a * b;
			q = q.next = new Node(c % 10);
			p = p.next;
		}
		if (c > 9) {
			q.next = new Node(c / 10);
		}
		
		return result;
	}
	
	public BigInt multiply(BigInt x) {
		Node p = x.start;
		BigInt temp = new BigInt(p.digit);
		BigInt result = this.multiplyOne(temp);
		int count = 1;
		p = p.next;
		while(p!= null) {
			temp = new BigInt(p.digit);
			BigInt temp2 = this.multiplyOne(temp);
			for(int i = 0; i < count; i++) {
				Node zero = new Node(0);
				zero.next = temp2.start;
				temp2.start = zero;
			}
			result = result.plus(temp2);
			p = p.next;
			count++;
		}
		
		return result;
	}
}
