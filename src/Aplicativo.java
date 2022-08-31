import model1.Cliente;
import model1.Recepcionista;

public class Aplicativo {
    public static void main(String[] args) {
        System.out.println("Hotel java");

        Cliente cliente1 = new Cliente("Ricardo", "12345", "8584848");
        Recepcionista recepcionista1 = new Recepcionista("Valeria", "473838","e473727");
        recepcionista1.atenderOtelefone();
        recepcionista1.falarIngles();
    }
}
