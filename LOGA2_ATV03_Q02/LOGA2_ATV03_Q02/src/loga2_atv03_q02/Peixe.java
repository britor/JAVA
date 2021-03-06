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
public class Peixe extends Animal {

    String caracteristica;

    public Peixe(String nome, String caracteristica, String cor, String ambiente, int comprimento, int patas, float velocidade) {
        super(nome, cor, ambiente, comprimento, patas, velocidade);
        this.caracteristica = caracteristica;
    }

    void alteraCaracteristica(String caracteristica) {
        setCaracteristica(caracteristica);
    }

    String caracteristica() {
        return caracteristica = getCaracteristica();
    }

    void dados() {
        System.out.println("---------------------");
        System.out.println("Animal: " + getNome());
        System.out.println("Comprimento: " + getComprimento()+" cm.");
        System.out.println("Patas: " + getPatas());
        System.out.println("Cor: " + getCor());
        System.out.println("Ambiente: " + getAmbiente());
        System.out.println("Velocidade: " + getVelocidade() + " m/s");
        System.out.println("Característica: " + getCaracteristica() + ".");
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
                +"Característica: " + getCaracteristica()+ ".%n"
                +"---------------------%n");
}

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
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
