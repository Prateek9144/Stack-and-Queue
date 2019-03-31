package queue;

import java.util.*;
import java.io.*;
public class QueueAL<D> implements Queue<D>
{	Object arr[];
	Integer size;
	Integer buffer ;    
	public QueueAL()
	{
		buffer = 5;
		size = 0;
		arr = new Object[buffer];
	}
	public void Enqueue(D a){
		size++;
		if(size==buffer)
		{
		    buffer*=2;
		    Object arr2[] = new Object[buffer];
		    for(int i=0;i<size;i++)
		    arr2[i]=arr[i];
		    arr=arr2;
		}
		Integer i;
		for(i=size-1;i>0;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[i]=a;
	}
	public D Dequeue(){
		D y=(D)arr[size-1];
		try{
		    if(size==0)
		    {
		        BoundsException ob=new BoundsException();
		        throw ob;
		    }
		}   
		catch(BoundsException b)
		{
		    b.printError();
		    return null;
		}
		size--;
		return y;
	}
	public Integer size(){
	
	return size;
	}
	
}
