package customDataStructures;

import java.util.AbstractList;
import java.util.Iterator;

public class CustomArrayList <T> extends AbstractList<T>  implements Iterable<T>{

    private static final int DEFAULT_SIZE = 10;
    int size = 0;
    Object[] arr;

    public CustomArrayList (){
        arr = new Object[DEFAULT_SIZE];
    }

    public boolean add(Object obj){
        size++;
        if(size >= arr.length){
            expandArr(arr.length * 2);
        }

        arr[size - 1] = obj;
        return true;
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

    public boolean remove(Object item){
        int i = 0;
        while(i < size && arr[i] != item){
            i++;
        }
        //If it has not found anything, return
        if(i >= size) return false;
        size--;
        while(i < size){
            arr[i] = arr[i + 1];
            i++;
        }
        return true;
    }

    public T get(int idx){
        if(idx >= size || idx < 0) throw new IndexOutOfBoundsException();
        return (T)arr[idx];
    }

    public T set(int idx, T obj){
        if(idx >= size || idx < 0) throw new IndexOutOfBoundsException();
        arr[idx] = obj;
        return obj;
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
        Object obj = list.get(current);
        current++;
        return (T)obj;
    }
}
