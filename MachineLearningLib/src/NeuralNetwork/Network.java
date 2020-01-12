package NeuralNetwork;

import Math.Vector;

public class Network {
	
	private Layer layers;
	private LossFunction function;

	public Network(int[][] layers, LayerType[] layer_types, ActivationFunction[] activation_functions, int num_of_inputs, LossFunction loss_function) {
		if(layers.length != layer_types.length || layers.length != activation_functions.length) throw new IllegalArgumentException("layers array must be the same size as layer_types array and activation_function array. layers:" + layers.length + " layer_types:" + layer_types.length + " activation_function:" + activation_functions.length);
		if(num_of_inputs <= 0) throw new IllegalArgumentException("num_of_inputs must be greater than 0. Value is " + num_of_inputs);
		if(loss_function == null) throw new IllegalArgumentException("loss_function must not be null");
		switch(layer_types[0]) {
			case ANN: this.layers = new ANNLayer(num_of_inputs, layers[0][0], activation_functions[0]);
		}
		for(int i = 1 ; i < layers.length ; i++) {
			this.layers.addLayer(layers[i], activation_functions[i], layer_types[i]);
		}
		function = loss_function;
	}
	
	public float[] feedForward(float[] inputs) {
		return layers.feedForward(inputs);
	}
	public void backPropagation(float[] inputs, float[] target_results, float rate_of_change) {
		layers.backPropagation(inputs, target_results, function, rate_of_change);
	}
	
	public void printNetwork() {
		System.out.println(layers.toString());
	}
	
	public float getCost(float[] inputs, float[] targets) {
		return (float)Math.pow(Vector.sum(Vector.Sub(targets, feedForward(inputs))), 2);
	}
	
	public static void main(String[] args) {
		int[] layers = new int[] {2, 1};
		LayerType[] types = new LayerType[] {LayerType.ANN, LayerType.ANN};
		ActivationFunction[] activation_functions = new ActivationFunction[] {ActivationFunction.sigmoid, ActivationFunction.sigmoid};
		int num_of_inputs = 2;
		LossFunction loss_function = LossFunction.Quadratic;
		
		
		Network network = new Network(new int[][] {layers}, types, activation_functions, num_of_inputs, loss_function);
		network.printNetwork();
		
		float[] inputs = new float[]{1, 0};
		float[] targets = new float[] {1};
		float rate_of_change = 0.01F;
		int repeats = 1000000;
		
		for(int i = 0 ; i < repeats ; i++) {
			float[] results = network.feedForward(inputs);
			for(int j = 0 ; j < results.length ; j++) {
				System.out.println("result " + j + ": " + results[j]);
			}
			System.out.println(network.getCost(inputs, targets));
			System.out.println();
			network.backPropagation(inputs, targets, rate_of_change);
		}
		network.printNetwork();
	}
	
}
