public abstract class Button{
    protected String caption;

    public Button(String caption){
        System.out.println(caption + " 버튼을 클릭했습니다.");
    }
    public void clickEvent(){
        System.out.println(caption + "버튼을 클릭했습니다.");
    }

    abstract void render();
}