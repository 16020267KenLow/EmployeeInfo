package sg.edu.rp.c346.employeeinfo;

/**
 * Created by 16020267 on 16/7/2018.
 */

public class EmployeeInfo {
    private String name;
    private String title;
    private Float salary;

    public EmployeeInfo(String name, String title, Float salary) {
        this.name = name;
        this.title = title;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "EmployeeInfo{" +
                "name='" + name + '\'' +
                ", title='" + title + '\'' +
                ", salary=" + salary +
                '}';
    }
}
