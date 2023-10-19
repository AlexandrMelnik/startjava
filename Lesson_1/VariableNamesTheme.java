public class VariableNamesTheme {
    public static void main(String[] args) {

        System.out.println("1. Разные переменные: ");
        System.out.println();

        //цифра
        int a = 7;
        System.out.println("Цифра: " + a);
        System.out.println();

        //сумма чисел
        int b = 50;
        int t = 20;
        System.out.println("Сумма чисел: " + (b + t));
        System.out.println();

        //произведение цифр
        int d = 7;
        System.out.println("Произведение цифр: " + (a * d));
        System.out.println();

        //максимальное число
        long c = 9_223_372_036_854_775_806L;
        System.out.println("Максимальное число: " + c);
        System.out.println();

        //количество десятков
        System.out.println("Количество десятков: " + (b / t));
        System.out.println();

        //вес собаки
        double dogMass = 25.2D;
        System.out.println("Вес собаки: " + dogMass + " Кг");
        System.out.println();

        //исходное число
        int originalNumber = 100;
        System.out.println("Исходное число: " + originalNumber);
        System.out.println();

        //процент по вкладу
        System.out.println("Процент по вкладу: " + (a % 10) + "%");
        System.out.println();

        //(переменная хранит символ) &
        char symbol = '&';
        System.out.println("Переменная хранит символ: " + symbol);
        System.out.println();

        //код ошибки
        String error = "Error 501";
        System.out.println("Код ошибки: " + error);
        System.out.println();

        //тип сообщения
        String massage = "SMS";
        System.out.println("Тип сообщения: " + massage);
        System.out.println();

        //число нулей
        int zerosNumber = 1_000_000_000;
        System.out.println("Число нулей: " + zerosNumber);
        System.out.println();

        //уникальное число
        int a2 = 100;
        int b2 = 100;
        int c2 = 100;
        int uniqueNumber = 200;
        System.out.println("Уникальное число: " + uniqueNumber);
        System.out.println();

        //случайное число
        int randomNumber = 590;
        System.out.println("Случайное число: " + randomNumber);
        System.out.println();

        //математическое выражение
        double a3 = 2.75D;
        double b3 = 3.20D;
        double c3 = 1.07D;
        double mathematicalExpression = (double) (a3 + b3) * c3;
        System.out.println("Математическое выражение: " + mathematicalExpression);
        System.out.println();

        //выбор чего-либо
        String choosingSomething1 = "Будешь кофе?";
        String choosingSomething2 = "Будешь чай?";
        System.out.println("Выбор чего-либо: " + choosingSomething1);
        System.out.println("Выбор чего-либо: " + choosingSomething2);
        System.out.println();

        //количество очков (в игре)
        double gamePointsNumber = 19.531D;
        System.out.println("Количество очков в игре: " + gamePointsNumber);
        System.out.println();

        //максимальная длина строки
        int maximumStringLength = 120;
        System.out.println("Максимальная длина строки: " + maximumStringLength);
        System.out.println();

        //пункт меню
        String menuItem = "Дополнительно";
        System.out.println("Пункт меню: " + menuItem);
        System.out.println();

        //стоимость кофе на вынос
        double coffeeCoast = 2.67D;
        System.out.println("Стоимость кофе на вынос: " + coffeeCoast + "$");
        System.out.println();

        //дата начала (чего-либо)
        String dataStart = "16 Декабря 2023";
        System.out.println("Дата начала чего-либо: " + dataStart);
        System.out.println();

        //окончание диапазона
        String endRange = "A1 - C17";
        System.out.println("Окончание диапазона: " + endRange);
        System.out.println();

        //полное имя работника месяца
        String nameEmployeeOfMonth = "Иванов Иван Иванович";
        System.out.println("Полное имя работника месяца: " + nameEmployeeOfMonth);
        System.out.println();

        //заголовок электронной книги
        String bookTitle = "Содержание";
        System.out.println("Заголовок электронной книги: " + bookTitle);
        System.out.println();

        //размер
        String size = "S, M, L, XL, 2XL, 4XL";
        System.out.println("Размер одежды: " + size);
        System.out.println();

        //вместимость (чего-либо)
        int machineCapacity = 5;
        System.out.println("Вместимость машины: " + machineCapacity + " человек");
        System.out.println();

        //счетчик
        String counterElectricity = "Тайпит НЕВА 301 0,5 ТО 230V 5(10)A";
        System.out.println("Счетчик электроэнергии: " + counterElectricity);
        System.out.println();

        //путь до файла
        String filePath = "C:/Program Files/Java/jdk-21/bin";
        System.out.println("Путь до файла: " + filePath);
        System.out.println();

        //количество чисел в каждой строке
        int numbersInRow = 24;
        System.out.println("Количество чисел в каждой строке: " + numbersInRow);
        System.out.println();

        System.out.println();
        System.out.println("2. boolean переменные");
        System.out.println();
        //сотни равны?
        int x = 100;
        int y = 100;
        System.out.println("Сотни равны? Ответ: " + (x == y));
        System.out.println();

        //компьютер включен?
        boolean computerIsTurnedOn = true;
        System.out.println("Компьютер включен? Ответ: " + computerIsTurnedOn);
        System.out.println();

        //есть равные цифры?
        int x1 = 1;
        int y1 = 2;
        System.out.println("Есть равные цифры? Ответ: " + (x1 == y1));
        System.out.println();

        //(что-либо) создано?
        boolean legoСreated = true;
        System.out.println("Создано Lego? Ответ: " + legoСreated);
        System.out.println();

        //(что-либо) пусто?
        boolean emptyBox = true;
        System.out.println("Пустая коробка? Ответ: " + emptyBox);
        System.out.println();

        //(что-либо) активный?
        boolean activeSport = false;
        System.out.println("Активный вид спорта? Ответ: " + activeSport);
        System.out.println();

        //новый?
        boolean newFile = false;
        System.out.println("Новый файл? Ответ: " + newFile);
        System.out.println();

        //электронная почта действительная?
        boolean validEmail = true;
        System.out.println("Электронная почта действительная? Ответ: " + validEmail);
        System.out.println();

        //имеются уникальные строки?
        boolean uniqueStrings = true;
        System.out.println("Имеются уникальные строки? Ответ: " + uniqueStrings);
        System.out.println();

        System.out.println();
        System.out.println("3. Аббревиатуры");
        System.out.println();

        //старый universally unique identifier
        String oldIdentifier = "00112233-4455-6677-8899-aabbccddeeff";
        System.out.println("Cтарый UUID: " + oldIdentifier);
        System.out.println();

        //производитель оперативной памяти
        String ramManufacturer = "SAMSUNG";
        System.out.println("Производитель оперативной памяти: " + ramManufacturer);
        System.out.println();

        //емкость жесткого диска
        int hardDiskCapacity = 1000000;
        System.out.println("Емкость HDD = " + hardDiskCapacity + " Мб");
        System.out.println();

        //протокол передачи гипертекста
        String hyperText = "HTTP(S)";
        System.out.println("Протокол передачи гипертекста: " + hyperText);
        System.out.println();

        //сокращенный uniform resource locator
        String uniformResourceLocator = "URL";
        System.out.println("Универсальный идентификатор ресурса: " + uniformResourceLocator);
        System.out.println();

        //новый идентификатор клиента
        int clientId = 1122334455;
        System.out.println("Новый идентификатор клиента: " + clientId);
        System.out.println();

        //кодировка american standard code for information interchange
        String encoding = "ASCII";
        System.out.println("Кодировка: " + encoding);
    }
}