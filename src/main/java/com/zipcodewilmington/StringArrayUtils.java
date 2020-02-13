package com.zipcodewilmington;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[array.length -1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length -2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        boolean z = false;
        for(int x =0; x <array.length; x++){
            if(array[x].equals(value)){
                z =true;
            }
        }

      return z;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] reverse = new String[array.length];

        int count = 0;

        for(int x = array.length -1; x >= 0; x--){
            String holder = array[x];
            reverse[count] = holder;
            count ++;
        }
        return reverse;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int count = 0;
        boolean answer = false;

        for(int x = array.length -1; x >= 0; x--){
            if(array[x].equals(array[count])){
                answer = true;
            }else {
                answer = false;
                x =-1;
            }
            count ++;
        }

        return answer;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {

        char[] alpha = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        String stringo = "";
        int atoz = 0;

        for(int x = 0; x <= array.length -1; x++){
            String holder = array[x];
            stringo += holder;
        }

        stringo = stringo.toLowerCase();

        if(stringo.length() >= alpha.length){

            for(int x = 0; x <= alpha.length - 1; x++){

                for(int z = 0; z <= stringo.length() -1; z++){
                    if(stringo.charAt(z) == alpha[x]){
                        atoz++;
                        z = stringo.length() + 1;
                    }
                }
            }
            if(atoz == 26){
                return true;
            }else {
                return false;
            }
        }else{
            return false;
        }


    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {

        int counter =0;
        for(int x = 0; x <= array.length - 1; x++){
            if(value == array[x]){
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {

        int arrayLength = array.length -1;
        String[] newArray = new String[arrayLength];

        int currentIndx = 0;

        for(int x = 0; x < array.length; x++){
            if(array[x] == valueToRemove){

            }else{
                newArray[currentIndx] = array[x];
                currentIndx++;
            }
        }

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        String[] places = new String[array.length];
        places[0] = array[0];
        int numOfGroups = 1;

        for (int i = 1; i <= array.length -1; i++){
            String passer = "XX";
            String actual = array[i];
            if(array[i].equals(array[i-1])){
                places[i] = passer;
            }else{
                numOfGroups++;
                places[i] = actual;
            }
        }
        String[] answer = new String[numOfGroups];
        int counter = 0;

        for(int x = 0; x <= array.length -1; x++) {
            if(places[x].equals("XX")){

            }else if(!places[x].equals("XX")){
                answer[counter] = places[x];
                counter++;
            }
        }
        return answer;
    }
    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {

        String[] places = new String[array.length];
        int numOfGroups = 0;

        for (int i = 0; i <= array.length - 1; i++) {
            String passer = "XX";
            String actual = array[i];
            if (i == 0) {
                places[i] = array[i];
                numOfGroups++;
            } else if (array[i].equals(array[i - 1])) {
                places[i] = passer;
            } else {
                numOfGroups++;
                places[i] = actual;
            }
        }

        String[] answer = new String[numOfGroups];
        int counter = 0;
        int firstRun = 1;
        String current = "";

        for (int x = 0; x <= array.length - 1; x++) {

            if (firstRun == 1) {
                answer[0] = places[0];
                firstRun = 0;
                current = answer[0];

            } else if (places[x].equals("XX")) {
                answer[counter] += current;

            } else if (!places[x].equals("XX")) {
                counter++;
                answer[counter] = places[x];
                current = places[x];
            }


        }
        return answer;
    }

}

