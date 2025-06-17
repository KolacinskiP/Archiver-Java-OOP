package main;

import command.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Class that creates commands map and executes operation chosen by the user
 */
public class CommandExecutor {
    private static final Map<Operation, Command> allKnownCommandsMap = new HashMap<>();

    static {
        allKnownCommandsMap.put(Operation.CREATE, new ZipCreateCommand());
        allKnownCommandsMap.put(Operation.ADD, new ZipAddCommand());
        allKnownCommandsMap.put(Operation.REMOVE, new ZipRemoveCommand());
        allKnownCommandsMap.put(Operation.EXTRACT, new ZipExtractCommand());
        allKnownCommandsMap.put(Operation.CONTENT, new ZipContentCommand());
        allKnownCommandsMap.put(Operation.EXIT, new ExitCommand());
    }

    /**
     * Private constructor
     */
    private CommandExecutor() {
    }

    /**
     * Executes operation chosen by the user
     * @param operation name of the operation to be executed
     * @throws Exception
     */
    public static void execute(Operation operation) throws Exception {
        allKnownCommandsMap.get(operation).execute();
    }
}