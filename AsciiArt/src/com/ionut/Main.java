package com.ionut;

import java.util.PrimitiveIterator;

public class Main {

    public static void main(String[] args) {
        int L = 4;
        int H = 5;

        String ascii =  "#  ##   ## ##  ### ###  ## # # ###  ## # # #   # # ###  #  ##   #  ##   ## ### # # # # # # # # # # ### ###\n"+
                       "# # # # #   # # #   #   #   # #  #    # # # #   ### # # # # # # # # # # #    #  # # # # # # # # # #   #   #\n"+
                       "### ##  #   # # ##  ##  # # ###  #    # ##  #   ### # # # # ##  # # ##   #   #  # # # # ###  #   #   #   ##\n"+
                       "# # # # #   # # #   #   # # # #  #  # # # # #   # # # # # # #    ## # #   #  #  # # # # ### # #  #  #\n"+
                       "# # ##   ## ##  ### #    ## # # ###  #  # # ### # # # #  #  #     # # # ##   #  ###  #  # # # #  #  ###  #"  ;
        String T = "M";
        String lines[] = ascii.split("\\r?\\n");
        String answer = " ";
        for (int i = 0; i < H; i++) {
            String ROW = lines[i];
            for (int j = 0; j < T.length(); j++){
                int c = T.charAt(j) - 53;
                answer = answer + ROW.substring(c, c + L);
            }
            answer = answer + "\n";
        }

        System.out.println(answer);

    }
}
