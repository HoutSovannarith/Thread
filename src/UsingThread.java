public class UsingThread {

    public static void main(String[] args) {
        String greeting = "Welcome to CSTAD!";
        String message = "Don't give up this opportunity, do your best first";
        String download = "Downloading";
        String complete = "completed 100%";

//      Print greeting
        printGreeting (greeting, 300);
        System.out.println();

//      Print star
        printStar(message.length(), 300);

//      Print message
        printMessage(message, 300);
        System.out.println();

//      Print dash
        printDash(message.length(),300);

//      Print download
        printDownload(download,300);

//      Print dot
        printDot(download.length(),300);

//      Print complete
        System.out.println(complete);
    }

    private static void printGreeting (String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush(); // flush to ensure immediate display

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printStar(int length, int delay) {

        for (int i = 0; i < length; i++) {
            System.out.print("*");
            System.out.flush();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }
    private static void printMessage (String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush(); // flush to ensure immediate display

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void printDash(int length, int delay) {

        for (int i = 0; i < length; i++) {
            System.out.print("-");
            System.out.flush();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println();
    }
    private static void printDownload (String text, int delay) {
        for (char c : text.toCharArray()) {
            System.out.print(c);
            System.out.flush(); // flush to ensure immediate display

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    private static void printDot(int length, int delay) {
        for (int i = 0; i < length; i++) {
            System.out.print(".");
            System.out.flush();

            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
