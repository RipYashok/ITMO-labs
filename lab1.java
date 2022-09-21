import static java.lang.Math.*;
import java.util.Arrays;
public class lab1 {

    /*
     * функция возвращающая случайное число от -14.0 до 14.0
     */

    public static Float randomaizer() {
        int max = 14;
        int min = -14;
        double r = (Math.random() * ((max - min))) + min;
        float rNun = (float) r;
        return rNun;
    }
    public static void main(String[] args) {

        /*
         * одномерный массив c типа short
         */

        Short[] numbers = new Short[17];
        for (short i = 18; i > 1; i--) {
            numbers[18 - i] = i;
        }

        /*
         * одномерный массив x типа float
         */

        Float[] randomNun = new Float[17];
        for (int i = 0; i < 17; i++) {
            randomNun[i] = randomaizer();
        }

        /*
         *  двумерный массив c размером 17x17 и работа с формулами
         */

        int[] mass = {2, 3, 4, 9, 10, 14, 16, 18};

        Double[][] DuoArr = new Double [17][17];
        for (int i = 0; i < 17; i++) {
            System.out.print('|');
            for (int j = 0; j < 17; j++) {
                int nAr1 = (int) numbers[i];
                double nAr2 = (double) randomNun[j];

                if (nAr1 == 5) {
                    DuoArr[i][j] = log(abs(pow((pow((nAr2 - 1), 3) - 1), pow(nAr2, (nAr2 * (nAr2 - 1) ) ) ) ) );
                    System.out.printf("%14.5f",DuoArr[i][j]);
                    System.out.print('|');
                }
                else {
                    if (Arrays.binarySearch(mass, nAr1) > -1) {
                        DuoArr[i][j] = pow(E, pow(E, log(abs(nAr2))));
                        System.out.printf("%14.5f",DuoArr[i][j]);
                        System.out.print('|');
                    }
                    else {
                        DuoArr[i][j] = pow((1 - tan(pow(E, asin(nAr2 / 28))) / 4), 3);
                        System.out.printf("%14.5f",DuoArr[i][j]);
                        System.out.print('|');
                    }
                }
            }
            System.out.println(' ');
        }
    }
}