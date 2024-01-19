package customDataStructures;

public class CustomArrayList <T> {

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



}
