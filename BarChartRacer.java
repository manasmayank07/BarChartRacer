import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.In;

public class BarChartRacer {
    public static void main(String[] args) {
        String filename = args[0];
        In in = new In(filename);

        String title = in.readLine();
        String xAxisLabel = in.readLine();
        String source = in.readLine();

        int k = 12;  // Number of bars to display

        BarChart chart = new BarChart(title, xAxisLabel, source);

        StdDraw.setCanvasSize(1000, 700);
        StdDraw.enableDoubleBuffering();

        while (in.hasNextLine()) {
            String line = in.readLine();
            if (line == null) break;

            int n = Integer.parseInt(line);
            Bar[] bars = new Bar[n];

            for (int i = 0; i < n; i++) {
                String[] tokens = in.readLine().split(",");
                String name = tokens[1];
                String country = tokens[2];
                int value = Integer.parseInt(tokens[3]);
                bars[i] = new Bar(name, value, country);
            }

            chart.reset();
            for (int i = 0; i < n; i++) {
                chart.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());
            }

            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(100);
        }
    }
}
