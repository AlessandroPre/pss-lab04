package it.unibo.encapsulation;

public class TestAllClasses {
    public static void main(final String[] args) {
        final Calculator calc = new Calculator();
        System.out.println("1+2=" + calc.add(1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("-1-(+2)=" + calc.sub(-1, 2));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8*3=" + calc.mul(8, 3));
        Calculator.printCalculatorStatus(calc);
        System.out.println("8/4=" + calc.div(8, 4));
        Calculator.printCalculatorStatus(calc);

        final Smartphone htcOne = new Smartphone("HTC", "One", 1024);
        final Smartphone note3 = new Smartphone(4, 2048, 8192, "Samsung", "Galaxy Note 3", true, true, true);
        htcOne.printStringRep();
        note3.printStringRep();



        Smartlamp lamp = new Smartlamp();
        lamp.switchOnOff();
        lamp.setColor("green");
        lamp.setIntensity(2);
        //System.out.println("Lamp is: "+ lamp.getStatus());
        lamp.getStatus();
        System.out.println(lamp.getColour());
        System.out.println(lamp.getIntensity());
        lamp.setIntensity(5);
        System.out.println(lamp.getIntensity());
        lamp.setIntensity(1);
        System.out.println(lamp.getIntensity());
        //lamp.printLampInfo();
        lamp.switchOnOff();
        lamp.getStatus();
        //System.out.println("Lamp is: " + lamp.getStatus());
        //lamp.printLampInfo();
    }
}
