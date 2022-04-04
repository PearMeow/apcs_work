public class NodeQueue<QUASAR> implements Queue<QUASAR> {
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public Node<QUASAR> first;
  public Node<QUASAR> last;
  public int size;
  public QUASAR dequeue() {
    if (!(isEmpty())) {
      int x = size;
      Node temp = last;
      while (x > 1) {
        temp = temp.cdr;
      }
      first = temp;
      size--;

    }
    return first.car;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    if (isEmpty()) {
      first = new Node(x, null);
      last = first;
    }
    else {
      last = new Node(x, last);
    }
    size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return size==0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    return first.car;
  }

  public static void main(String[] )

}
class Node<QUASAR> {
  public QUASAR car;
  public Node<QUASAR> cdr;
  public Node(QUASAR carr, Node<QUASAR> cdrr ) {
    car = carr;
    cdr = cdrr;
  }
}
