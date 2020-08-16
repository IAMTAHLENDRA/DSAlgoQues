public static Character firstNonRepeatedCharacter(String str) {
HashMap<Character, Integer> count = new HashMap<Character, Integer>();

for(int i=0;i<str.length();i++) {
  if(count.containsKey(str.charAt(i))) {
      count.put(str.charAt(i),count.get(str.charAt(i))+1 );
  } else {
      count.put(str.charAt(i),1);
  }
}

for(int j = 0;j<str.length();j++) {
    if(count.get(str.charAt(j)) == 1) {
        return str.charAt(j);
    }
}


return null;

}