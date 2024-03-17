package com.dev.DSA;

public class TranscribeToMRNA {
    //Transcribe To mRNA
    //Transcribe the given DNA strand into corresponding mRNA - a type of RNA, that will be formed from DNA after transcription.
    // DNA has the bases A, T, G and C, while RNA converts to U, A, C and G respectively.
    //
    //Examples
    //dnaToRna("ATTAGCGCGATATACGCGTAC") ➞ "UAAUCGCGCUAUAUGCGCAUG"
    //
    //dnaToRna("CGATATA") ➞ "GCUAUAU"
    //
    //dnaToRna("GTCATACGACGTA") ➞ "CAGUAUGCUGCAU"

    public static String dnaToRna(String dna){

        StringBuilder mRNA = new StringBuilder();
        for(char letter: dna.toCharArray()){
            switch(letter){
                case 'A':
                    mRNA.append('U');
                    break;
                case 'T':
                    mRNA.append('A');
                    break;
                case 'G':
                    mRNA.append('C');
                    break;
                case 'C':
                    mRNA.append('G');
                    break;
                default:
                    break;

            }
        }
        return mRNA.toString();
    }
}
