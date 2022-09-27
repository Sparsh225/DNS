ackage DNS;

import java.util.Scanner;

public class binary {

	public static int count(int n) {
		int c = 0;
		while (n > 0) {
			c = c + 1;
			n /= 10;

		}
		return c;
	}

	public static int power(int n, int pow) {
		if (pow == 0) {
			return 1;
		}
		int s = 1;
		while (pow > 0) {
			s = s * n;
			pow = pow - 1;
		}
		return s;
	}

	public static int binaryToInt(int n) {
		int i = 0, s = 0;
		while (n > 0) {
			s = s + (n % 10) * power(2, i);
			n /= 10;
			i++;
		}
		return s;
	}

	public static int intToBinary(int n) {
		int i = 0;
		int[] a = new int[10];

		while (n > 0) {
			a[i] = n % 2;
			n /= 2;
			i++;
		}
		int l = 0, r = i - 1;
		while (l < r) {
			int temp = a[l];
			a[l] = a[r];
			a[r] = temp;
			l++;
			r--;
		}
		l = 0;
		for (int j = 0; j < i; j++) {
			l = l * 10 + a[j];
		}
		return l;
	}

	public static int andf(int a, int b, int mc) {
		int temp = mc;
		int[] res = new int[mc];
		mc -= 1;
		while (a > 0 || b > 0) {
			if (a % 10 == 1 && b % 10 == 1) {
				res[mc] = 1;
			} else {
				res[mc] = 0;
			}
			mc -= 1;
			a /= 10;
			b /= 10;
		}
		mc = 0;
		for (int i = 0; i < temp; i++) {
			mc = mc * 10 + res[i];
		}
		return mc;
	}

	public static int orf(int a, int b, int mc) {
		int temp = mc;
		int res[] = new int[mc];
		mc -= 1;
		while (a > 0 || b > 0) {
			if (a % 10 == 0 && b % 10 == 0) {
				res[mc] = 0;
			} else {
				res[mc] = 1;
			}
			mc -= 1;
			a /= 10;
			b /= 10;
		}
		mc = 0;
		for (int i = 0; i < temp; i++) {
			mc = mc * 10 + res[i];
		}
		return mc;
	}

	public static int xorf(int a, int b, int mc) {
		int temp = mc;
		int res[] = new int[mc];
		mc -= 1;
		while (a > 0 || b > 0) {
			if (a % 10 == b % 10) {
				res[mc] = 0;
			} else {
				res[mc] = 1;
			}
			mc -= 1;
			a /= 10;

			b /= 10;
		}
		mc = 0;
		for (int i = 0; i < temp; i++) {
			mc = mc * 10 + res[i];
		}
		return mc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 Integer ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int binA = intToBinary(a);
		int binB = intToBinary(b);
		int mc = 0;
		int ac = count(binA);
		int bc = count(binB);
		if (ac > bc) {
			mc = ac;
		} else {
			mc = bc;
		}
		int and = andf(binA, binB, mc);
		int or = orf(binA, binB, mc);
		int xor = xorf(binA, binB, mc);
		System.out.println("Binary of " + a + " is " + binA);
		System.out.println("Binary of " + b + " is " + binB);
		System.out.println("AND-> " + binaryToInt(and));
		System.out.println("OR -> " + binaryToInt(or));
		System.out.println("XOR-> " + binaryToInt(xor));
	}
}
