public abstract class ComponentFactory {
    //추상 클래스가 아닌 interface로도 사용 가능

    public abstract Button createButton(String caption);
    public abstract CheckBox createCheckBox(boolean bChecked);
    public abstract TextEdit craeteTextEdit(String value);
}
