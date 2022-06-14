package jmu.cs.OS.Producer_consumer_Problem;

public class test {
    public static void main(String[] args) {

    }

}
/*
 Semaphore SF1, SF2
 List F1, List F2

 A:
    while(1)
        P(SF1)
            if(F1.size < 10)
                F1.add(1)
        V(SF1)
 B:
    while(1)
        P(SF2)
            if(F2.size < 10)
                F2.add(2)
        V(SF2)
 T:
    while(1)
        while(F1.size == 0)
        while(F2.size == 0)
        P(SF1)
        P(SF2)
            F1.sub(1)
            F2.sub(2)
        V(SF2)
        V(SF1)
 */


/*
 Semaphore Full1, Full2, Empty1, Empty2, Mutex1, Mutex2
 */
