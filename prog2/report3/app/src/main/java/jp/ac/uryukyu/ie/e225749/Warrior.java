package jp.ac.uryukyu.ie.e225749;

public class Warrior extends Hero{
    public Warrior(String name,int maximumHP,int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(Enemy e){
        if (this.dead == false){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, e.name, damage);
            e.wounded(damage);
        }
    }
}
