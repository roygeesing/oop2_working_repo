package oop2.module03.box;

/**
 * @author Dieter Holz
 */
public class ArrayBox <T extends A>{
	private A[] myArray = new A[5];

	public void add(T val){
		myArray[0] = val;
	}
}
