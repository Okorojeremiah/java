package dietelProject.chapterTwo;

/** (Table of Squares and Cubes) Using only the programming techniques you learned in this
chapter, write an application that calculates the squares and cubes of the numbers from 0 to 10 and
prints the resulting values in table format, as shown below*/


public class SquaresAndCubes {

	//main method begins to execute java application
	public static void main(String[] args) {
	
		int a, b, c, d, e, f, g, h, i, j;
		
		a = 1;
		b = 2;
		c = 3;
		d = 4;
		e = 5;
		f = 6;
		g = 7;
		h = 8;
		i = 9;
		j = 10;

		
		int square1 = a * a;
		int square2 = b * b;
		int square3 = c * c;
		int square4 = d * d;	
		int square5 = e * e;
		int square6 = f * f;
		int square7 = g * g;
		int square8 = h * h;
		int square9 = i * i;
		int square10 = j * j;

		int cube1 = a * a * a;
		int cube2 = b * b * b;
		int cube3 = c * c * c;
		int cube4 = d * d * d;
		int cube5 = e * e * e;
		int cube6 = f * f * f;
		int cube7 = g * g * g;
		int cube8 = h * h * h;
		int cube9 = i * i * i;
		int cube10 = j * j * j;


		System.out.println("number     square     cubes");
		System.out.printf("%d          %d          %d%n", a, square1, cube1);
		System.out.printf("%d          %d          %d%n", b, square2, cube2);
		System.out.printf("%d          %d          %d%n", c, square3, cube3);
		System.out.printf("%d          %d         %d%n", d, square4, cube4);
		System.out.printf("%d          %d         %d%n", e, square5, cube5);
		System.out.printf("%d          %d         %d%n", f, square6, cube6);
		System.out.printf("%d          %d         %d%n", g, square7, cube7);
		System.out.printf("%d          %d         %d%n", h, square8, cube8);
		System.out.printf("%d          %d         %d%n", i, square9, cube9);
		System.out.printf("%d         %d        %d%n", j, square10, cube10);

	}

}