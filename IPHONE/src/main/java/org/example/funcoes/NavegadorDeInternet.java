package org.example.funcoes;

public interface NavegadorDeInternet {
    public static void  exibirPagina(){
        System.out.println("Exibindo Página");
        exibirPagina();
    }
    public static void adicionarNovaAba(){
        System.out.println("Adicionando nova pagina");
        adicionarNovaAba();
    }
    static void atualizarPagina(){
        System.out.println("Atualizando a Página");
        atualizarPagina();
    }
}
