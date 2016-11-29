package day1129;

public class String05 {
	public static void main(String[] args) {
		String str="fansifnlkf";
		System.out.println(str.replace('f', 'a'));
		String[] str1=str.split("f");
		for (int i = 0; i < str1.length; i++) {
			System.out.println(str1[i]);
		}
		System.out.println(str.concat("sb"));
	}
}
