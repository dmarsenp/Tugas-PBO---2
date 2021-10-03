package dmp1;

public class main {
    public static void main(String[] args) {
        game hero = new game("Raiden",10,20);
        game hero1 = new game("Sub-Zero",5,25);

        hero.kick(hero1);
        hero1.kick(hero);

        for(int i=1;i<=3;i++){
            hero1.hit(hero);
        }

        for(int i=0;i<4;i++){
            hero.kick(hero1);
        }

        System.out.println(hero.getLifePoint());
        System.out.println(hero1.getLifePoint());

        hero.result(hero1);
}
}
