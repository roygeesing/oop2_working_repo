package oop2.module03.box;

/**
 * @author Dieter Holz
 */
class BoxWithKey<T, Q> {
	private T val;
	private Q key;

	public void setValue(T val) {
		this.val = val;
	}

	public T getValue() {
		return val;
	}

	public T getVal() {
		return val;
	}

	public void setVal(T val) {
		if(isNull(key)) {
			throw new NullPointerException("key is null");
		}
		this.val = val;
	}

	public Q getKey() {
		return key;
	}

	public void setKey(Q key) {
		if(isNull(key)) {
			throw new NullPointerException("key is null");
		}
		this.key = key;
	}

	public <P> boolean isNull(P val){
		return val==null;
	}

}

