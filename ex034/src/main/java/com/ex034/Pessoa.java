/*Superclasse*/
package com.ex034;
public abstract class Pessoa {
        protected String telefone;
        protected String nomePessoa;
        public Pessoa(){
         super();
         System.out.println("Executando o construtor de Pessoa");
        }
        
        public String getNomePessoa() {
            return nomePessoa;
        }
        public void setNomePessoa(String nomePessoa) {
            this.nomePessoa = nomePessoa;
        }
}
