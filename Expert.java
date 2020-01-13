
public class Expert extends Person{
    CarDetails carDetails;
    public Expert(CarDetails carDetails){
        this.carDetails=carDetails;
    }
    public void Repair(){
        carDetails.setOilLevel(10);
        carDetails.setEngineName("127-kilowatt electric motor (BMW i3)");
        System.out.println("Expert's Review:");
        System.out.println("Engine name is:"+carDetails.getEngineName()+" Oil Level in car is:"+carDetails.getOilLevel());  
        System.out.println("I have repaired the car");  
    }

}