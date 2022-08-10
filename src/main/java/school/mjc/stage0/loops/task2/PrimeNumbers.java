package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive != 0) {
            int start = 2;
            while (start <= printToInclusive) {
                boolean isPrime = true;

                for (int i = 2; i < start; i++) {
                    if (start % i == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    System.out.println(start);
                }

                start++;
            }
        }
    }
}
