package dataDriven;

import java.io.IOException;
import java.util.ArrayList;

public class testExcelUtil {
public static void main(String args[]) throws IOException {
	excelUtil eu = new excelUtil();
	ArrayList<String> data = eu.getData();
	
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	System.out.println(data.get(3));
}
}
