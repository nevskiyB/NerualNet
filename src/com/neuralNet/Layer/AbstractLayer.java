package com.neuralNet.Layer;

abstract class AbstractLayer {
    protected double[] units;

    public AbstractLayer(double[] units){
        this.units = units;
    }
}
