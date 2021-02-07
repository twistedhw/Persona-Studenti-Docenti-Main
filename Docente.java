public class Docente extends Persona
{
    //attributo
    private String codiceDocente;
    //costruttore di default
    public Docente ()
    {
        super(); //senza niente va a utilizzare il primo costruttore della classe persona
        codiceDocente = null;
    }
    //costruttore classico
    public Docente (String nome, int eta, double altezza, String codiceDocente)
    {
        super (nome, eta, altezza);
        this.codiceDocente = codiceDocente;

    }
    //metodo get
    public String getCodiceDocente ()
    {
        return codiceDocente;
    }
    //metodo set
    public void setCodiceDocente(String codiceDocente)
    {
        this.codiceDocente = codiceDocente;  //il this.numeromatricola è riferito all'attributo non alla stringa numeromatricola tra parentesi
    }
    //metodo tostring
    public String toString ()
    {
        //dalla classe persona prendo il metodo toString dalla classe persona
        return super.toString() + "\nCodice docente: " + codiceDocente;
    }
}
