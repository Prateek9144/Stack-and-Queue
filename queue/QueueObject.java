package queue;
import java.util.*;
public class QueueObject<D>

{
    D val;

    QueueObject<Integer> next;

    QueueObject(D i)
    {
        val=i;
        next=null;
    }


}
