import java.util.*;
import java.io.*;

public class LinkedList {
	private static PipelineNode headNode = null;
	private static PipelineNode tailNode = null;
	private static PipelineNode nextNode = null;
	public static void append(int pos, String descr) {
		PipelineNode newNode = new PipelineNode(pos, descr, null);
		if(headNode == null)
		{
			headNode = newNode;
		}
		else
		{
			tailNode.nextNode = newNode;
		}
		tailNode = newNode;
	}
	public static void insert (int pos, String descr, int indx) {
		PipelineNode newNode =  new PipelineNode(pos, descr, null);
		PipelineNode currentNode = headNode;
		PipelineNode alsoCurrentNode = headNode;
		for (int x = 0; x < indx-1; x++) {
			currentNode = currentNode.nextNode;
			alsoCurrentNode = alsoCurrentNode.nextNode;
		}
		alsoCurrentNode = alsoCurrentNode.nextNode;
		if (indx == 0) {
			headNode = newNode;
			newNode.nextNode = currentNode;
	    } else if (indx >= 1){
	    	currentNode.nextNode = newNode;
	    	newNode.nextNode = alsoCurrentNode;
	    }

	}
	public static void traverseAndPrint( ) {
		PipelineNode currentNode = headNode;
		int nodeNum = -1;
		do
		{
			nodeNum++;
			System.out.println("Node number: " + nodeNum);
			System.out.println("Position: " + currentNode.position);
			System.out.println("Description: " + currentNode.description);
			System.out.println(""); //gives a blank line between nodes
			currentNode = currentNode.nextNode;
		}while(currentNode != null); //We don't need to know ahead of time how many
	}
	public static void main(String args[]) {
		append(0, "Pump station");
		append(3050, "Hwy 35");
		append(4573, "Tank farm");

		traverseAndPrint();
		System.out.println("now insert a node before old node 2");
		insert(4040, "Cold Creek", 1); // 3050 + 990 = 4040
		insert(3500, "Hwy 1 or sumthin", 1);
		insert(5000, "front", 0);
		traverseAndPrint( );
	}
}