package com.class31;

public abstract class Marks {
	

		public  abstract double getPercentage () ;
		
		}

	class StudentA extends Marks {
		int subj1;
		int subj2;
		int subj3;
		
		public StudentA(int subj1, int subj2,int subj3){
			this.subj1=subj1;
			this.subj2=subj2;
			this.subj3=subj3;
			}
		public double getPercentage() {
			double percantage= (subj1+subj2+subj3)/3;
			return percantage;
		}
	}
	class StudentB extends Marks {
		int subj1;
		int subj2;
		int subj3;
		int subj4;
		public StudentB(int subj1, int subj2,int subj3, int subj4){
			this.subj1=subj1;
			this.subj2=subj2;
			this.subj3=subj3;
			this.subj4=subj4;
			}
		public double getPercentage() {
			double percantage= (subj1+subj2+subj3+subj4)/4;
			return percantage;
		}
	}
