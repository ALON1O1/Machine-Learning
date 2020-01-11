package NeuralNetwork;

public abstract class Layer {
	
	enum LayerType{
		ANN;
	}
	enum ActivationFunction{
		identity, sigmoid;
	}
	enum LossFunction{
		Quadratic
	}
	
	protected Layer next;
	protected ActivationFunction function;
	protected int num_of_outputs;
	
	public void addLayer(int size[], ActivationFunction function, LayerType type) {
		if(next == null) {
			switch(type) {
				case ANN: next = new ANNLayer(num_of_outputs, size[0], function); break;
			}
		}
		else next.addLayer(size, function, type);
	}
	public abstract float[] feedForward(float[] inputs);
	public abstract float[] backPropagation(float[] inputs, float[] target_results, LossFunction loss_function, float rate_of_change);
	
}
