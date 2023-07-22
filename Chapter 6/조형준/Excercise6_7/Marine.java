package Chapter6.Excercise6_7;

class Marine {
    int x = 0, y = 0;
    int hp = 60;
    int weapon = 6;
    int armor = 0;

    void weaponUp() {
        weapon++;
    }
    void armorUp() {
        armor++;
    }
    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * static 을 붙여야 하는건 메서드 weaponUp, armorUp, weapon, armor 이다.
     * 게임 내에 존재하는 모든 Marine들은 동일한 weapon과 armor값을 가져야 하기 때문이다.
     * 현재 좌표인 x, y와 체력값은 마린마다 전부 다르기(같을 수도 있긴함) 때문이다.
     */
}
