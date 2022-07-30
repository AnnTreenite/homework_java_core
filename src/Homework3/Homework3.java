package Homework3;

import java.io.FileWriter;
import java.io.IOException;

public class Homework3 {
    public static void main(String[] args) throws IOException {
        FinancialRecord task = new FinancialRecord(500, 300);
        String filename = "/Users/treenite/IdeaProjects/homework_java_core/report.txt";
        FileWriter fileWriter = new FileWriter(filename);
        fileWriter.write("доходы = " + task.getIncomes() + ", " + "расходы = " + task.getOutcomes());
        fileWriter.close();
    }
}
