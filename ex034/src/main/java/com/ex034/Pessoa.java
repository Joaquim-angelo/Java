/*Superclasse*/
package com.ex034;
/*Para usar o super() a classe precisa ser abstrata*/
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
