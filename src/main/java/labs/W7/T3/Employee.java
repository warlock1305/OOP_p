package labs.W7.T3;

public record Employee(int id, String name, double salary) {
    public String to_String(){
        return "Id is " + this.id + " and name is " + this.name + " with a salary of " + this.salary;
    }
}
