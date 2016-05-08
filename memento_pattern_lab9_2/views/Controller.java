package memento_pattern_lab9_2.views;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import memento_pattern_lab9_2.CareTaker;
import memento_pattern_lab9_2.Memento;
import memento_pattern_lab9_2.ProfileOrigator;
import memento_pattern_lab9_2.SerializeUtil;

public class Controller {
	@FXML
	private TextField id;
	@FXML
	private TextField name;
	@FXML
	private TextField ssn;

	@FXML
	private Button btnSave;
	@FXML
	private Button btnUndo;
	@FXML
	private Button btnLoad;

	private CareTaker careTaker = new CareTaker();
	@FXML
	public void btnSave_click() {
		ProfileOrigator p = new ProfileOrigator(id.getText(), name.getText(), ssn.getText());
		SerializeUtil.serialize(p);
	}

	@FXML
	public void btnLoad_click() {
		ProfileOrigator p = SerializeUtil.deSerialize();
		refresh(p);
	}
	
	@FXML
	private void refresh(ProfileOrigator p) {
		id.setText(p.getId());
		name.setText(p.getName());
		ssn.setText(p.getSsn());
	}

	public void contentChange() {
		ProfileOrigator p = new ProfileOrigator(id.getText(), name.getText(), ssn.getText());
		Memento memento = p.saveStateToMemento();
		careTaker.add(memento);
	}

	@FXML
	public void btnUndo_click() {
		Memento memento = careTaker.get();
		if (null != memento) {
			ProfileOrigator p = memento.getProfileOrigator();
			refresh(p);
		}
	}
	@FXML
	public void initialize() {
//		id.textProperty().addListener((observable, oldValue, newValue) -> {
//			contentChange();
//		});
//		name.textProperty().addListener((observable, oldValue, newValue) -> {
//			contentChange();
//		});
//		ssn.textProperty().addListener((observable, oldValue, newValue) -> {
//			contentChange();
//		});
	}
}
