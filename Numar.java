public class Numar<T>{
    T t; 
    //acest tip de data poate fi folosit pentru a defini zone de memorie, deci pentru crearea atributelor
    //parametrul "t" poate acum prelua orice tip de data
    
    public Numar(){} //costructor fara parametrii
    
    public Numar(T t){//supraincarc cu un constructor care sa primeasca parametrul T
        this.t = t;
    }
    
    public void setT(T t){
        this.t = t;
    }
    
    public T getT(){
        return this.t;
    }
}