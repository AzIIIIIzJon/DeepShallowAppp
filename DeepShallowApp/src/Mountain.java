import packageprivate.Coordinates;

    import java.util.Arrays;

    public class Mountain {
        private String name;
        private int area;
        private int maxHeight;
        private Altitude mountainAltitude;
        private Coordinates coordinates;
        private Activity[] spareTimeActivities;

        public Mountain(String name, int area, int maxHeight, Altitude mountainAltitude, Coordinates coordinates, Activity[] spareTimeActivities) {
            this.name = name;
            this.area = area;
            this.maxHeight = maxHeight;
            this.mountainAltitude = mountainAltitude;
            this.coordinates = coordinates;
            this.spareTimeActivities = spareTimeActivities;
        }

        public String getName() {
            return name;
        }

        public int getArea() {
            return area;
        }

        public int getMaxHeight() {
            return maxHeight;
        }

        public Altitude getMountainAltitude() {
            return mountainAltitude;
        }

        public Activity[] getSpareTimeActivities() {
            return spareTimeActivities;
        }

        public Coordinates getCoordinates() {
            return coordinates;
        }

        public Coordinates getCoordinatesCopy(){
            return  new Coordinates(getCoordinates().getLatitude(), getCoordinates().getLongitude()) ;
        }

        public void setMountainAltitude(Altitude mountainAltitude) {
            this.mountainAltitude = mountainAltitude;
        }

        public Mountain copyShallow(){

           return new Mountain(name, area, maxHeight, mountainAltitude, coordinates, spareTimeActivities);


        }

        public  Activity [] getSpareTimeActivitiesCopy() {
            Activity[] spareTimeActivitiesCopy = new Activity[spareTimeActivities.length];
            for (int i = 0; i < spareTimeActivities.length; i++) {
                spareTimeActivitiesCopy[i] = spareTimeActivities[i];
            }
            return spareTimeActivitiesCopy;
        }

        public Mountain copyDeep() {
        Coordinates coordinatesCopy = getCoordinatesCopy();
        Activity[] spareTimeActivitiesCopy = getSpareTimeActivitiesCopy();



            return new Mountain(name, area, maxHeight, mountainAltitude, coordinatesCopy,  spareTimeActivitiesCopy);
        }




        @Override
        public String toString() {
            return "Mountain{" +  "name='" + name  + ",area=" + area + ", maxHeight=" + maxHeight + ", mountainAltitude=" + mountainAltitude +
                    ", coordinates=" + coordinates + ", spareTimeActivities=" + Arrays.toString(spareTimeActivities) + '}';
        }
    }

