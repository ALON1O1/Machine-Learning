package Math;

public class Matrix {
	
	public static float[][] Add(float[][] mat, float num) {
		float[][] new_mat = new float[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] + num;
			}
		}
		return new_mat;
	}
	public static long[][] Add(long[][] mat, long num) {
		long[][] new_mat = new long[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] + num;
			}
		}
		return new_mat;
	}
	public static double[][] Add(double[][] mat, double num) {
		double[][] new_mat = new double[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] + num;
			}
		}
		return new_mat;
	}
	public static int[][] Add(int[][] mat, int num) {
		int[][] new_mat = new int[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] + num;
			}
		}
		return new_mat;
	}
	
	public static float[][] Sub(float[][] mat, float num) {
		float[][] new_mat = new float[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] - num;
			}
		}
		return new_mat;
	}
	public static long[][] Sub(long[][] mat, long num) {
		long[][] new_mat = new long[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] - num;
			}
		}
		return new_mat;
	}
	public static double[][] Sub(double[][] mat, double num) {
		double[][] new_mat = new double[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] - num;
			}
		}
		return new_mat;
	}
	public static int[][] Sub(int[][] mat, int num) {
		int[][] new_mat = new int[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] - num;
			}
		}
		return new_mat;
	}
	
	public static float[][] Add(float[][] mat1, float[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		float[][] new_mat = new float[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return new_mat;
	}
	public static long[][] Add(long[][] mat1, long[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		long[][] new_mat = new long[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return new_mat;
	}
	public static double[][] Add(double[][] mat1, double[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		double[][] new_mat = new double[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return new_mat;
	}
	public static int[][] Add(int[][] mat1, int[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		int[][] new_mat = new int[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] + mat2[i][j];
			}
		}
		return new_mat;
	}
	
	public static float[][] Sub(float[][] mat1, float[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		float[][] new_mat = new float[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return new_mat;
	}
	public static long[][] Sub(long[][] mat1, long[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		long[][] new_mat = new long[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return new_mat;
	}
	public static double[][] Sub(double[][] mat1, double[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		double[][] new_mat = new double[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return new_mat;
	}
	public static int[][] Sub(int[][] mat1, int[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		int[][] new_mat = new int[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] - mat2[i][j];
			}
		}
		return new_mat;
	}
	
	public static float[][] Mul(float[][] mat, float num) {
		float[][] new_mat = new float[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] * num;
			}
		}
		return new_mat;
	}
	public static long[][] Mul(long[][] mat, long num) {
		long[][] new_mat = new long[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] * num;
			}
		}
		return new_mat;
	}
	public static double[][] Mul(double[][] mat, double num) {
		double[][] new_mat = new double[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] * num;
			}
		}
		return new_mat;
	}
	public static int[][] Mul(int[][] mat, int num) {
		int[][] new_mat = new int[mat.length][mat[0].length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] * num;
			}
		}
		return new_mat;
	}
	
	public static float[][] MulCross(float[][] mat1, float[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		float[][] new_mat = new float[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] * mat2[i][j];
			}
		}
		return new_mat;
	}
	public static long[][] MulCross(long[][] mat1, long[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		long[][] new_mat = new long[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] * mat2[i][j];
			}
		}
		return new_mat;
	}
	public static double[][] MulCross(double[][] mat1, double[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		double[][] new_mat = new double[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] * mat2[i][j];
			}
		}
		return new_mat;
	}
	public static int[][] MulCross(int[][] mat1, int[][] mat2) {
		if((mat1.length != mat2.length) || mat1[0].length != mat2[0].length) throw new IllegalArgumentException("Both Matrixes must be the same size.");
		int[][] new_mat = new int[mat1.length][mat1[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat1[i][j] * mat2[i][j];
			}
		}
		return new_mat;
	}
	
	public static float[][] MulDot(float[][] mat1, float[][] mat2){
		if(mat1[0].length != mat2.length) throw new IllegalArgumentException("the number of columns in mat1 must be equal to the number of rows in mat2");
		float[][] new_mat = new float[mat1.length][mat2[0].length];
		final float[][] mat = Matrix.Transpose(mat2);
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = Vector.MulDot(mat1[i], mat[j]);
			}
		}
		return new_mat;
	}
	public static long[][] MulDot(long[][] mat1, long[][] mat2){
		if(mat1[0].length != mat2.length) throw new IllegalArgumentException("the number of columns in mat1 must be equal to the number of rows in mat2");
		long[][] new_mat = new long[mat1.length][mat2[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				for(int k = 0 ; k < mat2.length ; k++) {
					new_mat[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return new_mat;
	}
	public static double[][] MulDot(double[][] mat1, double[][] mat2){
		if(mat1[0].length != mat2.length) throw new IllegalArgumentException("the number of columns in mat1 must be equal to the number of rows in mat2");
		double[][] new_mat = new double[mat1.length][mat2[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				for(int k = 0 ; k < mat2.length ; k++) {
					new_mat[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return new_mat;
	}
	public static int[][] MulDot(int[][] mat1, int[][] mat2){
		if(mat1[0].length != mat2.length) throw new IllegalArgumentException("the number of columns in mat1 must be equal to the number of rows in mat2");
		int[][] new_mat = new int[mat1.length][mat2[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				for(int k = 0 ; k < mat2.length ; k++) {
					new_mat[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		return new_mat;
	}
	
	public static float[][] Transpose(float[][] mat){
		float[][] new_mat = new float[mat[0].length][mat.length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[j][i] = mat[i][j];
				
			}
		}
		return new_mat;
	}
	public static long[][] Transpose(long[][] mat){
		long[][] new_mat = new long[mat[0].length][mat.length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[j][i] = mat[i][j];
				
			}
		}
		return new_mat;
	}
	public static double[][] Transpose(double[][] mat){
		double[][] new_mat = new double[mat[0].length][mat.length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[j][i] = mat[i][j];
				
			}
		}
		return new_mat;
	}
	public static int[][] Transpose(int[][] mat){
		int[][] new_mat = new int[mat[0].length][mat.length];
		for(int i = 0 ; i < mat.length ; i++) {
			for(int j = 0 ; j < mat[i].length ; j++) {
				new_mat[j][i] = mat[i][j];
				
			}
		}
		return new_mat;
	}
	
	public static float[][] Div(float[][] mat, float num){
		float[][] new_mat = new float[mat.length][mat[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] / num;
			}
		}
		return new_mat;
	}
	public static long[][] Div(long[][] mat, long num){
		long[][] new_mat = new long[mat.length][mat[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] / num;
			}
		}
		return new_mat;
	}
	public static double[][] Div(double[][] mat, double num){
		double[][] new_mat = new double[mat.length][mat[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] / num;
			}
		}
		return new_mat;
	}
	public static int[][] Div(int[][] mat, int num){
		int[][] new_mat = new int[mat.length][mat[0].length];
		for(int i = 0 ; i < new_mat.length ; i++) {
			for(int j = 0 ; j < new_mat[i].length ; j++) {
				new_mat[i][j] = mat[i][j] / num;
			}
		}
		return new_mat;
	}
}
