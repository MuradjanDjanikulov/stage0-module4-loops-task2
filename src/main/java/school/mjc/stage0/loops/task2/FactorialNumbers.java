package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int x = 1;
        int y = 1;
        System.out.println(1);
        while (y<=printToInclusive && y>0){
            x*=y;
            System.out.println(x);
            y++;}

    }
}