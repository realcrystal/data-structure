import java.util.Random;

public class IntArrays {
	
	private int[] array;
	private int size;
	
	public IntArrays(int n){
		array = new int[n];
		size = n/2;
		Random rng = new Random();
		for(int i = 0; i < n/2; i++) {
			array[i] = rng.nextInt(10);
		}
		System.out.println("���� " + n + "�� �迭�� �����Ͽ����ϴ�.");
	}
	
	public void print() {
		System.out.print("�迭 ������ :");
		for(int i = 0; i < size; i++) {
			System.out.print(" " + array[i]);
		}
		System.out.println();
	}
	
	public void add(int x) {
		if(size == array.length) {
			int[] newArray = new int[size * 2];
			System.arraycopy(array, 0, newArray, 0, size);
			array = newArray;
		}
		array[size++] = x;
	}
	
	public void remove(int x) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == x) {
				System.arraycopy(array, i + 1, array, i, size - (i + 1));
				size--;
				System.out.println("������ " + x + "�� ������ �Ϸ�Ǿ����ϴ�.");
				return;
			}
		}
		return;
	}
}
