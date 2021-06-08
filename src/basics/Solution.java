package basics;

import java.util.Arrays;

public class Solution {
        public static void main(String[] args){
            String hallway = "--<->-><-><-->-";
            int salutes = 0;
            for(int i=0;i<hallway.length();i++){
                if(hallway.charAt(i) == '>')  {
                   for (int j=i; j<hallway.length(); j++) {
                       if(hallway.charAt(j) == '<') {
                           salutes++;
                       }
                   }
                }
            }
            for(int i=hallway.length()-1;i>=0;i--){
                if(hallway.charAt(i) == '<')  {
                    for (int j=i-1; j>=0; j--) {
                        if(hallway.charAt(j) == '>') {
                            salutes++;
                        }
                    }
                }
            }
            System.out.println(salutes);
        }
}
