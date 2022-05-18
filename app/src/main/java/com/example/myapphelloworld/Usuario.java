package com.example.myapphelloworld;

public class Usuario {

    private static final String EMAIL = "joseluan74@gmail.com";
    private static final String PASSWORD = "123456";
    private String Email;
    private String Senha;

    Usuario(){
    }

    public void setEmail(String email){
        Email = email;
    }

    public String getEmail(){
        return Email;
    }

    public void setPassword(String password){
        Senha = password;
    }

    public String getPassword(){
        return Senha;
    }

    public boolean ValidaUsuario(){
        if (Email.equals("")){
            return false;
        }else if (Senha.equals("")){
            return false;
        }else if(!Email.equals(EMAIL) || !Senha.equals(PASSWORD)){
            return false;
        }else {
            return true;
        }
    }
}
