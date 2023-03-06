/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf09_08;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author sanzs
 */
public class Pokemon {
    private String tipo;
    private String apodo;
    private String DEFAPODO = "Sense asiganr"
            + "";
    private String nomPokemon;
    private int numPokedex;
    private int vida;
    private int pc;
    private int nivell;
    private static ArrayList<ArrayList> pokemons = new ArrayList<>();
    
    public Pokemon(String nomPokemon, int vida, int pc, int nivell) {
        asignarTipo(nomPokemon);
        this.vida = vida;
        this.pc = pc;
        this.nivell = nivell;
        this.apodo = DEFAPODO;
    }
    public Pokemon(int numpokedex, int vida, int pc, int nivell) {
        asignarTipo(numpokedex);
        this.vida = vida;
        this.pc = pc;
        this.nivell = nivell;
        this.apodo = DEFAPODO;
    }
    public Pokemon(String apodo, int numPokedex, int vida, int pc, int nivell) {
        this.apodo = apodo;
        this.numPokedex = numPokedex;
        this.vida = vida;
        this.pc = pc;
        this.nivell = nivell;
    }
    public Pokemon(String apodo, String nomPokemon, int vida, int pc, int nivell) {
        this.apodo = apodo;
        this.nomPokemon = nomPokemon;
        this.vida = vida;
        this.pc = pc;
        this.nivell = nivell;
    }
    
    
    static void rellenarArray() {
        pokemons.add(new ArrayList<String>());
        pokemons.add(new ArrayList<String>());
        pokemons.add(new ArrayList<Integer>());
        pokemons.get(0).addAll(Arrays.asList("Bulbasaur", "Ivysaur", "Venusaur", "Charmander", "Charmeleon", "Charizard","Squirtle", "Wartortle", "Blastoise", "Caterpie", "Metapod", "Butterfree","Weedle", "Kakuna", "Beedrill", "Pidgey", "Pidgeotto", "Pidgeot","Rattata", "Raticate", "Spearow", "Fearow", "Ekans", "Arbok","Pikachu", "Raichu", "Sandshrew", "Sandslash", "Nidoran♀", "Nidorina","Nidoqueen", "Nidoran♂", "Nidorino", "Nidoking", "Clefairy", "Clefable","Vulpix", "Ninetales", "Jigglypuff", "Wigglytuff", "Zubat", "Golbat","Oddish", "Gloom", "Vileplume", "Paras", "Parasect", "Venonat","Venomoth", "Diglett", "Dugtrio", "Meowth", "Persian", "Psyduck","Golduck", "Mankey", "Primeape", "Growlithe", "Arcanine", "Poliwag","Poliwhirl", "Poliwrath", "Abra", "Kadabra", "Alakazam", "Machop","Machoke", "Machamp", "Bellsprout", "Weepinbell", "Victreebel", "Tentacool","Tentacruel", "Geodude", "Graveler", "Golem", "Ponyta", "Rapidash","Slowpoke", "Slowbro", "Magnemite", "Magneton", "Farfetch'd", "Doduo","Dodrio", "Seel", "Dewgong", "Grimer", "Muk", "Shellder","Cloyster", "Gastly", "Haunter", "Gengar", "Onix", "Drowzee","Hypno", "Krabby", "Kingler", "Voltorb", "Electrode", "Exeggcute","Exeggutor", "Cubone", "Marowak", "Hitmonlee", "Hitmonchan", "Lickitung","Koffing", "Weezing", "Rhyhorn", "Rhydon", "Chansey", "Tangela","Kangaskhan", "Horsea", "Seadra", "Goldeen", "Seaking", "Staryu","Starmie", "Mr. Mime", "Scyther", "Jynx", "Electabuzz", "Magmar","Pinsir", "Tauros", "Magikarp", "Gyarados", "Lapras", "Ditto","Eevee", "Vaporeon", "Jolteon", "Flareon", "Porygon", "Omanyte","Omastar", "Kabuto", "Kabutops", "Aerodactyl", "Snorlax", "Articuno", "Zapdos","Moltres", "Dratini", "Dragonair", "Dragonite", "Mewtwo", "Mew"));
        pokemons.get(1).addAll(Arrays.asList("Planta / Veneno","Planta / Veneno","Planta / Veneno","Fuego","Fuego","Fuego / Volador","Agua","Agua","Agua","Bicho","Bicho","Bicho / Volador","Bicho / Veneno","Bicho / Veneno","Bicho / Veneno","Normal / Volador","Normal / Volador","Normal / Volador","Normal","Normal","Normal / Volador","Normal / Volador","Veneno","Veneno","Eléctrico","Eléctrico","Tierra","Tierra","Veneno","Veneno","Veneno / Tierra","Veneno","Veneno","Veneno / Tierra","Hada","Hada","Fuego","Fuego","Normal / Hada","Normal / Hada","Veneno / Volador","Veneno / Volador","Planta / Veneno","Planta / Veneno","Planta / Veneno","Bicho / Planta","Bicho / Planta","Bicho / Veneno","Bicho / Veneno","Tierra","Tierra","Normal","Normal","Agua","Agua","Lucha","Lucha","Fuego","Fuego","Agua","Agua","Agua / Lucha","Psíquico","Psíquico","Psíquico","Lucha","Lucha","Lucha","Planta / Veneno","Planta / Veneno","Planta / Veneno","Normal","Normal","Normal","Normal","Normal","Normal","Normal","Normal","Normal","Normal / Volador","Bicho","Bicho / Volador","Bicho / Veneno","Bicho / Veneno","Bicho / Veneno","Normal","Normal","Normal","Lucha","Lucha","Lucha","Agua / Psíquico","Agua / Psíquico","Agua / Psíquico","Agua / Hielo","Agua / Hielo","Agua / Hielo","Agua","Agua","Agua","Normal","Normal","Normal","Normal","Agua / Volador","Agua / Volador","Agua","Agua / Hielo","Agua / Hielo","Hielo / Volador","Hielo / Volador","Hielo / Volador","Agua","Agua / Hielo","Hielo / Volador","Hielo / Volador","Hielo","Hielo / Agua","Eléctrico","Eléctrico","Psíquico","Psíquico","Psíquico","Psíquico / Volador","Psíquico","Lucha","Lucha","Lucha","Agua / Siniestro","Agua / Siniestro","Roca / Terrestre","Roca / Terrestre","Roca / Terrestre","Roca / Agua","Roca / Agua","Fuego","Fuego","Fuego","Planta / Volador","Planta / Volador","Planta / Veneno","Planta / Veneno","Planta / Veneno","Eléctrico","Eléctrico","Normal","Normal","Fuego / Volador","Fuego / Volador","Bicho / Agua"));
        for (int i = 0; i < pokemons.get(0).size(); i++) {
            pokemons.get(2).add(i+1);
        }
    }
    
