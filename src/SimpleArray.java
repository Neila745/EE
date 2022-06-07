import java.util.Random;
//imports for writing


public class SimpleArray{

    private int[] data;

    public SimpleArray(int size) {
        data = new int[size];
        Random r = new Random();
        // fill with random numbers
        for (int i=0; i<size; i++) {
            data[i] = r.nextInt();
        }
    }
  /*
  public int randomIndex(int index){
    data = new int[size];
    int r = (int)(Math.random()*data.length);
    System.out.println("The chosen index is: " + r);
    int numberAtRandomIndex = data[r];
    return numberAtRandomIndex;
    }  */

    public int randomIndex(){
        Random r = new Random();
        int index = r.nextInt(data.length);
        return data[index];
    }

    public long timeReads(int readCount) {
        // performs readCount random timeReads
        // and return the elapsed time in ms or microseconds
        Random r = new Random();
        // record start time
        long t = System.nanoTime();
        for (int i=0; i<readCount;i++){
            int arrayIndex= r.nextInt(data.length);
            int arrayValue= data[arrayIndex];
        }
        //record end time
        t = System.nanoTime() - t;
        //divide by readCount to get average
        t = t / readCount;
        // return number
        return t;
    }
    public long memoryReads(int readCount) {
        // performs readCount random timeReads
        // and return the elapsed time in ms or microseconds
        Random r = new Random();
        Runtime runtime = Runtime.getRuntime();
        // record start time
        long m = runtime.totalMemory() - runtime.freeMemory();
        for (int i=0; i<readCount;i++){
            int arrayIndex= r.nextInt(data.length);
            int arrayValue= data[arrayIndex];
        }
        //record end time
        m = runtime.totalMemory() - runtime.freeMemory() - m;
        //divide by readCount to get average
        m = m / readCount;
        // return number
        return m;
    }
    /* public int getDataLength(){
       int lengthData =0 ;
       while(data[] != null){
         lengthData = lengthData + 1;
       }
       return lengthData;
     }*/
    //TODO: overwrite to existing data
    public void overwriteAtIndex(int number, int index ){
        System.out.println(data[index]);
        for(int i = 0 ; i < data.length; i++){
            if(data[i] != 0){
                data[index] = number;
            }
        }
        System.out.println(data[index]);
    }
    //TODO: reading random index
    //TODO: reading a block of sequential indices


    public void addArray(){
        String[] myArray= {"element_1", "element_2", "element_3", "etc..."};
        for (int i=0;i<myArray.length;i++) {
            System.out.print("Array " + myArray[i] + ", ");

        }

    }

    public void display(){
        for(int i = 0 ; i < data.length; i++){
            System.out.println(data[i]);
        }
    }
}
