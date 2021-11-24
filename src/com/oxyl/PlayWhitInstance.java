package com.oxyl;

import java.nio.file.Path;
import java.util.Objects;

public class PlayWhitInstance {


    public static void main(String... arg){

        Object fileref = Path.of("path/to/foo.txt");
        //old
        if(fileref instanceof Path){
            System.out.println("fileref = " +((Path) fileref).getFileName());
        }
        //new
        if(fileref instanceof Path path){
            System.out.println("path = " + path.getFileName());
        }

        record Foo(String s) {
            @Override
            public boolean equals(Object o) {

                return o instanceof Foo foo && s.equals(foo.s);
            }

        }
    }

}
