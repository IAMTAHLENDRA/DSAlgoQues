public static boolean isStringPalindrome(String str){

        if(str == null) {
        return true;
        }

        else if(str.length() == 1) {
        return true;
        }

        else if(str.length() == 0) {
        return true;
        }

        else {
        for(int i=0;i<str.length()/2;i++) {
        if(str.charAt(i) == str.charAt(str.length()-1-i) ){
        return true;
        }
        }
        }

        return false;
        }