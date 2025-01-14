package com.zipcodewilmington.froilansfarm;
import com.zipcodewilmington.froilansfarm.Animal.Chicken;
import com.zipcodewilmington.froilansfarm.Animal.Cow;
import com.zipcodewilmington.froilansfarm.Animal.Horse;
import com.zipcodewilmington.froilansfarm.Controller.Edible;
import com.zipcodewilmington.froilansfarm.Crops.Vegetable;
import com.zipcodewilmington.froilansfarm.Person.*;
import com.zipcodewilmington.froilansfarm.Produce.*;
import com.zipcodewilmington.froilansfarm.Shelter.ChickenCoop;
import com.zipcodewilmington.froilansfarm.Shelter.CowShed;
import com.zipcodewilmington.froilansfarm.Shelter.FarmHouse;
import com.zipcodewilmington.froilansfarm.Shelter.Stable;

public class MorningRoutine {
    Horse pegasus = new Horse("Pegasus");
    Horse charlie = new Horse("Charlie");
    Horse nightmare = new Horse("Nightmare");
    Horse sebastian = new Horse("Sebastian");
    Horse dullahan = new Horse("Dullahan");
    Horse jackstraw = new Horse("Jackstraw");
    Horse reba = new Horse("Reba");
    Horse waseca = new Horse ("Waseca");
    Horse seabiscuit = new Horse ("Seabiscuit");
    Horse redhare = new Horse ("Redhare");
    Carrot earCorn = new Carrot("earcorn");
    Tomato tomato = new Tomato("tomato");
    EggPlant eggPlant = new EggPlant("eggplant");
    Lettuce lettuce = new Lettuce("lettuce");
    Carrot carrot = new Carrot("carrot");
    EdibleEgg egg = new EdibleEgg("egg");
    FarmHouse house = new FarmHouse();
    Farmer froilan = (Farmer) house.getPersonObject(0);
    Pilot froilanda = (Pilot) house.getPersonObject(1);
    Stable stable = new Stable(pegasus, charlie);
    Stable stable2 = new Stable(nightmare, sebastian, dullahan);
    Stable stable3 = new Stable(jackstraw, reba, waseca, seabiscuit, redhare);
    Chicken kentucky, popeyes, link, torchic, foghorn, eggmaker, wanda, yolkahontas, zelda, chickadee, whatever, barbie, kardashian, henzilla, cruella;
    ChickenCoop coopACabana = new ChickenCoop("Coop-A-Cabana", kentucky = new Chicken(), torchic = new Chicken());
    ChickenCoop tajMaCoop = new ChickenCoop("Taj-Ma-Coop",popeyes = new Chicken(), eggmaker = new Chicken(), wanda = new Chicken());
    ChickenCoop eggCademy = new ChickenCoop("Egg-Cademy",link = new Chicken(), yolkahontas = new Chicken(), chickadee = new Chicken(), whatever = new Chicken());
    ChickenCoop justGotLaid = new ChickenCoop("Just-Got-Laid",foghorn = new Chicken(), zelda = new Chicken(), barbie = new Chicken(), kardashian = new Chicken(), henzilla = new Chicken(), cruella = new Chicken());
    Cow betty = new Cow("Betty");
    Cow buttercup = new Cow ("Buttercup");
    Cow maggie = new Cow ("Maggie");
    Cow sweetie = new Cow ("Sweetie");
    Cow emma = new Cow ("Emma");
    Cow molly = new Cow ("Molly");
    Cow beef = new Cow ("Beef");
    Cow penelope = new Cow ("Penelope");
    Cow meg = new Cow ("Meg");
    Cow bessie = new Cow ("Bessie");
    CowShed cowShed1 = new CowShed(betty, bessie);
    CowShed cowShed2 = new CowShed(buttercup, maggie, sweetie);
    CowShed cowShed3 = new CowShed(beef, emma, molly, penelope, meg);
    Edible[] froilanBreakfast;
    Edible[] froilandaBreakfast;
    Horse horseOnField1;
    Horse horseOnField2;
    public MorningRoutine() {
    }
    public void activities(){
        System.out.println("\033[0;107m\033[1;91m\t\tMorning Routine for CALM Farm\t\t\033[0m\n");
        house.leave(froilan);
        house.leave(froilanda);
        cowShedRelease(cowShed1);
        cowShedRelease(cowShed2);
        cowShedRelease(cowShed3);
        horseOnField1 = stable.release(0);
        horseOnField2 = stable.release(1);
        froilan.mount(horseOnField1);
        froilanda.mount(horseOnField2);
        froilan.dismount(horseOnField1);
        froilanda.dismount(horseOnField2);
        stable.store(horseOnField1);
        stable.store(horseOnField2);
        System.out.print(horseFeeding(horseOnField1,earCorn,earCorn,carrot));
        System.out.print(horseFeeding(horseOnField2,earCorn,earCorn,eggPlant));
        horseOnField1 = stable2.release(0);
        horseOnField2 = stable2.release(1);
        froilan.mount(horseOnField1);
        froilanda.mount(horseOnField2);
        froilan.dismount(horseOnField1);
        froilanda.dismount(horseOnField2);
        stable2.store(horseOnField1);
        stable2.store(horseOnField2);
        System.out.print(horseFeeding(horseOnField1,earCorn,earCorn,earCorn));
        System.out.print(horseFeeding(horseOnField2,earCorn,earCorn,lettuce));
        horseOnField1 = stable2.release(2);
        horseOnField2 = stable3.release(0);
        froilan.mount(horseOnField1);
        froilanda.mount(horseOnField2);
        froilan.dismount(horseOnField1);
        froilanda.dismount(horseOnField2);
        stable2.store(horseOnField1);
        stable3.store(horseOnField2);
        System.out.print(horseFeeding(horseOnField1,carrot,earCorn,carrot));
        System.out.print(horseFeeding(horseOnField2,carrot,eggPlant,carrot));
        System.out.print(chickenFeeding(this.earCorn));
        horseOnField1 = stable3.release(1);
        horseOnField2 = stable3.release(2);
        froilan.mount(horseOnField1);
        froilanda.mount(horseOnField2);
        froilan.dismount(horseOnField1);
        froilanda.dismount(horseOnField2);
        stable3.store(horseOnField1);
        stable3.store(horseOnField2);
        System.out.print(horseFeeding(horseOnField1,carrot,carrot,lettuce));
        System.out.print(horseFeeding(horseOnField2,carrot,carrot,carrot));
        horseOnField1 = stable3.release(3);
        horseOnField2 = stable3.release(4);
        froilan.mount(horseOnField1);
        froilanda.mount(horseOnField2);
        froilan.dismount(horseOnField1);
        froilanda.dismount(horseOnField2);
        stable3.store(horseOnField1);
        stable3.store(horseOnField2);
        System.out.print(horseFeeding(horseOnField1,lettuce,earCorn,carrot));
        System.out.print(horseFeeding(horseOnField2,earCorn,eggPlant,lettuce));
        System.out.print(froilanBreakfast(froilan,this.egg, this.tomato, this.earCorn));
        System.out.print(froilandaBreakfast(froilanda,this.earCorn, this.tomato, this.egg));
        cowShed1.store(betty);
        cowShed1.store(buttercup);
        cowShed2.store(bessie);
        cowShed2.store(penelope);
        cowShed2.store(maggie);
        cowShed3.store(beef);
        cowShed3.store(sweetie);
        cowShed3.store(meg);
        cowShed3.store(emma);
        cowShed3.store(molly);
        System.out.println("\n\033[0;107m\033[1;91m\t\tEnd of Morning Routine\t\t\033[0m\n");
    }
    public Cow cowShedRelease(CowShed cowShed) {
        for(int i = 0; i < cowShed.getCowShedSize(); i++) {
            cowShed.release(i);
        }
        return null;
    }
    public String horseFeeding(Horse horse, Vegetable vegetable1, Vegetable vegetable2, Vegetable vegetable3) {
        horse.eat(vegetable1);
        horse.eat(vegetable2);
        horse.eat(vegetable3);
        return String.format("\033[1;94m%s has been fed with %s, %s, & %s", horse.getName(), vegetable1.getName(), vegetable2.getName(), vegetable3.getName() + ".\n\033[0m");
    }
    public String froilanBreakfast(Farmer farmer, EdibleEgg egg, Tomato tomato, Carrot earCorn) {
        this.froilanBreakfast = new Edible[8];
        for(int i = 0; i < 5; i++) {
            farmer.eat(egg);
        }
        farmer.eat(tomato);
        farmer.eat(tomato);
        farmer.eat(earCorn);
        return String.format("\033[1;32m%s has eaten 5 %s, 2 %s, & 1 %s\n\033[0m", farmer.getName(), egg.getName(), tomato.getName(), earCorn.getName());
    }
    public String froilandaBreakfast(Pilot pilot, Carrot earCorn, Tomato tomato, EdibleEgg egg) {
        this.froilandaBreakfast = new Edible[5];
        pilot.eat(earCorn);
        pilot.eat(earCorn);
        pilot.eat(tomato);
        pilot.eat(egg);
        pilot.eat(egg);
        return String.format("\033[1;36m%s has eaten 2 %s, 1 %s, & 2 %s\n\033[0m", pilot.getName(), egg.getName(), tomato.getName(), earCorn.getName());
    }
    public String chickenFeeding(Carrot earCorn) {
        coopACabana.feed(earCorn);
        tajMaCoop.feed(earCorn);
        eggCademy.feed(earCorn);
        justGotLaid.feed(earCorn);
        return String.format(
                """
                        \033[1;91mAll of the chickens at %s has been fed\033[0m
                        \033[1;93mAll of the chickens at %s has been fed\033[0m
                        \033[1;92mAll of the chickens at %s has been fed\033[0m
                        \033[1;94mAll of the chickens at %s has been fed\033[0m
                        """,coopACabana.getName(),tajMaCoop.getName(),eggCademy.getName(),justGotLaid.getName());
    }
}