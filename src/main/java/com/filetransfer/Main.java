public class Main {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println(
                "Por favor, proporciona un argumento: --client o --server"
            );
            return;
        }

        switch (args[0]) {
            case "--client":
            case "-c":
                //iniciar cliente
                break;
            case "--server":
            case "-s":
                //Iniciamos servidor
                break;
            default:
                System.out.println(
                    "Argumento no reconocido. Usa --client o --server"
                );
                break;
        }
    }
}
