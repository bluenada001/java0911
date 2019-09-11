package lang;

import java.math.BigDecimal;

public class WrapperMain {

	public static void main(String[] args) {
		// 기본형 데이터를 Wrapper Class 객체로 만들기.
		//auto boxing 이 지원 되므로 바로 대입.
		Integer i = 102;
		//문자열을 정수로 변환
		String str = "187";
		System.out.println(str + 90);   //문자열과 숫자는 +하면 문자열로 결합. 18790 
		
		//문자열을 정수로 변환.
		int su = Integer.parseInt(str);
		System.out.println(su+90);
		//문자열을 숫자로 변경 할 때는 변경 할 수 없는 문자가 있거나 공백이 있으면 
		//NumberFormatException 이 발생. 
		//su = Integer.parseInt("   189");

		
		
		//double 은 소수 15자리 까지만 인식함.(나머지는 버림)
		//아래의 경우는 15자리 초과로 2.0 으로 나옴. 
		double d1 = 1.0000000000000000000000000000000000001;
		double d2 = 1.00000000000000000000000000000000003;
		System.out.println(d1+d2);
	
		//위에 연산을 BigDecimal 로 해결.
		BigDecimal b1 = new BigDecimal("1.0000000000000000000000000000000000001");
		BigDecimal b2 = new BigDecimal("1.00000000000000000000000000000000003");
		System.out.println(b1.add(b2));
	
	}

}
