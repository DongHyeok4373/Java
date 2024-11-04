package chapter3;

public class LogicalOperatorExample {
	public static void main(String[] args) {
		int charCode = 'A';
		
		if( (charCode >= 65) & (charCode <= 90) ) {
			System.out.println("�빮�ڱ���");
		}
		
		if( (charCode >= 97) && (charCode <= 122) ) {
			System.out.println("�ҹ��ڱ���");
		}
		
		if( (charCode >= 48) && (charCode <= 57) ) {
			System.out.println("0 ~ 9 ���ڱ���");
		}
		
		int value = 6;
		
		if( (value % 2 == 0) | (value % 3 == 0) ) {
			System.out.println("2또는 3의 배수군요");
		}
		
		if( (value % 2 == 0) || (value % 3 == 0) ) {
			System.out.println("2또는 3의 배수군요");
		}
	}
}