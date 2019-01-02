import java.sql.*;
import java.util.Random;

/**
 * Class in charge of communicating with the database.
 * Via it's methods it performs queries to retrieve the data.
 */
public class DataRetriever {
    private Connection con;
    private Statement stmnt;
    private int artistMaxRowNum;
    private int songMaxRowNum;
    private int albumMaxRowNum;
    private Random randy;

    DataRetriever() throws SQLException {
        this.con = DriverManager.getConnection("jdbc:mysql://localhost:3306","root","123123" );
        this.stmnt = this.con.createStatement();
        ResultSet res = stmnt.executeQuery("select count(*) from artist;");
        this.artistMaxRowNum = res.getInt(1);
        res = stmnt.executeQuery("select count(*) from tracks;");
        this.songMaxRowNum = res.getInt(1);
        res = stmnt.executeQuery("selectmnbv count(*) from release;");
        this.albumMaxRowNum = res.getInt(1);
    }

    public String GetRandomArtist() throws SQLException {
        int row = this.randy.nextInt(artistMaxRowNum);
        ResultSet res = stmnt.executeQuery("select name from artist where line_num=" + row +";" );
        return res.toString();
    }

    public String GetRandomSong() throws SQLException {
        int row = this.randy.nextInt(songMaxRowNum);
        ResultSet res = stmnt.executeQuery("select track from track where line_num=" + row +";" );
        return res.toString();
    }

    public String GetRandomAlbum() throws SQLException {
        int row = this.randy.nextInt(albumMaxRowNum);
        ResultSet res = stmnt.executeQuery("select name from release where line_num=" + row +";" );
        return res.toString();
    }
}
