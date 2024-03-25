package basicjava;

public class VarArgsPractice {
	
	static float avgValue(float... value) {
		float sum = 0;
		for(int i =0; i<=value.length; i++) {
			sum += i;
		}
		return sum/value.length;
	}

	public static void main(String[] args) {
		float c = avgValue(1, 2, 3, 4, 5);
		System.out.println(c);

	}

}
