package FileSaveLogic.SaveLoad;

import models.Shape;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Stack;

public interface IFileManager<T> {
    public void saveDataToFile(Stack<T> stack) throws FileNotFoundException;

    public Stack<T> loadDataFromFile(File file);
}
