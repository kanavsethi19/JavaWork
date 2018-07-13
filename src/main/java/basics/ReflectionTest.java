package basics;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;

public class ReflectionTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		A a = new A();
		Class c = a.getClass();
		Object o = c.newInstance();
		Method m = c.getDeclaredMethod("print",null);
		m.setAccessible(true);
		m.invoke(o, null);
	}

}
class A{
	private void print() {
		System.out.println("Hi from private!");
	}
}