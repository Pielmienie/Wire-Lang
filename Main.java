import WireLang.WireLang;
import WireLang.Scanner;
public class Main {

    public static void main(String[] args) {

        WireLang start = new WireLang();
        Scanner program = start.start_program();

        program.showScanner();
    }
}
