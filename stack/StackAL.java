package stack;

import java.util.*;
import java.io.*;
public class StackAL<D> implements Stack<D> 
{	Object arr[];
	Integer size;
	Integer buffer ;    
	public StackAL()
	{
		buffer = 5;
		size = 0;
		arr = new Object[buffer];
	}
	public void push(D a){
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
	public D pop(){
		D y=(D)arr[0];
		Integer x=size-1;
		try{
		    if(x<0)
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
			Integer i=0;
		for(;i<size;i++)
		{
			arr[i]=arr[i+1];	
		}
		size--;
		return y;
	}
	public D peek(){
		return (D)arr[0];	
	}
	public Integer size(){
	
	return size;
	}
	public static void main(String args[]){
	
	
	}
    	
}
