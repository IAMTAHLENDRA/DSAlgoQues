public static boolean areAllCharactersUnique(String str){

HashMap<Character, Integer> countmap = new HashMap<Character, Integer>();

    if(str == null) {
        return true;
    }
    else if(str.length() == 0) {
        return true;
    }
    int count=0;
        int n = str.length();

    for(int i=0;i<n;i++) {
        countmap.put(str.charAt(i), count++);
    }

    if(countmap.size() != n ) {
        return false;
    }

    return true;

}