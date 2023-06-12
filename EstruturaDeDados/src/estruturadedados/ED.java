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
        Materia materia2 = new Materia();
        Materia materia3 = new Materia();
        ListaMateria lista = new ListaMateria();
       
        materia.setMateria("eu"); 
        materia2.setMateria("joao");
        materia3.setMateria("kaio");

        
        lista.inserirInicio(materia);
        lista.inserirInicio(materia2);
        lista.inserirInicio(materia3);
        
        System.out.println(lista.tamanho);
      
        /*for (int i = 0; i < lista.tamanho; i++) {
           / Materia aux = new Materia();
            aux = lista.retirarInicio();
            System.out.println(aux.toString());
        }*/
         
       // System.out.println(lista.retorno());
       // System.out.println("estruturadedados.ED.main()");
        
       // lista.retirarFim();
        //System.out.println(lista.retorno());
       // System.out.println("estruturadedados.ED.main()");
       // lista.retirarInicio();
        for (int i = 0; i < lista.tamanho; i++) {
            lista.retorno();
        }
            
        
        
          // lista.retorno();
        
    }
}
