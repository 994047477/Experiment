package cn.leexuan.demo1;

import java.io.File;
import java.io.FileInputStream;

/*
��дһ������ʵ����һ�ı��ļ��в���ָ���ַ���
Ҫ�����ִ�Сд����ӡ���ֵĴ�����
 * */
public class Main {
	public static FileInputStream fs = null;

	public static void main(String[] args) throws Exception {
		try {
			fs = new FileInputStream(new File("D:/JavaWorkPlace/Demo/src/cn/leexuan/demo1/1.txt"));
			String dest = "hello";
			byte[] by = new byte[fs.available()];
			fs.read(by);
			String str = new String(by);
			int count =0 ;
			int t  ;
			for(int i =0 ;i<str.length();i++){
				t=0 ;
				while(t<dest.length()&& i<str.length()&& 
						Character.toUpperCase(dest.charAt(t))==Character.toUpperCase(str.charAt(i)) ){
					t++ ;
					i++ ;
					if(dest.length()==t){
						count++ ;
						break ;
					}
				}
			}
			System.out.println(dest+"���ļ��г��ֵĴ�����"+count);
		} catch (Exception e) {
			System.out.println("δ�ҵ��ļ�");
		} finally {
			fs.close();
		}
	}

}