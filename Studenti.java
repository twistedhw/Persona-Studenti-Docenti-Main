public class Studenti extends Persona
{
    //attributo
    private String numeroMatricola;
    //costruttore di default
    public Studenti ()
    {
        super(); //senza niente va a utilizzare il primo costruttore della classe persona
        numeroMatricola = null;
    }
    //costruttore classico
    public Studenti (String nome, int eta, double altezza, String numeroMatricola)
    {
        super (nome, eta, altezza);
        this.numeroMatricola = numeroMatricola;

    }
    //metodo get
    public String getNumeroMatricola ()
    {
        return numeroMatricola;
    }
    //metodo set
    public void setNumeroMatricola(String numeroMatricola)
    {
        this.numeroMatricola = numeroMatricola;  //il this.numeromatricola è riferito all'attributo non alla stringa numeromatricola tra parentesi
    }
    //metodo tostring
    public String toString ()
    {
        //dalla classe persona prendo il metodo toString dalla classe persona
        return super.toString() + "\nNumero matricola: " + numeroMatricola;
    }
}
