import java.util.Scanner;

abstract class functions {
    public abstract String getUsername();
    public abstract void setUsername(String name);
    public abstract String getPassword();
    public abstract void setPassword(String passwd);
}

class login extends functions{
    private String username = "admin";
    private String password = "admin";
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setUsername(String name){
        this.username = name;
    }
    public void setPassword(String passwd){
        this.password = passwd;
    }
    Scanner read = new Scanner(System.in);
    public void readDataLog(){
        System.out.println("Ingresa tu nombre de usuario > ");
        String name = read.nextLine();
        System.out.println("Ingresa tu contraseña > ");
        String pass = read.nextLine();
        check(name, pass);
    }
    public void readDataSign(){
        System.out.println("Ingresa como quieres que te llamemos > ");
        String name = read.nextLine();
        System.out.println("Ingresa cual sera tu contraseña > ");
        String pass = read.nextLine();
        setUsername(name);
        setPassword(pass);
        System.out.println("Cuenta creada correctamente \n \nPorfavor inicie sesión \n");
        readDataLog();
    }
    public void check(String inputUsername, String inputPassword){
        String username = getUsername();
        String password = getPassword();
        if(inputUsername.equals(username) && inputPassword.equals(password)){
            System.out.println("Iniciando sesion");
        }else{
            System.out.println("Credenciales incorrectas");
        }
    }
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }else{
            return false;
        }
    }
}