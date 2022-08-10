package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int start = 0;
        if (multiplyByAndToInclusive != 0) {
            while (start <= Math.abs(multiplyByAndToInclusive)) {
                System.out.println(start * multiplyByAndToInclusive);

                start++;
            }
        }
    }
}
