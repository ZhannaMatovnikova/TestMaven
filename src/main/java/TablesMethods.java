import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TablesMethods {

    private WebElement tableElement;
    private WebDriver driver;
    public TablesMethods(WebElement tableElement, WebDriver driver) {
        this.tableElement = tableElement;
        this.driver = driver;
    }
    //поиск всех строк в таблице
    public List<WebElement> getRows(){
        List<WebElement> rows = tableElement.findElements(By.xpath(".//tr"));
        rows.remove(0);
        return rows;
    }
    // поиск заголовков таблицы
    public List<WebElement> getHeadings(){
        WebElement headingsRow = tableElement.findElement(By.xpath(".//tr[1]"));
        List<WebElement> headingColumns = headingsRow.findElements(By.xpath(".//th"));
        return headingColumns;
    }

    // разбить все строки на колонки
    public List<List<WebElement>> getRowsWithColumns(){
        List<WebElement> rows = getRows();
        List<List<WebElement>> rowsWithColumns = new ArrayList<List<WebElement>>();
        for (WebElement row: rows){
            List<WebElement> rowWithColumns = row.findElements(By.xpath(".//td"));
            rowsWithColumns.add(rowWithColumns);
        }
        return rowsWithColumns;
    }


    //получение значения по номеру строки и заголовку
    public List<Map<String, WebElement>> getRowsWithColumnsByHeadings(){ //лист - список всех строк, мап -каждая строка
        // string заголовок, webelement - конкретная ячейка
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns();
        List<Map<String, WebElement>> rowsWithColumnsByHeadings = new ArrayList<Map<String, WebElement>>(); //те строки, разбитые по заголовкам, которые метод будет возвращать
        Map<String, WebElement> rowByHeadings;    //одна строка, разбитая на столбцы по заголовкам,  такие строки будут содержаться в листе
        List<WebElement> headingColumns = getHeadings();

        for (List<WebElement> row: rowsWithColumns) {
            rowByHeadings = new HashMap<String, WebElement>();
            for (int i = 0; i<headingColumns.size(); i++){
                String heading = headingColumns.get(i).getText();// перебираем каждую строку, чтобы получить текст заголовка и привязать заголовок к колонке
                WebElement cell = row.get(i); // получаем ячейку из строки под тем же номером, что и заголовок
                rowByHeadings.put(heading,cell);
            }
            rowsWithColumnsByHeadings.add(rowByHeadings);
        }
        return rowsWithColumnsByHeadings;
    }

    //метод, который позволит использовать метод getRowsWithColumns номер строки и номер столбца
    public String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns(); // получение списка столбцов
        WebElement cell = rowsWithColumns.get(rowNumber-1).get(columnNumber-1);
        // создаем ячейку, получаем строку через номер строки, получаем столбец по номеру столбца
        return cell.getText();
    }
    //метод, который позволит использовать метод getRowsWithColumns номер строки и имя заголовка
    public String getValueFromCell(int rowNumber, String columnName){
        List<Map<String,WebElement>> rowsWithColumnsByHeadings = getRowsWithColumnsByHeadings(); // получение списка столбцов
        return rowsWithColumnsByHeadings.get(rowNumber-1).get(columnName).getText();
    }

}
