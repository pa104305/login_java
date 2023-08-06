import java.util.Scanner;

class app{
    static public void main(String[] args){
        Scanner read = new Scanner(System.in);
        login log = new login();
        /*System.out.println(in.us());
        System.out.println(in.getPassword());*/
        System.out.println("1-. Iniciar sesion \n2-. Crear cuenta");
        int opt = read.nextInt();
        if(opt == 1){
            log.readDataLog();
        }else if(opt == 2){
            log.readDataSign();
        }else{
            System.out.println("Error opción invalida");
        }
        read.close();
    }
}