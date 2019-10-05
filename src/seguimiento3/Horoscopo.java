/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguimiento3;

import java.util.ArrayList;

/**
 *
 * @author s109e8
 */
public class Horoscopo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double numeroalertorio = Math.round(Math.random()*9);
        int posicion = (int)numeroalertorio;
        
        imprimirFrase(posicion);
    }
    
    public static void imprimirFrase(int posicion){
        
        ArrayList<String> miLista = new ArrayList<>();
        
        miLista.add("La sugerencia del Niño Prodigio es que no te quejes de nada, al contrario, haz énfasis en todas las cosas que te rodean");
        miLista.add("Es importante que la repitas y le añadas todas las cosas positivas que piensas de ti.");
        miLista.add("Siempre piensa de manera productiva y trata de jalar todas las cosas buenas que te rodean, por ejemplo, \"Yo siento que todo será para mi favor");
        miLista.add("No pongas límites ni barreras en tus proyectos y acciones, al contrario, siempre trata de luchar por ellos.");
        miLista.add("Debes hacerlo con todas las cosas que puedes lograr en tu vida, con cada uno de los aspectos que te rodean y siempre tratando de atraer todo lo bueno");
        miLista.add("Úsala en todos los aspectos que tengan que ver con el hogar y el amor.");
        miLista.add("Pide que haya paz, abundancia, felicidad, amor, que la suerte te rodee y toda la buena vibra esté siempre contigo y con los que te rodean.");
        miLista.add("Una manera de encontrar soluciones a tus problemas y mejorar las condiciones que te rodean");
        miLista.add("Aprovecha todas tus habilidades y capacidades, y trata de sacarles el mejor provecho posible.");
        miLista.add("Debes aprender a perdonar y olvidar situaciones dolorosas.");
        
        System.out.println(miLista.get(posicion));

    }
    
}
