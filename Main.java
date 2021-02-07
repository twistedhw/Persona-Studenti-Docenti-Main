public class Main
{
    public static void main (String [] args)
    {
        Docente programmazione;
        programmazione = new Docente("Mario Rossi", 45, 1.75, "MR03Z1T");
        System.out.println (programmazione.toString());
        Studenti dati;
        dati = new Studenti("Luca Bianchi", 20, 1.72, "137834");
        System.out.println(dati.toString());


    }


}