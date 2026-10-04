// Q16. Camera + MusicPlayer -> Smartphone

interface Camera16 {
    void takePhoto();
}

interface MusicPlayer16 {
    void playMusic();
}

class Smartphone16 implements Camera16, MusicPlayer16 {

    @Override
    public void takePhoto() {
        System.out.println("Taking a photo...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music...");
    }

    public static void main(String[] args) {
        Smartphone16 phone = new Smartphone16();

        phone.takePhoto();
        phone.playMusic();
    }
}
