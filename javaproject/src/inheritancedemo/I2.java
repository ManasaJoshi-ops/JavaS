package inheritancedemo;

public interface I2 {
	default void starter() {
		System.out.println("I2 starting..");
	}
}
