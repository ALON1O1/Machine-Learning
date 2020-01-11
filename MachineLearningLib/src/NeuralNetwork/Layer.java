package NeuralNetwork;

public interface Layer {
	
	enum LayerType{
		ANN;
	}
	enum ActivationFunction{
		identity, sigmoid;
	}
	enum LossFunction{
		Quadratic
	}
	
	public void addLayer(int size, ActivationFunction function, LayerType type);
	public float[] feedForward(float[] inputs);
	public float[] backPropagation(float[] inputs, float[] target_results, LossFunction loss_function, float rate_of_change);
	
}
