package day1129;

import java.util.Scanner;

public class String_class {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String str=sc.nextLine();
		//���ַ����ָ�
		String[] str1= str.split(" ");
		String str2="";
		//������Ԫ������ĸ��Ϊ��д��������ĸ��ΪСд
		for (int i = 0; i < str1.length; i++) {
			str1[i]=str1[i].substring(0,1).toUpperCase()+str1[i].substring(1).toLowerCase();
		}
		//���޸ĺ������Ԫ�����ӳ��ַ���
		for (int i = 0; i < str1.length; i++) {
			str2+=str1[i];
		}
		str=str2;
		System.out.println(str);
		
	}
}
