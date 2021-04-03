package model;

import javafx.beans.property.SimpleStringProperty;

public interface ITextTransformer {

    void doConversion();

    SimpleStringProperty inputTextProperty();

    SimpleStringProperty outputTextProperty();

}
