package application;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class TableViewController implements Initializable {

    @FXML
    private TableView<Item> GrilleItem;

    @FXML
    private TableColumn<Item, String> ColumnName;

    @FXML
    private TableColumn<Item, String> ColumnSellIn;

    @FXML
    private TableColumn<Item, String> ColumnQuality;

    @FXML
    private Button UpdateButton;

    
    @Override
    public void initialize (URL arg0, ResourceBundle arg1)
    {
    	ColumnName.setCellValueFactory(new PropertyValueFactory<>("Name"));
    	ColumnSellIn.setCellValueFactory(new PropertyValueFactory<>("SellIn"));
    	ColumnQuality.setCellValueFactory(new PropertyValueFactory<>("Quality"));
    	GrilleItem.setItems(getItemList());
    }
    
    public void AddRecord()
    {
    	
    }
    
    public ObservableList<Item> getItemList()
    {
    	ObservableList<Item> result = FXCollections.observableArrayList();
    	result.add(new Item("+5 Dexterity Vest", 10, 20));
    	result.add(new Item("Aged Brie", 2, 0));
    	result.add(new Item("Elixir of the Mongoose", 5, 7));
    	result.add(new Item("Sulfuras, Hand of Ragnaros", 0, 80));
    	result.add(new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20));
    	result.add(new Item("Conjured Mana Cake", 3, 6));

    	return result;
    }
}

