public abstract class Persona {
    //ATTRIBUTI
    private String nome;
    private int eta;
    private double altezza;


    //costruttore di default
    public Persona() {
        nome = "nessun nome";
        eta = 0;
        altezza = 0.0;
    }

    //costruttore classico
    public Persona(String n, int e, double a) {
        nome = n;
        eta = e;
        altezza = a;
    }
    //metodo get per prendere un valore
    public String getNome()
    {
        return nome;
    }
    public int getEta ()
    {
        return eta;
    }
    public double getAltezza ()
    {
        return altezza;
    }

    //metodo set per modificare un valore. Il set è sempre void ed esegue un azione

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public void setEta(int eta)
    {
        this.eta = eta;
    }

    public void setAltezza(double altezza)
    {
        this.altezza = altezza;
    }
    public String toString ()
    {
        return "\nNome: "+ nome + "\nEtà: "+ eta + "\nAltezza: "+ altezza;
    }

}


