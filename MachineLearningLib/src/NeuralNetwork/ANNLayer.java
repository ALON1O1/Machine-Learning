package NeuralNetwork;

import java.util.Random;

import Math.Matrix;
import Math.Vector;

public class ANNLayer extends Layer{
	
	protected float[][] weights;
	protected float[] biases;
	
	public ANNLayer(int num_of_inputs, int size, ActivationFunction function) {
		if(function == null) throw new IllegalArgumentException("function must not be null");
		weights = new float[size][num_of_inputs];
		biases = new float[size];
		this.function = function;
		next = null;
		num_of_outputs = size;
		
		Random r = new Random();
		
		for(int i = 0 ; i < size ; i++) {
			biases[i] = r.nextFloat() + r.nextFloat() - 1;
			for(int j = 0 ; j < num_of_inputs ; j++) {
				weights[i][j] = r.nextFloat() + r.nextFloat() - 1;
			}
		}
	}
	
	public float[] feedForward(float[] inputs) {
		if(inputs.length != weights[0].length) throw new IllegalArgumentException("Number of given inputs must be the same as the number of required inputs. Given inputs:" + inputs.length + " Required inputs:" + weights[0].length);
		float[] results = new float[weights.length];
		for(int i = 0 ; i < results.length ; i++) {
			results[i] = activate(Vector.MulDot(inputs, weights[i]) + biases[i]);
		}
		if(next == null) return results;
		return next.feedForward(results);
	}
	
	public float[] backPropagation(float[] inputs, float[] target_results, LossFunction loss_function, float rate_of_change) {
		if(inputs.length != weights[0].length) throw new IllegalArgumentException("Number of given inputs must be the same as the number of required inputs. Given inputs:" + inputs.length + " Required inputs:" + weights[0].length);
		if(next == null && weights.length != target_results.length) throw new IllegalArgumentException("Number of target results must be equal to the number of perceptrons on the last layer. target_results size: " + target_results.length + " number of perceptrons: " + weights.length);
		float[] results = new float[weights.length];
		for(int i = 0 ; i < results.length ; i++) {
			results[i] = activate(Vector.MulDot(inputs, weights[i]) + biases[i]);
		}
		float[] err;
		if(next != null) err = next.backPropagation(inputs, target_results, loss_function, rate_of_change);
		else err = Vector.Sub(target_results, results);
		
		float[][] weight_changes = new float[weights.length][weights[0].length];
		float[] bias_changes = new float[biases.length];
		
		for(int i = 0 ; i < weight_changes.length ; i++) {
			bias_changes[i] = deriveLoss(err[i], loss_function) * -derive(Vector.MulDot(inputs, weights[i]) + biases[i]) * rate_of_change;
			for(int j = 0 ; j < weight_changes[i].length ; j++) {
				weight_changes[i][j] = bias_changes[i] * inputs[j];
			}
		}
		err = Matrix.MulDot(new float[][] {err}, weights)[0];
		
		weights = Matrix.Sub(weights, weight_changes);
		biases = Vector.Sub(biases, bias_changes);
		return err;
	}
	
	private float deriveLoss(float err, LossFunction function) {
		switch(function) {
			case Quadratic: return 2 * err;
			default: return 0;
		}
	}
	private float activate(float value) {
		switch(function) {
			case identity: return value;
			case sigmoid: return (float)(1 / (1 + Math.pow(Math.E, -value)));
			default: return 0;
		}
	}
	private float derive(float value) {
		switch(function) {
			case identity: return 1;
			case sigmoid:
				float sigmoid = (float)(1 / (1 + Math.pow(Math.E, -value)));
				return sigmoid * (1 - sigmoid);
			default: return 0;
		}
	}
	
	public String toString() {
		String s = "Layer Type: ANN\nActivation Function:" + function.name() + "\n";
		for(int i = 0 ; i < weights.length ; i++) {
			s += "neuron number:" + i + "\nbias:" + biases[i] + "\n";
			for(int j = 0 ; j < weights[i].length ; j++) {
				s += "weight " + j + ":" + weights[i][j] + ",   ";
			}
			s += "\n";
		}
		if(next != null) s += "\n" + next.toString();
		return s;
	}

}
