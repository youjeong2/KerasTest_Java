public class java {
    //
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i=1; i<=20; i++) {
//            if(i%2 !=0 && i%3!=0)
//                sum +=i;
//        }
//        System.out.println(sum);
//    }
//
//}
//

//
//        int total = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum += i;
//            total += sum;
//            System.out.print(i);
//            System.out.print(total);
//        }
//        System.out.println(total);
//    }
//}

        int op = 1;

        int i = 0;

        for (int sum = 0; sum <= 100; ) {

            ++i;

            sum += i * op;

            op = -op;

            System.out.println("i=" + i);

            System.out.println("Sum=" + sum);

        }

        System.out.println("최종 i=" + i);

    }
}
