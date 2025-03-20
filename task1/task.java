public class CircularArrayPath {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Необходимо передать два аргумента: n и m.");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);

        if (n <= 0 || m <= 0) {
            System.out.println("Аргументы должны быть положительными числами.");
            return;
        }

        // Создаем круговой массив
        int[] circularArray = new int[n];
        for (int i = 0; i < n; i++) {
            circularArray[i] = i + 1;
        }

        // Вычисляем путь
        StringBuilder path = new StringBuilder();
        int currentPosition = 0;

        do {
            path.append(circularArray[currentPosition]);
            currentPosition = (currentPosition + m - 1) % n;
        } while (currentPosition != 0);

        // Выводим результат
        System.out.println(path.toString());
    }
}
