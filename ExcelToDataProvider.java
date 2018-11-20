import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelToDataProvider
{
	public static void main(String[] args) throws Exception {
		
		String excelpath= "C:\\Users\\Shrikant\\IdeaProjects\\WebDriver1\\ApachePOI\\Data.xlsx";
		String excelSheet="Sheet1";
		testdata(excelpath, excelSheet);
	}
	
	@DataProvider(name="testdata1")
	public Object[][] getData() throws Exception
	{
		String excelpath= "C:\\Users\\Shrikant\\IdeaProjects\\WebDriver1\\ApachePOI\\Data.xlsx";
		String excelSheet="Sheet1";
		Object data[][]=testdata(excelpath, excelSheet);
		return data;
	}
	
	@Test(dataProvider="testdata1")
	public void test1(String user,String pass)
	{
		System.out.println(user+"|"+pass);
	}
	
	public static Object[][] testdata(String excelpath,String excelSheet) throws Exception
	{
		ExcelUtils excel = new ExcelUtils(excelpath,excelSheet);
		int Row=excel.getColCount();
		int Col=excel.getRowCount();
		
		Object data[][]=new Object[Row-1][Col];
		
		for(int i=1;i<Row;i++)
		{
			for(int j=0;j<Col;j++)
			{
				String CellData=excel.getCellData(i, j);
				System.out.println(CellData);
				data[i-1][j]=CellData;
			}
		}
		return data;
	}
}