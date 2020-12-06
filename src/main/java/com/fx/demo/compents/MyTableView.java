package com.fx.demo.compents;

import com.fx.demo.dao.Data1;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;
import lombok.Data;

/**
 * @DESCRIPTION:  自定义tableView
 * @AUTHOR: KONG De Yan
 * @DATE: Create in  11:01 2020/12/6
 */
@Data
public class MyTableView {

   private TableView tableView;


   public MyTableView(ObservableList observableList){

      //将数据放到TableView表中，但是不会渲染上去，需要添加列
      this.tableView=new TableView(observableList);

      //增加数据
      addTableColumn();

      //自定义初始化
     inital();

   }

   private void inital(){


   }

   private void addTableColumn(){

      //可编辑
      tableView.setEditable(true);

      //表头
      TableColumn tableColumn=new TableColumn<Data1,String>("姓名");
      TableColumn tableColumnAge=new TableColumn<Data1,Number>("年龄");

      tableColumn.setCellValueFactory(new PropertyValueFactory<Data1,String>("name"));
      tableColumnAge.setCellValueFactory(new PropertyValueFactory<Data1,Number>("age"));

      tableColumn.setCellFactory(new Callback<TableColumn<Data1,String>, TableCell<Data1,String>>() {

         @Override
         public TableCell<Data1, String> call(TableColumn<Data1, String> param) {
            TableCell<Data1, String> cell=new TableCell<Data1, String>(){



            };

            return cell;
         }
      });

//      //列
//      tableColumn.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Data1, String>, ObservableValue<String>>() {
//         @Override
//         public ObservableValue<String> call(TableColumn.CellDataFeatures<Data1, String> param) {
//            SimpleStringProperty simpleStringProperty=new SimpleStringProperty(param.getValue().getName());
//            return simpleStringProperty;
//         }
//      });
//
//      //列
//      tableColumnAge.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Data1,Number>, ObservableValue<Number>>() {
//         @Override
//         public ObservableValue<Number> call(TableColumn.CellDataFeatures<Data1, Number> param) {
//            SimpleIntegerProperty simpleIntegerProperty=new SimpleIntegerProperty(param.getValue().getAge());
//            return simpleIntegerProperty;
//         }
//      });


      tableView.getColumns().add(tableColumn);
      tableView.getColumns().add(tableColumnAge);
   }




}
