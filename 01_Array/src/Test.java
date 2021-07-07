
public class Test {
	public static void main(String[] args) {
		IntArrays myArray = new IntArrays(10);
		myArray.print();
		
		myArray.add(1);
		myArray.add(2);
		myArray.add(3);
		myArray.add(4);
		myArray.add(5);
		myArray.add(6);
		myArray.add(7);
		myArray.print();
		
		myArray.remove(1);
		myArray.print();
		myArray.remove(3);
		myArray.print();
		myArray.remove(7);
		myArray.print();
	}

}
