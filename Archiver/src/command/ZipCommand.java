package command;

import main.ConsoleHelper;
import main.ZipFileManager;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Abstract class, which is the parent for every ZipCommand class <br>
 *  Every ZipCommand class: <br>
 *  * prompt the user to enter the full path to the archive file <br>
 *  * use ZipFileManager object to perform certain operations
 */
public abstract class ZipCommand implements Command {

    public ZipFileManager getZipFileManager() throws Exception{
        ConsoleHelper.writeMessage("Enter the full path to the archive file:");
        Path zipPath = Paths.get(ConsoleHelper.readString());
        return new ZipFileManager(zipPath);
    }
}