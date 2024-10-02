import java.security.KeyStore;

public class Escopo {
    public static void main(String[] args) {
        //Escopo: evita conflitos de nomes, libera memória quando variáveis locais não são mais necessárias e impede o acesso não intencional a variáveis
        int x;
        if (true) {
            x = 2; //Variável local
        }else{
            x = 10;
        }
        System.out.println(x);
    }
}
