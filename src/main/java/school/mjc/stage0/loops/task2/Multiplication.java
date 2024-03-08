package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {

        int x = 0;
        if (multiplyByAndToInclusive > 0){
            while (x<= multiplyByAndToInclusive){
                System.out.println(x*multiplyByAndToInclusive);
                x++;	}}
        else if (multiplyByAndToInclusive<0){
            int num = multiplyByAndToInclusive * -1;
            while (x<= num){
                System.out.println(x*multiplyByAndToInclusive);
                x++;  }}
    }
}