package education;

public class University extends School
{

    private String type;
    private int studies;

    public University(String name, String address, int students, String type, int studies)
    {
        super(name, address, students);
        if(type.isEmpty())
        {
            this.type = "university of technology";
        }
        else
        {
            this.type = type;
        }

        if(studies < 0)
        {
            this.studies = 10;
        }
        else
        {
            this.studies = studies;
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.isEmpty())
        {
            this.type = type;
        }
    }

    public int getStudies() {
        return studies;
    }

    public void setStudies(int studies) {
        if(studies >= 0)
        {
            this.studies = studies;
        }
    }

    @Override
    public String toString() {
        if(super.getName() == null || super.getName().isEmpty())
        {
            return getClass().getSimpleName() + ": Address: " + getAddress() + ". Number of students: " + getStudents() + "\""
                    + "Type: " + type + ". Number of fields of study: " + studies;
        }
        else
        {
            return getClass().getSimpleName() + ": Name: " + getName() + ". Address: " + getAddress() + ". Number of students: " + getStudents() + "\""
                    + "Type: " + type + ". Number of fields of study: " + studies;
        }
    }

    public void recruitment(int x)
    {
        super.recruitment(x);
        studies += x/10;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;

        University that = (University) o;

        return studies == that.studies;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + studies;
        return result;
    }
}
