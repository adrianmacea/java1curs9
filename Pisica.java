public class Pisica implements Comparable<Pisica>{
    String nume;
    
    public Pisica(String nume){
        this.nume = nume;
    }
    
    public int compareTo(Pisica p){
        return this.nume.compareTo(p.nume); 
        //returneaza in functie de compareTo pe String (nume este un String)
        //this.nume pt ca e un comportament si-l are pe this, 
        //numele pisicii care-si executa comportamentul compareTo cu parametrul numele instantei
        
        /**
         * daca dorim sa facem comparatie dupa mai multe atribute vom scrie mai mult de o linie
         * 
         * if(nume.compareTo(p.nume)>0){return 1;}
         * if(nume.compareTo(p.nume)<0){return -1;}
         * return 0;
         * 
         */
    }
    
    //suprascriem toString pentru ca atunci cand folosim System.out.print pentru a afisa o instanta de Pisisca sa stie ce sa afiseze,
    //in cazul nostru, atributul nume al pisicii
    public String toString(){
        return nume;
    }
}