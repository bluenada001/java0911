package exceptionHandling;

public class Main2 {

	public static void main(String[] args) {
		String [] languages =
			{"Java", "JavaScript", "Kotlin", "Swift"};
		int x = 10;
			
		try {
			 //예외가 발생할 가능성이 있는 구문 
			//밑에 경우는 ArithmeticException이 발생.
			System.out.printf("x/0:%d\n", x/0);
			for(int i=0; i<=languages.length; i=i+1) {
				System.out.printf("프로그래밍 언어:%s\n", languages[i]);
			}
		}catch(ArrayIndexOutOfBoundsException e) {
			///예외 클래스에 해당하는 예외가 발생했을 때 처리할 구문.
			System.out.printf("배열의 인덱스 오류\n");
		}catch(ArithmeticException e) {
			
		
			System.out.printf("산술 연산 오류\n");
	}
		finally {
			//예외 발생 여부에 상관없이 수행할 구문.
			System.out.printf("무조건 수행할 구문\n");
		}

			}
	}
		//여러 종류의 예외를 묶어서 처리하기 위해서 Exception을 사용. 일일이 예외를 다 쓸 수가 없고 이방법을 많이 씀.

		//Exception 클래스의 getMESSAGE() 는 예외 내용을 문자로 리턴.
 		//catch(Exception e) {
		//System.out.printf("예외:%s\n", e.getMessage());
		// }
