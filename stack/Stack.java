package stack;

public interface Stack<D>{
	public void push(D i);
	public D pop();
	public D peek();
	public Integer size();
}

