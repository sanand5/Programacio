package exemplesclases;

// Andreu Sanz Sanz

import java.util.ArrayList;


public class ExemplesClases {
    public static void main(String[] args) {
        //*--PERSONA--
        Persona raquel=new Persona();
        raquel.edat=18;
        raquel.nom="Raquel";
        System.out.println(raquel.nom+" va a morir con "+raquel.edat+" años");
        System.out.println("Raquel es major de edat. "+raquel.esMajorEdat());//*/
        ArrayList llista = new ArrayList();
        llista.add(-25);
        llista.add(3.14);
        llista.add('a');
        llista.add(raquel);
        for (int i = 0; i < llista.size(); i++) {
            System.out.println(llista.get(i));
        }
        
        /*--ALUMNE--
        Alumne Roger1rC=new Alumne();
        Roger1rC.setNom("Roger");
        Roger1rC.setEdat(18);
        Roger1rC.setCognom("Joze Lui");
        System.out.println(Roger1rC.toString());*/
        
        /*--Article--
        
        Article p1=new Article("367sfdg43g", "Avatar", "CD", 5,"dsdfsdf");
        //Article p2=new Article("54aser318", "El Gato Con Botas", "CD", 3,"sdfr");
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s\n\n",p1.getTitol(),p1.preudia(),p1.preudos(),p1.preusemana(),p1.getCod(),p1.getFormat());
        p1.modificarTots("777", "JEJEEJEJE", "HAHAHAAAA", 0);
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s\n\n",p1.getTitol(),p1.preudia(),p1.preudos(),p1.preusemana(),p1.getCod(),p1.getFormat());
        //System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s",p2.getTitol(),p2.preudia(),p2.preudos(),p2.preusemana(),p2.getCod(),p2.getFormat());
        
        */
        
        /*--Quandrat--
        Quadrat q1=new Quadrat();
        Quadrat q2=new Quadrat();
        q1.x1=2; q1.x2=20;
        q1.y1=3; q1.y2=1;
        
        q2.x1=11; q2.x2=14;
        q2.y1=23; q2.y2=19;
        
        
        
        System.out.printf("Dades primer rectangle\nLa diagonal es: %.2f\nEl perimetre es: %.2f\nL'area es: %.2f\n\n",q1.diagonal(), q1.perimetre(q1.diagonal()), q1.area(q1.diagonal()));
        
        System.out.printf("Dades segon rectangle\nLa diagonal es: %.2f\nEl perimetre es: %.2f\nL'area es: %.2f\n",q2.diagonal(), q2.perimetre(q2.diagonal()), q2.area(q2.diagonal()));
        */
        
        /*--Arrays--
        ArticleArray pelis[]=new ArticleArray[10];
        for (int i = 0; i < 10; i++) {
            pelis[i]=new ArticleArray("000","Avatar 1", "DVD", (double) Math.random()*10+1, "0");
        }
        for (ArticleArray peli : pelis) {
            System.out.printf("""
                              Titol: %s
                              Preu dia: %.2f€
                              Preu 2 dies: %.2f€
                              Preu semana: %.2f€
                              Codic: %s
                              Format: %s
                              
                              """,peli.getTitol(), peli.preudia(), peli.preudos(), peli.preusemana(), peli.getCod(), peli.getFormat());
        }
        */
        
    }
}

