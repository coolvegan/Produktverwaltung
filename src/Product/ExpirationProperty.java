package Product;

import java.util.Calendar;

public class ExpirationProperty implements EntsorgungsInterface {
    private int verfallInTagen;

    public ExpirationProperty(int verfallInTagen) {
        this.verfallInTagen = verfallInTagen;
    }

    @Override
    public boolean isEntsorgbar(AbstractProductTemplate abstractProductTemplate) {
        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_YEAR, verfallInTagen);
        calendar2.setTime(abstractProductTemplate.getErzeugungsdatum());
        calendar2.add(Calendar.DAY_OF_YEAR, abstractProductTemplate.getAlive());
        return (calendar2.getTime().compareTo(calendar.getTime()) > 0);
    }
}
