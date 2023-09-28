package main;
import domain.Sale;
import domain.TeslaModel;
import services.FileService;
import services.SalesService;
import java.util.List;

public class SalesDataApp {
    public static void main(String[] args) {
        for(TeslaModel model : TeslaModel.values()) {
            List<Sale> salesData = FileService.readCSV(model.getCsvFileName());
            SalesService.printYearlySalesReport(model.getDisplayName(), salesData);
        }
    }
}

