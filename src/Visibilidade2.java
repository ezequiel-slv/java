public class Visibilidade2 {

    static int y; //Ao adicionar a variavel int y no escopo geral do arquivo é possivel executar independente do local do projeto

    public static void main(String[] args) {
        //public: Visibilidade do >{escopo}< do projeto
    }
    public static void sum (int a, int b){
     System.out.println(y);
    }
}
