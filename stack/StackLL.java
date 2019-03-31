package stack;

import java.util.*;
import java.io.*;
public class StackLL<D> implements Stack<D>
{
    StackObject<Integer> head=null;
        Integer size;
        public StackLL()
        {
            size = 0;
        }
    public void push(D a){
        StackObject<Integer> ob=new StackObject<Integer>((Integer)a);
                if(head==null)
                {
                    head=ob;
                    size++;
                }
                else
                {
                    ob.next=head;
                    head=ob;
                    size++;
                }   
        }
    public D pop(){
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
        StackObject<Integer> print=head;
        head=head.next;
        size--;
        return (D)print.val;
    }
    public D peek(){
        return (D)head.val;   
    }
    public Integer size(){
    
    return size;
    }
        
}
