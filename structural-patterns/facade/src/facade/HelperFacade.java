package facade;

import databasehelpers.MySqlHelper;
import databasehelpers.OracleHelper;

import java.sql.Connection;

public class HelperFacade {
    public static void generateReport(DBTypes dbType,ReportTypes reportType,String tableName){
        Connection con=null;
        switch (dbType){
            case MYSQL :
                con = MySqlHelper.getMySqlDBConnection();
                MySqlHelper mySqlHelper=new MySqlHelper();
                switch (reportType){
                    case HTML :
                        mySqlHelper.generateMySqlHTMLReport(tableName,con);
                        break;
                    case PDF:
                        mySqlHelper.generateMySqlPDFReport(tableName,con);
                        break;
                }
                break;
            case ORACLE:
                con=MySqlHelper.getMySqlDBConnection();
                OracleHelper oracleHelper=new OracleHelper();
                switch (reportType){
                    case PDF:
                        oracleHelper.generateOracleHTMLReport(tableName,con);
                        break;
                    case HTML:
                        oracleHelper.generateOraclePDFReport(tableName,con);
                        break;
                }
                break;
        }
    }
   public static enum DBTypes{
        MYSQL,ORACLE;
    }
   public static enum ReportTypes{
        HTML,PDF;
   }
}
