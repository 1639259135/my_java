import java.util.List;

public class Page {

    private int pageCode;
    private List<Employee> employees;
    private int pageSize = 2;
    private int totalDatas;
    private String params;

    public Page() {
    }

    @Override
    public String toString() {
        return "Page{" + "pageCode=" + pageCode + ", employees=" + employees + ", pageSize=" + pageSize + ", totalDatas=" + totalDatas + '}';
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public int getPageCode() {
        return pageCode;
    }

    public void setPageCode(int pageCode) {
        this.pageCode = pageCode;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getTotalPages(){
        int pc = totalDatas / pageSize;
        if (totalDatas % pageSize > 0){
            pc ++;
        }
        return pc;
    }

    public void setTotalDatas(int totalDatas) {
        this.totalDatas = totalDatas;
    }
}
