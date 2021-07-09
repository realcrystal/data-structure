
public class LinkedStack implements Stack {

	private Node top;

	public boolean isEmpty() {
		return top == null ? true : false;
	}

	@Override
	public Object peek() {
		if (top == null)
			throw new java.util.NoSuchElementException();
		return top.object;
	}

	@Override
	public Object pop() {
		if (top == null)
			throw new java.util.NoSuchElementException();
		Object oldTop = top.object;
		top = top.next;
		return oldTop;
	}

	@Override
	public void push(Object object) {
		top = new Node(object, top);
	}

	public String toString() {
		if (top == null)
			throw new java.util.NoSuchElementException();
		StringBuilder sb = new StringBuilder("Current Elements of Stack : top");
		Node p = top;
		while (p != null) {
			sb.append(" -> " + p.object);
			p = p.next;
		}
		return sb.toString();
	}

	public void removeSecond() {
		if (top == null || top.next == null)
			throw new java.util.NoSuchElementException();
		top.next = top.next.next;
	}

	public void reverse() {
		if (top == null)
			throw new java.util.NoSuchElementException();
		Node p = top;
		Node prev = null;
		Node next = top.next;
		p.next = prev;
		while (next != null) {
			prev = p;
			p = next;
			next = p.next;
			p.next = prev;
		}
		top = p;
	}

	private static class Node {
		Object object;
		Node next;

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}
}
