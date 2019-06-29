//Demonstrating Linked List,Stacks using Collections Framework 
import java.util.*;
public class collectionsdemo {

	public static void main(String[] args) {
		//Linked List
		LinkedList<Integer> ll = new LinkedList<Integer>();//Generic Class
		//Adding Elements in our linked List
		ll.add(4);
		ll.add(5);
		ll.add(10);
		ll.add(11);
		ll.add(13);
		ll.addFirst(12);
		ll.addLast(87);
		int a = ll.get(3);
		
		//Display nodes of ll
		System.out.println(ll);
		System.out.println(a);
		
		//Stacks
		Stack<String> stck = new Stack<String>();//Generic Class
		//Pushing elements into the stack
		stck.push("Hello");
		stck.push("World");
		stck.pop();
		//Display contents of the stack
		System.out.println(stck);
	}
}
