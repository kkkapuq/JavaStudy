package Chapter7.Excercise.Excercise7_2;

class SutdaDeck {
    final int CARD_NUM = 20;
    SutdaCard[] cards = new SutdaCard[CARD_NUM];

    SutdaDeck() {
        for (int i = 0; i < CARD_NUM; i++) {
            int n = i%10+1;
            boolean kwang = i < 10 && (i == 1 || i == 3 || i == 8);
            cards[i] = new SutdaCard(n, kwang);
        }
    }

    void shuffle(){
        for (int i = 0; i < CARD_NUM; i++) {
            int r = (int) (Math.random() * CARD_NUM);
            int temp = i;
            cards[i] = cards[r];
            cards[r] = cards[temp];
        }
    }

    SutdaCard pick(int n){
        return cards[n];
    }

    SutdaCard pick(){
        int r = (int) (Math.random() * CARD_NUM);
        return cards[r];
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
