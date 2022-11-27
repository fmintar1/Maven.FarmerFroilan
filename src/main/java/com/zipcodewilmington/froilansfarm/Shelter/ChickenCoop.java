package com.zipcodewilmington.froilansfarm.Shelter;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Produce.EarCorn;

public class ChickenCoop extends Farm<Chicken>{
    Chicken[] chicken;
    public ChickenCoop(){
    }
    public ChickenCoop(Chicken chicken, Chicken chicken2) {
        this.chicken = new Chicken[2];
        this.chicken[0] = chicken;
        this.chicken[1] = chicken2;
    }
    public ChickenCoop(Chicken chicken, Chicken chicken2, Chicken chicken3) {
        this.chicken = new Chicken[3];
        this.chicken[0] = chicken;
        this.chicken[1] = chicken2;
        this.chicken[2] = chicken3;
    }
    public ChickenCoop(Chicken chicken, Chicken chicken2, Chicken chicken3, Chicken chicken4) {
        this.chicken = new Chicken[4];
        this.chicken[0] = chicken;
        this.chicken[1] = chicken2;
        this.chicken[2] = chicken3;
        this.chicken[3] = chicken4;
    }
    public ChickenCoop(Chicken chicken, Chicken chicken2, Chicken chicken3, Chicken chicken4, Chicken chicken5, Chicken chicken6) {
        this.chicken = new Chicken[6];
        this.chicken[0] = chicken;
        this.chicken[1] = chicken2;
        this.chicken[2] = chicken3;
        this.chicken[3] = chicken4;
        this.chicken[4] = chicken5;
        this.chicken[5] = chicken6;
    }
    public void store(Chicken chicken) {
        for (int i = 0; i < this.chicken.length; i++) {
            if (this.chicken[i] == null) {
                this.chicken[i] = chicken;
                System.out.println("All of the chickens are back in stable");
                break;
            }
        }
    }
    public Chicken release(int stableNumber) {
        if(this.chicken[stableNumber] != null) {
            Chicken temp;
            temp = chicken[stableNumber];
            chicken[stableNumber] = null;
            System.out.println("\033[1;30m\033[47m" + temp + " has been released.\033[0m");
            return temp;
        }
        return null;
    }
    public void feed(EarCorn earCorn) {
        for(int i = 0; i < chicken.length; i++) {
            chicken[i].eat(earCorn);
        }
    }
    //ADDED CONSTRUCTOR (5-6)
    //ADDED METHOD STORE (7-8)
    //ADDED METHOD RELEASE() (10-12)
}