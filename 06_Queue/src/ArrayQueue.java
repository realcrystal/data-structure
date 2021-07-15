public class ArrayQueue implements Queue {

	private int capacity;
	private int[] array;
	private int size;
	private int front;
	private int rear;

	public ArrayQueue(int capacity) {
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
		front = -1;
		rear = -1;
	}

	public void add(int x) {
		if (size == array.length) {

		} else {
			array[++rear] = x;
			size++;
		}
	}

	public void remove() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		array[++front] = -1;
		size--;
//			System.arraycopy(array, 1, array, 0, --size);
	}

	public int first() {
		if (size == 0) {
			throw new java.util.NoSuchElementException();
		}
		return array[front + 1];
	}

	public boolean isEmpty() {
		if (size == 0)
			return true;
		return false;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Array Queue = [ ");
		for (int i = 0; i <= rear; i++) {
			if (array[i] == -1) {
				sb.append("null ");
			} else {
				sb.append(array[i] + " ");
			}

			if (i != rear) {
				sb.append("| ");
			} else {
				sb.append("] ");
			}
		}
		sb.append("(front: " + front + ", rear: " + rear + ")");
		return sb.toString();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

}
