package cn.leexuan.demo1;

/*
 * дһ����A�����ഴ���Ķ�����Ե��÷���f���Ӣ����ĸ��
 * Ȼ���ٱ�дһ�����������B����̳�A��ķ���f����������д����
 * ���ഴ���Ķ��󲻽����Ե��÷���f���Ӣ����ĸ��
 * ���ҿ��Ե������������ķ���g���ϣ����ĸ��
 * */
class A {
	public void f(){
		System.out.print("Ӣ����ĸ��:");
		for(char c ='a' ;c <='z' ;c++)
			System.out.print(c+" ");
		System.out.println();
	}
}

class B extends A {
	void g() {
		char[] lowerGreekLetters = "���¦æĦŦƦǦȦɦʦ˦̦ͦΦϦЦѦҦӦԦզ֦צ�".toCharArray();
		System.out.print("ϣ����ĸ��:");
		for (char i :lowerGreekLetters)
			System.out.print(i+" ");
		System.out.println();
	}
}
public class Main{
	public static void main(String[] args) {
		A a =new A() ;
		a.f();
		B b =new B() ;
		b.f();
		b.g();
	}
}