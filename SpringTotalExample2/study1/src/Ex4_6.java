public class Ex4_6 {
    public static void main(String[] args) {

/*		int ir = (int)(Math.random()*6+1);

		int jr = (int)(Math.random()*6+1);*/

        for (int i = 1; i < 7; i++) {
            for (int j = 1; j < 7; j++) {
                if (i + j == 6) {
                    System.out.println(i + "+" + j + "=6");
                }
            }

        }

    }

}



