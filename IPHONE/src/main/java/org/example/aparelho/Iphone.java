package org.example.aparelho;

import org.example.funcoes.AparelhoEletronico;
import org.example.funcoes.NavegadorDeInternet;
import org.example.funcoes.ReprodutorMusical;

public class Iphone implements NavegadorDeInternet, AparelhoEletronico, ReprodutorMusical {

    public void Ligar() {
        AparelhoEletronico.super.Ligar();
    }
    public void Atender(){
        AparelhoEletronico.Atender();
    }
    public void IniciarCorreioEletronico(){
        AparelhoEletronico.IniciarCorreioEletronico();
    }
    public static void  exibirPagina(){
        NavegadorDeInternet.exibirPagina();
    }
    public static void adicionarAba(){
        NavegadorDeInternet.adicionarNovaAba();
    }
    public void atualizarPagina(){
        NavegadorDeInternet.atualizarPagina();
    }

    public static void Tocar(){
        ReprodutorMusical.Tocar();
    }
    public static void PausarMusica(){
        ReprodutorMusical.PausarMusica();
    }
    public static void SelecionarMusica(){
        ReprodutorMusical.SelecionarMusica();
    }
}
