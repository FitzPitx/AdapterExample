public class Main {
    public static void main(String[] args) {
        Namekian namekian = new Namekian();
        Saiyan saiyan = new Saiyan();
        Android android = new Android();
        AndroidAdapter androidAdapter = new AndroidAdapter(android);
        System.out.println("Goku attack: " + namekian.attack());
        System.out.println("Vegeta attack: " + saiyan.attack());
        System.out.println("Picollo attack: " + namekian.attack());
        System.out.println("Android attack: " + androidAdapter.attack());
    }
}