package www;

public class VArgumentTest {
	public static void main(String[] args) {
		System.out.println(sum(1,4,6));
		System.out.println(sum(3));
		System.out.println(sum(1,2,3,4,4,5,10));
	}
	
	static int sum(int ... a) {
		// (int ... a) :매개변수를 몇개 받을지 모를 때(가변인수)
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		return sum;
	}
}
