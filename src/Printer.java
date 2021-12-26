//import java.net.PortUnreachableException;

public class Printer {

    private String queue = "";
    private int pengingPageCount = 0;
    private int printedPageCount;
    private int sum = 0;

    public void append(String text, String name, int pageCount) {
        queue = queue + "\n" + "Текст документа: " + text + " Имя документа: " + name +
                " Количество страниц: " + pageCount;
        pengingPageCount += pageCount;
    }

    public void print(String title) {
        System.out.println(title);
        increasePrintedPageCount();
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
            return;
        }
        System.out.println(queue);
        System.out.println("Количество страниц на печать: " + getPengingPageCount() + " страниц");
        clear();
        System.out.println();
        System.out.println("Общее количество распечатанных страниц:" + getPrintedPageCount());
    }

    public void clear() {
        queue = "";
        pengingPageCount = 0;
        sum = 0;
    }

    public void increasePrintedPageCount() {
        while (sum < pengingPageCount) {
            sum++;
            printedPageCount++;
        }
    }

    public int getPengingPageCount() {
        return pengingPageCount;
    }

    public int getPrintedPageCount() {
        return printedPageCount;
    }
}
