package org.example.funcoes;

public interface AparelhoEletronico {
   static void Atender(){
       System.out.println("Atendendo Telefone");
   }
   public default void Ligar(){
       System.out.println("Ligando para contato");
   }
   public static void IniciarCorreioEletronico(){
       System.out.println("Consutando correio eletronico");
   }
}
