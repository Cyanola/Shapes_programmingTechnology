package FileSaveLogic;

import Factory.ShapeFactory;
import models.Shape;
import FileSaveLogic.SaveLoad.IFileManager;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FIleManagerShape implements IFileManager<Shape> {

    @Override
    public void saveDataToFile(Stack<Shape> stack) throws FileNotFoundException {
        try (FileOutputStream fileOutputStream = new FileOutputStream("file" + LocalDate.now().toString() + ".txt");
             PrintStream printStream = new PrintStream(fileOutputStream)){
            for (var item: stack) {
                printStream.println(item.toString());
            }
        }
        catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }

    @Override
    public Stack<Shape> loadDataFromFile(File file) {
        try (FileInputStream fileInputStream = new FileInputStream(file);
             InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8)) {

            Stack<Shape> shapes = new Stack<Shape>();
            ArrayList<String> items = new ArrayList<>();
            StringBuilder lines = new StringBuilder();

            int count;

            while ((count = inputStreamReader.read()) != -1){
                if ((char)count == '\n'){
                    items.add(lines.toString());
                    lines = new StringBuilder();
                }
                else lines.append((char) count);
            }

            try {
                for (var item: items) {
                    shapes.push(this.setShapeHelper(item));
                }
                return shapes;
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        catch (Exception exception) {
            System.out.println(exception.toString());
        }
        return null;
    }

    private Shape setShapeHelper(String info){
        var args = info.split(" ");
        return new ShapeFactory().factoryMethod(args[0],Double.parseDouble(args[1]),Double.parseDouble(args[2]), Integer.parseInt(args[3]),
                Color.valueOf(args[4].replace('\r',' ').trim()), Color.valueOf(args[5].replace('\r',' ').trim()));
    }
}

