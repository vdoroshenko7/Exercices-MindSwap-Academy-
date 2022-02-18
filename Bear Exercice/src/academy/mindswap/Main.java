package academy.mindswap;

import academy.mindswap.Bear.*;

public class Main {

    public static void main(String[] args) {

        SimpleBear ursoSimples = new SimpleBear("joaquim");
        CrankyBear ursoMau = new CrankyBear("antonio");
        DrunkBear ursoBebado = new DrunkBear("zeca");


        //ursoSimples.abilityToTalk();


        // ursoMau.abilityToTalk();
        // ursoMau.abilityToTalk();

        TheShop loja1 = new TheShop();

        TheShop loja2 = new TheShop();


        Bears urso1 = loja1.creatingBears("zeca");
        Bears urso2 = loja2.creatingBears("antonio");
        Bears urso3 = loja1.creatingBears("antoni435o");
        Bears urso4 = loja2.creatingBears("antonio");
        Bears urso5 = loja1.creatingBears("antonio");
        Bears urso6 = loja2.creatingBears("antonio");
        Bears urso7 = loja2.creatingBears("antonio");
        Bears urso8 = loja2.creatingBears("antonio");
        Bears urso9 = loja2.creatingBears("antonio");


       //urso2.abilityToTalk();

        if(loja1.getNumOfBears() > loja2.getNumOfBears()) {
            System.out.println("Loja1: " + loja1.getNumOfBears());
            System.out.println("Loja2: " + loja2.getNumOfBears());
            System.out.println("Loja 1 wins!");
        } else if(loja1.getNumOfBears() < loja2.getNumOfBears()) {
            System.out.println("Loja1: " + loja1.getNumOfBears());
            System.out.println("Loja2: " + loja2.getNumOfBears());
            System.out.println("Loja 2 wins!");
        } else {
            System.out.println("Loja1: " + loja1.getNumOfBears());
            System.out.println("Loja2: " + loja2.getNumOfBears());
            System.out.println("It´s a tie!");
        }

        //ursoBebado.abilityToTalk();

    }
}
