package arrayManipilation;

public class TowArraysDemo2 {
	

	public static void main(String[] args) {
		
		String [][] names= {
				{"Mike","Joe","Jiji","Hatem"},
				{"Jan","abe","Bob","Hobby"},
                {"Akmad","jake","Jojo","Ali"},
		};
		
	int lenghtOfRows=names.length;
	//	System.out.println(length);
		
			int lenthOfColumns=names[0].length;
		System.err.println(lenthOfColumns);
			
			for (String getArrays[]:names) { /// this step will allow you to do 2D 
				for (String getname: getArrays) {  // for loop 
				System.out.println(getname+" ");	
				}
					System.out.println();
			}
			}
			
				
	}


