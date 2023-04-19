import java.util.Date;

public class Event {

    private String name;
    private String startDate;
    private String startTime;
    private String associatedClubOrDepartment;
    private String description;
    private String place;

    public Event(String name, String startDate, String startTime, String associatedClubOrDepartment, String description, String place) {
        setName(name);
        setStartDate(startDate);
        setStartTime(startTime);
        setAssociatedClubOrDepartment(associatedClubOrDepartment);
        setDescription(description);
        setPlace(place);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        if(startTime.length() == 5 && startTime.charAt(2) == ':')
        this.startTime = startTime;
    }

    public String getAssociatedClubOrDepartment() {
        return associatedClubOrDepartment;
    }

    public void setAssociatedClubOrDepartment(String associatedClubOrDepartment) {
        this.associatedClubOrDepartment = associatedClubOrDepartment;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
