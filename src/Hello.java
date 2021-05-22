
public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("hello");
      String s ="hello world";
      System.out.println(s);
      StringBuilder s1 = new StringBuilder(10);
      s1.append("hi1234567890");
      s1.append("jay");
      String s3 = s1.toString();
      System.out.println(s3);
      String s4 = new String(s3);
      System.out.println(s4);
      StringBuffer s5 = new StringBuffer(10);
      s5.append(20);
      String s6 = s5.toString();
      System.out.println(s6);
      
          
      
	}
	
}
