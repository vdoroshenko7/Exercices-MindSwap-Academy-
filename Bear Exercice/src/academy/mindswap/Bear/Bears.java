package academy.mindswap.Bear;

public class Bears {

    private String name;
    private boolean canTalk;
    private int energyLevel;


    public Bears(String name) {
        this.name = name;
        this.canTalk = true;
        this.energyLevel = 100;
    }


    public void abilityToTalk() {
        if (canTalk) {
            System.out.println("I love you!");
            energyLevel -= 40;
            canTalk = energyLevel > 0;
            return;
        }
        System.out.println("No energy");
    }

    public int getEnergyLevel() {
        return energyLevel;
    }
}
