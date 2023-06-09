
package com.mycompany.prova1.Prova;

import java.time.LocalDate;
import java.time.Month;


public class Main {
    
    public static void main(String[] args) {
        
        Medico medico = new Medico("6594", "659.695.256-89", "659.365-98", "6589", Setor.SAUDE, 10000.00, LocalDate.of(1990, Month.MARCH, 25), Genero.MASCULINO, "Kauã", "(58)9875-6395", "kaua.cerqueira@gmail.com", new Endereco("Avenida", "98", "Em frente ao prédico premium", "6594-000", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Motoboy motoboy = new Motoboy("659841", "698.365.359-98", "265.985-69", "9856", Setor.OPERACOES, 3000.00, LocalDate.of(1999, Month.MARCH, 20), Genero.MASCULINO, "Gabriel", "(56)9854-3625", "Gabriel.basto@gmail.co,", new Endereco("Rua", "69", "Do lado do restaurante Tols", "6539-000", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Advogado advogado = new Advogado("3569", "659.452.25-98", "326.695-98", "3655", Setor.JURIDICO, 7000.00, LocalDate.of(1990, Month.MARCH, 10), Genero.FEMININO, "Júlia", "(65)9874-2517", "julia.santo@gmial.com", new Endereco("Rua", "36", "Em frente ao colégio", "6598.000", "Salvador", UnidadeFederativa.BAHIA));
        Cliente cliente = new Cliente(10, LocalDate.of(2000, Month.MARCH, 15), Genero.FEMININO, "Vanessa", "(71)3659-5987", "vanessa.santos@gmail.com", new Endereco("Rua", "56", "Ao lado de uma barraca metálica", "65988-000", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO));
        Juridica juridica = new Juridica("6598.2658", "6598", "Daniel", "(98)9856-4875", "Daniel.santana@gmail.com", new Endereco("Avenida", "12", "Dentro do condomínio", "695.235.000", "Camaçari", UnidadeFederativa.BAHIA));
        Fisica fisica = new Fisica(LocalDate.of(2000, Month.MARCH, 5), Genero.FEMININO, "Eduarda", "(87)9658-4587", "eduarda.santos@gmail.com", new Endereco("rua", "69", "Condomínio Água", "659.000", "Camaçari", UnidadeFederativa.BAHIA)) {
        };
                
        
        
        System.out.println("Informações sobre os Funionários e os Clientes: " + "\n" + medico.toString() + "\n" + motoboy.toString() + "\n" + advogado.toString() +"\n" + cliente.toString() + "\n" + juridica.toString() + "\n" + fisica.toString() + "\n");
        
      
        
        }
        
    }
    

