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
        bestAvailable = 0;  //Shows the parking-space which is free and has the lowest parkingNum.
                            // Is -1 if there is not anything free
    }

    //From bestAvailable, go to end of parkingArr. If it finds a free Parking Space, set bestAvailable to this and
    // return the previous best
    private int reserveSmallest(){
        int parkingNum = bestAvailable;
        if(bestAvailable == -1){
            System.out.println("No Parking Space left!");
            return -1;
        }
        else {
            spaceFree[parkingNum] = false;
            System.out.println("Reserved Parking Space: " + parkingNum);
            findNextBest();
            return parkingNum;
        }
    }

    private void findNextBest(){
        for (int i = bestAvailable + 1; i < spaceFree.length; i++) {
            if (spaceFree[i]) {
                bestAvailable = i;
                System.out.println("Next best is: " + bestAvailable);
                return;
            }
        }
        bestAvailable = -1;
        System.out.println("Parking full!");
    }

    public int reserve(int num){
        if(num > bestAvailable && spaceFree[num]){ //If desired num is free, reserve that
            spaceFree[num] = false;
            System.out.println("Reserved desired Parking Space: " + num);
            return num;
        }
        return reserveSmallest(); //If num was not free, reserveSmallest
    }

    public int reserve(){
        return reserveSmallest();
    }

    public void unreserve(int num){
        spaceFree[num] = true;
        System.out.println("Unreserved Parking Space Num: " + num);
        if(num < bestAvailable) bestAvailable = num;
    }

    public void showSpaces(){
        System.out.println("Spaces: ");
        for(int i = 0; i < spaceFree.length; i++){
            System.out.printf("%b, ", spaceFree[i]);
        }
        System.out.printf("\n");
    }

}
