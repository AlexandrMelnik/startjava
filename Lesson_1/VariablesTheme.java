public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера: ");
        byte pcWeight = 15;
        System.out.println("Вес ПК: " + pcWeight + " Кг");
        short numberCpuCores = 24;
        System.out.println("Количество ядер процессора: " + numberCpuCores);
        int ram = 64;
        System.out.println("Объем оперативной памяти: " + ram + " Гб");
        long supplyUnitPower = 1000L;
        System.out.println("Мощность блока питания: " + supplyUnitPower + " Вт");
        float baseClockFrequency = 3.2F;
        System.out.println("Базовая тактовая частота: " + baseClockFrequency + " ГГц");
        double autoClockSpeedIncrease = 5.8;
        System.out.println("Увеличение тактовой частоты: " + autoClockSpeedIncrease + " ГГц");
        char typeVideoCard = 'D';
        System.out.println("Тип видеокарты " + typeVideoCard + " = дискретная");
        boolean freeSpaceHdd = true;
        System.out.println("Есть свободное место на диске? Ответ: " + freeSpaceHdd);

        System.out.println("\n2. Расчет стоимости товара со скидкой: ");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int sumGoods = penPrice + bookPrice;
        int discountAmount = (sumGoods / 100) * discount;
        int discountPrice = sumGoods - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + sumGoods + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA: ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов: ");
        byte byteMax = Byte.MAX_VALUE;
        short shortMax = Short.MAX_VALUE;
        int intMax = Integer.MAX_VALUE;
        long longMax = Long.MAX_VALUE;
        char charMax = Character.MAX_VALUE;
        System.out.println("Первоначальное значение byte: " + byteMax);
        System.out.println("Значение byte после инкремента на 1: " + ++byteMax);
        System.out.println("Значение byte после декремента на 1: " + --byteMax);
        System.out.println("Первоначальное значение short: " + shortMax);
        System.out.println("Значение short после инкремента на 1: " + ++shortMax);
        System.out.println("Значение short после декремента на 1: " + --shortMax);
        System.out.println("Первоначальное значение int: " + intMax);
        System.out.println("Значение int после инкремента на 1: " + ++intMax);
        System.out.println("Значение int после декремента на 1: " + --intMax);
        System.out.println("Первоначальное значение long: " + longMax);
        System.out.println("Значение long после инкремента на 1: " + ++longMax);
        System.out.println("Значение long после декремента на 1: " + --longMax);
        System.out.println("Первоначальное значение char: " + (int) (charMax));
        System.out.println("Значение char после инкремента на 1: " + (int) (++charMax));
        System.out.println("Значение char после декремента на 1: " + (int) (--charMax));

        System.out.println("\n5. Перестановка значений переменных: ");
        int a = 5;
        int b = 2;
        System.out.println("Перестановка значений переменных с помощью третьей переменной");
        System.out.println("Исходные значения: a = " + a + " , b = " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("Новые значения: a = " + a + " , b = " + b);
        System.out.println("Перестановка значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + " , b = " + b);
        a = a + b - (b = a);
        System.out.println("Новые значения: a = " + a + " , b = " + b);
        System.out.println("Перестановка значений переменных с помощью побитовой операции");
        System.out.println("Исходные значения: a = " + a + " , b = " + b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("Новые значения: a = " + a + " , b = " + b);

        System.out.println("\n6. Вывод символов и их кодов: ");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.printf("%d %s \n", (int) dollar, dollar);
        System.out.printf("%d %s \n", (int) asterisk, asterisk);
        System.out.printf("%d %s \n", (int) atSign, atSign);
        System.out.printf("%d %s \n", (int) verticalBar, verticalBar);
        System.out.printf("%d %s \n", (int) tilde, tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка: ");
        char slash = '/';
        char backslash = '\\';
        char underscore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.printf("    %s%s \n", slash, backslash);
        System.out.printf("   %s  %s \n", slash, backslash);
        System.out.printf("  %s%s%s %s%s \n", 
                slash, underscore, leftParenthesis, rightParenthesis, backslash);
        System.out.printf(" %s      %s \n", slash, backslash);
        System.out.printf("%s%s%s%s%s%s%s%s%s%s \n", 
                slash, underscore, underscore, underscore, underscore, slash,
                backslash, underscore,underscore, backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа: ");
        int number = 123;
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        int sum = hundreds + tens + ones;
        int product = hundreds * tens * ones;
        System.out.println("Число " + number + " содержит:");
        System.out.println("Сотен - " + hundreds);
        System.out.println("Десятков - " + tens);
        System.out.println("Единиц - " + ones);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + product);

        System.out.println("\n9. Вывод времени: ");
        int totalSecondsTime = 86399;
        int hh = totalSecondsTime / 3600;
        int mm = totalSecondsTime / 60 % 60;
        int ss = totalSecondsTime % 60;
        System.out.println("Время: " + hh + ":" + mm + ":" + ss);
    }
}