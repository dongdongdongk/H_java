package sec01.exam02;

public class A {

	class B {} //인스턴스 멤버 클래스 
	
	static class C{} // 정적 멤버 클래스 
	
	B field1 = new B(); // B필드 선언 
	C field2 = new C();
	
	public void method1() { //A객체를 생성하고 사용할수 있는 인스턴스 method1
		B var1 = new B(); //로컬변수 B 타입의 var1 선언 new B 객체생성
		C var2 = new C();
	}
	
	//static B field3 = new B(); 
	//A 객체가 있어야 사용가능한 인스턴스 클래스 B 객체를 A가 없어도 사용가능한 
	//static B 에 대입하면 문제가 생긴다.
	
	static C field = new C();
	// A객체 없이 C field 가능 A객체 없이 C객체 가능 결과적으로 사용가능
	
	static void method2() {
		//B var1 = new B();
		//method2 는 static 이라 A객체가 필요없는데 A객체가 필요한 객체B 필드 사용 불가능
		C var2 = new C();
		// C객체는 A객체가 필요없으니 문제x
	}
}
