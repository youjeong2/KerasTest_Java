public class Ex4_5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {

            for (int j = 0; j <= i; j++)

                System.out.print("*");

            System.out.println();

        }


        int i = 0;

        while (i <= 10) {

            ++i;

            int j = 0;

            System.out.println();

            while (j < i) {

                j++;

                System.out.print("*");

            }

            System.out.println("최종 i=" + i);


        }

    }
}