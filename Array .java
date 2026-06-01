class Array {
        int[] arr;
        int size;
        int capacity;

       Array(int capacity) {
        arr = new int[capacity];
          this.capacity = capacity;
          size = 0;
      }

//Insert a Index
boolean insert(int index,int element){
    if(size>=capacity||index<0||index>size){
        System.out.println("Invalid index");
        return false;
    }
    for(int i = size;i>index;i--){
        arr[i] = arr[i-1];
    }
    arr[index]= element;
    size++;
    return true;

}
void display(){
    for(int i = 0 ; i<size;i+=){
        System.out.print(arr[i]+" ");

    }
    System.out.println();
}   
      public static void main(String[] args) {
          Array arr1 = new Array(5);
          System.out.println(arr1.capacity);
          arr1.insert(0,25);
           arr1.insert(1,2);
           arr1.insert(2,98);
           arr1.display();
      }
}