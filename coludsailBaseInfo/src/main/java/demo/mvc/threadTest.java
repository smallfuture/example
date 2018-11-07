package demo.mvc;

public class threadTest {

    interface  play{
        /**
         * 三十分
         * @return void
         */
          void play();
    }

    static class  dog implements  play{
        @Override
        public void play() {
           System.out.println("i am a dog");
        }
    }

    static class cat implements play{
        @Override
        public void play() {
            System.out.println("i am a cat");
        }
    }

    public static void main(String[] args) {
        play dog = new dog();
        play cat = new cat();
        dog.play();
        cat.play();
    }
}
