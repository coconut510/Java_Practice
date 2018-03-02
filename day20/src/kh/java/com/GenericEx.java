package kh.java.com;

public class GenericEx <T,E> {
	private T dataT;
	private E dataE;
	public GenericEx(T dataT,E dataE)
	{
		this.dataT = dataT;
		this.dataE = dataE;
	}
	public T getDataT() {return this.dataT;}	
	public E getDataE() {return this.dataE;}	
}
