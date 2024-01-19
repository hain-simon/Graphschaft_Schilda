package customDataStructures;

import java.util.Iterator;

public class CustomArrayList <T> implements Iterable<T>{

    private static final int DEFAULT_SIZE = 10;
    int size = 0;
    Object[] arr;

    public CustomArrayList (){
        arr = new Object[DEFAULT_SIZE];
    }

    public void add(Object obj){
        size++;
        if(size >= arr.length){
            expandArr(arr.length * 2);
        }

        arr[size] = obj;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int indexOf(Object obj){
        for(int i = 0; i < size; i++){
            if(arr[i] == obj) return i;
        }
        return -1;
    }

    public void addAll(CustomArrayList<T> other){
        for(T item : other){
            add(item);
        }
    }

    /**
     * Removes the first occurence of the given Object in list
     * @param item
     */
    public void remove(T item){
        int i = 0;
        while(i < size && arr[i] != item){
            i++;
        }
        //If it has not found anything, return
        if(i == size) return;
        size--;
        while(i < size){
            arr[i] = arr[i + 1];
        }
    }

    public T get(int idx){
        return (T)arr[idx];
    }

    public void set(int idx, Object obj){
        arr[idx] = obj;
    }

    public Object[] toArray(){
        Object[] returnArr = new Object[size];

        for(int i = 0; i < size; i++){
            returnArr[i] = arr[i];
        }

        return returnArr;
    }

    public boolean contains(Object obj){
        return (indexOf(obj) >= 0);
    }

    private void expandArr(int newSize){
        Object[] newArr = new Object[newSize];

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];
        }
        arr = newArr;
    }


    @Override
    public Iterator<T> iterator() {
        return new CustomIterator<T>(this);
    }
}

class CustomIterator<T> implements Iterator<T>{
    int size;
    int current = 0;
    CustomArrayList<T> list;
    public CustomIterator(CustomArrayList<T> list) {
        this.list = list;
        this.size = list.size();
    }

    @Override
    public boolean hasNext() {
        return current < size;
    }

    @Override
    public T next() {
        if(!hasNext()) throw new IndexOutOfBoundsException();
        current ++;
        return list.get(current);
    }
}
