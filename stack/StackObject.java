package stack;
import java.util.*;

public class StackObject<D>

{
    D val;
    StackObject<Integer> next;
    StackObject(D i)
    {
        val=i;
        next=null;
    }


}