public class Visibilidade {
    public static void main(String[] args) {
       //public: Visibilidade do >{escopo}< do projeto
        int x;
    }
    public static void sum (int a, int b){
     System.out.println(x); //<<--- ocorre um erro ao executar  a variável, ja que ela é de outro escopo
    }
}
