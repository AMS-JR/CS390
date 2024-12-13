package problem_four;

public class Ticket {
    private String description;
    private int Id;
    Ticket(String desc, int Id){
        description = desc;
        this.Id = Id;
    }

    @Override
    public String toString() {
        return "Id='" + Id +  '\'' +
                " description=" + description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getId() {
        return Id;
    }


}
