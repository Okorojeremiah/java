package dietelProject.chapterFour;

public class Student {
	private String name;
	private double average;


	public Student(String name, double average) {
		this.name = name;

		if (average > 0.0) {
			if (average <=100.0) {
				this.average = average;
			}
		}
	}	
	
	public void setName(String name) {
		this.name = name;
	} 

	public String getName() {
		return name;
	}
	
	public void setAvarage(double studentAverage) {
		if (average > 0) {
			if (average <= 100) {
				this.average = average;
			}
		}
	}

	public double getAverage() {
		return average;
	}

	public String getLetterGrade() {
		String letterGrade = " ";

		if (average >= 90.0) {
			letterGrade = "A";
		}
		
		if (average >=80.0) {
			letterGrade = "B";
		}

		if (average >= 70.0) {
			letterGrade = "C";
		}

		if (average >= 60.0) {
			letterGrade = "D";
		}

		if (average >= 50.0) {
			letterGrade = "E";
		}
	
		else {
			letterGrade = "F";
		}
		
		return letterGrade;
	}

}



