package week1day1assignments;

public class Fibonacciseries {

	public static void main(String[] args) {
		int range = 8;
		int firstNum = 0;
		int SecNum = 1;
		int sum;
		System.out.println(firstNum);
		System.out.println(SecNum);
		for (int i = 2; i < range; ++i) {
			sum = firstNum + SecNum;
			System.out.println(sum);
			firstNum = SecNum;
			SecNum = sum;
		}

	}

}
