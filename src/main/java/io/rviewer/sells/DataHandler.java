package io.rviewer.sells;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;

import java.io.FileReader;
import java.net.URL;
import java.util.List;

public class DataHandler {

   /* @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) throws Exception {

        URL fileUrl = DataHandler.class.getClassLoader().getResource("data.csv");
        CSVReader csvReader = new CSVReader(new FileReader(fileUrl.getFile()));

        CsvToBean csv = new CsvToBean(csvReader);
        csv.setMappingStrategy(setColumMapping());

        List list = csv.parse();

        for (Object object : list) {
            Employee employee = (Employee) object;
            System.out.println(employee);
        }
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private static ColumnPositionMappingStrategy setColumMapping() {
        ColumnPositionMappingStrategy strategy = new ColumnPositionMappingStrategy();
        strategy.setType(Employee.class);
        String[] columns = new String[]{"id", "firstName", "lastName", "country", "age"};
        strategy.setColumnMapping(columns);
        return strategy;
    }
*/
}
