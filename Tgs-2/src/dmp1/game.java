package dmp1;

public class game {
    private final String name;
    private int lifePoint = 100;
    private final int attackHitPoint;
    private final int attackKickPoint;

    public game(String name, int attackHitPoint, int attackKickPoint) {
        this.name = name;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getName() {
        return name;
    }

    public int getLifePoint() {
        return lifePoint;
    }

    public void setLifePoint(int lifePoint) {
        this.lifePoint = lifePoint;
    }
    public void kick(game chara) {
        chara.setLifePoint(chara.getLifePoint() - this.attackKickPoint);
        System.out.println(chara.getName() + " Kick " + this.name);
    }
        public void hit(game chara){
        chara.setLifePoint(chara.getLifePoint()-this.attackHitPoint);
        System.out.println(chara.getName()+" Punch "+this.name);
    }
    public void result(game chara){
        int result = Integer.compare(this.lifePoint, chara.getLifePoint());
        if(result>0){
            System.out.println(this.name+"  is Victory");
        }else if(result<0){
            System.out.println(chara.getName()+" is Victory");
        }else{
            System.out.println("Draw");
        }
}
}
