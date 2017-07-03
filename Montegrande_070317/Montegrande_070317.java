package Montegrande_070317;
public class Montegrande_070317 {

    
    public static void main(String[] args) {
       FlyingSuperHero sh = new FlyingSuperHero();
       //sh.displayPower();
       
       Spiderman ah = new Spiderman();
       //ah.displayPower();
       
       
       //sh.setSuperpowers(args);
       
       sh.setSuperPowers("New Power", 2);
       sh.printSuperPowers();
    }
}
