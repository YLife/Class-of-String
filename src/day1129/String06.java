package day1129;

public class String06 {
	public static void main(String[] args) {
		String str="gahfoidsjf";
		System.out.println(str.startsWith("gah"));
		System.out.println(str.endsWith("jf"));
		char[] str1=str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
	}
}
