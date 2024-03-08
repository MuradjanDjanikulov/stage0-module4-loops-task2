package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int x = 0;
        while (x<= printToInclusive){
            if (x ==2 || x == 3 || x ==5 || x ==7){
                System.out.println(x);}
            if (x!=1 && x%1 == 0 && x%2!=0 && x%3!=0 && x%5!=0 && x%7!=0 && x%9!=0 ){
                System.out.println(x);}
            x++;
        }
    }
}