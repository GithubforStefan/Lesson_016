package com.redi.streaming;


import java.time.*;
import java.util.*;

//this is only for testing some concepts:
public class Main {
    public static void main(String[] args) {
        Track oSoleMio = new Track(UUID.randomUUID(),"O sole mio", Duration.ofSeconds(350),"Enrico Caruso", Year.of(1904));
        System.out.println(oSoleMio.getName());
        StreamingService reDiStreaming = new StreamingService();
        System.out.println(reDiStreaming.name);
        User stefan = new User(UUID.randomUUID(), "Stefan", newPlaylist);



    }


}
