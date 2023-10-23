public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера: ");
        //Вес ПК
        byte pcWeight = 15;
        System.out.println("Вес ПК: " + pcWeight + " Кг");
        //количество ядер процессора
        short numberProcessorCores = 24;
        System.out.println("Количество ядер процессора: " + numberProcessorCores);
        //объем оперативной памяти
        int ramAmount = 64;
        System.out.println("Объем оперативной памяти: " + ramAmount + " Гб");
        //мощность блока питания
        long supplyUnitPower = 1000L;
        System.out.println("Мощность блока питания: " + supplyUnitPower + " Вт");
        //Базовая тактовая частота
        float baseClockFrequency = 3.2F;
        System.out.println("Базовая тактовая частота: " + baseClockFrequency + " ГГц");
        //Автоматическое увеличение тактовой частоты
        double autoClockSpeedIncrease = 5.8D;
        System.out.println("Увеличение тактовой частоты: " + autoClockSpeedIncrease + " ГГц");
        //Тип видеокарты
        char typeVideoCard= 'D';
        System.out.println("Тип видеокарты " + typeVideoCard + " = дискретная");
        //Свободное пространство на жестком диске
        boolean freeSpaceHdd = true;
        System.out.println("Есть свободное место на диске? Ответ: " + freeSpaceHdd);


        System.out.println("\n2. Расчет стоимости товара со скидкой: ");
        int pen = 100;
        int book = 200;
        int discount = 11;
        int costWithoutDiscount = pen + book;
        int discountAmount = (costWithoutDiscount / 100) * 11;
        int costWithDiscount = costWithoutDiscount - discountAmount;
        System.out.println("Общая стоимость товаров без скидки: " + costWithoutDiscount + " руб.");
        System.out.println("Сумма скидки: " + discountAmount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + costWithDiscount + " руб.");


        System.out.println("\n3. Вывод слова JAVA: ");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");


        System.out.println("\n4. Вывод min и max значений целых числовых типов: ");
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
        System.out.println("Первоначальное значение short: " + d);
        System.out.println("Значение short после инкремента на 1: " + ++d);
        System.out.println("Значение short после декремента на 1: " + --d);
        System.out.println("Первоначальное значение int: " + f);
        System.out.println("Значение int после инкремента на 1: " + ++f);
        System.out.println("Значение int после декремента на 1: " + --f);
        System.out.println("Первоначальное значение long: " + g);
        System.out.println("Значение long после инкремента на 1: " + ++g);
        System.out.println("Значение long после декремента на 1: " + --g);
        System.out.println("Первоначальное значение char: " + k);
        System.out.println("Значение char после инкремента на 1: " + ++k);
        System.out.println("Значение char после декремента на 1: " + --k);


        System.out.println("\n5. Перестановка значений переменных: ");
        int a = 5;
        int b = 2;
        System.out.println("Перестановка значений переменных с помощью арифметических операций");
        System.out.println("Исходные значения: a = " + a + " , b = " + b);
        System.out.println("Новые значения: a = " + (a = a + b - (b = a)) + " , b = " + b);


        System.out.println("\n6. Вывод символов и их кодов: ");
        char z = 36;
        char x = 42;
        char c = 64;
        char v = 124;
        char n = 126;
        System.out.println("Код:    36 42 64 124 126");
        System.out.println("Символ:  " + z + "  " + x + "  " + c + "  " + v + "   " + n);


        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка: ");
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


        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа: ");
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


        System.out.println("\n9. Вывод времени: ");
        int totalTime = 86399;
        int h = totalTime / 3600;
        int m = (totalTime - h * 3600) / 60;
        int s = totalTime - h * 3600 - m * 60;
        System.out.println("Время: " + ((h) + ":" + (m) + ":" + (s)));
    }
}