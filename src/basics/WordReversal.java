package basics;

public class WordReversal {
    public static void main(String[] args) {
        String x = "i.like.this.program.very.much";
        String[] arr = x.split("\\.");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]).append(".");
        }
        sb.setLength(sb.length()-1);
        System.out.println(sb.toString());
    }
}
