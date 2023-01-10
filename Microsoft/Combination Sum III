class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character,Character> hm = new HashMap<>();
        int numBulls = 0;
        int numCows = 0;
        int numbers[] = new int[10];
        for(int i=0;i<secret.length();i++){
            
            if(secret.charAt(i) == guess.charAt(i)){
                numBulls++;
                
            }
            else{
                int s = Character.getNumericValue(secret.charAt(i));
                int g = Character.getNumericValue(guess.charAt(i));
                if(numbers[s] < 0){
                    numCows++;
                }
                if(numbers[g] > 0){numCows++;}
                numbers[s]++;
                numbers[g]--;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.valueOf(numBulls));
        sb.append("A");
        sb.append(Integer.valueOf(numCows));
        sb.append("B");
        return sb.toString();
    }
}
