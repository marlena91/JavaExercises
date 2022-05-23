public class Car {
        final String model;
        final String producer;
        Double mileage;
        Double engineVolume;
        String color;
        Double value;

        public Car(String model, String producer, Double value) {
            this.model = model;
            this.producer = producer;
            this.value = value;
            this.mileage = 5000.00;
        }
}
