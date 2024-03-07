
public class Main {
    public static void main(String[] args) {
        int amountBricks=41;
        int containerCapacity=13;
        int fullContainers=amountBricks/containerCapacity;
        int bricksUnfilledContainer=amountBricks%containerCapacity;
        if(amountBricks%containerCapacity!=0)
            System.out.println("Amount of containers "+(fullContainers+1));
        else
            System.out.println("Amount of containers "+fullContainers);
        System.out.println("Amount of Full containers "+fullContainers);
        System.out.println("Amount of bricks in the unfilled container: "+bricksUnfilledContainer);
    }
}