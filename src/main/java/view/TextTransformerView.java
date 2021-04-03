package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import viewmodel.ITextTransformerViewModel;

public class TextTransformerView extends VBox {

    private final ITextTransformerViewModel viewModel;

    public TextTransformerView(ITextTransformerViewModel viewModel) {
        this.viewModel = viewModel;

        var lblUppercasinator = new Label("Uppercasinator");

        var tfInput = new TextField();
        tfInput.setMaxSize(200, 30);
        tfInput.setPromptText("Input");
        tfInput.textProperty().bindBidirectional(viewModel.getModel().inputTextProperty());
        tfInput.textProperty().addListener(viewModel.getInputTextChangeListener());

        var tfOutput = new TextField();
        tfOutput.setMaxSize(200, 30);
        tfOutput.setEditable(false);
        tfOutput.setPromptText("Output");
        tfOutput.textProperty().bindBidirectional(viewModel.getModel().outputTextProperty());

        var spcTitle = new Separator();
        spcTitle.setMinHeight(50);
        spcTitle.setMaxHeight(50);

        var spcButton = new Separator();
        spcButton.setMinHeight(50);
        spcButton.setMaxHeight(50);

        var btnConvert = new Button("Convert");
        btnConvert.onActionProperty().bindBidirectional(viewModel.btnHandlerProperty());

        this.getChildren().addAll(
                lblUppercasinator,
                spcTitle,
                tfInput,
                tfOutput,
                spcButton,
                btnConvert
        );
        this.setAlignment(Pos.CENTER);
    }
}
