import packageprivate.Coordinates;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public class DeepShallowApp {
        public static void main(String[] args) {
            Coordinates coordinates1 = new Coordinates(202.678, 2123.456);
            Activity[] activities1 = {Activity.HIKE, Activity.BIKE};
            Mountain mountain1 = new Mountain("Mountain1", 230, 9900, Altitude.HIGH, coordinates1, activities1);

            Coordinates coordinates2 = new Coordinates(123.891, 123.678);
            Activity[] activities2 = {Activity.SKI, Activity.RUN};
            Mountain mountain2 = new Mountain("Mountain2", 321, 9000, Altitude.MEDIUM, coordinates2, activities2);

            Mountain shallowCopy = mountain1.copyShallow();
            Mountain deepCopy = mountain2.copyDeep();


            shallowCopy.setMountainAltitude(Altitude.LOW);
            shallowCopy.getCoordinates().setLongitude(12.345);
            shallowCopy.getSpareTimeActivities()[0] = Activity.GOLF;


            System.out.println("Shallow Copy:");
            System.out.println(shallowCopy);
            System.out.println(mountain1);


            deepCopy.setMountainAltitude(Altitude.LOW);
            deepCopy.getCoordinates().setLongitude(98.765);
            deepCopy.getSpareTimeActivities()[0] = Activity.FLY;


            System.out.println("\nDeep Copy:");
            System.out.println(deepCopy);
            System.out.println(mountain2);
        }
    }
}