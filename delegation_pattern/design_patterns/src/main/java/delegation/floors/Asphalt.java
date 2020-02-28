package delegation.floors;

import delegation.CourtType;

public class Asphalt implements CourtType{

    private String COURT_TYPE = "Asphalt";
    
    @Override
    public String getType() {
        return COURT_TYPE;
    }
}