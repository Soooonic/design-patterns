package command;

import filesystem.FileSystemReceiver;

public class WriteFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;
    public WriteFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver=fileSystemReceiver;
    }
    @Override
    public void execute() {
        fileSystemReceiver.writeFile();
    }
}
