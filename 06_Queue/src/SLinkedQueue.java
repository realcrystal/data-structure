public class SLinkedQueue implements Queue{

	private static class Node {
		Object object;
		Node next;

		Node(Object object, Node next) {
			this.object = object;
			this.next = next;
		}
	}

	private Node startNode;
	private int size;

	public SLinkedQueue() {
		startNode = null;
		size = 0;
	}

	public boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	public void add(int x) {
		if (startNode == null) {
			startNode = new Node(x, null);
		} else {
			Node p = startNode;
			while (p.next != null) {
				p = p.next;
			}
			p.next = new Node(x, null);
		}
		size++;
	}

	public void remove() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		startNode = startNode.next;
		size--;
	}

	public int first() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		return (int) startNode.object;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Singly Linked Queue = head");
		Node p = startNode;
		while (p != null) {
			sb.append(" -> " + p.object);
			p = p.next;
		}
		return sb.toString();
	}

	public ArrayQueue toArrayQueue() {
		System.out.println("[Change from SLinked_Q to Array_Q]");
		ArrayQueue aq = new ArrayQueue(size);
		Node p = startNode;
		while (p != null) {
			aq.add((int) p.object);
			p = p.next;
		}
		return aq;
	}

	@Override
	public int size() {
		return size;
	}
}
