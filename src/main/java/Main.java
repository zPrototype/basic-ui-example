import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.GesperrtTransformer;
import model.LowercaseTransformer;
import view.TextTransformerView;
import viewmodel.TextTransformerViewModel;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        var model = new GesperrtTransformer();
        var viewModel = new TextTransformerViewModel(model);
        var view = new TextTransformerView(viewModel);
        Scene scene = new Scene(view, 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}