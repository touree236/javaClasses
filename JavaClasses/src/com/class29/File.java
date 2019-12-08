package com.class29;

public abstract class File {

/* Create a class File that will have the following behaviors: 
* open, edit, close. Edit and close are implemented method while 
* open is an abstract. 
* Create 3 subclasses: JavaFile, WordFile, 
* PDFFile that will provide specific implementation of open 
* behaviour: Example: to open .java file we need notepad++ or 
* sublime text,to open .doc file we need Microsoft word to be 
* installed etc
 */
	
	public abstract void open(); 
	
	
	public void edit() {
		System.out.println("edit file");
	}
	public void close() {
		System.out.println("close file");
	}
}

	class  JavaFile extends File {

		@Override
		public void open() {
			System.out.println("Notepad");
		} 
		
	}
	
	class  WordFile extends File {

		@Override
		public void open() {
			System.out.println("sublime text");
		} 
	
	
		class  PDFFile extends File {

			@Override
			public void open() {
				System.out.println("file we need Microsoft word");
			} 
		}
}
