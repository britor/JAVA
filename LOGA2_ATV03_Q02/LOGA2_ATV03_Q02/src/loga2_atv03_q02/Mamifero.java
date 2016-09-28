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
public class Mamifero extends Animal {

    String Alimento;

    public Mamifero(String nome, String alimento, String cor, String ambiente, int comprimento, int patas, float velocidade) {
        super(nome, cor, ambiente, comprimento, patas, velocidade);
        this.Alimento=alimento;
    }

    void dados() {
        System.out.println("---------------------");
        System.out.println("Animal: " + getNome());
        System.out.println("Comprimento: " + getComprimento()+" cm.");
        System.out.println("Patas: " + getPatas()); 
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade: " + getVelocidade() + " m/s");
        System.out.println("Alimento: " + getAlimento() + ".");
        System.out.println("---------------------");
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
                +"Alimento: " + getAlimento() + ".%n"
                +"---------------------%n");
}

    public String getAlimento() {
        return Alimento;
    }

    public void setAlimento(String Alimento) {
        this.Alimento = Alimento;
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
