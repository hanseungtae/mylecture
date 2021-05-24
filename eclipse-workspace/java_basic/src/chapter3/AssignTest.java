package chapter3;

public class AssignTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 1000;
		int i;
		
		String str = "Test";
		String str2 = new String("Test2");
		String str3;
		
		System.out.println(t);
		//System.out.println(i); // 조심할것 
		System.out.println(str);
		System.out.println(str2);
		//System.out.println(str3);
		
		i = t;
		str3 = str;
		
		System.out.println(i);
		System.out.println(str3);
		
		int num = 10;
		
		System.out.println(+num);
		System.out.println(-num);
		System.out.println(num);
		
		num = -num;
	    System.out.println(num);
	    
	    //byte
	    byte b = 1;
	    System.out.println(b);
	    System.out.println(-b);
	    
	    System.out.println(-b);
	    
		
	}

}
