import java.util.*;
import stack.*;
import queue.*;

class Driver{

public static void main(String args[])
    {
    		Scanner sc= new Scanner(System.in);
		int y=0;
                while(y<1){
                System.out.println("\n1.StackAL\n2.StackLL\n3.QueueAL\n4.QueueLL\n5.Exit\n");
		int k=sc.nextInt();
		if(k==1){  
		    StackAL s1=new StackAL();
                            int x=0;
                            while(x<1){
                            System.out.println("\nStackAL\n\n1.Push\n2.Pop\n3.Peek\n4.Size\n5.Exit\n");
            		int j=sc.nextInt();
            		switch (j){
            		case 1:  
            			System.out.print("Enter Element : ");
            			int i=sc.nextInt();
            			s1.push(i);
            			break;
            		case 2:
            		   System.out.println(s1.pop());
            		    break;
            		case 3:
            		    System.out.println(s1.peek()); 
            		    break;       
            		case 4:
            		    System.out.println(s1.size()); 
            		    break;
            		case 5:
            			x=3;
            			break;    
                        }
                    }  
                }
                if(k==2){ 
                    StackLL s2=new StackLL();
                            int x=0;
                            while(x<1){
                            System.out.println("\nStackLL\n\n1.Push\n2.Pop\n3.Peek\n4.Size\n5.Exit\n");
            		int j=sc.nextInt();
            		switch (j){
            		case 1:  
            			System.out.print("Enter Element : ");
            			int i=sc.nextInt();
            			s2.push(i);
            			break;
            		case 2:
            		   System.out.println(s2.pop());
            		    break;
            		case 3:
            		    System.out.println(s2.peek()); 
            		    break;       
            		case 4:
            		    System.out.println(s2.size()); 
            		    break;
            		case 5:
            			x=3;
            			break;    
                        }
                    }  
                }
                if(k==3){  
                    QueueAL s3=new QueueAL();
                            int x=0;
                            while(x<1){
                            System.out.println("\nQueueAL\n\n1.Enqueue\n2.Dequeue\n3.Size\n4.Exit\n");
            		int j=sc.nextInt();
            		switch (j){
            		case 1:  
            			System.out.print("Enter Element : ");
            			int i=sc.nextInt();
            			s3.Enqueue(i);
            			break;
            		case 2:
            		   System.out.println(s3.Dequeue());
            		    break;
            		case 3:
            		    System.out.println(s3.size()); 
            		    break;
            		case 4:
            			x=3;
            			break;    
                        }
                    }  
                }
                if(k==4){  QueueLL s4=new QueueLL();
                            int x=0;
                            while(x<1){
                            System.out.println("\nQueueLL\n\n1.Enqueue\n2.Dequeue\n3.Size\n4.Exit\n");
            		int j=sc.nextInt();
            		switch (j){
            		case 1:  
            			System.out.print("Enter Element : ");
            			int i=sc.nextInt();
            			s4.Enqueue(i);
            			break;
            		case 2:
            		   System.out.println(s4.Dequeue());
            		    break;
            		case 3:
            		    System.out.println(s4.size()); 
            		    break;
            		case 4:
            			x=3;
            			break;    
                        }
                    }  
                }
		if(k==5)
			y=3;   	
	}	
   }
}
