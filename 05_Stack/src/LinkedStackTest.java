import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedStackTest {

	LinkedStack linkedStack = new LinkedStack();

	@Test
	void testPush() {
		for (int i = 5; i > 0; i--) {
			linkedStack.push(i);
		}
		assertEquals("Current Elements of Stack : top -> 1 -> 2 -> 3 -> 4 -> 5", linkedStack.toString());
	}

	@Test
	void testRemoveSecond() {
		for (int i = 5; i > 0; i--) {
			linkedStack.push(i);
		}
		linkedStack.removeSecond();
		assertEquals("Current Elements of Stack : top -> 1 -> 3 -> 4 -> 5", linkedStack.toString());
	}

	@Test
	void testReverse() {
		for (int i = 5; i > 0; i--) {
			linkedStack.push(i);
		}
		linkedStack.reverse();
		assertEquals("Current Elements of Stack : top -> 5 -> 4 -> 3 -> 2 -> 1", linkedStack.toString());
	}
}
