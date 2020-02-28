package delegation.floors;

import delegation.CourtType;

public class Plastic implements CourtType{

    private final String COURT_TYPE = "Plastic";

    @Override
    public String getType() {
        return COURT_TYPE;
    }
}