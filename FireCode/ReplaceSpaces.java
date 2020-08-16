public static String replace(String a, String b) {
StringBuilder ansString = new StringBuilder();
for(int i = 0; i < a.length(); i++){
    char c = a.charAt(i);
    if(c == ' ') ansString.append(b);
    else ansString.append(c);
}
return ansString.toString();
}