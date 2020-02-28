package delegation;

import delegation.floors.*;

public class App 
{
    public static void main( String[] args )
    {
        Court court = new Court();

        String wood = court.getType(new Wood());
        String concret = court.getType(new Concrete());
        String asphalt = court.getType(new Asphalt());
        String plastic = court.getType(new Plastic());

        System.out.println("type:" + wood);
        System.out.println("type:" + concret);
        System.out.println("type:" + asphalt);
        System.out.println("type:" + plastic);

    }
}
