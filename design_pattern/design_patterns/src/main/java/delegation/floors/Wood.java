package delegation.floors;

import delegation.CourtType;

public class Wood implements CourtType{

    private final String COURT_TYPE = "Wood";

    @Override
    public String getType() {
        return COURT_TYPE;
    }
}
