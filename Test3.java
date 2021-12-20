package training;

public class Test3 {

	void A(String name) {
		int i;
		
		int count = 0;
		for (i = 0; i <= name.length()-1; i++) {
			char y = name.charAt(i);
			if (y == 'c') {
				count++;

			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Test3 test3 = new Test3();
		test3.A("Technocredits");
	}

}
