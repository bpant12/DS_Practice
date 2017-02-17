package com.tp.ds.TP_DS;


public class TestLinkedList {

	public static void main(String...s){
		LinkedList l = new LinkedList();
		l.add(5);
		l.add(1);
		l.add(2);
		l.add(33);
		l.add(3);
		l.add(3);
		
		l.delete(12);
		
		
		System.out.println("NUMBER COUNT:"+l.numCount(3));
		System.out.println("NUMBER COUNT:"+l.numCount(33));
		System.out.println("NUMBER COUNT:"+l.numCount(333));
		System.out.println("MIDDLE:"+l.middleValue());
		System.out.println("SIZE:"+l.getSize());
		System.out.println("DONE");
		l.print();
		
		l.reverse();
		System.out.println("++++++++++++++");
		l.print();
		
		l.deleteDuplicate();
		System.out.println("SIZE:"+l.getSize());
		l.print();
		
		
		LinkedList l1 = new LinkedList();
		l1.add(3);
		//l1.delete(3);
		System.out.println("SIZE:"+l1.getSize());
	}
	
}


 class LinkedList {
     Node head;
	 class Node{
		 int i;
		 Node next=null;
		 Node(int i){
			 this.i = i;
		 }
	 }
	 
	 
	 //ADD VALUE
	 public void add(int i){
		 Node node = new Node(i);
		 Node temp=head;
		 if(head==null){
			 head = node;
		 }
		 else{
		 while(temp.next!=null){
			 temp = temp.next;
		 }
		 temp.next = node;
		 }
		 
		 
	 }
	 
	 //SIZE
	 public int getSize(){
		 int count=0;
		 Node temp = head;
		 while(temp!=null){
			 count++;
			 temp = temp.next;
		 }
		 return count;
	 }
	 
	 //DELETE VALUE FORM LINKEDLIST
	 public void deleteDuplicate(){
		 Node temp = head;
		 
		 while(temp!=null&&temp.next!=null){
			 for(Node no=temp.next, pre=temp;no!=null;no=no.next,pre=pre.next){
				 if(temp.i==no.i){
					 pre.next = no.next;
				 }
				
			 }
			 temp =temp.next;
		 }
	 }
	 
	 //Delete from index
	 public void delete(int i){
		 Node prev=null,current=head;
		 int count = 0;
		 while(current!=null&& count < i){
			 count++;
			 prev = current;
			 current  = current.next;
		 }
		 if(count<this.getSize())
		 prev.next = current.next;
		 
	 }
	 
	 
	 //FIND Middle value in linkedlist
	 public int middleValue(){
		 Node temp = head;
		 int i = this.getSize();
		 int mid = (i/2)+1;
		 int j=0;
		 while(temp!=null&&j<mid-1){
				 j++;
				 temp = temp.next;
		
		 }
		 return temp.i;
		// return -1;
	 }
	 
	 //COUNT REPITATION of a number in linkedlist
	 public int numCount(int n){
		 int count=0;
		 Node temp = head;
		 while(temp!=null){
			 if(temp.i==n){
				 count++;
			 }
			 temp = temp.next;
		 }
		 return count;
	 }
	 
	 public void reverse(){
		 Node next =null,current=head,prev = null;
		 
		 while(current!=null){
			 next = current.next;
			 current.next = prev;
			 
			 prev = current;
			 current =  next;
		 }
		 
		 head = prev;
		 
	 }
	 
/*	 public int nthFromLast(int i){
		 Node temp = head;
		 int size = this.getSize();
		 int j = size - i;
	 }*/
	 
	 //PRINT VALUE
	 public void print(){
		// LinkedList l = this;
		Node temp = head;
		 while(temp!=null){
			 System.out.println(temp.i);
			 temp = temp.next;
		 }
	 }
}
