package builder1;
public class Car{
    private String engine;
    private boolean airbag;
    private String color;
    private boolean cameraSensor;
    private boolean AEB;

    public Car(String engine, boolean airbag, String color, boolean cameraSensor, boolean AEB){
        this.engine = engine;
        this.airbag = airbag;
        this.color = color;
        this.cameraSensor = cameraSensor;
        this.AEB = AEB;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(" # CAR SPEC\n");
        sb.append("1." + cameraSensor+"\n");
        sb.append("2."+engine+"\n");
        sb.append("3."+airbag+"\n");
        sb.append("4."+color+"\n");
        sb.append("5."+AEB+"\n");
        return sb.toString();

    }
}