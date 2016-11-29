package day1129;

import java.util.Scanner;

public class String_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String str=sc.nextLine();
		//将字符串分割
		String[] str1= str.split(" ");
		String str2="";
		//将数组元的首字母变为大写，其他字母变为小写
		for (int i = 0; i < str1.length; i++) {
			str1[i]=str1[i].substring(0,1).toUpperCase()+str1[i].substring(1).toLowerCase();
		}
		//将修改后的数组元素连接成字符串
		for (int i = 0; i < str1.length; i++) {
			str2+=str1[i];
		}
		str=str2;
		System.out.println(str);
		
	}
}
