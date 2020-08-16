public static int maxGain(int[] a) {
    int maxgain = 0, minele = Integer.MAX_VALUE;
    for(int i=0;i<a.length;i++) {
        if(a[i] < minele) {
            minele = a[i];
        }
        if(minele < a[i]) {
            int gain = a[i]-minele;
            if(Math.abs(gain) > Math.abs(maxgain)) {
                maxgain = gain;
            }
        }
    }

    return Math.abs(maxgain);
}