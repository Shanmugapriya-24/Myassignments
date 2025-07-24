package week1.day1;

public class PracticeOpertors {

	// Assignment operator
	// Arithmetic operator
	// Comparison operator
	// Logical operator
	// Increment/Decrement operator

	public static void main(String[] args) {
		// Assignment operator sign is =
		int age = 27;
		System.out.println(age);

		// Arithmetic operator
		// symbols to be used in java( addition +, subtraction -, multiplication *,
		// division remainder %, quotient /
		int a = 10;
		int b = 40;
		// addition +
		System.out.println(a + b);

		System.out.println("------------");

		int c = 10;
		int d = 40;
		// Subtraction
		System.out.println(c - d);

		System.out.println("------------");

		int e = 10;
		int f = 40;
		// multiplication
		System.out.println(e * f);

		System.out.println("------------");

		// division
		int g = 100;
		int h = 10;
		System.out.println(g / h);
		System.out.println(g % h);

		System.out.println("------------");

		// comparison operator
		// equal to ==
		// not equal to!=
		// less than <
		// less than or equal to <=
		// greater than >
		// greater than or equal to >=

		int i = 100;
		int j = 200;
		System.out.println(i == j);
		System.out.println(i != j);
		System.out.println(i < j);
		System.out.println(i <= j);
		System.out.println(i > j);
		System.out.println(i >= j);

		System.out.println("------------");

		// Logical operators(compare 2 conditions)
		// and && condition 1 and condition 2 = 2 condition must be true = true
		// or || Condition 1 and condition 2 = any 1 condition must be true

		// And && both condition should be satisfied
		int k = 20;
		int l = 60;

		System.out.println(k < l && k <= l); // 20<100 20<=10 = true
		System.out.println(k < l && k >= l); // 20<100 20>=10 = false

		System.out.println("--------------");

		// or|| any one condition should be satisfied
		System.out.println(k < l || k >= l); // 20<10 one condition satisfied , 20>=10 not satisfied out put is true

		System.out.println("-------------------------");

		// Increment/Decrement
//increment operator will increase the value by 1
//decrement operator will decrease the value by 1
		// increment symbol is ++, increment is of 2 types post increment a++ , pre
		// increment ++a
		// Decrement symbol is --, Decrement is of 2 types post Decrement a-- , pre
		// Decrement --a

		int m = 100;

		System.out.println(m++); //100
		System.out.println(m); //101
		System.out.println(++m); // 102

		System.out.println("------------------");

		System.out.println(m--); //102
		System.out.println(m); // 101
		System.out.println(--m); // 100

	}

}
