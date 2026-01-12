package IIP;

public class ConsecutiveLettersReplace {
    public static void main(String[] args) {
        String input="abcd12345ow";
        System.out.println(result(input));
    }
    private static String result(String input){
        int i=0;
        StringBuilder output= new StringBuilder();
        while(i<input.length()){
            char start= input.charAt(i);
            int end=i;

            while(end+1<input.length() && input.charAt(end+1)==input.charAt(end)+1){
                end++;
            }

            if(end>i){
                output.append(start).append("-").append(input.charAt(end));
            }else {
                output.append(start);
            }
            i=end+1;
        }
        return output.toString();
    }
}
