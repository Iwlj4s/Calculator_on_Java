import java.util.Scanner;

public class calc {

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            int res;
            int num1 = scanner.nextInt();

            System.out.print("Введите второе число: ");
            int num2 = scanner.nextInt();

            System.out.print("Выберите действие: ");
            String action = scanner.nextLine();
                action = scanner.nextLine();
            switch(action) {
                case "+":
                    res = num1 + num2;
                    System.out.println("Результат: " + res);
                    break;

                case "-":
                    res = num1 - num2;
                    System.out.println("Результат: "+ res);
                    break;

                case "*":
                    res = num1 * num2;
                    System.out.println("Результат: "+ res);
                    break;

                case "/":
                    if(num2 == 0)
                        System.out.println("Error ");
                    else {
                        res = num1 / num2;
                        System.out.println("Результат: " + res);
                    }
                    break;
                default:
                    System.out.println("Введите корректные числа...");
        }

    }
}
