package io.angelwing;

import java.util.UUID;

public class ClothesCollection {

    private UUID id;

    int name;

     public ClothesCollection(){
         //NOOP
     }

     public ClothesCollection(UUID id , int name){
         this.id = id;
         this.name = name;
     }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public  int getName(){
         return  name;
    }

    public void setName(int name){
         this.name = name;
    }
}
