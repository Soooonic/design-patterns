package command;

import filesystem.FileSystemReceiver;

public class OpenFileCommand implements Command{
    FileSystemReceiver fileSystemReceiver;

   public OpenFileCommand(FileSystemReceiver fileSystemReceiver){
        this.fileSystemReceiver=fileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.openFile();
    }
}
