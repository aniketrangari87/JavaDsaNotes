import java.util.*;
 
 class Heap{
    static void swap(ArrayList<Integer> heap, int l , int r ){
        int temp = heap.get(l);
        heap.set(l,heap.get(r));
        heap.set(r,temp);
    }
    static void pushupinMinheap(ArrayList<Integer> heap, int i){
        int pareantInd= (i-1)/2;
        if( i ==0 || heap.get(pareantInd) < heap.get(i)){
            return ;
        }
        swap(heap , i , pareantInd );

        pushupinMinheap(heap,pareantInd);
    }

    static void insetMinheap(ArrayList<Integer> heap , int data){

        // isert in last 
        heap.add(data);
        int index = heap.size()-1;

        pushupinMinheap(heap , index );
    }
     

    public static void main(String[] args) {

        ArrayList<Integer> heap = new ArrayList<>();

        heap.add(10);
        heap.add(20);
        heap.add(30);
        heap.add(40);
        heap.add(50);
        System.out.println(heap);
        insetMinheap(heap,2);
        System.out.println(heap);

    }


}