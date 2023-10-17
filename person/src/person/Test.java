package person;

public class Test {

	public static void main(String[] args) {
		
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		
		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println();
		
		Person jiro = new Person();
		jiro.name = "木村次郎";
		jiro.age = 18;
		
		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		
		Person ryotaro = new Person();
		ryotaro.name = "古賀稜太郎";
		ryotaro.age = 24;
		
		taro.phoneNumber = "08011112222";
		taro.address = "aaaa@gmail.com";
		
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();
		System.out.println();
		System.out.println();
		
		Robot aibo = new Robot();
		Robot asimo = new Robot();
		Robot pepper = new Robot();
		
		aibo.name = "aibo";
		asimo.name = "asimo";
		pepper.name = "pepper";
		aibo.talk();
		aibo.walk();
		aibo.run();
		System.out.println();
		asimo.talk();
		asimo.walk();
		asimo.run();
		System.out.println();
		pepper.talk();
		pepper.walk();
		pepper.run();
		
	}

}
