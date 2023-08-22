public class AndroidAdapter implements Warrior {

    private final Android android;
    public int ATTACK_BASE = 10;

    //Constructor
    public AndroidAdapter(Android android){
        this.android = android;
    }

    //Method that implements the attack method from the Warrior interface to be used by the Android class
    public double attack(){
        return (this.android.kick() + this.android.punch() + this.ATTACK_BASE);
    }
}
