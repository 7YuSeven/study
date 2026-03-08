package com.javaproject.test03;

import java.util.ArrayList;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<LiHuaCat> liHuaCats = new ArrayList<>();
        ArrayList<BoSiCat> boSiCats = new ArrayList<>();
        ArrayList<Teddy> teddys = new ArrayList<>();
        ArrayList<Husky> huskys = new ArrayList<>();

        keepPet1(liHuaCats);
        keepPet1(boSiCats);
        keepPet2(teddys);
        keepPet2(huskys);

        keepPet3(liHuaCats);

    }

    //养猫不养狗
    public static void keepPet1(ArrayList<? extends Cat> list){
    }

    //养狗不养猫
    public static void keepPet2(ArrayList<? extends Dog> list){

    }

    //只养动物
    public static void keepPet3(ArrayList<? extends Animal> list){

    }
}
