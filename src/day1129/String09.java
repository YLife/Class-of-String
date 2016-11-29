package day1129;

public class String09 {
	public static void main(String[] args) {
		String str="fafsdgdfggdfga";
		byte[] a=str.getBytes();
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		String str1=new String(a);
		System.out.println(str1);
	}
}
