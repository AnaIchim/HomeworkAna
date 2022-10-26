package homeworkJava01;

public class MathFunctions {

    public static void runVolume() {

    int vertex = 5;
    System.out.println("The volume for a cube with vertex = "+vertex +" is "+ computeVolume(vertex));
    double l = 6;
    double b = 3;
    double h = 2;
    System.out.println("The volume for a cuboid with l = " +l + " b = "+b+" h = "+h+" is "+ computeVolume(l, b, h));
    float r = 7;
    System.out.println("The volume for a sphere with r = "+r +" is "+ computeVolume(r));
    double r2 = 6;
    double R = 8;
    System.out.println("The volume for a torus with r = "+r + " R = " + R+ " is "+ computeVolume(r2, R));
    int a = 3;
    int b2 = 4;
    int h2 = 6;
    System.out.println("The volume for a triangular pyramid is "+ computeVolume(a, b2, h2));
}

    public static double computeVolume(int vertex) {
        return Math.pow(vertex, 3);
    }

    public static double computeVolume (double l, double b, double h) {
        return l*b*h;
    }

    public static double computeVolume (float r) {
        return (4 / 3.0) * (22 / 7.0) * Math.pow(r, 3);
    }
    public static double computeVolume (double r, double R) {
        return 2 * 3.14 * 3.14 * R * r * r;
    }
    public static double computeVolume (int a, int b, int h) {
        return (0.1666) * a * b * h;
    }
}

