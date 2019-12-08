package com.class29;


	public class Albanian extends Human{
		String albanianId;
		
		public Albanian(String name, int age, int weight, String albanianId) {
			super(name, age, weight);
			this.albanianId = albanianId;
		}
		
		public void taxReturns() {
			System.out.println("I have an Albanian ID.");
		}

}