    public void asignarTipo(String apodo) {
        for (int i = 0; i < pokemons.get(0).size(); i++) {
            if (pokemons.get(0).get(i).equals(apodo)) {
                this.nomPokemon=apodo;
                this.tipo=(String) pokemons.get(1).get(i);
                this.numPokedex=(int) pokemons.get(2).get(i);
                break;
            }
        }
    }
    public void asignarTipo(int num) {
        if (num <= 151 && num >0) {
            this.nomPokemon = (String) pokemons.get(0).get(num-1);
            this.tipo = (String) pokemons.get(1).get(num-1);
            this.numPokedex = num;
        }else System.out.println("El numero no esta entre 0-151");
    }
    
    public static void añadirALista(String nomPokemon, String tipo, int numPokedex){
        String tipos="(Normal|Fuego|Agua|Planta|Eléctrico|Hielo|Lucha|Veneno|Tierra|Volador|Psíquico|Bicho|Roca|Fantasma|Dragón|Siniestro|Acero|Hada)";
        if (tipo.matches(tipos)) {
           pokemons.get(0).add(nomPokemon);
           pokemons.get(1).add(tipo);
           pokemons.get(2).add(numPokedex);
        }else System.out.println("### Pokemon no afegir ###");
    }
    
    public static void verDatos() {
        for (int i = 0; i < pokemons.get(0).size(); i++) {
            System.out.println("·····································");
            System.out.println("Nom\t\t: "+pokemons.get(0).get(i));
            System.out.println("Tipo\t\t: "+ pokemons.get(1).get(i));
            System.out.printf("NºPokedex\t: #%03d%n",pokemons.get(2).get(i));
        }
    }

    public String getTipo() {
        return tipo;
    }
    public String getApodo() {
        return apodo;
    }
    public String getNomPokemon() {
        return nomPokemon;
    }
    public int getNumPokedex() {
        return numPokedex;
    }
    public int getVida() {
        return vida;
    }
    public int getPc() {
        return pc;
    }
    public int getNivell() {
        return nivell;
    }
    public void cambiarApodo(String apodo) {
        this.apodo = apodo;
    }
    public void cambiarVida(int vida) {
        this.vida = vida;
    }
    public void cambiarPc(int pc) {
        this.pc = pc;
    }
    public void cambiarNivell(int nivell) {
        this.nivell = nivell;
    }
}