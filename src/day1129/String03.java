package day1129;

public class String03 {
	public static void main(String[] args) {
		String str="abfdsfjvzxfsdf";
		System.out.println(str.indexOf('f'));
		System.out.println(str.indexOf("fjv"));
		System.out.println(str.indexOf('f',0));
		System.out.println(str.indexOf("fjv",1));
		System.out.println(str.intern());
		//如果有相同的，取最后一个的下标
		System.out.println(str.lastIndexOf('f'));
	}
}
