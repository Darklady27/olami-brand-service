package io.angelwing;

import java.util.UUID;

public class Clothes {

    private UUID id;

    private ClothesMake clothesMake;
    
    private Colors colors;

    private Sizes sizes;

    private double salePrice;

    private double regularPrice;

    public Clothes(){
        //NOOP
    }

    public Clothes(UUID id , ClothesMake clothesMake , Colors colors , Sizes sizes , double salePrice , double regularPrice){
        this.id = id;
        this.clothesMake = clothesMake;
        this.colors = colors;
        this.sizes = sizes;
        this.salePrice = salePrice;
        this.regularPrice = regularPrice;
    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ClothesMake getClothesMake() {
        return clothesMake;
    }

    public void setClothesMake(ClothesMake clothesMake) {
        this.clothesMake = clothesMake;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Sizes getSizes() {
        return sizes;
    }

    public void setSizes(Sizes sizes) {
        this.sizes = sizes;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }
}
