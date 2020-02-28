package delegation.floors;

import delegation.CourtType;

public class Concrete implements CourtType{
    
    private final String COURT_TYPE = "Concrete";

    @Override
    public String getType() {
        return COURT_TYPE;
    }
}
