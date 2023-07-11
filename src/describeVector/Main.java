package describeVector;


public class Main {
    public static void main(String[] args) {

        VectorIn3d vectorIn3d1 = new VectorIn3d(3.6, 5.4, 6.5);
        VectorIn3d vectorIn3d2 = new VectorIn3d(8.5, 9.6, 1.1);

        System.out.println();
        System.out.println("Метод, вычисляющий длину вектора");

        System.out.println(vectorIn3d1.vectorLength());
        System.out.println(vectorIn3d2.vectorLength());

        System.out.println();
        System.out.println("Метод, вычисляющий скалярное произведение");

        double scalar = vectorIn3d1.scalarProduct(vectorIn3d2);
        System.out.println(scalar);

        System.out.println();
        System.out.println("Произведение разных векторов");

        VectorIn3d vector = vectorIn3d1.vectorProduct(vectorIn3d2);
        System.out.println(vector);

        System.out.println();
        System.out.println("Метод, вычисляющий угол между векторами");

        double vectorAngle = vectorIn3d1.vectorAngle(vectorIn3d2);
        System.out.println(vectorAngle);

        System.out.println();
        System.out.println("Метод, вычисляющий сумму векторов");

        VectorIn3d vectorPlus = vectorIn3d1.vectorPlus(vectorIn3d2);
        System.out.println(vectorPlus);

        System.out.println();
        System.out.println("Метод, вычисляющий разность векторов");

        VectorIn3d vectorMinus = vectorIn3d1.vectorMinus(vectorIn3d2);
        System.out.println(vectorMinus);
    }
}