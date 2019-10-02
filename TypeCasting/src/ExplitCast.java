public class ExplitCast {
    public static void main (String [] args) {
        long L = 10;
        double d = 1; // неявное приведение long в double
        L =  (long) d; // явное приведение double в long
        byte x, z;
        int y;

        x = 5;
        y = x * x; //  все правильно, результат операции имеет тип int
        z = (byte) (x * x); // чтобы записать результат в переменную типа byte,
                            // требуется явное преобразование типа результата
    }
}
