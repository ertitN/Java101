package BoxingGame;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    public int hit(Fighter foe) {
        double criticalDamage = Math.random() * 10;


        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasarı savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;

        }
        System.out.println("------------");

        if (true!=(this.health<0 || foe.health<0)) {
        if (criticalDamage >= 8 && criticalDamage <= 10) {
            System.out.println(this.name + " => " + foe.name + " " + this.damage * 2+ " kritik vurdu!");
            return foe.health - this.damage * 4;
        } else {
            System.out.println(this.name + " => " + foe.name + " " + this.damage + " hasar vurdu.");
            return foe.health - this.damage;

        }
    }
        return 0;



    }


    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}

