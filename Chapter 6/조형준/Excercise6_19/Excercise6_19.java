package Chapter6.Excercise6_19;

class MyTv {
    boolean isPowerOn;
    int channel;
    int volume;
    final int MAX_VOLUME = 100;
    final int MIN_VOLUME = 0;
    final int MAX_CHANNEL = 100;
    final int MIN_CHANNEL = 1;

    void turnOnOff() {
// (1) isPowerOn true false , false true . 의 값이 면 로 면 로 바꾼다
        isPowerOn = !isPowerOn;
    }

    void volumeUp() {
// (2) volume MAX_VOLUME 1 . 의 값이 보다 작을 때만 값을 증가시킨다
        if (volume < MAX_VOLUME)
            volume++;
    }

    void volumeDown() {
// (3) volume MIN_VOLUME 1 . 의 값이 보다 클 때만 값을 감소시킨다
        if (volume > MIN_VOLUME)
            volume--;
    }

    void channelUp() {
// (4) channel 1 . 의 값을 증가시킨다
// channel MAX_CHANNEL , channel MIN_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
        if (channel == MAX_CHANNEL) {
            channel = MIN_CHANNEL;
        } else {
            channel++;
        }
    }

    void channelDown() {
// (5) channel 1 . 의 값을 감소시킨다
// channel MIN_CHANNEL , channel MAX_CHANNEL . 만일 이 이면 의 값을 로 바꾼다
        if (channel == MIN_CHANNEL) {
            channel = MAX_CHANNEL;
        } else {
            channel--;
        }
    }
}

class Excercise6_19 {
    public static void main(String[] args) {
        MyTv t = new MyTv();
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
    }
}
