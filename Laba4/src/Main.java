public class Main {
    public static void main(String[] args) {
        double[] v1arr = new double[]{1, 2, 3};
        double[] v2arr = new double[]{4, 5, 6};

        CustomVector v1 = new CustomVector(v1arr);
        CustomVector v2 = new CustomVector(v2arr);

        // Check default methods
        CustomVector add = v1.add(v2);
        System.out.print("Сума векторів: " );
        add.print();

        CustomVector subtract = v1.subtract(v2);
        System.out.print("Різниця векторів: ");
        subtract.print();

        CustomVector multiply = v1.multiply(2.5);
        System.out.print("Множення вектора на число: ");
        multiply.print();
        //

        System.out.println();

        // Check static methods
        CustomVector staticAdd = CustomVector.add(v1, v2);
        System.out.print("Сума векторів: ");
        staticAdd.print();

        CustomVector staticSubtract = CustomVector.subtract(v1, v2);
        System.out.print("Різниця векторів: ");
        staticSubtract.print();

        CustomVector staticMultiply = CustomVector.multiply(v1, 2.5);
        System.out.print("Множення вектора на число: ");
        staticMultiply.print();
        //
    }
}