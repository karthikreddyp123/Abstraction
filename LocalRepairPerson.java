public class LocalRepairPerson extends Person{
    CarDetails carDetails;
    public LocalRepairPerson(CarDetails carDetails){
        this.carDetails=carDetails;
    }
    public void Repair(){
        carDetails.setOilLevel(10);
        System.out.println("Local Person's Review:");
        System.out.println("Oil Level in car is:"+carDetails.getOilLevel());  
        System.out.println("I tried but I can't repair this car");  
    }

}