package queue;

import java.util.*;
import java.io.*;
public class QueueLL<D> implements Queue<D>
{   QueueObject<Integer> head=null;
    QueueObject<Integer> tail=null;
    Integer size;
    public QueueLL()
    {
        size = 0;
    }
    public void Enqueue(D a){
        QueueObject<Integer> ob=new QueueObject<Integer>((Integer)a);
                if(head==null)
                {
                    head=ob;
                    tail=ob;
                    size++;
                }
                else
                {
                    tail.next=ob;
                    tail=ob;
                    size++;
                }   
        }
    public D Dequeue(){
         try{
            if(size<=0)
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
        QueueObject<Integer> print=head;
        head=head.next;
        size--;
        return (D)print.val;
    }
    public Integer size(){
    return size;
    }
}
