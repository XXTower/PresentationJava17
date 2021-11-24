package com.oxyl;

import java.util.Arrays;

public class PlayWhitRecord {

    public static void main(String... arg){

        record Point(int x, int y){
        }

        var p11 = new Point(1,1);
        System.out.println("p11 = " + p11);
        System.out.println("p11.x() = " + p11.x());
        System.out.println("p11.y() = " + p11.y());

        var p01 = new Point(0,1);
        var p02 = new Point(0,2);
        var p10 = new Point(1,0);
        var p12 = new Point(1,2);
        var p20 = new Point(2,0);
        var p21 = new Point(2,1);
        var p22 = new Point(2,2);

        var points = Arrays.asList(
                p01,p02,p10,p12,p20,p11,p21,p22
        );
        System.out.println("points = " + points);


        record  Range(int start,int end){

        }

        var range = new Range(100,10);
        System.out.println("range = " + range);
    }
}
