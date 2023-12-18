package problemImplementations;

import java.util.Arrays;

public class Parkhaus {

    int size;
    int bestAvailable;
    boolean[] spaceFree;

    public Parkhaus(int size) {
        this.size = size;
        spaceFree = new boolean[size];
        Arrays.fill(spaceFree, true);
        bestAvailable = 0;
    }

    public boolean isFree(int parkingNum){
        return spaceFree[parkingNum];
    }
    public void unreserve(int parkingNum){
        spaceFree[parkingNum] = true;
        if(bestAvailable > parkingNum){
            bestAvailable = parkingNum;
        }
    }
    public int reserve(int parkingNum) throws Exception {
        //This method returns the parking Number that was reserved. If the Parking Lot is full, it throws an Exception
        checkIndex(parkingNum);

        //If bestAvailable >= size (no free Space) throw Exception
        if(bestAvailable >= size) throw new Exception("No free Space left!");

        //If we try to reserve a bigger Num than bestAvailable, check this, otherwise reserve bestAvailable
        if(parkingNum > bestAvailable) {
            if (spaceFree[parkingNum]) {
                spaceFree[parkingNum] = false;
                return parkingNum;
            }
        }

        //Otherwise reserveBestAvailable
        return reserveBest();

    }

    private int reserveBest(){
        spaceFree[bestAvailable] = false;
        int reservedNum = bestAvailable;
        setNextBest();
        return reservedNum;
    }

    private void setNextBest(){
        for(int i = bestAvailable; i < size; i++){
            //If we find a free Space, set bestAvailable
            if(spaceFree[i]){
                bestAvailable = i;
                return;
            }
        }
        //Otherwise set to size
        bestAvailable = size;
    }


    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of Bounds!");
        }
    }
}
