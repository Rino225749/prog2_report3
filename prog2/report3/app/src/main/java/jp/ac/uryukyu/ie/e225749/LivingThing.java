package jp.ac.uryukyu.ie.e225749;
//Hero,Ememyのスーパークラス
public class LivingThing {
    public String name;
    public int hitPoint;
    public int attack;
    public boolean dead;

    /**
     * コンストラクタ。名前、最大HP、攻撃力を指定する。
     * @param name 名
     * @param maximumHP HP
     * @param attack 攻撃力
     */

     public LivingThing(String name,int maximumHP,int attack){
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
     }

     public boolean isDead(){
        return this.dead;
     }

     public String getName(){
        return this.name;
     }

     /**
     * 対象へ攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、LivingThing.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
     public void attack(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
            opponent.wounded(damage);
        }
     }

     /*public void attackWithWeponSkill(LivingThing opponent){
        if (this.dead == false){
            int damage = (int)(1.5 * attack);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.name, damage);
            opponent.wounded(damage);
        }
    }*/

     /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
     public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }
}
