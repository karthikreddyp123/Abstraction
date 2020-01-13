
public class abstraction{
    public static void main(String args[]){
        CarDetails carDetails=new CarDetails();
        Person p1=new Owner();
        p1.Repair();
        Person p2=new LocalRepairPerson(carDetails);
        p2.Repair();
        Person p3=new Expert(carDetails);
        p3.Repair();
    }
}