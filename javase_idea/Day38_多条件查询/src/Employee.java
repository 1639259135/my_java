public class Employee {

    private int id;
    private String name;
    private String job;
    private int managerId;
    private String hiredate;
    private double pay;
    private double prize;
    private int dmtid;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", job='" + job + '\'' + ", managerId=" + managerId + ", hiredate='" + hiredate + '\'' + ", pay=" + pay + ", prize=" + prize + ", dmtid=" + dmtid + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getManagerId() {
        return managerId;
    }

    public void setManagerId(int managerId) {
        this.managerId = managerId;
    }

    public String getHiredate() {
        return hiredate;
    }

    public void setHiredate(String hiredate) {
        this.hiredate = hiredate;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getDmtid() {
        return dmtid;
    }

    public void setDmtid(int dmtid) {
        this.dmtid = dmtid;
    }
}
