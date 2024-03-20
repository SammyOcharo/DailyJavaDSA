package com.dev.DSA;

public class InstantJazz {

    //Create a function which concatenates the number 7 to the end of every chord in an array. Ignore all chords which already end with 7.
    //
    //Examples
    //jazzify(["G", "F", "C"]) ➞ ["G7", "F7", "C7"]
    //
    //jazzify(["Dm", "G", "E", "A"]) ➞ ["Dm7", "G7", "E7", "A7"]
    //
    //jazzify(["F7", "E7", "A7", "Ab7", "Gm7", "C7"]) ➞ ["F7", "E7", "A7", "Ab7", "Gm7", "C7"]
    //
    //jazzify([]) ➞ []

    public static String [] jazzify(String[] jazzCodes){

        for(int i=0; i <= jazzCodes.length -1; i++){
            if(!jazzCodes[i].contains("7")){
                jazzCodes[i] = jazzCodes[i] + "7";
            }
        }

        return jazzCodes;
    }
}
