/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW103 -- Erica's Friends, Hugo, and The One in the Middle
2022-05-18
time spent: L Bozo hours

DISCO

QCC

ALGO


*/
import java.util.ArrayList;
public class RunMed {

    ALHeapMax lilVals;
    ALHeapMin bigVals;

    public RunMed() {
        lilVals = new ALHeapMax();
        bigVals = new ALHeapMin();
    }

    public void balance() {

        if (lilVals.size() > bigVals.size() + 1) {
            bigVals.add(lilVals.removeMax());
        }
        else if (bigVals.size() > lilVals.size()) {
            lilVals.add(bigVals.removeMin());
        }

    }

    public Integer getMedian() {
        if ((lilVals.size() + bigVals.size()) % 2 == 0) {
            return (lilVals.peekMax() + bigVals.peekMin()) / 2;
        }
        else {
            return lilVals.peekMax();
        }
    }

    public void add(Integer newVal) {
        if (newVal > bigVals.peekMin()) {
            bigVals.add(newVal);
        }
        else {
            lilVals.add(newVal);
        }
        balance();
    }

}