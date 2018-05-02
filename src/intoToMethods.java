
public class intoToMethods {
	public static void main(String[] args) {
		rocker("bob");
		truth("Justin Bieber");
		echo("hello");
		repeat("josh", 4);
		theBestCoder("josh");
		int sum = add(2, 3);
		System.out.println(sum);
	}

	static void rocker(String bob) {
		System.out.println(bob + " rocks");
	}

	static void truth(String bobo) {

		if (bobo.equalsIgnoreCase("josh")) {
			System.out.println(bobo + " is bird flapflap McFlapington,      is awesome");
		} else if (bobo.equalsIgnoreCase("Justin Bieber")) {
			System.out.println(bobo + " is annoying");
		} else {
			System.out.println(bobo + " is awesome!");
		}
	}

	static void echo(String bobob) {
		System.out.println(bobob + " " + bobob);
	}

	static void repeat(String bobobo, int i) {

		for (int j = 0; j < i; j += 1) {
			System.out.println(bobobo + " ");
		}
	}

	static void theBestCoder(String getTheBestCoder) {

		// String theBest = getTheBestCoder;
		System.out.println(getTheBestCoder + " is the best coder");

	}

	static int add(int q, int w) {
		return q + w;

	}
}
