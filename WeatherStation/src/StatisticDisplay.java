import  java.util.Observable;
import java.util.Observer;

public class StatisticDisplay implements Observer, DisplayElement {
        Observable observable;
        private float temperature;
        private float ave;
        private float max;
        private float min;

        public StatisticDisplay(Observable observable){
            this.observable = observable;
            observable.addObserver(this);
        }

        public void update(Observable obs, Object arg){
            if( obs instanceof WeatherData){

                WeatherData weatherData = (WeatherData) obs;
                this.temperature = weatherData.getTemperature();
                if(temperature > max)
                this.max = temperature;
                if(temperature < min)
                this.min = temperature;

                this.ave = (ave + temperature/2);

            display();
            }
        }

        public void display(){
            System.out.println("Ave|Max|Min: " + ave + ":" + max + ":" + min);
        }
}
