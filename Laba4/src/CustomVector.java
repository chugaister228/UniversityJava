public class CustomVector {
    private double[] values;

    public CustomVector(double[] values) {
        this.values = values;
    }

    public double[] getValues() {
        return values;
    }

    // sum
    public CustomVector add(CustomVector other) {
        if (values.length != other.values.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] + other.values[i];
        }
        return new CustomVector(result);
    }

    // subtract
    public CustomVector subtract(CustomVector other) {
        if (values.length != other.values.length) {
            throw new IllegalArgumentException("Vectors must have the same length");
        }
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] - other.values[i];
        }
        return new CustomVector(result);
    }

    // multiply on scalar
    public CustomVector multiply(double scalar) {
        double[] result = new double[values.length];
        for (int i = 0; i < values.length; i++) {
            result[i] = values[i] * scalar;
        }
        return new CustomVector(result);
    }

    // static add
    public static CustomVector add(CustomVector v1, CustomVector v2) {
        return v1.add(v2);
    }

    // static subtract
    public static CustomVector subtract(CustomVector v1, CustomVector v2) {
        return v1.subtract(v2);
    }

    // static multiply
    public static CustomVector multiply(CustomVector v, double scalar) {
        return v.multiply(scalar);
    }

    public void print() {
        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();
    }

}
