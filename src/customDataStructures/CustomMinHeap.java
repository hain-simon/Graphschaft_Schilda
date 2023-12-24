package customDataStructures;

public class CustomMinHeap {
    private int[] heap;
    private int size = 0;
    private int maxsize;

    /*
    In this Heap, we start at Index 1 and reserve Index 0 for Integer.MIN_VALUE. This allows cleaner code for getting the Parent / Childs
     */

    public CustomMinHeap(int maxsize){
        this.maxsize = maxsize;
        heap = new int[this.maxsize + 1];
        heap[0] = Integer.MIN_VALUE;
    }

    private int parentIndex(int pos){
        return (pos/2);
    }

    private int leftChildIndex(int pos){
        return (pos*2);
    }

    private int rightChildIndex(int pos){
        return (pos*2) + 1;
    }

    private void swap (int pos1, int pos2){
        int temp = heap[pos1];
        heap[pos1] = heap[pos2];
        heap[pos2] = temp;
    }

    private boolean isChild(int pos){
        return (pos >= (size/2) && pos < size);
    }

    private void heapifyDown(int pos){
        if(isChild(pos)) return;

        //If heap at current pos is bigger than any child, swap with smaller child
        if(heap[pos] > heap[leftChildIndex(pos)] || heap[pos] > heap[rightChildIndex(pos)]){
            //If heap at leftChild is smaller, swap
            if(heap[leftChildIndex(pos)] < heap[rightChildIndex(pos)]){
                swap(pos, leftChildIndex(pos));
                heapifyDown(leftChildIndex(pos));
            }

            //Else do the same with rightChild
            else{
                swap(pos, rightChildIndex(pos));
                heapifyDown(rightChildIndex(pos));
            }
        }
    }

    private void heapifyUp(int pos){
        int temp = heap[pos];

        //While parent is bigger than heap at position, swap
        while(pos > 0 && temp < heap[parentIndex(pos)]){
            heap[pos] = heap[parentIndex(pos)];
            pos = parentIndex(pos);
        }
        heap[pos] = temp;
    }

    public void insert(int value){
        heap[++size] = value;
        int current = size;
        heapifyUp(current);
    }

    public int extractMin(){
        int min = heap[1];
        heap[1] = heap[size--];
        heapifyDown(1);
        return min;
    }

    public int getMin() {
        return heap[1];
    }

}
