class Quiz{
    public static void main(String args[]) {
        int arr[] = {3, 4, 5};
        for(int i = 1; i<4; i++){
            arr[i-1] *= i;
        }
        System.out.print(arr[2]);
    }
}