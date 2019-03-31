package queue;

public interface Queue<D>{
	public void Enqueue(D i);
	public D Dequeue();
	public Integer size();
}
