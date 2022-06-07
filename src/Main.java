class Main {

    public static void main(String[] args) {
        System.out.println("EE Project");
        System.out.println("Simple Array");
        SimpleArray array = new SimpleArray(1000000);
        array.overwriteAtIndex(11,224);
        long readTime =array.timeReads(1000000);
        System.out.println("The read time is " + readTime);
        //int rand = array.randomIndex(1000000);
        // System.out.println("The number at that index is: " + rand);
        long memoryUsed = array.memoryReads(100);
        System.out.println("The memory used is " + memoryUsed);
        long numberAtRandomIndexA =array.randomIndex();
        System.out.println("The number this random index is " + numberAtRandomIndexA);


        System.out.println("ArrayList");
        ArrayListFile arrayList = new ArrayListFile(1000000);
        //arrayList.searchByValue(10000);
        arrayList.overwriteAtIndex(11,224);
        readTime = arrayList.timeReads(100);
        System.out.println("The read time is " + readTime);
        //int rand2 = arrayList.randomIndex();
        //System.out.println("The number at that index is: " + rand2);
        memoryUsed = arrayList.memoryReads(10);
        System.out.println("The memory used is " + memoryUsed);
        long numberAtRandomIndexAL =arrayList.randomIndex();
        System.out.println("The number this random index is " + numberAtRandomIndexAL);
        System.out.println(arrayList.readAtRandom());
    }

}