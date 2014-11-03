package Lab3Package;

public class Lab3StudentPoints {
	
	//establishes the Student class that all the students belong to
	public static class Student{
		int lab;
		int bonus;
		
		public void setLab(int inp){
			lab = inp;
		}
		public void setBonus(int inp){
			bonus = inp;
		}
		
		public int getLab(){
			return lab;
		}
		public int getBonus(){
			return bonus;
		}
		public int getTotal(){
			return lab+bonus;
		}
	}
	
	//Helps with formatting the print statements; repeat is used by formatln
	public static String repeat(String s, int times) {
	    if (times <= 0) return "";
	    else return s + repeat(s, times-1);
	}
	
	public static String formatln(int spaces, int actionNumber){ //takes # of spaces in part of graph, what method is being called, and for whom it is being called
		spaces = (spaces-(Integer.toString(actionNumber)).length());
		return repeat(" ", spaces);
	}

	public static void main(String[] args) {
		
		//creates each individual student and assigns values
		Student grumpy = new Student(); //creation
		grumpy.setLab(48); //assignment
		grumpy.setBonus(1);
		
		Student sleepy = new Student();
		sleepy.setLab(12);
		sleepy.setBonus(0);
		
		Student doc = new Student();
		doc.setLab(50);
		doc.setBonus(7);
		
		Student dopey = new Student();
		dopey.setLab(45);
		dopey.setBonus(9);
		
		Student bashful = new Student();
		bashful.setLab(50);
		bashful.setBonus(10);
		
		
		//prints values in chart form
		int lab;
		int bonus;
		int total;
		
		System.out.println("////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("||       Student Points       ||");
		System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\////////////////");
		System.out.println("");
		System.out.println("_________________________________");
		System.out.println("|Name     | Lab | Bonus | Total |");
		System.out.println("|_________|_____|_______|_______|");
		
		lab = grumpy.getLab();
		bonus = grumpy.getBonus();
		total = grumpy.getTotal();
		System.out.println("|Grumpy   |" + lab + formatln(5,lab) + "|" + bonus + formatln(7,bonus) + "|" + total + formatln(7,total) + "|");
		
		lab = sleepy.getLab();
		bonus = sleepy.getBonus();
		total = sleepy.getTotal();
		System.out.println("|Sleepy   |" + lab + formatln(5,lab) + "|" + bonus + formatln(7,bonus) + "|" + total + formatln(7,total) + "|");
		
		lab = doc.getLab();
		bonus = doc.getBonus();
		total = doc.getTotal();
		System.out.println("|Doc      |" + lab + formatln(5,lab) + "|" + bonus + formatln(7,bonus) + "|" + total + formatln(7,total) + "|");
		
		lab = dopey.getLab();
		bonus = dopey.getBonus();
		total = dopey.getTotal();
		System.out.println("|Dopey    |" + lab + formatln(5,lab) + "|" + bonus + formatln(7,bonus) + "|" + total + formatln(7,total) + "|");
		
		lab = bashful.getLab();
		bonus = bashful.getBonus();
		total = bashful.getTotal();
		System.out.println("|Bashful  |" + lab + formatln(5,lab) + "|" + bonus + formatln(7,bonus) + "|" + total + formatln(7,total) + "|");
		
		System.out.println("|_________|_____|_______|_______|");
	}
}
