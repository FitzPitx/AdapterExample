public interface Warrior {
    public double attack();
}

class Saiyan implements Warrior {

    public int ATTACK_BASE = 30;

    public double attack(){
        return (int) (Math.random() * 100 + this.ATTACK_BASE);
    }

}

class Namekian implements Warrior {

    public int ATTACK_BASE = 50;

    public double attack(){
        return (int) (Math.random() * 100 + this.ATTACK_BASE);
    }
}

class Android {
    public int punch(){
        return 10;
    }

    public double kick(){
        return Math.random() * this.punch() + this.punch();
    }
}

class AndroidAdapter implements Warrior {

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
