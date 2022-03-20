package WireLang;

public class WireLang {

    static Scanner scanner;

    public Scanner start_program() {
        WireLang.scanner = new Scanner();
        return WireLang.scanner;
    }
}
