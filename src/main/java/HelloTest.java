import java.util.ArrayList;
import java.util.List;

public class HelloTest {
	String thisisit="";
	List<String> l = new ArrayList<String>();
	List<String> l2 = new ArrayList<String>();
	
	public void test() {
		String hello = "Hello world";
		
		
		for(int i=0; i<11;i++) {
			//System.out.println(hello.charAt(i));
			int length = hello.length();
			if(((hello.charAt(i)) == ' ')) {
				l.add(thisisit);
				thisisit="";
				
			}
			else if(i==((hello.length())-1)){
				thisisit=thisisit+hello.charAt(i);
				l.add(thisisit);
			}
			else {
				thisisit=thisisit+hello.charAt(i);
			}
			
			
		}
	for(int j=0; j<l.size();j++) {
		System.out.println("inside for"+ l.size());
		String str = l.get(j);
		System.out.println(str);
		int size =str.length();
		System.out.println(size);
		System.out.println(l2.size());
		
	
	}

	
	System.out.println(l2);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloTest test = new HelloTest();
		test.test();

	}

}
