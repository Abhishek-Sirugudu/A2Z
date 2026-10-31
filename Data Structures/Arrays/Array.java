public class Array {
    private int size;
    private int capacity;
    private int[] arr;

    public Array(int capacity){
        if(capacity < 0){
            throw new IllegalArgumentException("Array capacity cannot be negative");
        }
        this.capacity = capacity;
        this.size = 0;

        arr = new int[capacity];
    }

    private void resize(){
        if(capacity == 0){   
            capacity += 2;
        }else{
            capacity *= 2;
        }

        int[] copy_arr = new int[capacity];

        for(int i = 0; i< arr.length; i++){
            copy_arr[i] = arr[i];
        }
        
        this.arr = copy_arr;
        
    }



    public void add(int ele){
        if(size == capacity){
            resize();
        }
        arr[size] = ele;
        size++;
    }

    public int get(int index){
        if(index < 0 || index >= size){
           throw new IndexOutOfBoundsException("Invalid index: " + index);
        }

        return arr[index];
    }

    public void set(int index,int ele){
        if(index < 0 || index >= size){
            System.out.println("Index is not valid");
            return;
        }

        arr[index] = ele;
    }
}
