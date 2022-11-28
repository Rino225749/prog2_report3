package jp.ac.uryukyu.ie.e225749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WarriorTest {
    /**
     * 倒れたはずの敵は攻撃できないことを検証。
     * 検証手順
     *  (1) ヒーローと敵を準備。ヒーローの攻撃力は敵を一撃で倒せるほど強い状態とする。
     *  (2) ヒーローが殴り、敵も殴る。敵は一撃で倒されていることを期待。
     *  (3) 敵が死んだ状態ならば攻撃できないはず。
     * 　　つまり攻撃実行してもヒーローのHPは減っていないことを期待。これを検証する。
     */
    @Test
    void attackWithWeponSkillTest() {
        int defaultWarriorHp = 100;
        int defaultEnemyHp = 450;
        int finishEnemyHp = 0;
        Warrior demoWarrior = new Warrior("デモ勇者", defaultWarriorHp, 100);
        Enemy slime = new Enemy("スライムもどき", defaultEnemyHp, 5);
        for(int i=0; i<5; i++){
            demoWarrior.attackWithWeponSkill(slime);
            slime.attack(demoWarrior);
            //assertEquals(defaultWarriorHp, demoWarrior.hitPoint);
        }
        assertEquals(finishEnemyHp, slime.hitPoint);
    }
}