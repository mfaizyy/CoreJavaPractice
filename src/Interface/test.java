package Interface;

public class test implements printable,showable {

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("hello method from interface");
		
	}
	public static void main(String[] args) {
		test t = new test();
		t.print();
	}

}
