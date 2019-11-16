package com.johngellert;

public class Main {

    protected static class Fuel {
        private String type;

        public Fuel() {
            this("E87");
        }

        public Fuel(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }

    }


    public static void main(String[] args) {

        String e93 = "E93";
        Fuel myFuel = new Fuel();
        System.out.println(myFuel.getType());


        Auto myCar = new Auto();

        System.out.println(myCar.getMake());

        myCar.setMake("Chevy");
        myCar.setYear(1997);
        myCar.setModel("K1500");

        System.out.println(myCar.getYear());
        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());


    }
}
