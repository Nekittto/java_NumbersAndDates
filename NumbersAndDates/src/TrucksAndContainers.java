import java.util.Scanner;

public class TrucksAndContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //получение количество коробок от пользователя

        int boxes = scanner.nextInt();
        int containers = (int) Math.ceil((double) boxes / 27);
        int trucks = (int) Math.ceil((double) containers / 12);
        int boxesCount = 0;
        int conteinersCount = 0;
        if (boxes < 0) {
            System.out.println("Ошибка: введите положительное число");
        }
        for (int trucksNum = 1; trucksNum <= trucks; trucksNum++){
            System.out.println("Грузовик: " + trucksNum);
            for(int containersNum = 1;containersNum <= 12 && boxesCount < boxes;containersNum++){
                conteinersCount++;
                System.out.println("\tКонтейнер: " + conteinersCount);
                for (int boxNum = 1; boxNum <= 27 && boxesCount < boxes; boxNum++){
                    boxesCount++;
                    System.out.println("\t\tЯщик: " + boxesCount);
                }
            }
        }
        System.out.println("Необходимо:\n" + "грузовиков - "
                + trucks + " шт.\nконтейнеров - " + containers + " шт.");

        // TODO: вывести в консоль коробки разложенные по грузовикам и контейнерам
        // пример вывода при вводе 2
        // для отступа используйте табуляцию - \t

        /*
        Грузовик: 1
            Контейнер: 1
                Ящик: 1
                Ящик: 2
        Необходимо:
        грузовиков - 1 шт.
        контейнеров - 1 шт.
        */
    }
}

