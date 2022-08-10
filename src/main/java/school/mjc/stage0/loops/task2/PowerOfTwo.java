package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power == 0) {
            System.out.println(1);
        } else if (power < 0) {
            System.out.println("too much power");
        } else {
            int start = 0;
            while (start <= power) {
                System.out.println((int) (Math.pow(2, start)));

                start++;
            }
        }
    }
}
