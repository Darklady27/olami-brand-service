package io.angelwing;

import java.util.UUID;

public class ClothesMake {

    private UUID id ;

    private ClothesCollection clothesCollection;

    private int name;

    private DressType dressType;

    private JeansType jeansType;

    private SkirtType skirtType;

    private JacketType jacketType;

    public  ClothesMake(){
        //NOOP
    }


    public  ClothesMake(    UUID id , ClothesCollection clothesCollection , int name , DressType dressType , JeansType jeansType , SkirtType skirtType , JacketType jacketType){
        this.id = id;
        this.clothesCollection = clothesCollection;
        this.name =name;
        this.dressType = dressType;
        this.jacketType = jacketType;
        this.jeansType = jeansType;
        this.skirtType = skirtType;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public ClothesCollection getClothesCollection() {
        return clothesCollection;
    }

    public void setClothesCollection(ClothesCollection clothesCollection) {
        this.clothesCollection = clothesCollection;
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public DressType getDressType() {
        return dressType;
    }

    public void setDressType(DressType dressType) {
        this.dressType = dressType;
    }

    public JeansType getJeansType() {
        return jeansType;
    }

    public void setJeansType(JeansType jeansType) {
        this.jeansType = jeansType;
    }

    public SkirtType getSkirtType() {
        return skirtType;
    }

    public void setSkirtType(SkirtType skirtType) {
        this.skirtType = skirtType;
    }

    public JacketType getJacketType() {
        return jacketType;
    }

    public void setJacketType(JacketType jacketType) {
        this.jacketType = jacketType;
    }
}
