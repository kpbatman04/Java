package exercise;

 class Employee {
    private String name;
    private String age;
    private int salary;

      Employee(String name, String age, int salary) {
         this.name = name;
         this.age = age;
         this.salary = salary;
     }

     String getEmployeeDetails(){
          return "Employee details : Name "+ name
                  +" Age : " + age
                  +" salary : "+ salary;
     }

     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
