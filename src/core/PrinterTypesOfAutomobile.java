package core;

import util.TypeOfAutomobileEnum;

public class PrinterTypesOfAutomobile {
    TypeOfAutomobileEnum[] types = TypeOfAutomobileEnum.values();

    public void printTypes() {
        for (TypeOfAutomobileEnum type : types) {
            class Printer {
                private String text;

                public Printer(String text) {
                    this.text = text;
                }

                public void print() {
                    System.out.print(text + " ");
                }
            }

            Printer printer = new Printer(type.getTranslation());
            printer.print();
        }
        System.out.println("и других разных машин");
    }
}
