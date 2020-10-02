package fundamentals;

public class UprightTrianglePattern {

	public UprightTrianglePattern() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parameter in patternPrint method will be how many stories high the triangle is to be
		System.out.println(""+trianglePrint(99));
	}
	
	// I want to print the number of  as many times as that number's value i.e 1 once, 2 twice, 7x the number
	private static String trianglePrint(int stories) {
		String triangle = "";
		// TODO Auto-generated method stub
		for (int i = 1; i < stories +1; i++) {
			for (int j = i; j >= 1; j--) {
				triangle += i;
				System.out.print(triangle);
				triangle = "";
			}
			
			System.out.println();
		}
		
		return triangle ;
	}

}
