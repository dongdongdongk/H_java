package sec01.exam03;

public class A {
	int field1;
	void method1() {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void mehtod() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
			
		}
	}
	
	static class C {
		void method() {
			//field1 = 10; //A 객체가 필요한 인스턴스 필드와,메소드는
			//method1();   //정적 클래스에서는 사용 불가능 
		
			field2 = 10;
			method2();
		}
	}
}
