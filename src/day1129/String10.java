package day1129;

public class String10 {
	public static void main(String[] args) {
		String str="gadfgasdf";
		StringBuffer a=new StringBuffer();
		a.append(str);
		System.out.println(a);
		System.out.println(a.delete(1, 2));
		System.out.println(a.insert(2, "nihao"));
		System.out.println(a.reverse());
		System.out.println(a.toString());
	}
}
