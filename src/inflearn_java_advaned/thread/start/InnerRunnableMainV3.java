package inflearn_java_advaned.thread.start;

import static inflearn_java_advaned.util.MyLogger.log;

public class InnerRunnableMainV3 {

    public static void main(String[] args) {
        log("main() start");

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                log("run()");
            }
        });
        thread.start();

        log("main() end");
    }
}
