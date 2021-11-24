package com.oxyl;

public class PlayWhitSwitch {

    public static void main(String... arg){

        //old
        int seat = 3;
        String type;

        switch (seat){
            case 1:
                type = "small";
                break;
            case 2:
            case 3:
                int s =seat;
                type= "medium " + s;
                break;
            default:
                //String s = "debub";
                type = "big";
        }

        //java 15
        switch (seat){
            case 1 -> type = "small";
            case 2,3 ->{
                int s =seat;
                type= "medium " + s;
            }
            default->{
                String s = "debub";
                type = "big";
            }
        }

        var type2= switch (seat){
            case 1 -> "small";
            case 2,3 ->{
                int s =seat;
                yield  "medium " + s;
            }
            default->{
                String s = "debub";
                yield "big";
            }
        };


    }
}
