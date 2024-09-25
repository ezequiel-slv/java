public class Calculate2 {

    public static void main(String[] args){
       int x = Integer.parseInt((args[1]));
       int y = Integer.parseInt((args[2]));

       if (args[0].equals("Subtrair")){
           minus (x,y);
        }else if (args[0].equals("Dividir")){
           divide (x,y);
        }else{
           System.out.println("Indefinido");
       }
    }

    static void minus (int x, int y){
        System.out.println(x - y);
    }

    static void divide (int x, int y){
        System.out.println(x / y);
    }
}
