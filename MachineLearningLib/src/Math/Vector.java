package Math;

public class Vector {
	
	public static float[] Add(float[] vec, float num) {
		float[] new_vec = new float[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] + num;
		}
		return new_vec;
	}
	public static long[] Add(long[] vec, long num) {
		long[] new_vec = new long[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] + num;
		}
		return new_vec;
	}
	public static double[] Add(double[] vec, double num) {
		double[] new_vec = new double[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] + num;
		}
		return new_vec;
	}
	public static int[] Add(int[] vec, int num) {
		int[] new_vec = new int[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] + num;
		}
		return new_vec;
	}
	
	public static float[] Sub(float[] vec, float num) {
		float[] new_vec = new float[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] - num;
		}
		return new_vec;
	}
	public static long[] Sub(long[] vec, long num) {
		long[] new_vec = new long[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] - num;
		}
		return new_vec;
	}
	public static double[] Sub(double[] vec, double num) {
		double[] new_vec = new double[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] - num;
		}
		return new_vec;
	}
	public static int[] Sub(int[] vec, int num) {
		int[] new_vec = new int[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] - num;
		}
		return new_vec;
	}

	public static float[] Mul(float[] vec, float num) {
		float[] new_vec = new float[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] * num;
		}
		return new_vec;
	}
	public static long[] Mul(long[] vec, long num) {
		long[] new_vec = new long[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] * num;
		}
		return new_vec;
	}
	public static double[] Mul(double[] vec, double num) {
		double[] new_vec = new double[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] * num;
		}
		return new_vec;
	}
	public static int[] Mul(int[] vec, int num) {
		int[] new_vec = new int[vec.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec[i] * num;
		}
		return new_vec;
	}

	public static float[] Add(float[] vec1, float[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		float[] new_vec = new float[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] + vec2[i];
		}
		return new_vec;
	}
	public static long[] Add(long[] vec1, long[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		long[] new_vec = new long[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] + vec2[i];
		}
		return new_vec;
	}
	public static double[] Add(double[] vec1, double[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		double[] new_vec = new double[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] + vec2[i];
		}
		return new_vec;
	}
	public static int[] Add(int[] vec1, int[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		int[] new_vec = new int[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] + vec2[i];
		}
		return new_vec;
	}
	
	public static float[] Sub(float[] vec1, float[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		float[] new_vec = new float[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] - vec2[i];
		}
		return new_vec;
	}
	public static long[] Sub(long[] vec1, long[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		long[] new_vec = new long[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] - vec2[i];
		}
		return new_vec;
	}
	public static double[] Sub(double[] vec1, double[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		double[] new_vec = new double[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] - vec2[i];
		}
		return new_vec;
	}
	public static int[] Sub(int[] vec1, int[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		int[] new_vec = new int[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] - vec2[i];
		}
		return new_vec;
	}

	public static float[] MulCross(float[] vec1, float[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		float[] new_vec = new float[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] * vec2[i];
		}
		return new_vec;
	}
	public static long[] MulCross(long[] vec1, long[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		long[] new_vec = new long[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] * vec2[i];
		}
		return new_vec;
	}
	public static double[] MulCross(double[] vec1, double[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		double[] new_vec = new double[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] * vec2[i];
		}
		return new_vec;
	}
	public static int[] MulCross(int[] vec1, int[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must have the same size");
		int[] new_vec = new int[vec1.length];
		for(int i = 0 ; i < new_vec.length ; i++) {
			new_vec[i] = vec1[i] * vec2[i];
		}
		return new_vec;
	}

	public static float MulDot(float[] vec1, float[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must be same size");
		float sum = 0;
		for(int i = 0 ; i < vec1.length ; i++) {
			sum += vec1[i] * vec2[i];
		}
		return sum;
	}
	public static long MulDot(long[] vec1, long[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must be same size");
		long sum = 0;
		for(int i = 0 ; i < vec1.length ; i++) {
			sum += vec1[i] * vec2[i];
		}
		return sum;
	}
	public static double MulDot(double[] vec1, double[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must be same size");
		double sum = 0;
		for(int i = 0 ; i < vec1.length ; i++) {
			sum += vec1[i] * vec2[i];
		}
		return sum;
	}
	public static int MulDot(int[] vec1, int[] vec2) {
		if(vec1.length != vec2.length) throw new IllegalArgumentException("vectors must be same size");
		int sum = 0;
		for(int i = 0 ; i < vec1.length ; i++) {
			sum += vec1[i] * vec2[i];
		}
		return sum;
	}

	public static float sum(float[] vec) {
		float sum = 0;
		for(float temp : vec) {
			sum += temp;
		}
		return sum;
	}
	public static long sum(long[] vec) {
		long sum = 0;
		for(long temp : vec) {
			sum += temp;
		}
		return sum;
	}
	public static double sum(double[] vec) {
		double sum = 0;
		for(double temp : vec) {
			sum += temp;
		}
		return sum;
	}
	public static int sum(int[] vec) {
		int sum = 0;
		for(int temp : vec) {
			sum += temp;
		}
		return sum;
	}

	public static float[] div(float[] vec, float num) {
		float[] v = new float[vec.length];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = vec[i] / num;
		}
		return v;
	}
	public static long[] div(long[] vec, long num) {
		long[] v = new long[vec.length];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = vec[i] / num;
		}
		return v;
	}
	public static double[] div(double[] vec, double num) {
		double[] v = new double[vec.length];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = vec[i] / num;
		}
		return v;
	}
	public static int[] div(int[] vec, int num) {
		int[] v = new int[vec.length];
		for(int i = 0 ; i < v.length ; i++) {
			v[i] = vec[i] / num;
		}
		return v;
	}
}
