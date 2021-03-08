package oop2.module03.box;

/**
 * @author Dieter Holz
 */
public class TestGenerics {
	public static void main(String[] args) {

		Box box = new Box();

		Box<A> aBox = new Box<>();
		Box<B> bBox = new Box<>();
		//Box<?> bBox= new Box<>();
		//Box<? extends B> bBox= new Box<B>();

		Box<C> cBox = new Box<>();
		Box<D> dBox = new Box<>();

		A a1 = new A();
		B b1 = new B();
		C c1 = new C();
		D d1 = new D();

		aBox.setValue(a1);
		aBox.setValue(b1);
		aBox.setValue(c1);
		aBox.setValue(d1);

//		bBox.setValue(a1);
//		bBox.setValue(b1);
//		bBox.setValue(c1);
//		bBox.setValue(d1);

//		cBox.setValue(a1);
//		cBox.setValue(b1);
//		cBox.setValue(c1);
//		cBox.setValue(d1);

//		dBox.setValue(a1);
//		dBox.setValue(b1);
//		dBox.setValue(c1);
//		dBox.setValue(d1);

//		a1 = bBox.getValue();
//		b1 = bBox.getValue();
//		c1 = bBox.getValue();
//		d1 = bBox.getValue();



//		box = aBox;
//		box = dBox;
//		aBox = bBox;
//		dBox = cBox;

//		bBox = aBox;
//		bBox = cBox;
//		bBox = dBox;
//
//		Box<? super C> c2Box= new Box<C>();
//		c2Box= aBox;
//		c2Box= bBox;
//		c2Box= dBox;

	}
}
