package sec07;

public class NullPinterExceptionExample {

	public static void main(String[] args) {
		int[] intArray = null;
		intArray = new int[3];
		intArray[0] = 10; //NullPointerException
		System.out.println(intArray[0]);////////
		
		String str = null;
		str = "안녕하세요.";
		//NullPointerException
		System.out.println("총 문자 수 : " + str.length()); //////////////
	}

}
