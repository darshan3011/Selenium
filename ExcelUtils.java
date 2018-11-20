import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
    private static XSSFSheet ExcelWSheet;
    private static XSSFWorkbook ExcelWBook;
    
    public ExcelUtils(String ExcelFile,String SheetName) throws IOException
    {
    	ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
    }

     public static void setExcelFile(String Path,String SheetName) throws Exception {
        FileInputStream ExcelFile = new FileInputStream(Path);
        ExcelWBook = new XSSFWorkbook(ExcelFile);
        ExcelWSheet = ExcelWBook.getSheet(SheetName);
    }

    //This method is to read the test data from the Excel cell
    //In this we are passing parameters/arguments as Row Num and Col Num
    public static String getCellData(int RowNum, int ColNum) throws Exception{
        String Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum).getStringCellValue().toString();
        System.out.println(Cell);
		return Cell;
    }
    
    public int getRowCount()
    {
    	int rowcount= ExcelWSheet.getPhysicalNumberOfRows();
    	System.out.println("Rows:"+rowcount);
    	return rowcount;
    }
    
    public int getColCount()
    {
    	int Colcount= ExcelWSheet.getRow(0).getPhysicalNumberOfCells();
    	System.out.println("Cols:"+Colcount);
    	return Colcount;
    }

}