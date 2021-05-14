package com.Main;

public class NeuralNet {
    private double alpha = 0.005;
    private double unit, weight;// try to add the bias variable for case in which weight = 0

    public NeuralNet(double unit, double weight){
        this.unit = unit;
        this.weight = weight;
    }

    public void learn(double[][] learningData) {
        unit = learningData[0][0];
        for (int i = 0; i < 10; i++) {
            double pred = func();
            double error = pred - learningData[1][0];
            weight -= alpha * deriv() * error;

            System.out.println(String.format("OUT: %.1f \t TRUE: %.2f \t ERROR: %.3f", pred, learningData[1][0], error));
        }
    }

    //public void run(double[] input){}

    private double func(){
        return unit * weight;
    }

    private double deriv(){
        return unit;
    }
}
