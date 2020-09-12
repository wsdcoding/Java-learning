/**
 * @Description: StringTest
 * @Authror wsdcoding
 */
public class CPUCacheTest {
    private static int length1 = 1024 * 1024;
    private static int length2 = 6;
    private static int runs = 100;

    public static void main(String[] args) {
        long[][] array = new long[length1][length2];
        /**
         * init array
         */
        for (int i = 0; i < length1; i++) {
            array[i] = new long[length2];
            for (int j = 0; j < length2; j++) {
                array[i][j] = 1;
            }
        }
        System.out.println("init array ------ ");

        long sum = 0L;
        long start = System.currentTimeMillis();
        for (int i = 0; i < runs; i++) {
            for (int j = 0; j < length1; j++) {
                for (int k = 0; k < length2; k++) {
                    sum += array[j][k];
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("sum:" + sum);
        System.out.println("first added times： " + (end - start));

        long sum2 = 0L;
        long start2 = System.currentTimeMillis();
        for (int i = 0; i < runs; i++) {
            for (int j = 0; j < length2; j++) {
                for (int k = 0; k < length1; k++) {
                    sum2 += array[k][j];
                }
            }
        }
        long end2 = System.currentTimeMillis();
        System.out.println("sum:" + sum2);
        System.out.println("第二次add：耗时 " + (end2 - start2));
    }
}

