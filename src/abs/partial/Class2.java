package abs.partial;

public class Class2 extends ClientData{

	@Override
	void clientId() {
		System.out.println("id is 123456");
		
	}
public static void main(String[] args) {
	Class2 a=new Class2();
	a.clientId();
	a.clientName();
}
}
