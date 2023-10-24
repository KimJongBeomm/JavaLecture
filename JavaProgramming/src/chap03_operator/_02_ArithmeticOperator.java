package chap03_operator;

public class _02_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 대입연산자
		// 왼쪽 피연산자에 오른쪽 값을 저장한다.
		int num1 = 10;
		int num2 = 15;
		int num3 = 30;
		
		// 오른쪽 피연산자에는 변수를 사용할 수도 있다.
		int num4 = num3;
		System.out.println(num4);
		System.out.println("------------------");
		
		// 2. 산술연산자
		int result;
		
		result = num1 + num2;
		System.out.println("num1 + num2 = " + result);
		
		result = num1 - num2;
		System.out.println("num1 - num2 = " + result);
		
		result = num1 * num2;
		System.out.println("num1 * num2 = " + result);
		
		result = num1 / num2;
		System.out.println("num1 / num2 = " + result);
		
		double dResult = (double)num1 / num2;
		System.out.println("num1 / num2 = " + dResult);
		
		result = num1 % num2;
		System.out.println("num1 % num2 = " + result);
		System.out.println("------------------");
		
		// 3. 복합대입연산자
		num3 = 100;
		num4 = 15;
		
		// num3 = num3 + num4;
		// num3 = 100 + 15;
		// num3 = 115;
		num3 += num4;
		System.out.println(num3);
		
		//100
		num3 -= num4;
		System.out.println(num3);
		
		//1500
		num3 *= num4;
		System.out.println(num3);
		
		//100
		num3 /= num4;
		System.out.println(num3);
		
		//10
		num3 %= num4;
		System.out.println(num3);
		
		// 4. 복합 산술연산자
		result = num1 + num2 / num3;
		System.out.println("num1 + num2 / num3 = " + result);
		
		result = (num1 + num2) / num3; 
		System.out.println("(num1 + num2) / num3 = " + result);
		
	}

}
