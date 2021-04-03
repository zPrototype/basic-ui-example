package model;

import javafx.beans.property.SimpleStringProperty;

// Bla -> B l a
public class GesperrtTransformer implements ITextTransformer {
    private final SimpleStringProperty inputText = new SimpleStringProperty();
    private final SimpleStringProperty outputText = new SimpleStringProperty();

    public GesperrtTransformer() {
        inputText.set("");
        outputText.set("");
    }

    @Override
    public void doConversion() {
        outputText.set(inputText.getValue().replace("", " ").trim());
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
