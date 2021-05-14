package com.Main;

import com.data.*;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        NeuralNet AI = new NeuralNet(1, 1);//neural network initialization

        AI.learn(getLerningData());//learning...
    }

    private static double[][] getLerningData(){
        double[] polynimial = {1};// linear function with 45 degrees angel
        Datable learningData = new Polynomial(polynimial, 10);
        return learningData.getData();
    }
}