package kata4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Kata4 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        String filename = "E:\\IS2\\kata4\\Kata4\\emailsfilev1.txt";
        ArrayList<String> mailList = MailListReader.read(filename);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
}
