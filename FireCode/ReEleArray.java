public static String duplicate(int[] numbers){

        Arrays.sort(numbers);

        TreeSet<Integer> ans = new TreeSet<Integer>();

        for(int i=0;i<numbers.length-1;i++) {
        if(numbers[i] == numbers[i+1]) {
        ans.add(numbers[i]);
        }
        }

        String answer = ans.toString();

        return answer;




        }