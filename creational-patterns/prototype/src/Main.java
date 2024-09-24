import empolyee.Employees;

import java.util.List;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps=new Employees();
        emps.loadData();
        Employees empsNew=(Employees) emps.clone();
        Employees empsNew1=(Employees) emps.clone();
        List<String> list=empsNew.getEmpList();
        list.add("ali");
        List<String>list1=empsNew1.getEmpList();
        list1.remove("abdelrahman");
        System.out.println(emps.getEmpList());
        System.out.println(list);
        System.out.println(list1);
    }
}
