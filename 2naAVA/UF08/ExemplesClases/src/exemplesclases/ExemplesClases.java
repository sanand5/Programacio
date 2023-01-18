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
        
        //--Article--
        Article p1=new Article();
        p1.preu_lloguer=5;
        p1.titol="Avatar";
        p1.format="CD";
        p1.cod="367sfdg43g";
        Article p2=new Article();
        p2.preu_lloguer=3;
        p2.titol="El Gato Con Botas";
        p2.format="CD";
        p2.cod="54aser318";
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s\n\n",p1.titol,p1.preudia(),p1.preudos(),p1.preusemana(),p1.cod,p1.format);
        System.out.printf("El alquiler de la pelicula %s es de un dia: %.2f€, de dos %.2f€ i de una semana %.2f€.\nAltres dades: \n\tCOD: %s \n\tFORMAT: %s",p2.titol,p2.preudia(),p2.preudos(),p2.preusemana(),p2.cod,p2.format);
    }

}

