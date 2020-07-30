// stack을 만드는 방법

public class Ex1 {
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] j = new int[100];

        for (int b = 0; b < 100; b++) {
            a[b] = 0;
            j[b] = 0;
        }
        for (int c = 0; c < 100; c++) {
            a[c] = 1 + c;
        }
        for (int c = 0; c < 100; c++) {
            System.out.println(a[c]);
        }
        for(int e=99; e>-1; e--){
            j[99-e] = a[e];
            a[e] = 0;
        }
        for(int e=0; e<100; e++) {
            System.out.println("j = "+j[e]);
        }
    }
}
