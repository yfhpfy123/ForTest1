import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        do {
            System.out.print("Введите q для выхода или выражение: ");
            input = scan.nextLine().replaceAll(" ", "");
            if (!input.equals("")) {
                System.out.println("создан input, из него удалены все пробелы, сейчас он равен " + input);
            }
            if (input.equals("q")) {
                System.out.println("input = q");
                break;
            }
            if (input.equals("")) {
                System.out.println("input не ввели");
                continue;
            }

            if (input.length() < 3) {
                System.out.println("в input меньше 3 элементов");
                continue;
            }
            System.out.println("программа работает");

            char operation = 'n';
            System.out.println("чему равен char operation до цикла? он равен - " + operation);

            for (int i = 0; i < input.length(); i++) {
                switch (input.charAt(i)) {
                    case '+':
                        System.out.printf("сейчас идет итерация input посимвольно: проверяется %d эелемент charAt(%d) case +\n", i+1, i);
                        operation = '+';
                        break;
                    case '-':
                        System.out.printf("сейчас идет итерация input посимвольно: проверяется %d эелемент charAt(%d) case -\n", i + 1, i);
                        operation = '-';
                        break;
                    case '*':
                        System.out.printf("сейчас идет итерация input посимвольно: проверяется %d эелемент charAt(%d) case *\n", i + 1, i);
                        operation = '*';
                        break;
                    case '/':
                        System.out.printf("сейчас идет итерация input посимвольно: проверяется %d эелемент charAt(%d) case /\n", i + 1, i);
                        operation = '/';
                        break;
                    default:
                        System.out.printf("сейчас идет итерация input посимвольно: проверяется %d элемент charAt(%d) = %c\n", i + 1, i, input.charAt(i));
                        break;
                }
            }

            String[] numbers = input.split("[+\\-*/]");
            System.out.printf("разделили input на части по операции и изменили тип данных с String на int: было %s, стало массивом, где ", input);
            int num1 = Integer.parseInt(numbers[0]);
            System.out.println("первое число (первый элемент массива) number[0] = " + num1);
            int num2 = Integer.parseInt(numbers[1]);
            System.out.println("второе число (второй элемент массива) number[1] = " + num2);
            switch (operation) {
                case '+':
                    System.out.println("операция: " + operation);
                    System.out.println("результат: " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("операция: " + operation);
                    System.out.println("результат: " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("операция: " + operation);
                    System.out.println("результат: " + (num1 * num2));
                    break;
                case '/':
                    System.out.println("операция: " + operation);
                    if (num2 == 0) {
                        System.out.println("num2 = 0");
                        throw new RuntimeException("Делить на ноль нельзя");
                    }
                    System.out.println("результат: " + (num1 / (double) num2));
                    break;
            }
        }
        while (!input.equals("q"));

        System.out.println("программа завершена");
    }
}