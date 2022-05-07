package utilityfunctions;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel{

static XSSFWorkbook book=null;
static XSSFSheet sheet1 =null;

public static void getSheet() {

try {
book = new XSSFWorkbook("C:\\Users\\sitha\\eclipse-workspace\\AprilMavenFrameworks\\Data\\Testdata.xlsx");
} catch (IOException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
sheet1 = book.getSheet("Sheet1");

}


public static int getRowCount() {
getSheet();

int rowcount = sheet1.getPhysicalNumberOfRows();
return rowcount;

}

public static int getColCount() {
getSheet();

int colcount = sheet1.getRow(0).getLastCellNum();
return colcount;

}

public static String getCellValue(int rowno,int colno) {
getSheet();
String data = sheet1.getRow(rowno).getCell(colno).getStringCellValue();
return data;

}

}
