package kata3;

public class KATA3 {

    public static void main(String[] args) {
        Histogram<String> histo = new Histogram<>();
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        histo.increment("gmail");
        
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        histo.increment("ulpgc");
        
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");
        histo.increment("hotmail");

        HistogramDisplay histogram = new HistogramDisplay(histo);
        histogram.execute();
    }
    
}
