import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {
	ArrayQueue arrayQueue = new ArrayQueue(10);
	SLinkedQueue sLinkedQueue = new SLinkedQueue();

	@Test
	void test() {
		for (int i = 1; i <= 5; i++) {
			arrayQueue.add(i);
		}
		String result = "Array Queue = [ 1 | 2 | 3 | 4 | 5 ] (front: -1, rear: 4)";
		assertTrue(arrayQueue.toString().equals(result));
		System.out.println("* " + arrayQueue.toString());

		arrayQueue.remove();
		arrayQueue.remove();
		result = "Array Queue = [ null | null | 3 | 4 | 5 ] (front: 1, rear: 4)";
		assertTrue(arrayQueue.toString().equals(result));
		System.out.println("* " + arrayQueue.toString());

		for (int i = 6; i <= 9; i++) {
			sLinkedQueue.add(i);
		}
		result = "Singly Linked Queue = head -> 6 -> 7 -> 8 -> 9";
		assertTrue(sLinkedQueue.toString().equals(result));
		System.out.println("* " + sLinkedQueue.toString());

		sLinkedQueue.remove();
		sLinkedQueue.remove();
		sLinkedQueue.remove();
		sLinkedQueue.remove();
		result = "Singly Linked Queue = head";
		assertTrue(sLinkedQueue.toString().equals(result));
		System.out.println("* " + sLinkedQueue.toString());

		for (int i = 10; i <= 12; i++) {
			sLinkedQueue.add(i);
		}
		result = "Singly Linked Queue = head -> 10 -> 11 -> 12";
		assertTrue(sLinkedQueue.toString().equals(result));
		System.out.println("* " + sLinkedQueue.toString());

		ArrayQueue toAq = sLinkedQueue.toArrayQueue();
		result = "Array Queue = [ 10 | 11 | 12 ] (front: -1, rear: 2)";
		assertTrue(toAq.toString().equals(result));
		System.out.println("* " + toAq.toString());

	}

}
