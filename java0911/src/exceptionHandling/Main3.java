package exceptionHandling;

public class Main3 {

	public static void main(String[] args) {
		//throws InterrupedException {
		//위 처럼 메인에 throws를 만들면 예외가 발생한 경우 운영체제가 처리함. main은 운영체제가 호출하기 때문임.
		
		//1-10까지1초씩 대기하면서 출력하기.
	/* 내가한거..
		int i=0;
		for(i=0; i<10; i=i+1);
		System.out.printf(i);
		*/
		
		for(int i=1; i<=10; i=i+1) {
			System.out.printf("i:%d\n", i);
			//1초씩 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// 이렇게 바로 써도 되고. System.out.printf("인터럽트 예외 발생\n"); 이렇게 바꿔줘도 됨. 
				e.printStackTrace();
			}
			
		}
			
	}

}
