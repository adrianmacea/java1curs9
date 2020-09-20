public class E01GenericTypes{
    public static void main(String [] args){
        Numar<Integer> n1 = new Numar<Integer>(); //la instantiere trebuie sa definim TIPUL de data pe care il ia "T"
            n1.t = 10; //valorile pe care le ia "t" trebuie sa corespunda acelui tip de data
        Numar<Double> n2 = new Numar<Double>();
            n2.t = 10.5;
        Numar n3 = new Numar(); 
        //teoretic se poate instantia si fara a defini tipul, in acest caz ia automat tipul "Object", radacina, 
        //dar acest lucru a fost lasat posibil doar pentru a nu crea conflicte cu programele create inainte de java5
    }
}