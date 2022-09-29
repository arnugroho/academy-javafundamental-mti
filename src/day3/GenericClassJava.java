package day3;

import java.util.ArrayList;
import java.util.List;

public class GenericClassJava<T> {
	private T data;

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("abc");
		Integer i = 6;
		list.add(i); //OK

		for(Object obj : list){
			//type casting leading to ClassCastException at runtime
		    String str=(String) obj; 
		}
	}
}
