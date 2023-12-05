public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            
        }
        System.out.println(binarySearch(arr, 7));
        
    }

    private static int binarySearch(int[] arr, int target){
        int p1 = 0;
        int p2 = arr.length-1;
        int middle = p2 + p1;
        System.out.println("y");
        while(p1<=p2){
            //if target > middle ------ p1 = target + 1 ---------- (middle = p2 + p1) / 2
            //else target < middle -------- p2 = target - 1 ------------ (middle = p2 + p1) / 2
            //else target = middle -------- return middle
            //nothing found return -1


            if(target > arr[middle]){
                p1 = middle + 1;
                middle = ((p2 + p1) / 2);
            }else if(target < arr[middle]){
                p2 = middle - 1;
                middle = ((p2+p1) /2);
            }else if(target == arr[middle]){
                return middle;
                
            }
            else{
                return -1;
            }
        }
        return -1;
    }
}
