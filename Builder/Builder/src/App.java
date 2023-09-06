import builder1.Car;
import builder1.CarBuilder;
import builder2.Builder;
import builder2.Data;
import builder2.Director;
import builder2.PlainTextBuilder;


public class App {
    public static void main(String[] args) throws Exception {

        
        //Builder1
        //생성 시 지정해야 할 인자가 많을 때 사용함
        Car car1 = new Car("V7", true, "Black", true, false);

        Car car2 = new CarBuilder()
                        .setAEB(false)
                        .setAirbag(false)
                        .setCameraSensor(true)
                        .setColor("White")
                        .setEngine("V9")
                        .build();
        
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        //Builder2
        //객체 생성 시 여러단계를 순차적으로 거칠 때, 이 단계의 순서를 정해두고
        //각 단계를 다양하게 구현할 수 있게 함
        Data data = new Data("jane", 25);
        Builder builder = new PlainTextBuilder(data);
        //Director클래스가 없다면 Builder 클래스의 메서드를 다 알아야 함.
        //- Builder안에 build()를 선언했다면 - 
        Director director = new Director(builder);
        String result = director.build();
        System.out.println(result);
    
    }
}
