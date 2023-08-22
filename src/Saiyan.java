public class Saiyan implements Warrior {

    public int ATTACK_BASE = 30;

    public double attack(){
        return (int) (Math.random() * 100 + this.ATTACK_BASE);
    }

}
