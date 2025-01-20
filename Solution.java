public class MyClass {
    public static void main(String[] args) {
        int[] arr = new int[5];
        if(0 <= 4 && 4 < arr.length){
            arr[4] = 10; 
            System.out.println(arr[4]);
        }else{
            System.out.println("Array index out of bounds");
        }
    }
}