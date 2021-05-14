package com.neuralNet.ActivationFunction;

public class ReLU implements Activable{
    @Override
    public double getY(double x) {
        return x > 0.0 ? x : 0.0;
    }
}
