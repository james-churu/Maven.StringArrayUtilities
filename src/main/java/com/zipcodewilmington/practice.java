package com.zipcodewilmington;

public class practice {


    public static void main(String[] args){

        String[] array = {"a", "a", "a", "b", "c", "c", "a", "a","a", "d"};


        String[] places = new String[array.length];
        int numOfGroups = 0;

        for (int i = 0; i <= array.length -1; i++){
                String passer = "XX";
                String actual = array[i];
            if(i ==0) {
                places[i] = array[i];
                System.out.println(places[i]);
                numOfGroups++;
            }else if(array[i].equals(array[i-1])){
                places[i] = passer;
                System.out.println(passer);
            }else{
                numOfGroups++;
                places[i] = actual;
                System.out.println(actual);
            }
        }
        System.out.println("-----------------" + numOfGroups);


        String[] answer = new String[numOfGroups];
        int counter = 0;
        int firstRun = 1;
        String current = "";

        for(int x = 0; x <= array.length -1; x++) {

            if(firstRun == 1){
                answer[0] = places[0];
                firstRun = 0;
                current = answer[0];

            } else if(places[x].equals("XX")){
                answer[counter] += current;

            } else if(!places[x].equals("XX")){
                counter++;
                answer[counter] = places[x];
                current = places[x];
            }else {

            }
        }
        int x= 0;
        while(x <= answer.length -1){
            System.out.println(answer[x]);
            x++;
        }
    }
}

