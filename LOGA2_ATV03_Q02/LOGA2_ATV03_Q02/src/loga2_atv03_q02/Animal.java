/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga2_atv03_q02;

/**
 *
 * @author Rodrigo Brito
 */
public class Animal {

        public Animal(String nome, String cor, String ambiente, int comprimento, int patas, float velocidade) {
        this.nome = nome;
        this.cor = cor;
        this.ambiente = ambiente;
        this.comprimento = comprimento;
        this.patas = patas;
        this.velocidade = velocidade;
    }
    String nome;
    String cor;
    String ambiente;
    int comprimento;
    int patas;
    float velocidade;

    void dados (){
        //System.out.println("---------------------");
        //System.out.println("Animal: "+getNome());
        //System.out.println("Comprimento: "+getComprimento()+" cm.");
        //System.out.println("Patas: "+getPatas());
        //System.out.println("Cor: "+getCor());
        //System.out.println("Ambiente: "+getAmbiente());
        //System.out.println("Velocidade: "+getVelocidade()+" m/s");
        //System.out.println("---------------------");
        System.out.println(dadostxt ());
    
}
    public String dadostxt (){
        String x;
        return x=String.format("---------------------%n"
                +"Animal: " + getNome()+"%n"
                +"Comprimento: " + getComprimento()+" cm.%n"
                +"Patas: " + getPatas()+".%n"
                +"Cor: " + getCor()+".%n"
                +"Ambiente: " + getAmbiente()+".%n"
                +"Velocidade: " + getVelocidade() + " m/s%n"
                +"---------------------%n");
}
    
    void alteraNome(String Nome) {
        setNome(Nome);

    }

    void alteraComprimento(int comprimento) {
        setComprimento(comprimento);
    }

    void alteraPatas(int patas) {
        setPatas(patas);
        
    }

    void alteraCor(String cor) {
        setCor(cor);
            }

    void alteraAmbiente(String ambiente) {
        setAmbiente(ambiente);
    }

    void alteraVelocidade(float elocidade) {
        setVelocidade(velocidade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public int getComprimento() {
        return comprimento;
    }

    public void setComprimento(int comprimento) {
        this.comprimento = comprimento;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

}
