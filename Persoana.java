public class Persoana{
    String nume, prenume;
    
    public Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }
    
    public String toString(){ //folosim toString ca sa stie programul cum sa afiseze persoana in lista
        return nume+" "+prenume;
    }
}