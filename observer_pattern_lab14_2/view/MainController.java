package observer_pattern_lab14_2.view;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import observer_pattern_lab14_2.NameCollection;
import observer_pattern_lab14_2.NameCollectionObserver;

public class MainController implements NameCollectionObserver, Initializable{
	private NameCollection nameCollection;
	
	@FXML
	private ListView<String> lstName;
	
	@FXML
	private TextField txtName;

	
	@FXML
	void btnRemoveClick(ActionEvent event) throws Exception {
		nameCollection.removeName(0);
	}
	
	@FXML
	void btnAddClick(ActionEvent event) throws Exception {
		String name = txtName.getText();
		nameCollection.addName(name);
	}

	@Override
	public void update(List<String> names) {
		lstName.setItems(FXCollections.observableArrayList(names));
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		List<String> names = new ArrayList<>();
		names.add("Name1");
		names.add("Name2");
		names.add("Name3");
		names.add("Name4");
		nameCollection = new NameCollection(names, new ArrayList<>(Arrays.asList(this)));
		
		lstName.setItems(FXCollections.observableArrayList(names));
	}
	
	
}
