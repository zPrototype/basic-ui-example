package viewmodel;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.ITextTransformer;


public class TextTransformerViewModel implements ITextTransformerViewModel {

    private final SimpleObjectProperty<EventHandler<ActionEvent>> btnHandler = new SimpleObjectProperty<>();
    private final ChangeListener<String> inputTextChangeListener;

    private final ITextTransformer model;

    public TextTransformerViewModel(ITextTransformer model) {
        this.model = model;
        this.inputTextChangeListener = (observable, oldValue, newValue) -> {
            if (newValue.contains("bla")) {
                model.inputTextProperty().set(oldValue);
            }
            model.doConversion();
        };
        this.btnHandler.set(event -> {
            System.out.println("Button clicked!!");
            model.doConversion();
        });
    }

    public ITextTransformer getModel() {
        return model;
    }

    public SimpleObjectProperty<EventHandler<ActionEvent>> btnHandlerProperty() {
        return btnHandler;
    }

    public ChangeListener<String> getInputTextChangeListener() {
        return inputTextChangeListener;
    }
}
