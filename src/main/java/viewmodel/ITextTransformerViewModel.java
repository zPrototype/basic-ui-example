package viewmodel;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import model.ITextTransformer;

public interface ITextTransformerViewModel {

    ITextTransformer getModel();

    SimpleObjectProperty<EventHandler<ActionEvent>> btnHandlerProperty();

    ChangeListener<String> getInputTextChangeListener();

}
