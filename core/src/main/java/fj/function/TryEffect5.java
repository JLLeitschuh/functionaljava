package fj.function;

public interface TryEffect5<A, B, C, D, E, Z extends Exception> {

	void f(A a, B b, C c, D d, E e) throws Z;

}
