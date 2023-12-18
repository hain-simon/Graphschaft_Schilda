package customDataStructures;

public class CustomQueue<T> {
    T[] items;
    int frontPointer;
    int topPointer;

    public CustomQueue(int size){
        items = (T[]) new Object[size];
    }


}
