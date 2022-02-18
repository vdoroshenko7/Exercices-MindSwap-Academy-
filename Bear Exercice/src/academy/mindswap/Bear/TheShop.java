package academy.mindswap.Bear;

public class TheShop {

    private int numOfBears;

    public TheShop(){
        this.numOfBears = 0;
    }

    public Bears creatingBears(String name){
        numOfBears++;
        if(numOfBears % 2 == 0){
            Bears simpleBear = new SimpleBear(name);
            return simpleBear;
        } else if (numOfBears % 5 == 0){
            Bears crankyBear = new CrankyBear(name);
            return crankyBear;
        } else {
            Bears drunkBear = new DrunkBear(name);
            return drunkBear;
        }
    }

    public int getNumOfBears() {
        return numOfBears;
    }
}

