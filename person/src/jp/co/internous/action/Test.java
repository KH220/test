package jp.co.internous.action;

public class Test {

	public static void main(String[]args){
		Person taro=new Person();
		taro.name="山田太郎";
		taro.age=20;
		taro.phoneNumber="000-0000";
		taro.address="taro@yaboo.co.jp";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();



		Person jiro=new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		jiro.phoneNumber="000-0001";
		jiro.address="jiro@amail.com";

		System.out.println(jiro.name);
		System.out.println(jiro.age);
		System.out.println(jiro.phoneNumber);
		System.out.println(jiro.address);
		jiro.talk();
		jiro.walk();
		jiro.run();



		Person hanako=new Person();
		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-0002";
		hanako.address="hanako@mokomo.jp";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();



		Robot aibo=new Robot();
		aibo.name="アイボ";
		aibo.talk();
		aibo.walk();
		aibo.run();



		Robot asimo=new Robot();
		asimo.name="アシモ";
		asimo.talk();
		asimo.walk();
		asimo.run();



		Robot pepper=new Robot();
		pepper.name="ペッパー";
		pepper.talk();
		pepper.walk();
		pepper.run();
	}



}

