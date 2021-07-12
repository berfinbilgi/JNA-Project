package proje;

import com.sun.jna.Native;

public class MathFunc {

	static {
		System.loadLibrary("libJNAProjectdll");
	}

	public native int Add(int a, int b);

	public native int Subtract(int a, int b);

	public native int Multiply(int a, int b);

	public native int Divide(int a, int b);

	public static void main(String[] args) {

		IMathFunc mathFuncs = (IMathFunc) Native.loadLibrary("libJNAProjectdll", IMathFunc.class);
		int answer1 = mathFuncs.Add(20, 10);
		int answer2 = mathFuncs.Subtract(20, 10);
		int answer3 = mathFuncs.Multiply(20, 10);
		int answer4 = mathFuncs.Divide(20, 10);
		System.out.println(answer1);
		System.out.println(answer2);
		System.out.println(answer3);
		System.out.println(answer4);

	}
}
