import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Class in charge of communicating with the database.
 * Via it's methods it performs queries to retrieve the data.
 */
public class DataRetriever {
    private Connection connection;

    DataRetriever() {
        this.connection = DriverManager.getConnection( //TODO );
        // TODO: deal with the logic of DB management.

    }

    public String GetRandomArtist() {
        //TODO
        return null;
    }

    public String GetRandomSong() {
        //TODO
        return null;
    }
    public String GetRandomAlbum() {
        //TODO
        return null;
    }

    //TODO: Create more functions for queries. Do it as generically as possible.

}
