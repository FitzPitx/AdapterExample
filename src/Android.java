public class Android {
    public int punch(){
        return 10;
    }

    public double kick(){
        return Math.random() * this.punch() + this.punch();
    }
}
