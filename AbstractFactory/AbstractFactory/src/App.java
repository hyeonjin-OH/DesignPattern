public class App {
    public static void main(String[] args) throws Exception {

        ComponentFactory factory = new WindowsFactory();

        Button button = factory.createButton("확인");
        CheckBox checkBox = factory.createCheckBox(false);
        TextEdit textEdit = factory.craeteTextEdit("디자인패턴");

        button.render();
        checkBox.render();
        textEdit.render();

        button.clickEvent();
        checkBox.setChecked(true);
        textEdit.setValue("Abstract Factory 패턴");
    }
}
