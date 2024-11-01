import command.*;
import filesystem.FileSystemReceiver;
import filesystem.FileSystemReceiverUtil;

public class Main {
    public static void main(String[] args) {
        FileSystemReceiver fileSystemReceiver=FileSystemReceiverUtil.getUnderlyingFileSystem();

        Command openCommand=new OpenFileCommand(fileSystemReceiver);
        FileInvoker fileInvoker=new FileInvoker(openCommand);
        fileInvoker.execute();

        Command writeFile=new WriteFileCommand(fileSystemReceiver);
        fileInvoker=new FileInvoker(writeFile);
        fileInvoker.execute();

        Command closeCommand=new CloseFileCommand(fileSystemReceiver);
        fileInvoker=new FileInvoker(closeCommand);
        fileInvoker.execute();
    }
}
