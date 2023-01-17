package exemplesclases;

// Andreu Sanz Sanz

public class ExemplesClases {
    public static void main(String[] args) {
        Persona raquel=new Persona();
        raquel.edat=18;
        raquel.nom="Raquel";
        System.out.println(raquel.nom+" va a morir con "+raquel.edat+" años");
        System.out.println("Raquel es major de edat. "+raquel.esMajorEdat());
    }

}

