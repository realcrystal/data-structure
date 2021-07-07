
public class Test {
	public static void main(String[] args) {
		LinkedList list1 = new LinkedList();
		for(int i = 1; i <= 10; i++) {
			list1.insertFirst(i);
		}
		list1.print();
		
		System.out.println(list1.contain(10));
		System.out.println(list1.contain(20));
		
		LinkedList list2 = new LinkedList();
		for(int i = 1; i <= 10; i++) {
			list2.insertLast(i);
		}
		list2.print();
	}
}
