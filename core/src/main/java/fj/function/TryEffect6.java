package fj.function;

public interface TryEffect6<A, B, C, D, E, F, Z extends Exception> {

	void f(A a, B b, C c, D d, E e, F f) throws Z;

}
