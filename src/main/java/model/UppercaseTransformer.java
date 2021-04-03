package model;

import javafx.beans.property.SimpleStringProperty;

public class UppercaseTransformer implements ITextTransformer {

    private final SimpleStringProperty inputText = new SimpleStringProperty();
    private final SimpleStringProperty outputText = new SimpleStringProperty();

    public UppercaseTransformer() {
        inputText.set("");
        outputText.set("");
    }

    public void doConversion() {
        outputText.set(inputText.getValue().toUpperCase());
        System.out.println("Converted: " + outputText.get());
    }

    public SimpleStringProperty inputTextProperty() {
        return inputText;
    }

    public SimpleStringProperty outputTextProperty() {
        return outputText;
    }
}
