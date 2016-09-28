/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loga2_atv03_q02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JFileChooser;

/**
 *
 * @author Rodrigo Brito
 */
public class LOGA2_ATV03_Q02 {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        
        Animal Urso = new Animal("Urso", "marron", "terrestre", 200, 4, 4);
        Urso.dados();
        Peixe Tubarão = new Peixe("Tubarão", "Martelo", "Cinza", "Marinho", 300, 0, 10);
        Tubarão.dados();
        Mamifero Macaco = new Mamifero("Macaco", "xFrutas", "Marrom", "terrestre", 90, 2, 2);
        Macaco.dados();
        
        String nome = "";
        JFileChooser arquivo = new JFileChooser();
        int retorno = arquivo.showSaveDialog(arquivo);
        if (retorno == JFileChooser.APPROVE_OPTION){
            nome = arquivo.getSelectedFile().getAbsolutePath();

        }
        try {
            
            
            // o parâmetro true/false da linha abaixo serve para definir
            // se você deseja acrescentar algo no final do arquivo (true) ou gerar
            // um novo arquivo com o que deseja gravar (false)
            FileWriter arq = new FileWriter(nome,true);
           
            BufferedWriter escArq = new BufferedWriter(arq);
            
            String linha = Urso.dadostxt();
            // a linha abaixo "adiciona" o texto na string linha ao final do arquivo
            escArq.newLine();
            escArq.append(linha);
            linha = Tubarão.dadostxt();
            escArq.append(linha);
            escArq.newLine();
            linha = Macaco.dadostxt();
            escArq.append(linha);

	
            
            escArq.close();
                

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        
        
        
               
    }
     

}
