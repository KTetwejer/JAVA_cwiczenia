package education;

import java.util.Objects;

public class School
{
    private String name;
    private String address;
    private int students;

    public School(String name, String address, int students)
    {
        this.name = name;

        if(address == null || address.isEmpty())
        {
            this.address = "Ul. Sloneczna 54, 10-710 Olsztyn";
        }
        else
        {
            this.address = address;
        }

        if(students < 1)
        {
            this.students = 100;
        }
        else
        {
            this.students = students;
        }
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        if(address != null || !address.isEmpty())
        {
            this.address = address;
        }
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students)
    {
        if(students > 1)
        {
            this.students = students;
        }
    }

    @Override
    public String toString()
    {
        if(name == null || name.isEmpty())
        {
            return getClass().getSimpleName() + ": Address: " + address + ". Number of students: " + students + ".";
        }
        else
        {
            return getClass().getSimpleName() + ": Name: " + name + ". Address: " + address + ". Number of students: " + students + ".";
        }
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        School school = (School) o;

        return Objects.equals(address, school.address);
    }

    @Override
    public int hashCode()
    {
        int temp = address.hashCode() * 31;
        return temp;
    }

    public void recruitment(int x)
    {
        students += x;
        if(students > 500)
        {
            students = 500;
        }
    }
}
