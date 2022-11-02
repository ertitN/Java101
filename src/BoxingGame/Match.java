package BoxingGame;

public class Match {
    Fighter marc;
    Fighter alex;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.marc = f1;
        this.alex = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    public void run() {

        if (checkWeight()) {
            double firstHit = Math.random() * 10;
            while (marc.health > 0 && alex.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                if(firstHit>0 && firstHit<=5){
                    alex.health = marc.hit(alex);
                    marc.health = alex.hit(marc);
                }
                else{
                    marc.health = alex.hit(marc);
                    alex.health = marc.hit(alex);
                }
                if (isWin()){
                    break;
                }

                if (isWin()){
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight() {
        return (marc.weight >= minWeight && marc.weight <= maxWeight) && (alex.weight >= minWeight && alex.weight <= maxWeight);
    }

    public boolean isWin() {
        if (marc.health <= 0) {
            System.out.println("Maçı Kazanan : " + alex.name);
            return true;
        } else if (alex.health <= 0){
            System.out.println("Maçı Kazanan : " + marc.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(marc.name + " Kalan Can \t:" + marc.health);
        System.out.println(alex.name + " Kalan Can \t:" + alex.health);
    }
}
