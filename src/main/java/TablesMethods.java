import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

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

    //метод, который позволит использовать метод getRowsWithColumns
    public String getValueFromCell(int rowNumber, int columnNumber){
        List<List<WebElement>> rowsWithColumns = getRowsWithColumns(); // получение списка столбцов
        WebElement cell = rowsWithColumns.get(rowNumber-1).get(columnNumber-1);
        // создаем ячейку, получаем строку через номер строки, получаем столбец по номеру столбца
        return cell.getText();
    }
}
