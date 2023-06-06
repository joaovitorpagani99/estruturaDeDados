/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estruturadedados;

import model.Materia;

/**
 *
 * @author joaov
 */
public class ED {

    public static void main(String[] args) {
      Materia materia = new Materia();
        materia.setMateria("eu");
        ListaMateria lista = new ListaMateria();
        lista.inserirInicio(materia);
        materia.setMateria("joao");
        int tamnho = lista.tamanho;
           while(lista.tamanho == tamnho) {
             System.out.println(lista.toString());
        }
        
        
    }
}
