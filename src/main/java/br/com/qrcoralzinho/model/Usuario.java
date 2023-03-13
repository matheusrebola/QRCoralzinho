package br.com.qrcoralzinho.model;

import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;
@Entity
@Table(name="usuario")
public class Usuario {
    @Id
    private Long codigoUsuario;
    private String nome;
    private String sobrenome;
    private String login;
    
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    //getters
    public String getNome() {
        return nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public String getLogin() {
        return login;
    }
    
}
