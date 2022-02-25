package io.angelwing;

import java.util.UUID;

public class BarcodeUnit {

    private UUID id;

    private Clothes clothes;

    private boolean available;

    public BarcodeUnit(){
        //NOOP
    }

    public BarcodeUnit(UUID id , Clothes clothes , boolean available){
        this.id = id;
        this.clothes = clothes;
        this.available = available;
    }

    public UUID getId(){

        return id;
    }

    public void setId(UUID id){

        this.id = id;
    }

    public boolean isAvailable() {

        return available;
    }

    public void setAvailable(boolean available) {

        this.available = available;
    }


    public Clothes getClothes() {
        return clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }
}
