package gui;

import java.net.URL;
import java.util.ResourceBundle;

import entities.Cliente;
import gui.util.Alerts;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;

public class Controller implements Initializable{
	
	@FXML
	private TableView<Cliente> tbClientes;
	
	@FXML
	private TableColumn<Cliente, Boolean> colSelect;
	
	@FXML
	private TableColumn<Cliente, String> colNome;
	
	@FXML
	private TableColumn<Cliente, Integer> colIdade;
	
	@FXML
	private TableColumn<Cliente, String> colEndereco;
	
	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtIdade;
	
	@FXML
	private TextField txtEndereco;
	
	@FXML
	private Button btAdicionar;
	
	private ObservableList<Cliente> listaDeClientes = FXCollections.observableArrayList();
	
	
	public void onClickAdicionar() {
		
		Integer i = Integer.parseInt(txtIdade.getText());
		
		Cliente cliente = new Cliente(txtNome.getText(), i, txtEndereco.getText());
		listaDeClientes.add(cliente);
		txtNome.clear();
		txtIdade.clear();
		txtEndereco.clear();
		
		Alerts.showAlert("Clientes", "Adicionar", "Cliente adicionado com sucesso!", AlertType.INFORMATION);
		
	}
	
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		colSelect.setCellValueFactory(new PropertyValueFactory<>("selected"));
		colNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		colIdade.setCellValueFactory(new PropertyValueFactory<>("idade"));
		colEndereco.setCellValueFactory(new PropertyValueFactory<>("endereco"));
		
		colSelect.setCellFactory(CheckBoxTableCell.forTableColumn(colSelect));
		colNome.setCellFactory(TextFieldTableCell.forTableColumn());
			
		tbClientes.setItems(listaDeClientes);		
	}
	
	
	
	
	
	
	
	/*Adicionando cliente de forma estatica
	 * public ObservableList<Cliente> listaDeClientes(){
		return FXCollections.observableArrayList(
				new Cliente("Antonio", 18, "Sitio Riacho S/N"),
				new Cliente("Lucas", 21, "Rua da Guerra 22"),
				new Cliente("Maria", 22, "Rua da Paz 45"));
	}*/
	
	
	
	
}
