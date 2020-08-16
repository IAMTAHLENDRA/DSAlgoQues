public static String reverseString(String str){
    String inputString = str;
    String outputstring = null;

    if(inputString == null) {
        return null;
    }
    else {
    StringBuilder newstr = new StringBuilder();

    for(int i = str.length()-1;i>=0;i--) {
        char chr = str.charAt(i);

        newstr.append(chr);
    }

    outputstring = newstr.toString();

    return outputstring;
    }
}