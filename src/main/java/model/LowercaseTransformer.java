package model;

import javafx.beans.property.SimpleStringProperty;

public class LowercaseTransformer implements ITextTransformer {

    private final SimpleStringProperty inputText = new SimpleStringProperty();
    private final SimpleStringProperty outputText = new SimpleStringProperty();

    public LowercaseTransformer() {
        inputText.set("");
        outputText.set("");
    }

    @Override
    public void doConversion() {
        outputText.set(inputText.getValue().toLowerCase());
        System.out.println("Converted: " + outputText.get());
    }

    @Override
    public SimpleStringProperty inputTextProperty() {
        return inputText;
    }

    @Override
    public SimpleStringProperty outputTextProperty() {
        return outputText;
    }
}
