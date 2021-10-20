/*

   "The Cats" : Faiyaz Rafee, Xinqing Lin, Perry "the platypus" Huang
   APCS pd07
   HW21 --
   2021-10-20
   DISCO:

   QCC:

*/


public class StatsDriver{

  public static void main(String[] args) {

    Stats.mean(0, 0);             // expecting... 0
    Stats.mean(7, 7);             // expecting... 7
    Stats.mean(-2, -4);           // expecting... -3
    Stats.mean(2, 4);             // expecting... 3
    Stats.mean(0.4, 0.2);         // expecting... 0.3
    Stats.max(0, -1);             // expecting... 0
    Stats.max(-99, -30);          // expecting... -30
    Stats.max(2, 4);              // expecting... 4
    Stats.max(0.4, 0.2);          // expecting... 0.4
    Stats.geoMean(6, 6);          // expecting... 6
    Stats.geoMean(0, 0);          // expecting... 0
    Stats.geoMean(9, 1);          // expecting... 3
    Stats.geoMean(-1, 1);         // expecting... error
    Stats.geoMean(-1, -1);        // expecting... 1
    Stats.geoMean(0.5, 72.0);     // expecting... 6

  }

}
