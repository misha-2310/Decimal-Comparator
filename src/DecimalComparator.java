public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b){
        double i = a * 1000.000;
        int a1 = (int) i;

        double j = b * 1000.000;
        int b1 = (int) j;

        return a1 == b1;
    }
}
