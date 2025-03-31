package sample;

import genericUtility.JavaUtility;

public class WritingDataToExcelFilePractice {

	public static void main(String[] args) throws Exception {
		
//		FileInputStream fis = new FileInputStream("C:\\Users\\rajat burnwal\\Desktop\\Animal.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Animal");
////		Sheet sh = wb.createSheet("Flowers");
//		Row r = sh.createRow(2);
//		Cell c = r.createCell(2);
//		c.setCellValue("hello");
//		FileOutputStream fos = new FileOutputStream("C:\\Users\\rajat burnwal\\Desktop\\Animal.xlsx");
//		wb.write(fos);
//		ExcelUtility eUtil = new ExcelUtility();
//		eUtil.writeDataToExcelFile("Animal", 4, 2, "hello");
//		Random r = new Random();
//		int value = r.nextInt(1000);
//		System.out.println(value);
		JavaUtility jUtil = new JavaUtility();
		int value = jUtil.generateRandomNumber(10);
		System.out.println(value);
		
		String dateStamp = jUtil.getCalendarDetails("dd-MM-YYYY");
		System.out.println(dateStamp);
		
		String dateTimeStamp = jUtil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
		System.out.println(dateTimeStamp);
		
		String time = jUtil.getCalendarDetails("hh/mm/ss");
		System.out.println(time);
	}

}
