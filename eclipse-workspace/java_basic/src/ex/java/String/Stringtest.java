package ex.java.String;

public class Stringtest {

	public static void main(String[] args) {


		String str1 = new String("abc"); // 객체 생성 완료
		String str2 = "abc"; // " 
		String str3 = "abc"; // " str1~3객체라고 인식할 것 
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		str2 = "efg";
		System.out.println(str2);
		System.out.println(str3);
		
		
		String str4; // 식별자 변수명
		str4 = "하나둘셋";
		System.out.print(str4 + " : ");
		
		
		// dot operator:.
		System.out.print(str4.charAt(0)); 
		System.out.print(str4.charAt(1));
		System.out.print(str4.charAt(2));
		System.out.print(str4.charAt(3));
		
		System.out.println("");
		
		int length = str4.length();
		for( int i = 0; i < length; i ++ ) {
			
			System.out.println(str4.charAt(i));
			
		}
		
		/** equals(string) **/
		
		System.out.println(str4.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str3.equals("abc"));
		
		if( str3.equals("abc")) {
			
		}
				
		//
		
		String[] strs = "하 나 두 ㄹ ㅅ ㅔ 넷".split(" ");
		System.out.println(strs.length);
		
		System.out.println(strs[0]);
		System.out.println(strs[6]);
		
		for( int i = 0; i < length; i++ ); {
			int i = 0;
			System.out.println(strs[i]);
			
		}
		
		System.out.println("----- substring -----");
		System.out.println("하 나 두 ㄹ ㅅ ㅔ 넷".substring(2,5));
		

	}
}	
