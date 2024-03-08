package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int x = 0;
        if (power <0){
            System.out.println("too much power");}
        else{
            while (x<=power){
                int y = (int) Math.pow(2, x);
                System.out.println(y);
                x++;}}

    }
}