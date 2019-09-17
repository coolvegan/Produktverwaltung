import Product.AbstractProductTemplate;
import Product.AbstractProductTemplateInterface;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class ConsoleOutputStrategy implements OutputStrategyInterface {
    @Override
    public void run(Produktverwaltung produktverwaltung) {
        for (int i=0; i < produktverwaltung.getSortiment().size();i++)
        {
            introduce(produktverwaltung.getSortiment().get(i));
        }

        for (int j=0; j < produktverwaltung.getDaysToPreviewInDisplay(); j++)
        {
            for (int i=0; i < produktverwaltung.getSortiment().size();i++)
            {
                if (produktverwaltung.getSortiment().get(i).entsorgbar())
                {
                    produktverwaltung.removeProduct(i);
                }
                produktverwaltung.getSortiment().get(i).nextDay();
                actualsate(produktverwaltung.getSortiment().get(i));

            }
        }
    }

    private String entsorgen(AbstractProductTemplateInterface apt)
    {
        if (apt.entsorgbar())
        {
            return "Es muss entsorgt werden!";
        }
        else {
            return "Zustand ist okay.";
        }
    }

    private void introduce(AbstractProductTemplateInterface apt)
    {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        System.out.println("Produkt: "+ apt.getBezeichnung() + " erstellt am " + dateFormat.format(apt.getErzeugungsdatum())+",") ;
        System.out.println("Qualität: "+ apt.getQuality() + ", Grundpreis " + apt.getGrundpreis()+ "€"+ ", " + entsorgen(apt)+"\n");
    }

    private void actualsate(AbstractProductTemplateInterface apt)
    {
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(apt.getErzeugungsdatum());
        cal.add(Calendar.DAY_OF_YEAR,apt.getAlive());

        System.out.println("Produkt: "+ apt.getBezeichnung() + " betrachtet am " + dateFormat.format(cal.getTime())+",") ;
        System.out.println("Qualität: "+ apt.getQuality() + ", Grundpreis " + apt.getGrundpreis()+ "€"+ ", " + entsorgen(apt)+"\n");
    }

}
