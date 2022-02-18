package academy.mindswap.Bear;

public class DrunkBear extends Bears{

    private boolean isAsleep;
    public DrunkBear(String name) {
        super(name);
        this.isAsleep = false;
    }

    public static int generateRandomInt(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    @Override
    public void abilityToTalk() {

        if(isAsleep){
            System.out.println("ZZZZZ-..ZZZZZZZ");
            return;
        }

        super.abilityToTalk();

        int probabilityToSleep = generateRandomInt(0, 100);
        System.out.println(probabilityToSleep);

        if(probabilityToSleep < 20){
            isAsleep = true;
        }
    }
}
