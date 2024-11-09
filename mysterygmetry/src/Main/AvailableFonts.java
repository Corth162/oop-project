package Main;
import java.awt.GraphicsEnvironment;

public class AvailableFonts {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontNames = ge.getAvailableFontFamilyNames();
        
        for (String fontName : fontNames) {
            System.out.println(fontName);
        }
    }
}

