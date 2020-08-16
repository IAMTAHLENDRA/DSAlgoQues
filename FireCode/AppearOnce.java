public static int singleNumber(int[] A) {
Hashtable<Integer, Integer> count = new Hashtable<Integer,Integer>();

for(int i=0;i<A.length;i++) {
    if(count.containsKey(A[i])) {
    count.put(A[i],count.get(A[i])+1 );
    } else {
        count.put(A[i], 1);
    }
}

for(int j=0;j<A.length;j++) {
    if(count.get(A[j]) == 1) {
        return A[j];
    }
}

return 0;

}