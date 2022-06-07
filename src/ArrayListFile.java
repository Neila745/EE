import java.util.*;
import java.util.ArrayList;

public class ArrayListFile{
    public ArrayList<Integer> arrayListData;

    public ArrayListFile(int size){
        arrayListData = new ArrayList <Integer>();
        Random r = new Random();
        // fill with random numbers
        for (int i=0; i<size; i++){
            Integer ran= r.nextInt();
            arrayListData.add(ran);
        }
    }

        /*public int randomIndex(int size, int index){
          arrayListData= new ArrayList <Integer>();
          int r = (int)(Math.random()* index);
          System.out.println("The chosen index is: " + r);
          int numberAtRandomIndex = arrayListData.get(r);
          return numberAtRandomIndex;
        }*/


    public int randomIndex(){
        Random r = new Random();
        int index = r.nextInt(arrayListData.size());
        return index;
    }

    //write to EMPTY slot
    //TODO: overwrite to existing data
    public void overwriteAtIndex(int data, int index ){
        System.out.println(arrayListData.get(index));
        for(int i = 0 ; i < arrayListData.size(); i++){
            if(arrayListData.get(i) != null){
                arrayListData.set(index, data);
            }
        }
        System.out.println(arrayListData.get(index));
    }
    //TODO: reading random index
    public int readAtRandom(){
        // returns a random index between 0 - arrayListSize
        return arrayListData.get(randomIndex());
    }
    //TODO: reading a block of sequential indices

    public long timeReads(int readCount) {
        // performs readCount random timeReads
        // and return the elapsed time in ms or microseconds
        Random r = new Random();
        // record start time
        long start = System.nanoTime();
        for (int i=0; i<readCount;i++){

            int arrayIndex= r.nextInt(arrayListData.size());
            int arrayValue= arrayListData.get(arrayIndex);
        }
        long end = System.nanoTime();

        //record end time
        //System.out.println("start:"+start);
        //System.out.println("end  :"+end);
        long t = end - start;
        //t= System.nanoTime() -t;
        //divide by readCount to get average
        t = t / readCount;
        // return number
        return t;
    }

    public long memoryReads(int readCount) {
        Random r = new Random();
        Runtime runtime = Runtime.getRuntime();
        // record start memory
        long startMemory = runtime.totalMemory() - runtime.freeMemory();
        for (int i=0; i<readCount;i++){

            int arrayIndex= r.nextInt(arrayListData.size());
            int arrayValue= arrayListData.get(arrayIndex);
        }
        long endMemory = runtime.totalMemory() - runtime.freeMemory();

        //record end memory
        long m = endMemory - startMemory;
        //divide by readCount to get average
        m = m / readCount;
        // return number
        return m;
    }


      /*public void searchByValue(int size){
        for(int i=0; i < arrayListData.size(); i++) {
          if(arrayListData.get(i).equals(size)){
            System.out.println("Number is at index" + i);
          }
        }
      }*/




    public void display(){
        for(int i = 0 ; i < arrayListData.size(); i++){
            System.out.println(arrayListData.get(i));
        }
    }
}
