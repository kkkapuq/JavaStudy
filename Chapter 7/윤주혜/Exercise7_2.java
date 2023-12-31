class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int num = i % 10 + 1;
            boolean isKwang = ((i<10) && (num == 1||num==3||num==8));
            cards[i] = new SutdaCard(num, isKwang);
        }
    }

    void shuffle() {
        for (int i = 0; i < CARD_NUM; i++) {
            int n = (int)(Math.random()*CARD_NUM);
            SutdaCard tmp = cards[i];
            cards[i] = cards[n];
            cards[n] = tmp;
        }
    }

    SutdaCard pick(int index) {
        if (index < 0 || index >= CARD_NUM)
            return null;
        return cards[index];
    }

    SutdaCard pick() {
        int index = (int)(Math.random()*CARD_NUM);
        return pick(index);
    }
}
class SutdaCard {
    int num;
    boolean isKwang;
    SutdaCard() {
        this(1, true);
    }
    SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String toString() {
        return num + ( isKwang ? "K":"");
    }
}
class Exercise7_2 {
    public static void main(String args[]) {
        SutdaDeck deck = new SutdaDeck();
        System.out.println(deck.pick(0));
        System.out.println(deck.pick());
        deck.shuffle();
        for(int i=0; i < deck.cards.length;i++)
            System.out.print(deck.cards[i]+",");
        System.out.println();
        System.out.println(deck.pick(0));
    }
}