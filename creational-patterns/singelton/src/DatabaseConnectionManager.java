public class DatabaseConnectionManager {
    private static DatabaseConnectionManager instance;

    private DatabaseConnectionManager(){

    }

    public static DatabaseConnectionManager getInstance(){
        if(instance==null){
            instance=new DatabaseConnectionManager();
        }
        return instance;
    }
}
