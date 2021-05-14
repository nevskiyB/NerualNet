package com.neuralNet.Layer;

class MatrixOperations {
    public static double getMultply(double[] vec1, double[] vec2) throws Exception {
        if(vec1.length == vec2.length){
            double result = 0;

            for (int i = 0; i < vec1.length; i++)
                result += vec1[i] * vec2[i];

            return result;
        } else {
            throw new Exception("Vectors size is does not equals");
        }
    }
    /*
    public static double[] getMultiply(double[] vec, double[][] matrix) throws Exception{
        if(vec.length != matrix.length)
            throw new Exception("Vectors size is does not equals");

        double[] newVec = new double[matrix[0].length];

        for (int i = 0; i < newVec.length; i++) {
            newVec[i] = getMultply(vec, matrix[]);
        }
    }
    */
}
