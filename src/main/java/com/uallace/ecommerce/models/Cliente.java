package com.uallace.ecommerce.models;

public class Cliente {

        public String nome;
		public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String email;
		public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String senha;
		public String getSenha() {
            return senha;
        }
        public void setSenha(String senha) {
            this.senha = senha;
        }
        
        public String endereco;
		public String getEndereco() {
            return endereco;
        }
        public void setEndereco(String endereco) {
            this.endereco = endereco;
        }
        public String bairro;
	    public String getBairro() {
            return bairro;
        }
        public void setBairro(String bairro) {
            this.bairro = bairro;
        }
        public String cidade;
		public String getCidade() {
            return cidade;
        }
        public void setCidade(String cidade) {
            this.cidade = cidade;
        }
        public String estado;
		public String getEstado() {
            return estado;
        }
        public void setEstado(String estado) {
            this.estado = estado;
        }
        public String cep;
		public String getCep() {
            return cep;
        }
        public void setCep(String cep) {
            this.cep = cep;
        }
        public String complemento;
        public String getComplemento() {
            return complemento;
        }
        public void setComplemento(String complemento) {
            this.complemento = complemento;
        }

}
