package com.vdubyk.hm2;

public class Main {
    public static void main(String[] args) {

        // Task1
        Circle circle = new Circle(3);
        System.out.println("Area Circle= " + circle.areaCircle());

        // Task2
        for (int i = 0; i < 3; i++) {
            new CounterClass();
        }
        System.out.println("Number of created objects class CounterClass = " + CounterClass.getCount());

        // Task3
        Car car = new Car("Toyota");
        car.startEngineCar();
        car.stopEngineCar();
        car.goCar();
        car.goCarStaticSpeed(40);

        // Task4
        Fractions fractionsA = new Fractions(2, (short) 4);
        Fractions fractionsB = new Fractions(3, (short) 4);
        System.out.println(fractionsA.additation(fractionsB).toString());
        System.out.println(fractionsA.substraction(fractionsB).toString());
        System.out.println(fractionsA.multiplication(fractionsB).toString());
        System.out.println(fractionsA.division(fractionsB).toString());
        System.out.println("Equals fraction = " + fractionsA.equals(fractionsB));
        if (!fractionsA.equals(fractionsB)) {
            if (fractionsA.isHighNumber(fractionsB)) {
                System.out.println("High fraction " + fractionsA.toString());
            } else System.out.println("High fraction " + fractionsB.toString());
        }

        //Task5
        Money money = new Money(40, (byte) 25);
        System.out.println(money.additation(new Money(4, (byte) 80)));
        System.out.println(money.substraction(new Money(4, (byte) 75)));
        System.out.println(money.multiplication(3));
        double fractionNumberMultiplication = (double) 1 / 3;
        System.out.println(money.multiplication(fractionNumberMultiplication));
        System.out.println(money.division(2));
        double fractionNumberDivision = (double) 2 / 6;
        System.out.println(money.division(fractionNumberDivision));
        Money moneyB = new Money(40, (byte) 26);
        System.out.println("Equals money= " + money.equals(moneyB));
        if (!money.equals(moneyB)) {
            if (money.isHighMoney(moneyB)) {
                System.out.println("High money " + money.toString());
            } else System.out.println("High money " + moneyB.toString());
        }
    }


}
