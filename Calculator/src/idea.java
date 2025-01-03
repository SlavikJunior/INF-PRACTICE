import java.util.Scanner;

public class idea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите операцию, которую хотите провести с двумя числами: \n" +
                "1 - сложение\n" +
                "2 - вычитание \n" +
                "3 - умножение\n" +
                "4 - деление");
        int move = scanner.nextInt();
        boolean flag = activityCheck(move);
        if (flag){
            System.out.println("Через Enter введите два оперируемых числа");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(firstMove(move, a, b));
        }
        else
            System.out.println("Увы");

    }
    public static int firstMove(int step, int num1, int num2){
        int res = 0;
        switch (step){
            case 1:
                res = num1 + num2;
                break;
            case 2:
                res = num1 - num2;
                break;
            case 3:
                res = num1 * num2;
            case 4:
                if (num2 != 0)
                    res = num1 / num2;
                else
                {
                    System.out.println("Деление на ноль");
                    res = -10000000;
                }
        }
        return res;
    }

    public static boolean activityCheck(int move){
        return (move >= 1 && move <= 4);

    }
}
