package com.class28;

public class Room extends Building{
	
	int roomNumber;
	Room(String address,int floor, int roomNumber){
		super(address, floor); // it will call the consturctor with no arguments 
this.roomNumber=roomNumber;
	}
public void print() {
	
	System.out.println(address+" "+floor+" "+roomNumber);
}
	public static void main(String[] args) {
		
		Room room=new Room ("121 test Drive",10,101) ;
		room.print();
		// as a child you have your own properties 
		                          // and you still have access to the parent class
	//System.out.println(room.floor); // this line just to show that we can print it 
	
	
	}

	}

