import java.sql.Array;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Loop
        // Vòng lặp for ... i
//        for (int i = 0;i<10;i++){
//            System.out.println("Giá trị của i là "+ i);
//        }
        //  Array(mảng) - Collection(Danh sách)
//        int arr[] = new int[5];
//        int[] arr = new int[5];
        int[] arr = {1, 2, 3, 4, 5};
        for (int number : arr) {
            System.out.println("Number " + number);

        }
        // Vòng lặp While
//        int so = 0;
//        boolean check = true;
//        while (check){
//            System.out.println(" Vong lap van hoat dong");
//            if (so >=10){
//                check =false;
//            }
//            so++;
//        }
        Scanner sc = new Scanner(System.in);
//
//        // do ... while
//        int number = 0;
//        do{
//            System.out.println("Hay nhap vao 1 so tu nhien");
//            number = Integer.parseInt(sc.nextLine());
//            System.out.println("So ban vua nhap la "+number);
////            if(number == 9){
////                break;
////            }
//            if(number > 5) {
//                continue;
//            }
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//            System.out.println("Câu lệnh dưới continue .... ");
//        }while(number!=10);
        // Các mệnh đề Break / Continue


        // Bài thực hành kiểm tra số nguyên tố

        System.out.println("Hãy nhậ vào 1 số bạn cần kiểm tra");
        int snt = Integer.parseInt(sc.nextLine());
        boolean flag = true;
        if(snt < 2){
            flag= false;
        }
        for (int i = 2; i < Math.sqrt(snt); i++) {
            if (snt % i == 0) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Là số nguyên tố");
        } else {
            System.out.println("Không phải số nguyên tố");
        }


    }
}
