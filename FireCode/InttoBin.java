public static String computeBinary(int val) {
        if(val < 2) {
        return Integer.toString(val);
        }
        else {
        return computeBinary(val/2)+computeBinary(val%2);
        }

        }