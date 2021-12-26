public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.add("Milk", 40, 1, 1.1);
        basket.add("Bread", 35, 1, 0.2);
        basket.add("Butter", 80, 1, 0.6);
        basket.print("");
        System.out.println();
        basket.clear();
        basket.print("");

        System.out.println();

        Arithmetic arithmetic = new Arithmetic(1464,287);
        arithmetic.addition();
        arithmetic.multiplication();
        arithmetic.maxMin();
        arithmetic.Print();

        System.out.println();

        Printer printer = new Printer();
        printer.append("Text", "Name", 10);
        printer.print("Очередь на печать:");
        printer.append("Text1", "Name1", 5);
        printer.print("Очередь на печать:");
        printer.append("Text2", "Name2", 15);
        printer.print("Очередь на печать:");
    }
}
