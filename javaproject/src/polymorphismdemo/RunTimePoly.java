package polymorphismdemo;

public class RunTimePoly {
public static void main(String[] args) {
	MacBookAir mac=new MacBookAir();
	mac.start();
	mac.shutDown();
	MacBook mc=new MacBookPro();
	mc.start();
	mc.shutDown();
}
}
class MacBook{
	void start() {
		System.out.println("MacBook started");
	}
	void shutDown() {
		System.out.println("MacBook shutdown");
	}
}
class MacBookAir extends MacBook{
	void start() {
		System.out.println("MacBookAir started");
	}
	void shutDown() {
		System.out.println("MacBookAir shutdown");
	}
}
class MacBookPro extends MacBook{
	void start() {
		System.out.println("MacBookPro started");
	}
	void shutDown() {
		System.out.println("MacBookPro shutdown");
	}
}
