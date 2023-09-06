package builder2;

public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    //Builder클래스의 사용법을 숙지하지 않고 편하게 사용할 수 있게 함.
    public String build(){
        StringBuilder sb = new StringBuilder();

        sb.append(builder.head());
        sb.append(builder.head());
        sb.append(builder.head());

        return sb.toString();
    }
}
