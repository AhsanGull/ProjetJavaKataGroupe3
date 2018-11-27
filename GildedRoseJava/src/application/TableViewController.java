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

    

	Item i1 = new Item("+5 Dexterity Vest", 10, 20);
	Item i2=new Item("Aged Brie", 2, 0);
	Item i3=new Item("Elixir of the Mongoose", 5, 7);
	Item i4=new Item("Sulfuras, Hand of Ragnaros", 0, 80);
	Item i5=new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20);
	Item i6=new Item("Conjured Mana Cake", 3, 6);
	final ObservableList<Item> liste1 = FXCollections.observableArrayList(i1,i2,i3,i4,i5,i6);
	    
    
    @Override
    public void initialize (URL arg0, ResourceBundle arg1)
    {
    	ColumnName.setCellValueFactory(new PropertyValueFactory<Item, String>("name"));
    	ColumnSellIn.setCellValueFactory(new PropertyValueFactory<Item, String>("sellIn"));
    	ColumnQuality.setCellValueFactory(new PropertyValueFactory<Item, String>("quality"));
    	
    	GrilleItem.setItems(liste1);
    }
    
    
    
    
    
}

