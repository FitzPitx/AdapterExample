public class Namekian implements Warrior {

        public int ATTACK_BASE = 50;

        public double attack(){
            return (int) (Math.random() * 100 + this.ATTACK_BASE);
        }
}
