public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.");
        byte a = 88;
        System.out.println("Значение переменной a с типом byte равно " + a + ".");
        short b = -1397;
        System.out.println("Значение переменной b с типом short равно " + b + ".");
        int c = 82400;
        System.out.println("Значение переменной c с типом int равно " + c + ".");
        long d = 7123456789L;
        System.out.println("Значение переменной d с типом long равно " + d + ".");

        System.out.println("Задача 2.");
        float sun1 = 27.12f;
        long sun2 = 987678965549L;
        double sun3 = 2.786;
        short sun4 = 569;
        short sun5 = -159;
        int sun6 = 27897;
        byte sun7 = 67;
        System.out.println("Переменные " + sun1 + ", " + sun2 + ", " + sun3 + ", " + sun4 + ", " + sun5 + ", " + sun6 + ", " + sun7 + " инициализированы.");

        System.out.println("Задача 3.");
        byte students1 = 23;
        byte students2 = 27;
        byte students3 = 30;
        short paper = 480;
        int pieceOfPaper = paper / (students1 + students2 + students3);
        System.out.println("На каждого ученика рассчитано " + pieceOfPaper + " листов бумаги");

        System.out.println("Задача 4.");
        byte bottlesIn2Min = 16;
        byte time1 = 2;
        int bottlesIn1Min = bottlesIn2Min / time1;
        byte time2 = 20;
        int bottlesIn20Min = bottlesIn1Min * time2;
        System.out.println("За 20 минут машина произвела " + bottlesIn20Min + " штук бутылок");
        int time3 = 60*24;
        int bottlesIn1Day = bottlesIn1Min * time3;
        System.out.println("За 1 сутки машина произвела " + bottlesIn1Day + " штук бутылок");
        int time4 = time3 * 3;
        int bottlesIn3Days = bottlesIn1Min * time4;
        System.out.println("За 3 дня машина произвела " + bottlesIn3Days + " штук бутылок");
        int time5 = time3 * 30;
        int bottlesIn1Month = bottlesIn1Min * time5;
        System.out.println("За 1 месяц машина произвела " + bottlesIn1Month + " штук бутылок");

        System.out.println("Задача 5.");
        byte print = 120;
        byte whitePrintFor1Class = 2;
        byte brownPrintFor1Class = 4;
        int numberOfClasses = print / (whitePrintFor1Class + brownPrintFor1Class);
        int whitePrint = whitePrintFor1Class * numberOfClasses;
        int brownPrint = brownPrintFor1Class * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + whitePrint + " банок белой краски и " + brownPrint + " банок коричневой краски");

        System.out.println("Задача 6.");
        byte numberOfBananas = 5;
        byte weightOfBanana = 80;
        int weightOfBananas = numberOfBananas * weightOfBanana;
        short numberOfMilk = 200;
        int weightOfMilk = numberOfMilk / 100 * 105;
        byte numberOfIce = 2;
        byte weightOf1Ice = 100;
        int  weightOfIce = numberOfIce * weightOf1Ice;
        byte numberOfEggs = 4;
        byte weightOfEgg = 70;
        int weightOfEggs = numberOfEggs * weightOfEgg;
        int generalWeightInGr = weightOfBananas + weightOfMilk + weightOfIce + weightOfEggs;
        System.out.println("Вес спортзавтрака в граммах: " + generalWeightInGr + ".");
        int grPerKg = 1000;
        float generalWeightInKg = generalWeightInGr/(float)grPerKg;
        System.out.println("Вес спортзавтрака в килограммах: " + generalWeightInKg + ".");

        System.out.println("Задача 7.");
        byte lostWeightInKg = 7;
        int kgPerGr = 1000;
        int lostWeightInGr = lostWeightInKg * kgPerGr;
        short lostGrams1 = 250;
        short lostGrams2 = 500;
        int daysForLose1 = lostWeightInGr / lostGrams1;
        int daysForLose2 = lostWeightInGr / lostGrams2;
        System.out.println("Если спортсмен будет худеть на " + lostGrams1 + " грамм в день, то ему понадобится " + daysForLose1 + " дней.");
        System.out.println("Если спортсмен будет худеть на " + lostGrams2 + " грамм в день, то ему понадобится " + daysForLose2 + " дней.");
        int daysForLose3 = (daysForLose1 + daysForLose2) / 2;
        System.out.println("В среднем ему понадобится " + daysForLose3 + " день.");

        System.out.println("Задача 8.");
        byte numberOfMonths = 12;
        float upgrade = 0.1f;
        int zpMasha1 = 67760;
        float zpMasha2 = zpMasha1 * upgrade + zpMasha1;
        float differenceMasha = zpMasha2 * numberOfMonths - zpMasha1 * numberOfMonths;
        System.out.println("Маша теперь получает " + zpMasha2 + " рублей. Годовой доход вырос на " + differenceMasha + " рублей.");

        int zpDenis1 = 83690;
        float zpDenis2 = zpDenis1 * upgrade + zpDenis1;
        float differenceDenis = zpDenis2 * numberOfMonths - zpDenis1 * numberOfMonths;
        System.out.println("Денис теперь получает " + zpDenis2 + " рублей. Годовой доход вырос на " + differenceDenis + " рублей.");

        int zpKristina1 = 76230;
        float zpKristina2 = zpKristina1 * upgrade + zpKristina1;
        float differenceKristina = zpKristina2 * numberOfMonths - zpKristina1 * numberOfMonths;
        System.out.println("Кристина теперь получает " + zpKristina2 + " рублей. Годовой доход вырос на " + differenceKristina + " рублей.");

    }
}