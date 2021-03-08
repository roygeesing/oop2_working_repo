package oop2.module03.box;

/**
 * @author Dieter Holz
 */
class Box<T> {
	private T val;

	public void setValue(T val) {
		this.val = val;
	}

	public T getValue() {
		return val;
	}

	public <P> boolean isNull(P val) {
		return (val == null);
	}

}

