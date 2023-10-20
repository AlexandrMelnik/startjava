public class VariablesTheme {
    public static void main(String[] args) {

        System.out.println("1. Вывод характеристик компьютера: ");
        System.out.println();

        //Вес ПК
        byte pcWeight = 15;
        System.out.println("Вес ПК: " + pcWeight + " Кг");
        System.out.println();

        //количество ядер процессора
        short numberProcessorCores = 24;
        System.out.println("Количество ядер процессора: " + numberProcessorCores);
        System.out.println();

        //объем оперативной памяти
        int amountRam = 64;
        System.out.println("Объем оперативной памяти: " + amountRam + " Гб");
        System.out.println();

        //мощность блока питания
        long supplyUnitPower = 1000L;
        System.out.println("Мощность блока питания: " + supplyUnitPower + " Вт");
        System.out.println();

        //Базовая тактовая частота
        float baseClockFrequency = 3.2F;
        System.out.println("Базовая тактовая частота: " + baseClockFrequency + " ГГц");
        System.out.println();

        //Автоматическое увеличение тактовой частоты
        double autoClockSpeedIncrease = 5.8D;
        System.out.println("Увеличение тактовой частоты: " + autoClockSpeedIncrease + " ГГц");
        System.out.println();

        //Тип видеокарты = дискретная
        char typeVideoCard= 'D';
        System.out.println("Тип видеокарты " + typeVideoCard + " = дискретная");
        System.out.println();

        //Свободное пространство на жестком диске
        boolean freeSpaceHdd = true;
        System.out.println("Есть свободное место на диске? Ответ: " + freeSpaceHdd);
        System.out.println();
        System.out.println();

        System.out.println("2. Расчет стоимости товара со скидкой: ");
        System.out.println();
        int pen = 100;
        int book = 200;
        int discount = 11;
        int costWithoutDiscount = pen + book;
        int discountAmount = (costWithoutDiscount / 100) * 11;
        int costWithDiscount = costWithoutDiscount - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + costWithoutDiscount + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + costWithDiscount + " руб.");
        System.out.println();
        System.out.println();

        System.out.println("3. Вывод слова JAVA: ");
        System.out.println();
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();
        System.out.println();

        System.out.println("4. Вывод min и max значений целых числовых типов: ");
        System.out.println();
        //Byte.MAX_VALUE
        byte p = 127;
        //Short.MAX_VALUE
        short d = 32767;
        //Integer.MAX_VALUE
        int f = 2147483647;
        //Long.MAX_VALUE
        long g = 9223372036854775807L;
        //Character.MAX_VALUE
        char k = 65535;
        System.out.println("Первоначальное значение byte: " + p);
        System.out.println("Значение byte после инкремента на 1: " + ++p);
        System.out.println("Значение byte после декремента на 1: " + --p);
        System.out.println();
        System.out.println("Первоначальное значение short: " + d);
        System.out.println("Значение short после инкремента на 1: " + ++d);
        System.out.println("Значение short после декремента на 1: " + --d);
        System.out.println();
        System.out.println("Первоначальное значение int: " + f);
        System.out.println("Значение int после инкремента на 1: " + ++f);
        System.out.println("Значение int после декремента на 1: " + --f);
        System.out.println();
        System.out.println("Первоначальное значение long: " + g);
        System.out.println("Значение long после инкремента на 1: " + ++g);
        System.out.println("Значение long после декремента на 1: " + --g);
        System.out.println();
        System.out.println("Первоначальное значение char: " + k);
        System.out.println("Значение char после инкремента на 1: " + ++k);
        System.out.println("Значение char после декремента на 1: " + --k);
        System.out.println();
        System.out.println();

        System.out.println("5. Перестановка значений переменных: ");
        System.out.println();
        int a = 5;
        int b = 2;
        System.out.println("Перестановка значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + " , b = " + b);
        System.out.println("Новые значения: a = " + (a = a + b - (b = a)) + " , b = " + b);
        System.out.println();
        System.out.println();

        System.out.println("6. Вывод символов и их кодов: ");
        System.out.println();
        char z = 36;
        char x = 42;
        char c = 64;
        char v = 124;
        char n = 126;
        System.out.println("Код:    36 42 64 124 126");
        System.out.println("Символ:  " + z + "  " + x + "  " + c + "  " + v + "   " + n);
        System.out.println();
        System.out.println();

        System.out.println("7. Вывод в консоль ASCII-арт Дюка: ");
        System.out.println();
        char d1 = 0B00101111;
        char d2 = 0B01011100;
        char d3 = 0B01011111;
        char d4 = 0B00101000;
        char d5 = 0B00101001;
        System.out.println("    " + d1 + d2 + "            ");
        System.out.println("   " + d1 + "  " + d2 + "         ");
        System.out.println("  " + d1 + d3 + d4 + " " + d5 + d2 + "        ");
        System.out.println(" " + d1 + "      " + d2 + "          ");
        System.out.println(d1 + "" + d3 + d3 + d3 + d3 + d1 + d2 + d3 + d3 + d2 + " ");
        System.out.println("");

        System.out.println("8. Вывод количества сотен, десятков и единиц числа: ");
        System.out.println();
        int y = 123;
        int hundreds = y / 100;
        int dozens = (y / 10) % 10;
        int units = y % 10;
        int sum = hundreds + dozens + units;
        int mult = hundreds * dozens * units;

        System.out.println("Число " + y + " содержит:");
        System.out.println("Сотен - " + hundreds);
        System.out.println("Десятков - " + dozens);
        System.out.println("Единиц - " + units);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + mult);
        System.out.println();

        System.out.println("9. Вывод времени: ");
        System.out.println();
        int totalTime = 86399;
        int h = totalTime / 3600;
        int m = (totalTime - h * 3600) / 60;
        int s = totalTime - h * 3600 - m * 60;
        System.out.println("Время: " + ((h) + ":" + (m) + ":" + (s)));
    }
}