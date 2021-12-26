public class Arithmetic {

    public int valueOne;
    private int valueTwo;
    private int resultAddition;
    private int resultMultiplication;
    private int resultMax;
    private int resultMin;

    public Arithmetic(int valueOne, int valueTwo) {
        this.valueTwo = valueTwo;
        this.valueOne = valueOne;
    }
    public void addition() {
        resultAddition = valueOne + valueTwo;
    }

    public void multiplication() {
        resultMultiplication = valueOne * valueTwo;
    }

    public void maxMin() {
        if (valueOne >= valueTwo) {
            resultMax = valueOne;
            resultMin = valueTwo;
        } else {
            resultMax = valueTwo;
            resultMin = valueOne;
        }
    }

    public void Print() {
        System.out.println("Сумма чисел: " + resultAddition);
        System.out.println("Произведение чисел: " + resultMultiplication);
        System.out.println("Максимальное из двух чисел: " + resultMax);
        System.out.println("Минимальное из двух чисел: " + resultMin);
    }

}


