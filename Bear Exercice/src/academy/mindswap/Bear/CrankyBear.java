package academy.mindswap.Bear;

public class CrankyBear extends Bears {

    public CrankyBear(String name) {
        super(name);
    }

    @Override
    public void abilityToTalk() {

       super.abilityToTalk();

        if (getEnergyLevel() >= 0 && getEnergyLevel() < 50) {
            System.out.println("I just sing one more time!");

        } else if (getEnergyLevel() >= 50 && getEnergyLevel() <= 100)
            System.out.println("Let´s talk!");
        }
    }
