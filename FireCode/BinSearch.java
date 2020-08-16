public static Boolean binarySearch(int[] arr, int n){
        int size = arr.length;
        if(size ==0 ) {
        return false;
        }
        if(n == arr[size/2]) {
        return true;
        }

        else if(n > arr[size/2]) {
        for(int i=size/2;i<=size-1;i++) {
        if(arr[i] == n) {
        return true;
        }
        }
        }

        else if(n < arr[size/2]) {
        for(int i=size/2;i>=0;i--) {
        if(arr[i] == n) {
        return true;
        }
        }
        }


        return false;
        }