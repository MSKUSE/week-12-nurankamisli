public class StackLinkedList<T> implements Stack<T>{

    StackItem<T> top;
    @Override
    public void push(T item) {
        StackItem<T> newBox = new StackItem<>(item);
        StackItem<T> previousTop = top;
        top = newBox;
        top.setNext(previousTop);
    }
    @Override
    public T pop() throws MyEmptyStackException {
        if(top == null){
            throw new MyEmptyStackException("Stack is empty");
        }
        T tempData = top.getData();
        top = top.getNext();
        return tempData;
    }
    public void displayStack(){
        if (this.top == null){
            System.out.println("Stack is empty!!!");
        } else{
          StackItem<T> tempNode=top;
          while(tempNode != null){
              System.out.println(tempNode.getData());
              tempNode = tempNode.getNext();
          }
        }
    }

    @Override
    public void peek() {
        System.out.println("The top is "
        + this.top.getData());
    }
    @Override
    public boolean isEmpty() {
        return this.top == null;
    }
}
