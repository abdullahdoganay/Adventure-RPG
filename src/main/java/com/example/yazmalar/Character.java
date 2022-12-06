
public class Character {
    int health = 100;
    String name;
    int attackDamage;
    int armor;
    int level;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getLevel() {
        return level;
    }


    private void die(Object a){
        a = null;
    }

    public int hit(int attackDamage, int armor){
        return this.attackDamage-armor;
    }

    public String speak(String text){
        return text;
    }


}



