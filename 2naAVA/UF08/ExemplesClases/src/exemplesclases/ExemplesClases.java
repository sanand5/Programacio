package exemplesclases;

// Andreu Sanz Sanz

public class ExemplesClases {
    public static void main(String[] args) {
        /*
        --PERSONA--
        Persona raquel=new Persona();
        raquel.edat=18;
        raquel.nom="Raquel";
        System.out.println(raquel.nom+" va a morir con "+raquel.edat+" años");
        System.out.println("Raquel es major de edat. "+raquel.esMajorEdat());*/
        
        /*--ALUMNE--
        Alumne Roger1rC=new Alumne();
        Roger1rC.setNom("Roger");
        Roger1rC.setEdat(18);
        Roger1rC.setCognom("Joze Lui");
        System.out.println(Roger1rC.toString());*/
        
        //*--Article--
        
        Article p1=new Article("367sfdg43g", "Avatar", "CD", 5);
        Article p2=new Article("54aser318", "El Gato Con Botas", "CD", 3);
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s\n\n",p1.titol,p1.preudia(),p1.preudos(),p1.preusemana(),p1.cod,p1.format);
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s",p2.titol,p2.preudia(),p2.preudos(),p2.preusemana(),p2.cod,p2.format);
        //*/
        
        /*Quandrat
        Quadrat q1=new Quadrat();
        Quadrat q2=new Quadrat();
        q1.x1=2; q1.x2=20;
        q1.y1=3; q1.y2=1;
        
        q2.x1=11; q2.x2=14;
        q2.y1=23; q2.y2=19;
        
        
        
        System.out.printf("Dades primer rectangle\nLa diagonal es: %.2f\nEl perimetre es: %.2f\nL'area es: %.2f\n\n",q1.diagonal(), q1.perimetre(q1.diagonal()), q1.area(q1.diagonal()));
        
        System.out.printf("Dades segon rectangle\nLa diagonal es: %.2f\nEl perimetre es: %.2f\nL'area es: %.2f\n",q2.diagonal(), q2.perimetre(q2.diagonal()), q2.area(q2.diagonal()));
        */
    }

}

