package view;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputView {

    public static String inputMenu() {
        System.out.println("----------------------------------");
        System.out.println("1. 로또 구입");
        System.out.println("2. 구입한 로또 개수 조회");
        System.out.println("3. 구입한 로또 조회");
        System.out.println("4. 종료");
        System.out.println("번호를 입력 해주세요: ");
        return new Scanner(System.in).nextLine();
    }

    public static List<Integer> inputLotto() {
        System.out.println("구입할 로또 번호를 입력 해주세요: ");

        String number = new Scanner(System.in).nextLine();
        String[] split = number.split(",");
        return Arrays.stream(split)
                .map(Integer::parseInt)
                .toList();
    }
}
