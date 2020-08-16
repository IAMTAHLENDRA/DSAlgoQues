public static int findMissingNumber(int[] arr) {

int sum = 0;
for(int i=0;i<arr.length;i++) {
    sum += arr[i];
}

return 55-sum;

}