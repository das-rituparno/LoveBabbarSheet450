//{ Driver Code Starts
//Initial Template for Java

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class GfG {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
                
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    static void displayCList(Node head)
    {
        Node itr = head;
        do
        {
            System.out.print(itr.data + " ");
            itr = itr.right;
        } while (head!=itr);
        System.out.println();
    	itr=itr.left;
    	head = itr;
    	do{
    		System.out.print(itr.data + " ");
    		itr=itr.left;
    	}while(head!=itr);
    	System.out.println();
    }
    
	public static void main (String[] args) throws IOException {
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        
	        int t=Integer.parseInt(br.readLine());
	        while(t-- > 0){
	            String s= br.readLine();
	            Node root = buildTree(s);
	            
	            Solution boj = new Solution();
	            Node head = boj.bTreeToClist(root);
	            displayCList(head);
	            
	        }
	    
	}
}



// } Driver Code Ends


//User function Template for Java



//User function Template for Java
/*
Node defined as
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/
class treeInfo{
    Node head;
    Node tail;
    
    treeInfo(Node h, Node t){
        head = h;
        tail = t;
    }
}

class Solution
{ 
    treeInfo inOrder(Node root){
        if(root == null){
            return new treeInfo(null, null);
        }
        
        treeInfo left = inOrder(root.left);
        
        Node newNode = new Node(root.data);
        
        if(left.tail != null)
            left.tail.right = newNode;
            
        newNode.left = left.tail;
        
        treeInfo right = inOrder(root.right);
        newNode.right = right.head;
        
        if(right.head != null)
            right.head.left = newNode;
        
        Node outputHead = left.head;
        Node outputTail = right.tail;
        if(left.head == null){
            outputHead = newNode;
        }
        
        if(right.tail == null){
            outputTail = newNode;
        }
        
        
        return new treeInfo(outputHead, outputTail);
    }
    
    //Function to convert binary tree into circular doubly linked list.
    Node bTreeToClist(Node root)
    {
        //your code here
        treeInfo output = inOrder(root);
        
        output.head.left = output.tail;
        output.tail.right = output.head;
        
        return output.head;
    }
    
}
    
