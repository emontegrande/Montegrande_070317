package Montegrande_070317;
abstract class SuperHero {
    String superpowers[];
    SuperHero(){
        this.superpowers = new String[5];
        this.superpowers[0] = "1st Power";
        this.superpowers[1] = "2nd Power";
        this.superpowers[2] = "3rd Power";
        this.superpowers[3] = "4th Power";
        this.superpowers[4] = "5th Power";
    }
    void setSuperPowers(String power, int element){
        this.superpowers[element] = power;
    }
    void setSP(String superpowers[]){
        this.superpowers = superpowers;
    }
    void printSuperPowers(){
        for (int i=0; i <superpowers.length;i++){
            System.out.println(superpowers[i]);
        }
    }
    abstract void displayPower();
}




