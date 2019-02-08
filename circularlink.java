import java.util.*;
class node
{
	int data;
	node next;
	node head=null;
public node()
{
	this.data=0;
	this.next=null;
}
public node(int data1)
{
this.data=data1;
this.next=null;
}
public node add(int data)
{
	node l=new node(data);
	if(head==null)
	{
		head=l;
		head.next=head;
	}
	else
	{
		node temp=head;
		while(temp.next!=head)
		{
			temp=temp.next;
		}
		temp.next=l;
		
		l.next=head;
	}
	return head;
}
 public void print(node head)
{
	node temp=head;
	
	while(temp.next!=head)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println(temp.data);
	System.out.println(temp.next.data);
	
}
public void lengthnode(node head)
{
	node temp=head;
	int result=0;
	while(temp.next!=head)
	{
		
		result++;
		temp=temp.next;
	}
	result=result+1;
	System.out.println("length:" +result);
}
	
	
		
public static void main(String[] args)
{
	node a=new node();
	Scanner s=new Scanner(System.in);
	node h=new node();
	h=a.add(1);
	h=a.add(2);
	h=a.add(3);
	System.out.println("circular link list:");
	a.print(h);
	a.lengthnode(h);
	
}
}