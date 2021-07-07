
public class LinkedList {
	private Node startNode;
	private int size;

	public LinkedList() {
		startNode = new Node();
		size = 0;
	}

	public void insertLast(int x) {
		Node i = startNode;
		while (i.next() != null) {
			i = i.next();
		}
		Node node = new Node(x);
		i.setNext(node);
		size++;
	}

	public void insertFirst(int x) {
		Node node = new Node(x, startNode.next());
		startNode.setNext(node);
		size++;
	}

	public boolean contain(int x) {
		Node i = startNode;
		while (i.next() != null) {
			i = i.next();
			if(i.getValue() == x) return true;
		}
		return false;
	}

	public void print() {
		if (size < 1) {
			System.out.println("List is empty!");
		} else {
			System.out.print("List :");
			Node i = startNode;
			while (i.next() != null) {
				i = i.next();
				System.out.print(" " + i.getValue());
			}
			System.out.println();
		}
	}

}
