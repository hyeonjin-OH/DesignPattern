public class App {
    public static void main(String[] args) throws Exception {
        //Display display = new ScreenDisplay();
        Display display = new BufferDisplay(5);

        display.print("프록시 패턴의 종류");
        display.print("기본형, 가상, 보호, 로깅, 원격, 캐싱");
        display.print("프록시 패턴(Proxy Pattern)은 대상 원본 객체를 대리하여");
        display.print("대신 처리하게 함으로써 로직의 흐름을 제어하는 행동 패턴이다.");
        display.print("쉬운 예시로 고해상도 이미지를 불러올 때, 이미지를 렌더링하는데 시간이 소요된다.");
        display.print("굳이 모든걸 다 렌더링할 필요없이 사용할 것만 렌더링하면 좋을텐데.");
    }
}
