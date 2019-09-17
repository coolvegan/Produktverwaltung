public class CSVOutputStrategy implements  OutputStrategyInterface {
    @Override
    public void run(Produktverwaltung produktverwaltung) {
        try {
            throw new Exception("Not Implemented!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (int i=0; i < produktverwaltung.getSortiment().size();i++)
        {
            //SOLID OOP 5.DAN DEV SKILLZ
            //NEEDS TO IP IMPLEMENTED
        }

        for (int j=0; j < produktverwaltung.getDaysToPreviewInDisplay(); j++)
        {
            for (int i=0; i < produktverwaltung.getSortiment().size();i++)
            {
                produktverwaltung.getSortiment().get(i).nextDay();
                //Geht ein Informatiker mit seinem Kind im Kinderwagen in einem Park spazieren
                //Geht ein älteres Pärchen an ihm vorbei und fragt: Junge oder Mädchen?
                //Antwortet der Informatiker: Richtig! ;-)
            }
        }
    }
}
