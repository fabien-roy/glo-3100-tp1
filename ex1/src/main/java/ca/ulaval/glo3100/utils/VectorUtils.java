package ca.ulaval.glo3100.utils;

import java.util.*;

public class VectorUtils {

    // TODO : Add javadoc
    public static Double getScalarProduct(List<Double> firstVector, List<Double> secondVector) {
        if (firstVector.size() != secondVector.size()) {
            throw new IllegalArgumentException("Vectors must be of the same size");
        }

        double scalarProduct = 0;

        for (int i = 0; i < firstVector.size(); i++) {
            scalarProduct += firstVector.get(i) * secondVector.get(i);
        }

        return scalarProduct;
    }
}
