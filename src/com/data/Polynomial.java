package com.data;

/**
 * Class for getting the power function learning data.
 * @see {@link Datable}
 * @author Boris Nevskiy
 */
public class Polynomial implements Datable{
    private double[] xArray;// X points
    private double[] params;// Weights values

    /**
     * @param xArray {@link Double} x-axis
     * @param params {@link Double} polynomial arguments
     */
    public Polynomial(double[] params, double... xArray){
        this.params = params;
        this.xArray = xArray;
    }

    private double Y(double x){
        double result = params[params.length - 1];

        for (int i = params.length - 2; i >= 0; i--)
            result += params[i] * x;

        return result;
    }

    private double[] Y(double[] xArray){
        double[] output = new double[xArray.length];

        for (int i = 0; i < output.length; i++)
            output[i] = Y(xArray[i]);

        return output;
    }

    /**
     * @return matrix of {@link Double} in which first line is x-axis, and second line is y-axis.
     * @throws Exception
     */
    @Override
    public double[][] getData(){
        double[][] data = new double[2][xArray.length];
        data[0] = xArray;
        data[1] = Y(xArray);

        return data;
    }

    /*
    private double[] getX(double firstValue, double lastValue, int count) throws Exception {
        if(firstValue >= lastValue)
            throw new Exception("The last value is lower then first");

        double step = (lastValue - firstValue)/count;
        double[] xArray = new double[count];
        double store = firstValue;

        for (int i = 0; i < count; i++) {
            xArray[i] = store;
            store += step;
        }

        return xArray;
    }
    */
}
