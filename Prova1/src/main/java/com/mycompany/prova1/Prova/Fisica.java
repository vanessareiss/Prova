/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.prova1.Prova;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public abstract class Fisica extends Pessoa{

protected LocalDate dataNascimento;
protected Genero genero;

    public Fisica(LocalDate dataNascimento, Genero genero, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.dataNascimento = dataNascimento;
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    

    @Override
    public String toString() {
        return super.toString()+
                
            "\n Física: "  + "\n Data de Nascimento: " + dataNascimento + "\n Gênero:" + genero.getTexto() ;
    }







}
