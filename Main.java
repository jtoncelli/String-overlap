package com.company;

class Main {
    public static String getOverlap(String s1, String s2) {
        int counter = 0;
        int counter2 = 0;
        String overlap = "";
        String overlap2 = "";
        boolean test = true;
        for (int a = 0; a < s1.length(); a++){
            for (int b = 0; b < s2.length(); b++){
                if (Character.toString(s1.charAt(a)).equals(Character.toString(s2.charAt(b)))){
                    //factorial testing if any characters are equal
                    for (int a1 = a; a1 < s1.length(); a1++){
                        for (int b1 = b; b1 < s2.length(); b1++){
                            if (s1.substring(a,a1+1).equals(s2.substring(b,b1+1))){
                                //factorial testing how many more characters are equal
                                counter++;
                                if (counter > counter2){
                                    overlap = s1.substring(a,a1+1);
                                    counter2 = counter;
                                    //in case of several equal substrings
                                }
                            }
                        }
                    }
                    counter = 0;
                    if (test){
                        overlap2 = overlap;
                        test = false;
                    }
                }
            }
        }
        if (overlap2.length() == overlap.length()){
            return overlap2;
        }
        return overlap;
    }

    public static void main(String[] args) {
        System.out.println(getOverlap("PSA T2", "SA T1"));
    }
}
